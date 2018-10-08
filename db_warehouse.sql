# Host: 127.0.0.1  (Version 5.5.53)
# Date: 2018-10-08 15:41:16
# Generator: MySQL-Front 6.1  (Build 1.15)


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
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COMMENT='需求表';

#
# Data for table "db_require"
#

INSERT INTO `db_require` VALUES (1,'北京',111,'hasdjkfhdasjkl','的方式的','富含淀粉','回家法国','2018-09-22 00:00:00','机卡分离发',100,'地方撒打发手动阀第三方',1,'sdf'),(2,'广州',50,'地方撒旦','法国的说法','是否地方','是否感到十分','2018-09-22 00:00:00','的发生的',24,'士大夫似的',1,'sdf'),(3,'上海',111,'222','333','444','555','2018-10-03 21:44:45','111',222,'333',1,'sdf'),(4,'上海',111,'222','333','444','555','2018-10-03 21:44:46','111',222,'333',1,'sdf'),(5,'上海',111,'222','333','444','555','2018-10-03 21:44:46','111',222,'333',1,'sdf'),(6,'上海',111,'222','333','444','555','2018-10-03 21:44:46','111',222,'333',1,'sdf'),(7,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(8,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(9,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(10,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(11,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(12,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(13,'上海',111,'222','333','444','555','2018-10-03 21:44:47','111',222,'333',1,'sdf'),(14,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(15,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(16,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(17,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(18,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(19,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(20,'上海',111,'222','333','444','555','2018-10-03 21:44:48','111',222,'333',1,'sdf'),(21,'上海',111,'222','333','444','555','2018-10-03 21:44:49','111',222,'333',1,'sdf'),(22,'上海',111,'222','333','444','555','2018-10-03 21:44:49','111',222,'333',1,'sdf');

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
  `head_pic` varchar(255) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "db_user"
#

INSERT INTO `db_user` VALUES (1,'sdf','何爸爸','xixix','男','1732830','heqiutong@qq.com','广州','某公司',NULL);

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
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

#
# Data for table "db_warehouse"
#

INSERT INTO `db_warehouse` VALUES (1,'北京',NULL,'园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','地方上的','法国的说法',1,'2018-10-05 22:10:09'),(2,'广州','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:08'),(3,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:09'),(4,'广州','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:09'),(5,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:09'),(6,'北京','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:09'),(7,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:23'),(8,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:23'),(9,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:23'),(10,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:24'),(11,'上海','111','222','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:24'),(12,'上海','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:24'),(13,'上海','111','222','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:24'),(14,'上海','111','园区服务1 园区服务2 园区服务3','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:24'),(15,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:24'),(16,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(17,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(18,'上海','111','园区服务1 园区服务2 园区服务3','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(19,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(20,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(21,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(22,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:25'),(23,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:26'),(24,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:26'),(25,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:26'),(26,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:26'),(27,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:26'),(28,'上海','111','222','333',1,'sdf','推荐推荐','备注备注',1,'2018-10-05 22:10:26');

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
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8 COMMENT='单元';

#
# Data for table "db_warehouse_unit"
#

INSERT INTO `db_warehouse_unit` VALUES (25,233,0,50,100,'啥都没',1),(26,233,0,50,100,'啥都没',1),(27,233,1,440,111,'无',2),(28,233,1,440,111,'无',2),(29,233,1,440,111,'无',2),(30,233,1,440,111,'无',2),(31,233,1,440,111,'无',2),(32,233,1,440,111,'无',2),(33,233,1,440,111,'无',2),(34,233,1,440,111,'无',3),(35,233,1,440,111,'无',3),(36,233,1,440,111,'无',3),(37,233,1,440,111,'无',3),(38,233,1,440,111,'无',3),(39,233,1,440,111,'无',3),(40,233,1,440,111,'无',3),(41,233,1,440,111,'无',4),(42,233,1,440,111,'无',4),(43,233,1,440,111,'无',4),(44,233,1,440,111,'无',4),(45,233,1,440,111,'无',4),(46,233,1,440,111,'无',4),(47,233,1,440,111,'无',4),(57,233,0,440,111,'无',28),(58,233,0,440,111,'无',28),(59,233,0,440,111,'无',28),(60,233,0,440,111,'无',28),(61,233,0,440,111,'无',28),(62,233,0,440,111,'无',28),(63,233,0,440,111,'无',28),(64,233,0,440,111,'无',28),(65,233,0,440,111,'无',28);
