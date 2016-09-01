/*
Navicat MySQL Data Transfer

Source Server         : Royal
Source Server Version : 50140
Source Host           : localhost:3306
Source Database       : jzh

Target Server Type    : MYSQL
Target Server Version : 50140
File Encoding         : 65001

Date: 2016-08-30 21:48:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for client_commodity_relation
-- ----------------------------
DROP TABLE IF EXISTS `client_commodity_relation`;
CREATE TABLE `client_commodity_relation` (
  `client_id` bigint(10) unsigned NOT NULL COMMENT '客户id',
  `shop_id` bigint(10) unsigned NOT NULL COMMENT '商家id',
  PRIMARY KEY (`client_id`,`shop_id`),
  KEY `shop_id_2` (`shop_id`),
  CONSTRAINT `shop_id_2` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`),
  CONSTRAINT `client_id_1` FOREIGN KEY (`client_id`) REFERENCES `commodity_client` (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家所属客户关系表';

-- ----------------------------
-- Records of client_commodity_relation
-- ----------------------------

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `commodity_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `commodity_type_id` bigint(20) unsigned NOT NULL COMMENT '商品类别id',
  `commodity_name` varchar(100) NOT NULL COMMENT '商品名称',
  `price` decimal(10,2) NOT NULL COMMENT '商品价格',
  `shop_id` bigint(20) unsigned NOT NULL COMMENT '商家id',
  PRIMARY KEY (`commodity_id`),
  KEY `commodity_type_id_2` (`commodity_type_id`),
  KEY `shop_id_1` (`shop_id`),
  CONSTRAINT `shop_id_1` FOREIGN KEY (`shop_id`) REFERENCES `shop` (`shop_id`),
  CONSTRAINT `commodity_type_id_2` FOREIGN KEY (`commodity_type_id`) REFERENCES `commodity_type_level_three` (`level_three_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

-- ----------------------------
-- Records of commodity
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_attribute
-- ----------------------------
DROP TABLE IF EXISTS `commodity_attribute`;
CREATE TABLE `commodity_attribute` (
  `commodity_id` bigint(20) unsigned NOT NULL COMMENT '商品id',
  `commodity_attribute_id` bigint(20) unsigned NOT NULL COMMENT '商品属性id',
  `commodity_attribute_value` varchar(50) NOT NULL COMMENT '商品属性值',
  PRIMARY KEY (`commodity_id`,`commodity_attribute_id`),
  KEY `commodity_attribute_id_1` (`commodity_attribute_id`),
  CONSTRAINT `commodity_attribute_id_1` FOREIGN KEY (`commodity_attribute_id`) REFERENCES `commodity_attribute_type` (`commodity_attribute_type_id`),
  CONSTRAINT `commodity_id_1` FOREIGN KEY (`commodity_id`) REFERENCES `commodity` (`commodity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性表';

-- ----------------------------
-- Records of commodity_attribute
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_attribute_type
-- ----------------------------
DROP TABLE IF EXISTS `commodity_attribute_type`;
CREATE TABLE `commodity_attribute_type` (
  `commodity_attribute_type_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品属性类别id',
  `commodity_attribute_type_name` varchar(20) NOT NULL COMMENT '商品属性类别名称',
  `commodity_type_id` bigint(20) unsigned NOT NULL COMMENT '商品三级类别id',
  PRIMARY KEY (`commodity_attribute_type_id`),
  KEY `commodity_type_id_1` (`commodity_type_id`),
  CONSTRAINT `commodity_type_id_1` FOREIGN KEY (`commodity_type_id`) REFERENCES `commodity_type_level_three` (`level_three_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性类别表';

-- ----------------------------
-- Records of commodity_attribute_type
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_client
-- ----------------------------
DROP TABLE IF EXISTS `commodity_client`;
CREATE TABLE `commodity_client` (
  `client_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户id',
  `client_account` varchar(30) NOT NULL COMMENT '账号',
  `client_pwd` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家客户表';

-- ----------------------------
-- Records of commodity_client
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_type_level_one
-- ----------------------------
DROP TABLE IF EXISTS `commodity_type_level_one`;
CREATE TABLE `commodity_type_level_one` (
  `level_one_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '一级分类id',
  `level_one_name` varchar(10) NOT NULL COMMENT '一级分类名称',
  PRIMARY KEY (`level_one_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品一级分类表';

-- ----------------------------
-- Records of commodity_type_level_one
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_type_level_three
-- ----------------------------
DROP TABLE IF EXISTS `commodity_type_level_three`;
CREATE TABLE `commodity_type_level_three` (
  `level_three_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '三级分类id',
  `level_three_name` varchar(100) NOT NULL COMMENT '三级分类名称',
  `level_two_id` bigint(20) unsigned NOT NULL COMMENT '二级分类id',
  PRIMARY KEY (`level_three_id`),
  KEY `level_two_id` (`level_two_id`),
  CONSTRAINT `level_two_id` FOREIGN KEY (`level_two_id`) REFERENCES `commodity_type_level_two` (`level_two_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品三级分类表';

-- ----------------------------
-- Records of commodity_type_level_three
-- ----------------------------

-- ----------------------------
-- Table structure for commodity_type_level_two
-- ----------------------------
DROP TABLE IF EXISTS `commodity_type_level_two`;
CREATE TABLE `commodity_type_level_two` (
  `level_two_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '二级分类id',
  `level_two_name` varchar(10) NOT NULL COMMENT '二级分类名称',
  `level_one_id` bigint(20) unsigned NOT NULL COMMENT '一级分类id',
  PRIMARY KEY (`level_two_id`),
  KEY `level_one_id` (`level_one_id`),
  CONSTRAINT `level_one_id` FOREIGN KEY (`level_one_id`) REFERENCES `commodity_type_level_one` (`level_one_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品二级分类表';

-- ----------------------------
-- Records of commodity_type_level_two
-- ----------------------------

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customer_id` bigint(20) NOT NULL COMMENT '用户id',
  `customer_account` varchar(30) NOT NULL COMMENT '账号',
  `customer_pwd` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of customer
-- ----------------------------

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `shop_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '商家id',
  `shop_name` varchar(40) DEFAULT NULL COMMENT '商家名称',
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家表';

-- ----------------------------
-- Records of shop
-- ----------------------------
