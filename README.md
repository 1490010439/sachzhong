# SachZhong-User

# 用户权限管理后台系统
根据需求我分为： 用户 角色 菜单 操作 4大模块
一个用户可以是多个角色，一个角色可以拥有多个菜单，一个菜单可以拥有多个操作


#数据库
/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : localhost:3306
 Source Schema         : sachzhong

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 23/06/2020 16:08:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sachzhong_menu
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_menu`;
CREATE TABLE `sachzhong_menu`  (
  `menu_id` int(30) NOT NULL COMMENT '菜单ID',
  `menu_grade` int(10) DEFAULT NULL COMMENT '菜单等级 1最高 数越大等级越低',
  `menu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单名称',
  `menu_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单类型',
  `menu_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单编号',
  `menu_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单信息',
  `menu_opuserid` int(11) NOT NULL COMMENT '操作用户id',
  `menu_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '该表是否被删除   true false',
  `menu_foundtime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '该表的创建时间',
  `menu_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '该表被修改的时间',
  `menu_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_menu
-- ----------------------------
INSERT INTO `sachzhong_menu` VALUES (1, 1, '超级管理菜单', '超级管理', 'sachzhong_menu_001', '拥有增删改查的菜单', 1, 'false', '2020-06-22 09:02:49', '2020-06-23 15:50:16', '无');
INSERT INTO `sachzhong_menu` VALUES (2, 2, '普通管理菜单', '管理', 'sachzhong_menu_002', '只有查询和新增的菜单', 1, 'false', '2020-06-23 15:50:05', '2020-06-23 15:50:05', '无');
INSERT INTO `sachzhong_menu` VALUES (3, 3, '支付菜单', '支付', 'sachzhong_menu_003', '拥有支付功能的菜单', 1, 'fasle', '2020-06-23 15:54:12', '2020-06-23 15:54:12', '无');

-- ----------------------------
-- Table structure for sachzhong_menubyoperation
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_menubyoperation`;
CREATE TABLE `sachzhong_menubyoperation`  (
  `menubyoperation_id` int(30) NOT NULL COMMENT '菜单操作关联表ID',
  `menubyoperation_operationid` int(30) DEFAULT NULL COMMENT '操作ID',
  `menubyoperation_menuid` int(30) DEFAULT NULL COMMENT '菜单ID',
  `menubyoperation_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `menubyoperation_opuserid` int(11) DEFAULT NULL COMMENT '操作用户id',
  `menubyoperation_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '该表是否被删除   true false',
  `menubyoperation_foundtime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '该表的创建时间',
  `menubyoperation_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '该表被修改的时间',
  PRIMARY KEY (`menubyoperation_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_menubyoperation
-- ----------------------------
INSERT INTO `sachzhong_menubyoperation` VALUES (1, 1, 1, '无', 1, 'false', '2020-06-22 09:05:10', '2020-06-22 09:05:10');
INSERT INTO `sachzhong_menubyoperation` VALUES (2, 2, 1, '无', 1, 'fasle', '2020-06-22 09:17:21', '2020-06-22 09:17:21');
INSERT INTO `sachzhong_menubyoperation` VALUES (3, 3, 1, '无', 1, 'fasle', '2020-06-23 15:45:01', '2020-06-23 15:45:01');
INSERT INTO `sachzhong_menubyoperation` VALUES (4, 4, 1, '无', 1, 'fasle', '2020-06-23 15:45:16', '2020-06-23 15:45:16');
INSERT INTO `sachzhong_menubyoperation` VALUES (5, 1, 2, '无', 1, 'fasle', '2020-06-23 15:51:06', '2020-06-23 15:51:06');
INSERT INTO `sachzhong_menubyoperation` VALUES (6, 3, 2, '无', 1, 'fasle', '2020-06-23 15:51:27', '2020-06-23 15:51:27');
INSERT INTO `sachzhong_menubyoperation` VALUES (7, 5, 3, '无', 1, 'fasle', '2020-06-23 15:55:56', '2020-06-23 15:55:56');

-- ----------------------------
-- Table structure for sachzhong_operation
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_operation`;
CREATE TABLE `sachzhong_operation`  (
  `operation_id` int(30) NOT NULL COMMENT '操作菜单id',
  `operation_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '操作名',
  `operation_grade` int(10) DEFAULT NULL COMMENT '操作等级 1最高 数越大等级越低',
  `operation_number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '操作编号',
  `operation_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '操作类型',
  `operation_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '操作信息',
  `operation_opuserid` int(11) DEFAULT NULL COMMENT '操作用户id',
  `operation_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '该表是否被删除   true false',
  `operation_foundtime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '该表的创建时间',
  `operation_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '该表被修改的时间',
  `operation_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`operation_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_operation
-- ----------------------------
INSERT INTO `sachzhong_operation` VALUES (1, '添加', 1, 'sachzhong_op_1', '添加', '添加信息', 1, 'false', '2020-06-22 09:04:31', '2020-06-23 15:54:37', '无');
INSERT INTO `sachzhong_operation` VALUES (2, '删除', 1, 'sachzhong_op_2', '删除', '删除信息', 1, 'false', '2020-06-22 09:06:00', '2020-06-23 15:54:42', '无');
INSERT INTO `sachzhong_operation` VALUES (3, '查找', 1, 'sachzhong_op_3', '查找', '查找信息', 1, 'fasle', '2020-06-22 09:06:22', '2020-06-23 15:54:45', '无');
INSERT INTO `sachzhong_operation` VALUES (4, '更新', 1, 'sachzhong_op_4', '更新', '更新信息', 1, 'false', '2020-06-22 09:07:28', '2020-06-23 15:54:51', '无');
INSERT INTO `sachzhong_operation` VALUES (5, '支付', 1, 'sachzhong_op_5', '支付', '支付', 1, 'false', '2020-06-23 15:54:30', '2020-06-23 15:55:24', '无');

-- ----------------------------
-- Table structure for sachzhong_role
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_role`;
CREATE TABLE `sachzhong_role`  (
  `role_id` int(30) NOT NULL COMMENT '角色ID',
  `role_grade` int(10) DEFAULT NULL COMMENT '角色等级 ,1级最高，数越大越低',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色名称',
  `role_number` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色编号',
  `role_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色类型',
  `role_info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '角色信息',
  `role_opuserid` int(11) DEFAULT NULL COMMENT '操作用户id',
  `role_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '该表是否被删除   true false',
  `role_foundtime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '该表的创建时间',
  `role_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '该表被修改的时间',
  `role_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_role
-- ----------------------------
INSERT INTO `sachzhong_role` VALUES (1, 1, '超级管理员', 'sachzhong_role_001', '管理员', '拥有所有操作的角色', 1, 'false', '2020-06-22 09:00:13', '2020-06-23 15:46:53', '无');
INSERT INTO `sachzhong_role` VALUES (2, 2, '普通管理员', 'sachzhong_role_002', '管理员', '拥有查询和添加操作', 1, 'fasle', '2020-06-23 15:46:46', '2020-06-23 15:47:42', '无');
INSERT INTO `sachzhong_role` VALUES (3, 3, '能支付的普通管理员', 'sachzhong_role_003', '管理员', '拥有查询，添加和支付功能', 1, 'fasle', '2020-06-23 15:57:24', '2020-06-23 15:57:56', '无');

-- ----------------------------
-- Table structure for sachzhong_rolebymenu
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_rolebymenu`;
CREATE TABLE `sachzhong_rolebymenu`  (
  `rolebymenu_id` int(30) NOT NULL COMMENT '角色菜单关联表ID',
  `rolebymenu_roleid` int(30) DEFAULT NULL COMMENT '角色ID',
  `rolebymenu_menuid` int(30) DEFAULT NULL COMMENT '菜单ID',
  `rolebymenu_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `rolebymenu_opuserid` int(11) DEFAULT NULL COMMENT '操作用户id',
  `rolebymenu_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '该表是否被删除   true false',
  `rolebymenu_foundtime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '该表的创建时间',
  `rolebymenu_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '该表被修改的时间',
  PRIMARY KEY (`rolebymenu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_rolebymenu
-- ----------------------------
INSERT INTO `sachzhong_rolebymenu` VALUES (1, 1, 1, '无', 1, 'fasle', '2020-06-22 09:03:17', '2020-06-22 09:03:17');
INSERT INTO `sachzhong_rolebymenu` VALUES (2, 2, 2, '无', 1, 'false', '2020-06-23 15:50:41', '2020-06-23 15:50:41');
INSERT INTO `sachzhong_rolebymenu` VALUES (3, 3, 2, '无', 1, 'fasle', '2020-06-23 15:56:36', '2020-06-23 16:00:10');
INSERT INTO `sachzhong_rolebymenu` VALUES (4, 3, 3, '无', 1, 'fasle', '2020-06-23 15:56:59', '2020-06-23 15:56:59');

-- ----------------------------
-- Table structure for sachzhong_user
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_user`;
CREATE TABLE `sachzhong_user`  (
  `user_id` int(30) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_money` float(10, 2) DEFAULT NULL COMMENT '用户的M币',
  `user_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户性别',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户昵称',
  `user_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户头像地址',
  `user_age` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户年龄',
  `user_idcard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户身份证',
  `user_idcardname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户身份证名',
  `user_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户手机',
  `user_mail` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户邮箱',
  `user_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户类型',
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户密码',
  `user_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户地址',
  `user_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户是否被删除',
  `user_logintype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户是否登陆了',
  `user_loginip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户最近的登陆IP',
  `user_deletetime` datetime(0) DEFAULT NULL COMMENT '用户被删除的时间',
  `user_regtime` datetime(0) DEFAULT NULL COMMENT '用户创建时间',
  `user_logintime` datetime(0) DEFAULT NULL COMMENT '用户最近登陆时间',
  `user_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '用户操作更新时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_user
-- ----------------------------
INSERT INTO `sachzhong_user` VALUES (1, 37.20, '男', '情哥', 'images/101.jpg', '18', '431126199705282215', '钟盛勤', '15616902209', '1490010439@qq.com', '1', '520131455', '湖南长沙', 'false', 'true', NULL, NULL, NULL, NULL, '2020-06-12 14:34:44');
INSERT INTO `sachzhong_user` VALUES (2, 67.40, '男', '天玄子', 'images/102.jpg', '19', '431126199705282214', '钟盛勤', '17673601560', '782439052@qq.com', '1', '123456', '湖南长沙', 'false', 'null', 'null', '2020-03-27 20:53:18', '2020-03-21 10:49:54', '2019-11-13 00:00:00', '2020-06-12 13:39:08');
INSERT INTO `sachzhong_user` VALUES (3, 180.00, '男', '钟筱萱', 'images/104.jpg', '20', '431126199705282214', '钟筱萱', '15684950032', '15684950032@163.com', '1', '123456', '湖南长沙', 'false', 'null', 'null', '2020-03-27 20:44:33', '2020-03-27 19:42:19', NULL, '2020-06-12 14:33:02');
INSERT INTO `sachzhong_user` VALUES (4, 200.00, '男', '钟离昧', 'images/105.jpg', '99', '431126199705282213', '钟离昧', '15684950000', '15684950000@163.com', '1', '123456', '酆都', 'false', 'undefined', NULL, NULL, NULL, NULL, '2020-04-25 16:51:27');

-- ----------------------------
-- Table structure for sachzhong_userbyrole
-- ----------------------------
DROP TABLE IF EXISTS `sachzhong_userbyrole`;
CREATE TABLE `sachzhong_userbyrole`  (
  `userbyrole_id` int(30) NOT NULL COMMENT '用户角色关联表ID',
  `userbyrole_userid` int(30) DEFAULT NULL COMMENT '用户ID',
  `userbyrole_roleid` int(30) DEFAULT NULL COMMENT '角色ID',
  `userbyrole_back` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `userbyrole_opuserid` int(11) DEFAULT NULL COMMENT '操作用户id',
  `userbyrole_deletetype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '该表是否被删除   true false',
  `userbyrole_foundtime` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '该表的创建时间',
  `userbyrole_updatetime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '该表被修改的时间',
  PRIMARY KEY (`userbyrole_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sachzhong_userbyrole
-- ----------------------------
INSERT INTO `sachzhong_userbyrole` VALUES (1, 2, 1, '无', 1, 'false', '2020-06-22 09:00:50', '2020-06-22 09:00:50');
INSERT INTO `sachzhong_userbyrole` VALUES (2, 1, 2, '无', 1, 'false', '2020-06-23 15:44:18', '2020-06-23 15:48:00');
INSERT INTO `sachzhong_userbyrole` VALUES (3, 3, 3, '无', 1, 'fasle', '2020-06-23 15:58:52', '2020-06-23 15:58:52');

SET FOREIGN_KEY_CHECKS = 1;


# 最终结果
{
  "requestId": "SachZhong-User006281153200000022004",
  "startDateTime": "2020-06-28T11:53:20.483",
  "locale": "zh_CN",
  "clientIp": "0:0:0:0:0:0:0:1",
  "entryTx": "InterfaceController.getAllInfoByUserId",
  "body": {
    "menuByOperationRspDTOS": [
      {
        "menubyoperationId": 5,
        "menubyoperationOperationid": 1,
        "menubyoperationMenuid": 2,
        "menubyoperationBack": "无",
        "menubyoperationOpuserid": 1,
        "menubyoperationDeletetype": "fasle",
        "menubyoperationFoundtime": "2020-06-23T15:51:06",
        "menubyoperationUpdatetime": "2020-06-23T15:51:06"
      },
      {
        "menubyoperationId": 6,
        "menubyoperationOperationid": 3,
        "menubyoperationMenuid": 2,
        "menubyoperationBack": "无",
        "menubyoperationOpuserid": 1,
        "menubyoperationDeletetype": "fasle",
        "menubyoperationFoundtime": "2020-06-23T15:51:27",
        "menubyoperationUpdatetime": "2020-06-23T15:51:27"
      }
    ],
    "menuRspDTOS": [
      {
        "menuId": 2,
        "menuGrade": 2,
        "menuName": "普通管理菜单",
        "menuType": "管理",
        "menuNumber": "sachzhong_menu_002",
        "menuInfo": "只有查询和新增的菜单",
        "menuOpuserid": 1,
        "menuDeletetype": "false",
        "menuFoundtime": "2020-06-23T15:50:05",
        "menuUpdatetime": "2020-06-23T15:50:05",
        "menuBack": "无"
      }
    ],
    "operationRspDTOS": [
      {
        "operationId": 1,
        "operationName": "添加",
        "operationGrade": 1,
        "operationNumber": "sachzhong_op_1",
        "operationType": "添加",
        "operationInfo": "添加信息",
        "operationOpuserid": 1,
        "operationDeletetype": "false",
        "operationFoundtime": "2020-06-22T09:04:31",
        "operationUpdatetime": "2020-06-23T15:54:37",
        "operationBack": "无"
      },
      {
        "operationId": 3,
        "operationName": "查找",
        "operationGrade": 1,
        "operationNumber": "sachzhong_op_3",
        "operationType": "查找",
        "operationInfo": "查找信息",
        "operationOpuserid": 1,
        "operationDeletetype": "fasle",
        "operationFoundtime": "2020-06-22T09:06:22",
        "operationUpdatetime": "2020-06-23T15:54:45",
        "operationBack": "无"
      }
    ],
    "roleByMenuRspDTOS": [
      {
        "rolebymenuId": 2,
        "rolebymenuRoleid": 2,
        "rolebymenuMenuid": 2,
        "rolebymenuBack": "无",
        "rolebymenuOpuserid": 1,
        "rolebymenuDeletetype": "false",
        "rolebymenuFoundtime": "2020-06-23T15:50:41",
        "rolebymenuUpdatetime": "2020-06-23T15:50:41"
      }
    ],
    "roleRspDTOS": [
      {
        "roleId": 2,
        "roleGrade": 2,
        "roleName": "普通管理员",
        "roleNumber": "sachzhong_role_002",
        "roleType": "管理员",
        "roleInfo": "拥有查询和添加操作",
        "roleOpuserid": 1,
        "roleDeletetype": "fasle",
        "roleFoundtime": "2020-06-23T15:46:46",
        "roleUpdatetime": "2020-06-23T15:47:42",
        "roleBack": "无"
      }
    ],
    "userByRoleRspDTOS": [
      {
        "userbyroleId": 2,
        "userbyroleUserid": 1,
        "userbyroleRoleid": 2,
        "userbyroleBack": "无",
        "userbyroleOpuserid": 1,
        "userbyroleDeletetype": "false",
        "userbyroleFoundtime": "2020-06-23T15:44:18",
        "userbyroleUpdatetime": "2020-06-23T15:48:00"
      }
    ],
    "userRspDTOS": [
      {
        "userId": 1,
        "userMoney": 37.2,
        "userSex": "男",
        "userName": "情哥",
        "userImg": "images/101.jpg",
        "userAge": "18",
        "userIdcard": "431126199705282215",
        "userIdcardname": "钟盛勤",
        "userPhone": "156169022XX",
        "userMail": "1490010439@qq.com",
        "userType": "1",
        "userPassword": "XXXXXXXX",
        "userAddress": "湖南长沙",
        "userDeletetype": "false",
        "userLogintype": "true",
        "userUpdatetime": "2020-06-12T14:34:44"
      }
    ]
  },
  "msgCd": "UPM00000"
}
