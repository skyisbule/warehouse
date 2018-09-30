# Host: localhost  (Version: 5.5.53)
# Date: 2018-09-30 17:22:53
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "db_admin"
#

DROP TABLE IF EXISTS `db_admin`;
CREATE TABLE `db_admin` (
  `aid` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) DEFAULT NULL,
  `passwd` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `tel_num` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `power` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "db_admin"
#


#
# Structure for table "db_recommend"
#

DROP TABLE IF EXISTS `db_recommend`;
CREATE TABLE `db_recommend` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` char(100) DEFAULT NULL COMMENT '被推荐的人',
  `source_id` int(11) DEFAULT NULL COMMENT '被推荐的仓库id或者需求id',
  `type` int(11) DEFAULT NULL COMMENT '0是仓库1是需求',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推荐表';

#
# Data for table "db_recommend"
#


#
# Structure for table "db_require"
#

DROP TABLE IF EXISTS `db_require`;
CREATE TABLE `db_require` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `locates` varchar(1255) DEFAULT NULL COMMENT '位置',
  `area` int(11) DEFAULT NULL COMMENT '面积',
  `purpose` varchar(255) DEFAULT NULL COMMENT '用途',
  `fire_control_require` varchar(255) DEFAULT NULL COMMENT '消防需求',
  `platform_require` varchar(255) DEFAULT NULL COMMENT '月台需求',
  `floor_require` varchar(255) DEFAULT NULL COMMENT '楼层要求',
  `require_time` datetime DEFAULT NULL COMMENT '需求时间',
  `lease_term` varchar(255) DEFAULT NULL COMMENT '租期',
  `max_price` int(11) DEFAULT NULL COMMENT '最高价格',
  `remark` varchar(1255) DEFAULT NULL COMMENT '备注',
  `status` int(11) DEFAULT NULL COMMENT '0、未审核 1、已经通过审核 3、订单已完成 4、订单已取消',
  `open_id` varchar(100) DEFAULT NULL COMMENT '发布者id',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='需求表';

#
# Data for table "db_require"
#

INSERT INTO `db_require` VALUES (1,'北京',111,'hasdjkfhdasjkl','的方式的','富含淀粉','回家法国','2018-09-22 00:00:00','机卡分离发',100,'地方撒打发手动阀第三方',1,'sdf'),(2,'广州',50,'地方撒旦','法国的说法','是否地方','是否感到十分','2018-09-22 00:00:00','的发生的',24,'士大夫似的',1,'sdf');

#
# Structure for table "db_user"
#

DROP TABLE IF EXISTS `db_user`;
CREATE TABLE `db_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(100) DEFAULT NULL,
  `real_name` varchar(5) DEFAULT NULL COMMENT '真实姓名',
  `nick_name` varchar(255) DEFAULT NULL COMMENT '昵称',
  `sex` char(2) DEFAULT NULL COMMENT '性别',
  `tel_num` varchar(15) DEFAULT NULL COMMENT '电话号',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `locate` varchar(255) DEFAULT NULL COMMENT '位置',
  `company` varchar(255) DEFAULT NULL COMMENT '公司名',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "db_user"
#

INSERT INTO `db_user` VALUES (1,'sdf','skyis','xixix',NULL,'110',NULL,NULL,'某公司');

#
# Structure for table "db_warehouse"
#

DROP TABLE IF EXISTS `db_warehouse`;
CREATE TABLE `db_warehouse` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `locate` varchar(255) DEFAULT NULL COMMENT '位置',
  `picture` varchar(2255) DEFAULT NULL COMMENT '图片',
  `park_service` varchar(255) DEFAULT NULL COMMENT '园区的服务',
  `suitable_for` varchar(255) DEFAULT NULL COMMENT '适合行业',
  `is_pass` int(11) DEFAULT NULL COMMENT '是否通过审核',
  `open_id` char(100) DEFAULT NULL COMMENT '用户的openid',
  `advantage` varchar(255) DEFAULT NULL COMMENT '优势',
  `remark` varchar(2255) DEFAULT NULL COMMENT '备注',
  `status` int(11) DEFAULT NULL COMMENT '0、未审核 1、已经通过审核 3、订单已完成 4、订单已取消',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "db_warehouse"
#

INSERT INTO `db_warehouse` VALUES (1,'1','地方按身','地方按身','sdzf ',1,'sdf','地方上的','法国的说法',0,'2018-09-11 11:00:00');

#
# Structure for table "db_warehouse_unit"
#

DROP TABLE IF EXISTS `db_warehouse_unit`;
CREATE TABLE `db_warehouse_unit` (
  `wuid` int(11) NOT NULL AUTO_INCREMENT,
  `area` int(11) DEFAULT NULL COMMENT '面积',
  `could_sublet` int(11) DEFAULT NULL COMMENT '能否分组 1可以 0不可以',
  `min_sublet_area` int(11) DEFAULT NULL COMMENT '最小分租面积',
  `price` int(11) DEFAULT NULL COMMENT '报价',
  `supporting_facilities` varchar(255) DEFAULT NULL COMMENT '配套设施',
  `warehouse_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`wuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单元';

#
# Data for table "db_warehouse_unit"
#

