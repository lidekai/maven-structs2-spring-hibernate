/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : maven+srtucts2+spring+hibernate

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-10-23 14:42:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for usertable
-- ----------------------------
DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `age` int(3) DEFAULT NULL,
  `name` varchar(13) DEFAULT NULL,
  `userid` int(11) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=gb2312;

-- ----------------------------
-- Records of usertable
-- ----------------------------
INSERT INTO `usertable` VALUES ('1', '一', '1');
INSERT INTO `usertable` VALUES ('2', '二', '2');
INSERT INTO `usertable` VALUES ('3', '三', '3');
INSERT INTO `usertable` VALUES ('4', '四', '4');
INSERT INTO `usertable` VALUES ('5', '五', '5');
INSERT INTO `usertable` VALUES ('6', '六', '6');
INSERT INTO `usertable` VALUES ('7', '七', '7');
INSERT INTO `usertable` VALUES ('8', '八', '8');
