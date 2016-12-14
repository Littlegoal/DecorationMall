/*
Navicat MySQL Data Transfer

Source Server         : Royal
Source Server Version : 50140
Source Host           : localhost:3306
Source Database       : jzh

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2016-12-08 13:14:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shop_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '店铺id',
  `shop_name` varchar(100) NOT NULL COMMENT '店铺名称',
  `shop_introduce` text COMMENT '店铺介绍',
  `shop_address` text COMMENT '店铺地址',
  `contact_information` varchar(100) DEFAULT NULL COMMENT '联系方式',
  `img_shop` text COMMENT '店铺图片',
  `qr_code` varchar(200) DEFAULT NULL COMMENT '店铺二维码',
  `qq` varchar(100) DEFAULT NULL COMMENT 'QQ',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  `commodity_type_id_set` varchar(100) NOT NULL COMMENT '店铺出售的商品类型id集合',
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='店铺表';

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES ('1', '红木实业', '红木实业介绍', '红木实业地址', '18812345678', 'img_shop_url', 'qr_code_url', '123456789', '1', '2016-12-05 10:17:25', '1');

-- ----------------------------
-- Table structure for commodity_type_level_one
-- ----------------------------
DROP TABLE IF EXISTS `commodity_type_level_one`;
CREATE TABLE `commodity_type_level_one` (
  `level_one_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '一级分类id',
  `level_one_name` varchar(10) NOT NULL COMMENT '一级分类名称',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`level_one_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='商品一级分类表';

-- ----------------------------
-- Records of commodity_type_level_one
-- ----------------------------
INSERT INTO `commodity_type_level_one` VALUES ('1', '家具洁具', '1', '2016-12-05 10:18:49');
INSERT INTO `commodity_type_level_one` VALUES ('2', '建材', '1', '2016-12-05 10:19:03');
INSERT INTO `commodity_type_level_one` VALUES ('3', '主材', '1', '2016-12-05 10:19:13');

-- ----------------------------
-- Table structure for commodity_type_level_two
-- ----------------------------
DROP TABLE IF EXISTS `commodity_type_level_two`;
CREATE TABLE `commodity_type_level_two` (
  `level_two_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '二级分类id',
  `level_two_name` varchar(10) NOT NULL COMMENT '二级分类名称',
  `level_one_id` bigint(20) unsigned NOT NULL COMMENT '一级分类id',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`level_two_id`),
  KEY `level_one_id` (`level_one_id`),
  CONSTRAINT `level_one_id` FOREIGN KEY (`level_one_id`) REFERENCES `commodity_type_level_one` (`level_one_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='商品二级分类表';

-- ----------------------------
-- Records of commodity_type_level_two
-- ----------------------------
INSERT INTO `commodity_type_level_two` VALUES ('1', '卧室', '1', '1', '2016-12-05 10:19:36');
INSERT INTO `commodity_type_level_two` VALUES ('2', '客厅', '1', '1', '2016-12-05 10:19:48');

-- ----------------------------
-- Table structure for commodity_type_level_three
-- ----------------------------
DROP TABLE IF EXISTS `commodity_type_level_three`;
CREATE TABLE `commodity_type_level_three` (
  `level_three_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '三级分类id',
  `level_three_name` varchar(100) NOT NULL COMMENT '三级分类名称',
  `level_two_id` bigint(20) unsigned NOT NULL COMMENT '二级分类id',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`level_three_id`),
  KEY `level_two_id` (`level_two_id`),
  CONSTRAINT `level_two_id` FOREIGN KEY (`level_two_id`) REFERENCES `commodity_type_level_two` (`level_two_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='商品三级分类表';

-- ----------------------------
-- Records of commodity_type_level_three
-- ----------------------------
INSERT INTO `commodity_type_level_three` VALUES ('1', '床', '1', '1', '2016-12-05 10:20:23');
INSERT INTO `commodity_type_level_three` VALUES ('2', '沙发', '2', '1', '2016-12-05 10:20:37');

-- ----------------------------
-- Table structure for commodity_attribute_type
-- ----------------------------
DROP TABLE IF EXISTS `commodity_attribute_type`;
CREATE TABLE `commodity_attribute_type` (
  `commodity_attribute_type_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品属性类别id',
  `commodity_attribute_type_name` varchar(20) NOT NULL COMMENT '商品属性类别名称',
  `commodity_type_id` bigint(20) unsigned NOT NULL COMMENT '商品三级类别id',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`commodity_attribute_type_id`,`commodity_type_id`),
  KEY `commodity_type_id_1` (`commodity_type_id`),
  CONSTRAINT `commodity_type_id_1` FOREIGN KEY (`commodity_type_id`) REFERENCES `commodity_type_level_three` (`level_three_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='商品属性类别表';

-- ----------------------------
-- Records of commodity_attribute_type
-- ----------------------------
INSERT INTO `commodity_attribute_type` VALUES ('1', '材质', '1', '1', '2016-12-05 10:22:16');
INSERT INTO `commodity_attribute_type` VALUES ('1', '体积', '2', '1', '2016-12-05 10:23:18');

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `commodity_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `commodity_type_id` bigint(20) unsigned NOT NULL COMMENT '商品类别id',
  `commodity_name` text NOT NULL COMMENT '商品名称',
  `price` decimal(10,2) NOT NULL COMMENT '商品价格',
  `shop_id` bigint(20) unsigned NOT NULL COMMENT '店铺id',
  `img_principal` text NOT NULL COMMENT '主图片',
  `img_drawing` text COMMENT '效果图',
  `img_shot` text COMMENT '实拍图',
  `img_size` text COMMENT '尺寸图',
  `img_detail` text COMMENT '细节图',
  `img_material` text COMMENT '材质图',
  `img_advantage` text COMMENT '优势图',
  `commodity_introduce` text NOT NULL COMMENT '商品介绍',
  `is_deleted` int(11) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`commodity_id`),
  KEY `commodity_type_id_2` (`commodity_type_id`),
  KEY `shop_id_1` (`shop_id`),
  CONSTRAINT `commodity_type_id_2` FOREIGN KEY (`commodity_type_id`) REFERENCES `commodity_type_level_three` (`level_three_id`),
  CONSTRAINT `shop_id_1` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('1', '1', '4号沙发', '100.00', '1', 'Principal_1;Principal_2;', 'Drawing_1;Drawing_2;Drawing_3;Drawing_4;', 'Shot_1;Shot_2;', 'Size_1;Size_2;Size_3;', 'Detail_1;', 'Material_1;Material_2;Material_3;', 'Advantage_1;Advantage_2;', '4号沙发介绍', '1', '2016-12-08 12:52:02');
INSERT INTO `commodity` VALUES ('2', '1', '2号沙发', '200.00', '1', 'Principal_1;Principal_2;', 'Drawing_1;Drawing_2;Drawing_3;Drawing_4;', 'Shot_1;Shot_2;', 'Size_1;Size_2;Size_3;', 'Detail_1;', 'Material_1;Material_2;Material_3;', 'Advantage_1;Advantage_2;', '2号沙发介绍', '0', '2016-12-07 16:32:18');
INSERT INTO `commodity` VALUES ('3', '1', '1号沙发', '200.00', '1', 'Principal_1;Principal_2;', 'Drawing_1;Drawing_2;Drawing_3;Drawing_4;', 'Shot_1;Shot_2;', 'Size_1;Size_2;Size_3;', 'Detail_1;', 'Material_1;Material_2;Material_3;', 'Advantage_1;Advantage_2;', '1号沙发介绍', '0', '2016-12-07 16:32:22');
INSERT INTO `commodity` VALUES ('4', '1', '2号沙发', '200.00', '1', 'Principal_1;Principal_2;', 'Drawing_1;Drawing_2;Drawing_3;Drawing_4;', 'Shot_1;Shot_2;', 'Size_1;Size_2;Size_3;', 'Detail_1;', 'Material_1;Material_2;Material_3;', 'Advantage_1;Advantage_2;', '2号沙发介绍', '0', '2016-12-07 16:32:22');

-- ----------------------------
-- Table structure for commodity_homepage_recommend
-- ----------------------------
DROP TABLE IF EXISTS `commodity_homepage_recommend`;
CREATE TABLE `commodity_homepage_recommend` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '家装首页推荐商品项id',
  `type_level_two_id` bigint(20) DEFAULT NULL COMMENT '商品二级分类id',
  `shop_id` bigint(20) unsigned DEFAULT NULL COMMENT '店铺id',
  `shop_name` varchar(100) DEFAULT NULL COMMENT '店铺名称',
  `commodity_id` bigint(20) unsigned DEFAULT NULL COMMENT '商品id',
  `commodity_name` text COMMENT '商品名称',
  `commodity_price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `commodity_img` text COMMENT '商品图片',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位,未删除为1,已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  KEY `shop_id_3` (`shop_id`),
  KEY `commodity_id_3` (`commodity_id`),
  CONSTRAINT `commodity_id_3` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`commodity_id`),
  CONSTRAINT `shop_id_3` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='家装首页商品推荐表';

-- ----------------------------
-- Records of commodity_homepage_recommend
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_attribute
-- ----------------------------
DROP TABLE IF EXISTS `commodity_attribute`;
CREATE TABLE `commodity_attribute` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键id',
  `commodity_id` bigint(20) unsigned NOT NULL COMMENT '商品id',
  `commodity_attribute_id` bigint(20) unsigned NOT NULL COMMENT '商品属性id',
  `commodity_attribute_value` varchar(50) NOT NULL COMMENT '商品属性值',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  KEY `commodity_attribute_id_1` (`commodity_attribute_id`),
  KEY `commodity_id_1` (`commodity_id`),
  CONSTRAINT `commodity_attribute_id_1` FOREIGN KEY (`commodity_attribute_id`) REFERENCES `commodity_attribute_type` (`commodity_attribute_type_id`),
  CONSTRAINT `commodity_id_1` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性表';

-- ----------------------------
-- Records of commodity_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for business
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `business_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `business_account` varchar(30) NOT NULL COMMENT '账号',
  `business_pwd` varchar(20) NOT NULL COMMENT '密码',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`business_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='商家客户表';

-- ----------------------------
-- Records of business
-- ----------------------------
INSERT INTO `business` VALUES ('1', 'client_1', '123456', '1', '2016-12-05 12:20:13');
INSERT INTO `business` VALUES ('2', 'client_2', '123456', '1', '2016-12-05 12:20:29');

-- ----------------------------
-- Table structure for client_commodity_relation
-- ----------------------------
DROP TABLE IF EXISTS `client_commodity_relation`;
CREATE TABLE `client_commodity_relation` (
  `client_id` bigint(10) unsigned NOT NULL COMMENT '客户id',
  `shop_id` bigint(10) unsigned NOT NULL COMMENT '店铺id',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  `relation_id` bigint(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '关系id',
  PRIMARY KEY (`relation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='店铺所属客户关系表';

-- ----------------------------
-- Records of client_commodity_relation
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` bigint(20) NOT NULL COMMENT '用户id',
  `customer_account` varchar(30) NOT NULL COMMENT '账号',
  `customer_pwd` varchar(20) NOT NULL COMMENT '密码',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'customer_1', '123456', '1', '2016-12-05 12:21:46');
INSERT INTO `customer` VALUES ('2', 'customer_2', '123456', '1', '2016-12-05 12:54:59');


-- ----------------------------
-- Table structure for work
-- ----------------------------
DROP TABLE IF EXISTS `work`;
CREATE TABLE `work` (
  `work_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '装修案例id',
  `worker_id` bigint(20) unsigned NOT NULL COMMENT '工人id',
  `name` varchar(100) NOT NULL COMMENT '样例名称',
  `premises` varchar(100) NOT NULL COMMENT '所属楼盘',
  `area` varchar(40) NOT NULL COMMENT '面积',
  `introduction` varchar(400) NOT NULL COMMENT '样例简介',
  `img_principal` text NOT NULL COMMENT '主图片',
  `img_detail` text NOT NULL COMMENT '细节图片',
  `interest_amount` bigint(10) unsigned NOT NULL COMMENT '用户感兴趣数',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`work_id`),
  KEY `worker_id_1` (`worker_id`),
  CONSTRAINT `worker_id_1` FOREIGN KEY (`worker_id`) REFERENCES `worker` (`worker_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='装修案例表';

-- ----------------------------
-- Records of work
-- ----------------------------

-- ----------------------------
-- Table structure for worker
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker` (
  `worker_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '工人id',
  `worker_type_id` bigint(20) unsigned NOT NULL COMMENT '工种',
  `worker_name` varchar(20) NOT NULL COMMENT '工人姓名',
  `contact` varchar(100) NOT NULL COMMENT '联系方式',
  `service_area` varchar(100) NOT NULL COMMENT '服务区域',
  `introduction` varchar(400) NOT NULL COMMENT '简介',
  `score` double(3,2) unsigned NOT NULL COMMENT '评分数',
  `pageview` bigint(10) unsigned NOT NULL COMMENT '浏览量',
  `work_amount` bigint(10) NOT NULL COMMENT '装修案例数量',
  `comment_amount` bigint(10) unsigned NOT NULL COMMENT '评论数量',
  `order_amount` bigint(10) unsigned NOT NULL COMMENT '历史预约次数',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`worker_id`),
  KEY `work_type_id_1` (`worker_type_id`),
  CONSTRAINT `work_type_id_1` FOREIGN KEY (`worker_type_id`) REFERENCES `commodity_type_level_two` (`level_two_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='工人表';

-- ----------------------------
-- Records of worker
-- ----------------------------
INSERT INTO `worker` VALUES ('1', '3', '张师傅', '18812345678', '全市', '简介', '5.22', '22', '10', '10', '10', '1', '2016-12-13 10:55:24');
INSERT INTO `worker` VALUES ('2', '3', '1号工人', '18800000001', '全市', '简介', '1.10', '1', '1', '1', '1', '1', '2016-12-13 12:06:18');
INSERT INTO `worker` VALUES ('3', '3', '3号工人', '18800000003', '全市', '改简介', '3.10', '3', '3', '3', '3', '1', '2016-12-13 13:07:49');
INSERT INTO `worker` VALUES ('4', '3', '3号工人', '18800000003', '全市', '简介', '3.10', '3', '3', '3', '3', '0', '2016-12-13 12:08:05');
INSERT INTO `worker` VALUES ('5', '3', '1号工人', '18800000001', '全市', '简介', '1.10', '1', '1', '1', '1', '1', '2016-12-13 16:55:08');
INSERT INTO `worker` VALUES ('6', '3', '2号工人', '18800000002', '全市', '简介', '2.10', '2', '2', '2', '2', '1', '2016-12-13 16:55:08');
INSERT INTO `worker` VALUES ('7', '3', '3号工人', '18800000003', '全市', '简介', '3.10', '3', '3', '3', '3', '1', '2016-12-13 16:55:08');
INSERT INTO `worker` VALUES ('8', '3', '4号工人', '18800000004', '全市', '简介', '4.10', '4', '4', '4', '4', '1', '2016-12-13 16:55:08');
INSERT INTO `worker` VALUES ('9', '3', '5号工人', '18800000005', '全市', '简介', '5.10', '5', '5', '5', '5', '1', '2016-12-13 16:55:09');
INSERT INTO `worker` VALUES ('10', '3', '6号工人', '18800000006', '全市', '简介', '6.10', '6', '6', '6', '6', '1', '2016-12-13 16:55:09');
INSERT INTO `worker` VALUES ('11', '3', '7号工人', '18800000007', '全市', '简介', '7.10', '7', '7', '7', '7', '1', '2016-12-13 16:55:09');
INSERT INTO `worker` VALUES ('12', '3', '8号工人', '18800000008', '全市', '简介', '8.10', '8', '8', '8', '8', '1', '2016-12-13 16:55:09');
INSERT INTO `worker` VALUES ('13', '3', '9号工人', '18800000009', '全市', '简介', '9.10', '9', '9', '9', '9', '1', '2016-12-13 16:55:09');
INSERT INTO `worker` VALUES ('14', '3', '1号工人', '18800000001', '全市', '简介', '1.10', '1', '1', '1', '1', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('15', '3', '2号工人', '18800000002', '全市', '简介', '2.10', '2', '2', '2', '2', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('16', '3', '3号工人', '18800000003', '全市', '简介', '3.10', '3', '3', '3', '3', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('17', '3', '4号工人', '18800000004', '全市', '简介', '4.10', '4', '4', '4', '4', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('18', '3', '5号工人', '18800000005', '全市', '简介', '5.10', '5', '5', '5', '5', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('19', '3', '6号工人', '18800000006', '全市', '简介', '6.10', '6', '6', '6', '6', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('20', '3', '7号工人', '18800000007', '全市', '简介', '7.10', '7', '7', '7', '7', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('21', '3', '8号工人', '18800000008', '全市', '简介', '8.10', '8', '8', '8', '8', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('22', '3', '9号工人', '18800000009', '全市', '简介', '9.10', '9', '9', '9', '9', '1', '2016-12-13 16:56:05');
INSERT INTO `worker` VALUES ('23', '3', '1号工人', '18800000001', '全市', '简介', '1.10', '1', '1', '1', '1', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('24', '3', '2号工人', '18800000002', '全市', '简介', '2.10', '2', '2', '2', '2', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('25', '3', '3号工人', '18800000003', '全市', '简介', '3.10', '3', '3', '3', '3', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('26', '3', '4号工人', '18800000004', '全市', '简介', '4.10', '4', '4', '4', '4', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('27', '3', '5号工人', '18800000005', '全市', '简介', '5.10', '5', '5', '5', '5', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('28', '3', '6号工人', '18800000006', '全市', '简介', '6.10', '6', '6', '6', '6', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('29', '3', '7号工人', '18800000007', '全市', '简介', '7.10', '7', '7', '7', '7', '1', '2016-12-13 16:56:41');
INSERT INTO `worker` VALUES ('30', '3', '8号工人', '18800000008', '全市', '简介', '8.10', '8', '8', '8', '8', '1', '2016-12-13 16:56:41');

-- ----------------------------
-- Table structure for worker_homepage_recommend
-- ----------------------------
DROP TABLE IF EXISTS `worker_homepage_recommend`;
CREATE TABLE `worker_homepage_recommend` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '工人首页推荐工人项id',
  `type_level_two_id` bigint(20) unsigned NOT NULL COMMENT '商品二级分类id',
  `worker_id` bigint(20) unsigned NOT NULL COMMENT '工人id',
  `worker_name` varchar(20) NOT NULL COMMENT '工人名称',
  `worker_img` text NOT NULL COMMENT '工人头像',
  `work_id` bigint(20) unsigned NOT NULL COMMENT '装修案例id',
  `work_name` varchar(100) NOT NULL COMMENT '装修案例名称',
  `work_img` text NOT NULL COMMENT '案例主图片',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位,未删除为1,已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`),
  KEY `worker_id_2` (`worker_id`),
  KEY `work_id_2` (`work_id`),
  KEY `type_id_2` (`type_level_two_id`),
  CONSTRAINT `type_id_2` FOREIGN KEY (`type_level_two_id`) REFERENCES `commodity_type_level_two` (`level_two_id`),
  CONSTRAINT `worker_id_2` FOREIGN KEY (`worker_id`) REFERENCES `worker` (`worker_id`),
  CONSTRAINT `work_id_2` FOREIGN KEY (`work_id`) REFERENCES `work` (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工人首页工人推荐表';

-- ----------------------------
-- Records of worker_homepage_recommend
-- ----------------------------