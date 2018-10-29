
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


CREATE TABLE `db_recommend` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` char(100) DEFAULT NULL COMMENT '被推荐的人',
  `source_id` int(11) DEFAULT NULL COMMENT '被推荐的仓库id或者需求id',
  `type` int(11) DEFAULT NULL COMMENT '0是仓库1是需求',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推荐表';


CREATE TABLE `db_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `source_id` int(11) DEFAULT NULL,
  `content` varchar(20000) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


INSERT INTO `db_record` VALUES (1,'0',57,'435<span style=\"font-weight: bold;\">4wtregdr</span>'),(2,'0',56,'sdfsdf&nbsp;');


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
  `create_time` datetime DEFAULT NULL COMMENT '创建这条记录的时间',
  `shop_id` int(11) DEFAULT NULL,
  `source_rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8 COMMENT='需求表';


INSERT INTO `db_require` VALUES (1,'北京',111,'hasdjkfhdasjkl','的方式的','富含淀粉','回家法国','2018-09-22 00:00:00','机卡分离发',100,'地方撒打发手动阀第三方',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(2,'广州',50,'地方撒旦','法国的说法','是否地方','是否感到十分','2018-09-22 00:00:00','的发生的',24,'士大夫似的',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(25,'北京市',NULL,'物流仓储-日用快消品','需要喷淋','需要月台','只要单层或底楼','2018-10-02 21:44:49','1-3个月',NULL,'',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(29,'广州市->从化区',1000,'食品存储','无消防需求','无月台需求','1','2018-10-02 00:00:00','100',122,'',1,'sdf','2018-10-15 17:32:26',NULL,NULL),(30,'南京市',0,'物流仓储-食品','不限','不限','楼库也可以','2018-10-02 00:00:00','1-3个月',111,'',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(34,'天津市',111,'物流仓储-日用快消品','需要喷淋','不要月台','只要单层或底楼','2018-10-02 00:00:00','6-12个月',100,'',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(35,'北京市',555,'物流仓储-日用快消品','需要喷淋','需要月台','只要单层或底楼','2018-10-16 00:00:00','6-12个月',5757,'575',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(36,'西安市',1000,'物流仓储-白色家电','需要喷淋','需要月台','只要单层或底楼','2018-10-02 00:00:00','3-6个月',200,'',1,'sdf','2018-10-15 17:32:26',NULL,NULL),(38,'西安市',100,'物流仓储-日用快消品','不限喷淋','不限月台','楼库也可以','2018-10-02 00:00:00','1-3个月',188,'',2,'sdf','2018-10-15 17:32:26',NULL,NULL),(39,'北京市',100,'物流仓储-日用快消品','不限喷淋','不限月台','楼库也可以','2018-10-02 00:00:00','1-3个月',123,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(40,'广州市',999,'物流仓储-日用快消品','不限喷淋','不限月台','楼库也可以','2018-10-02 00:00:00','1-3个月',233,'',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(41,'北京市',10000,'物流仓储-日用快消品','需要喷淋','需要月台','只要单层或底楼','2018-10-18 00:00:00','1-3年',3500,'',1,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','2018-10-15 17:32:26',NULL,NULL),(42,'',NULL,'生产制造-日用快消品','不限喷淋','不限月台','楼库也可以','2018-12-03 00:00:00','1-3年',100,'好仓库，我喜欢',0,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','2018-10-15 17:32:26',NULL,NULL),(43,'',NULL,'','','','','2018-10-02 00:00:00','',0,'',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(44,'',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(45,'',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(46,'广州市-海珠区 北京市-东城区 ',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(47,'广州市-海珠区 ',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(48,'广州市-海珠区 ',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(49,'北京市->北京市->东城区 北京市->北京市->西城区 ',5000,'物流仓储-汽车配件','需要喷淋','需要月台','只要单层或底楼','2018-10-31 00:00:00','6-12个月',2500,'',1,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','2018-10-15 17:32:26',NULL,NULL),(50,'广东省->广州市->海珠区 ',2500,'物流仓储-日用快消品','需要喷淋','需要月台','只要单层或底楼','2018-11-30 00:00:00','3-5年',3000,'我爱仓库，呵呵',1,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','2018-10-15 17:32:26',NULL,NULL),(51,'广东省->广州市->海珠区 ',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(52,'广东省-广州市-海珠区 ',NULL,'物流仓储-日用快消品','','','','2018-10-02 00:00:00','',0,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(53,'重庆市-重庆市-万州区 ',11,'物流仓储-日用快消品','不限喷淋','不要月台','只要单层或底楼','2018-10-02 00:00:00','6-12个月',1100,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-15 17:32:26',NULL,NULL),(54,'浙江省-杭州市-临安市 ',3000,'物流仓储-电子产品','需要喷淋','需要月台','只要单层或底楼','2018-12-12 00:00:00','1-3年',3000,'好仓库，仓库好',1,'oItEJ41vc212Bjj_ugPEGa4O94qI','2018-10-15 17:32:26',NULL,NULL),(55,'广东省-广州市-海珠区 ',2222,'物流仓储-日用快消品','不限喷淋','不限月台','楼库也可以','2018-10-02 00:00:00','1-3个月',11100,'',2,'oItEJ4zfD-snBl69srqzOCFCSO5U','2018-10-02 00:00:00',NULL,NULL),(56,'广东',2,'物流仓储-日用快消品','不限喷淋','需要月台','只要单层或底楼','2018-10-02 00:00:00','3-6个月',1200,'23',2,'oItEJ4zfD-snBl69srqzOCFCSO5U',NULL,NULL,NULL),(57,'广东省-广州市-增城区 广东省-广州市-黄埔区 ',20000,'物流仓储-其他','需要喷淋','需要月台','只要单层或底楼','2018-11-15 00:00:00','3-5年',3200,'物流分拨用，需要双通库，有高台，场地至少35米',1,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI',NULL,NULL,NULL);



CREATE TABLE `db_require_code_pic_cache` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `url` char(100) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

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
  `open_up` int(11) NOT NULL DEFAULT '0' COMMENT '是否开通',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='用户表';



INSERT INTO `db_user` VALUES (1,'sdf','hqt',NULL,NULL,'17328301723',NULL,NULL,'某公司1','https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83eqOc9UDU0cNq7dH0sNdLoibjKJd1usZvQeaVPUu3jv050c3tibS49Ss9TaZVIzT1iazpVPFTGn7HHnAw/132',0),(2,'oItEJ4zfD-snBl69srqzOCFCSO5U','何秋彤','hqt',NULL,'110123',NULL,'US Clay County','广州某企业','https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83eqOc9UDU0cNq7dH0sNdLoibjKJd1usZvQeaVPUu3jv050c3tibS49Ss9TaZVIzT1iazpVPFTGn7HHnAw/132',0),(5,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','全冰凝','全冰凝Herbert',NULL,'18938841602',NULL,'China Shenzhen','赛沃云仓','https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKCk105yDHIGEspcusycTLibFp8V9bZibg1tEs69ExldanKJKx0VIyD1EIWW5Td2fXLqhBwV2Kwm01Q/132',0),(6,'oItEJ41vc212Bjj_ugPEGa4O94qI','全冰凝',NULL,NULL,'18938841602',NULL,NULL,'赛沃云仓','https://wx.qlogo.cn/mmopen/vi_32/HRGSy06jVo0kksfo2icFEHdLT8ET3tkB21sqIf8VMibeY8lWHZRKCbicLr0ytKaaQUYg5YpcgWiaN4DiaiaUfkSTicfLA/132',0),(7,'oItEJ41SgldJL3UUF9GZeuDhQw2E',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(8,'oItEJ49hjodx5_xq2VdGkl02mG9o','刘先生',NULL,NULL,'15361580968',NULL,NULL,'沃达','https://wx.qlogo.cn/mmopen/vi_32/6Cx5kqUjNFY45MgOUrrSs6w1AMTYLiag7ibAp8fzbxHdVMEJl68qPdagjd7TRssqZRMe2oT64D8hN5e6oxAz837A/132',0),(9,'oItEJ464ZnXzsKcstDq1oUd7ItvU',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(10,'oItEJ4yKPjkxXyFFmduki2BC12IA',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(11,'oItEJ4494g6247cHEt4wFZRKh32E',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(12,'oItEJ4x1Tf-o47pGQ3LGECu0yLvU',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(13,'oItEJ482PHMLZKDM2BhebN7_k_CI',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0),(14,'oItEJ405y7RZScf-t0PDj6gSDUPk','','柴进',NULL,'',NULL,' ','','https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTIlShPdVFbIabKNAMNQXh9Yhr7BZXg73OwOcf1B21nxHY3VtlSx1TnWwcoibFGzY3eH9ZK8pE6ZnKA/132',0);


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
  `shop_id` int(11) DEFAULT NULL COMMENT '其实是userid',
  `source_wid` int(11) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8;



INSERT INTO `db_warehouse` VALUES (1,'北京',NULL,'园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','地方上的','法国的说法',2,'2018-10-05 22:10:09',NULL,NULL),(6,'北京','111','园区服务1 园区服务2 园区服务3','有淋浴 厉害了',1,'sdf','推荐推荐','备注备注',2,'2018-10-05 22:10:09',NULL,NULL),(31,'沈阳市','pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.mKbarvXmbqeP0a2785a1c4acdb370ca43068198b1254.png','可注册 有食堂 有宿舍楼','资料 办公展厅 冶炼电镀',0,'sdf','不需落税 独门独院 场地大','dfgdfdf ',2,'2018-10-11 20:42:18',NULL,NULL),(32,'西安市','','可注册 可环评','其他 化工医药 木材造纸',0,'sdf','环氧地坪','哈哈',2,'2018-10-11 22:14:05',NULL,NULL),(33,'西安市','https://pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.2rCB49xRmrSza19bd907c466d3e891c5f4709aad9133.jpeg pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.1ax4AdYLesBp00094c0d4fcbe5810c7e8d8b9411b199.jpeg','可注册 可环评','物流仓储 汽车 资料',0,'sdf','多面卸货 环氧地坪','33',2,'2018-10-11 22:29:09',NULL,NULL),(34,'北京市','https://pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.ly3jZNjuMkvl00094c0d4fcbe5810c7e8d8b9411b199.jpeg','可注册 可环评','化工医药 其他',0,'sdf','环氧地坪 多面卸货','11',2,'2018-10-11 22:34:14',NULL,NULL),(36,'广州市','https://pic.warehouse.saiwoyun.com/tmp_1cd7afb186193429e2c25637a63bc7dd.jpg https://pic.warehouse.saiwoyun.com/tmp_1cd7afb186193429e2c25637a63bc7dd.jpg','有宿舍楼 可环评 可注册 有食堂','其他 化工医药',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','环氧地坪 多面卸货','',2,'2018-10-12 10:05:33',NULL,NULL),(37,'广州市','https://pic.warehouse.saiwoyun.com/tmp_0fdd31076ca7ba20a11450b23affdb30.jpg https://pic.warehouse.saiwoyun.com/tmp_9b6ed511c8cd3977f24126b8d0ab60ad.jpg','可注册 有食堂 可环评','其他 化工医药 木材造纸',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','环氧地坪 多面卸货','无',2,'2018-10-12 10:27:39',NULL,NULL),(38,'北京市','https://pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.LuJCVevvkuJe5160dd8796f13783763c20a6d9b2637f.png https://pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.AxvrONPzgCd8c3526916522e4ee2ee8dd7258cca25b6.png','可注册','',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','','',2,'2018-10-12 10:31:22',NULL,NULL),(39,'北京市','','','',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','','',2,'2018-10-12 10:33:16',NULL,NULL),(40,'北京市','https://pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.dVc0svxSgkkt8077525ab896fa79de55a6a940bada93.jpg https://pic.warehouse.saiwoyun.com/tmp/wxf134e694dfd9306a.o6zAJs3N7YtGn7AYtSQkgDfCDIp0.jE1iCaiAXCK5cddbbff35cdc92739c78f4cfffca5ef4.png','可注册','其他',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','','',2,'2018-10-12 10:43:09',NULL,NULL),(41,'北京市','','','',0,'oItEJ4zfD-snBl69srqzOCFCSO5U','','',2,'2018-10-12 10:45:45',NULL,NULL),(42,'广东省 东莞市 黄江镇','https://pic.warehouse.saiwoyun.com/tmp_c8f8aa6574d750dbfcc18414b78274ebfe4cfd755c3e5c49.jpg https://pic.warehouse.saiwoyun.com/tmp_750f2f4540ade712e12f24deea4fc09824753dcbfc986446.jpg https://pic.warehouse.saiwoyun.com/tmp_81f2be9c9868f6221ad15e57d0c9052dbb167dbda7c0f39f.jpg','办公楼 有宿舍楼 有食堂 可环评 可托管 可注册','电商 物流仓储 汽车 木材造纸 化工医药 机械电子 办公展厅',0,'oItEJ41vc212Bjj_ugPEGa4O94qI','独门独院 104板块 证件齐全 层高高 场地大 电量充足','你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库你好仓库',1,'2018-10-14 07:12:58',NULL,NULL),(43,'北京市 北京市 东城区','','','',0,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','','撸啊撸墨迹咯女摸鸡鸡',2,'2018-10-14 18:30:24',NULL,NULL),(44,'北京市 北京市 东城区','','','',0,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','','撸啊撸墨迹咯女摸鸡鸡',2,'2018-10-14 18:30:27',NULL,NULL),(45,'北京市 北京市 东城区','','','',0,'oItEJ4xN8D6Hw9Pou3lQDtkuUAcI','','撸啊撸墨迹咯女摸鸡鸡',2,'2018-10-14 18:30:27',NULL,NULL),(46,'广东省 广州市 海珠区','','','',0,'oItEJ464ZnXzsKcstDq1oUd7ItvU','','',1,'2018-10-14 22:00:58',NULL,NULL),(47,'广东省 广州市 海珠区','','','',0,'oItEJ405y7RZScf-t0PDj6gSDUPk','','',2,'2018-10-15 21:02:49',NULL,NULL),(48,'广东省 广州市 海珠区','','','',0,'oItEJ405y7RZScf-t0PDj6gSDUPk','','',2,'2018-10-15 21:07:23',NULL,NULL);



CREATE TABLE `db_warehouse_code_pic_cache` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `url` char(100) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=MyISAM AUTO_INCREMENT=78 DEFAULT CHARSET=utf8;


INSERT INTO `db_warehouse_code_pic_cache` VALUES (77,'Fnh2pN0njyhZhDeHwaC1zFGflL9x');


CREATE TABLE `db_warehouse_unit` (
  `wuid` int(11) NOT NULL AUTO_INCREMENT,
  `area` int(11) DEFAULT NULL COMMENT '面积',
  `could_sublet` int(11) DEFAULT NULL COMMENT '能否分组 1可以 0不可以',
  `min_sublet_area` int(11) DEFAULT NULL COMMENT '最小分租面积',
  `price` int(11) DEFAULT NULL COMMENT '报价',
  `supporting_facilities` varchar(255) DEFAULT NULL COMMENT '配套设施',
  `warehouse_id` int(11) DEFAULT NULL,
  `floor` char(10) DEFAULT NULL COMMENT '楼层',
  PRIMARY KEY (`wuid`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8 COMMENT='单元';



INSERT INTO `db_warehouse_unit` VALUES (25,233,0,50,100,'啥都没',1,'1楼'),(26,233,0,50,100,'啥都没',1,'1楼'),(27,233,1,440,111,'无',2,'1楼'),(28,233,1,440,111,'无',2,'1楼'),(29,233,1,440,111,'无',2,'1楼'),(30,233,1,440,111,'无',2,'1楼'),(31,233,1,440,111,'无',2,'1楼'),(32,233,1,440,111,'无',2,'1楼'),(33,233,1,440,111,'无',2,'1楼'),(34,233,1,440,111,'无',3,'1楼'),(35,233,1,440,111,'无',3,'1楼'),(36,233,1,440,111,'无',3,'1楼'),(37,233,1,440,111,'无',3,'1楼'),(38,233,1,440,111,'无',3,'1楼'),(39,233,1,440,111,'无',3,'1楼'),(40,233,1,440,111,'无',3,'1楼'),(41,233,1,440,111,'无',4,'1楼'),(42,233,1,440,111,'无',4,'1楼'),(43,233,1,440,111,'无',4,'1楼'),(44,233,1,440,111,'无',4,'1楼'),(45,233,1,440,111,'无',4,'1楼'),(46,233,1,440,111,'无',4,'1楼'),(47,233,1,440,111,'无',4,'1楼'),(66,233,1,440,111,'无',28,'1楼'),(67,233,1,440,111,'无',28,'1楼'),(68,233,1,440,111,'无',28,'1楼'),(69,233,1,440,111,'无',28,'1楼'),(70,233,1,440,111,'无',28,'1楼'),(71,233,1,440,111,'无',28,'1楼'),(72,233,1,440,111,'无',28,'1楼'),(73,233,1,440,111,'无',28,'1楼'),(74,233,1,440,111,'无',28,'1楼'),(88,111,0,NULL,22200,NULL,38,''),(89,10010,1,198,77700,NULL,39,''),(90,111,0,NULL,123,NULL,40,'一楼'),(92,111,0,22,2200,'月台 喷淋 行车 ',41,'一楼'),(93,15000,1,3000,3200,'月台 喷淋 行车 ',42,'一楼'),(94,NULL,1,NULL,0,'',43,'一楼'),(95,NULL,0,NULL,0,'',44,'一楼'),(96,NULL,0,NULL,0,'',45,'一楼'),(98,20000,0,5000,3500,'',46,'一楼'),(99,NULL,1,NULL,0,'',47,'一楼'),(100,NULL,1,NULL,0,'',48,'一楼'),(101,1400,0,NULL,3200,'喷淋 ',49,'一楼');
