/*
Navicat MySQL Data Transfer

Source Server         : Royal
Source Server Version : 50140
Source Host           : localhost:3306
Source Database       : jzh

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2016-09-09 16:48:22
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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='店铺表';

-- ----------------------------
-- Records of shop
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品一级分类表';

-- ----------------------------
-- Records of commodity_type_level_one
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品二级分类表';

-- ----------------------------
-- Records of commodity_type_level_two
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品三级分类表';

-- ----------------------------
-- Records of commodity_type_level_three
-- ----------------------------

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
  PRIMARY KEY (`commodity_attribute_type_id`),
  KEY `commodity_type_id_1` (`commodity_type_id`),
  CONSTRAINT `commodity_type_id_1` FOREIGN KEY (`commodity_type_id`) REFERENCES `commodity_type_level_three` (`level_three_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性类别表';

-- ----------------------------
-- Records of commodity_attribute_type
-- ----------------------------

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
  `img_ material` text COMMENT '材质图',
  `img_advantage` text COMMENT '优势图',
  `commodity_introduce` text NOT NULL COMMENT '商品介绍',
  `is_deleted` int(11) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`commodity_id`),
  KEY `commodity_type_id_2` (`commodity_type_id`),
  KEY `shop_id_1` (`shop_id`),
  CONSTRAINT `commodity_type_id_2` FOREIGN KEY (`commodity_type_id`) REFERENCES `commodity_type_level_three` (`level_three_id`),
  CONSTRAINT `shop_id_1` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of commodity
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家装首页商品推荐表';

-- ----------------------------
-- Records of commodity_homepage_recommend
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_attribute
-- ----------------------------
DROP TABLE IF EXISTS `commodity_attribute`;
CREATE TABLE `commodity_attribute` (
  `commodity_id` bigint(20) unsigned NOT NULL COMMENT '商品id',
  `commodity_attribute_id` bigint(20) unsigned NOT NULL COMMENT '商品属性id',
  `commodity_attribute_value` varchar(50) NOT NULL COMMENT '商品属性值',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`commodity_id`,`commodity_attribute_id`),
  KEY `commodity_attribute_id_1` (`commodity_attribute_id`),
  CONSTRAINT `commodity_attribute_id_1` FOREIGN KEY (`commodity_attribute_id`) REFERENCES `commodity_attribute_type` (`commodity_attribute_type_id`),
  CONSTRAINT `commodity_id_1` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性表';

-- ----------------------------
-- Records of commodity_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_client
-- ----------------------------
DROP TABLE IF EXISTS `commodity_client`;
CREATE TABLE `commodity_client` (
  `client_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `client_account` varchar(30) NOT NULL COMMENT '账号',
  `client_pwd` varchar(20) NOT NULL COMMENT '密码',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家客户表';

-- ----------------------------
-- Records of commodity_client
-- ----------------------------

-- ----------------------------
-- Table structure for client_commodity_relation
-- ----------------------------
DROP TABLE IF EXISTS `client_commodity_relation`;
CREATE TABLE `client_commodity_relation` (
  `client_id` bigint(10) unsigned NOT NULL COMMENT '客户id',
  `shop_id` bigint(10) unsigned NOT NULL COMMENT '店铺id',
  `is_deleted` int(1) NOT NULL COMMENT '删除标记位，未删除为1，已删除为0',
  `update_time` datetime NOT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`client_id`,`shop_id`),
  KEY `shop_id_2` (`shop_id`),
  CONSTRAINT `client_id_1` FOREIGN KEY (`client_id`) REFERENCES `commodity_client` (`client_id`),
  CONSTRAINT `shop_id_2` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`)
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
