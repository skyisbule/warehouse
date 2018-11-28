-- MySQL dump 10.13  Distrib 5.6.41, for Linux (x86_64)
--
-- Host: localhost    Database: db_warehouse
-- ------------------------------------------------------
-- Server version	5.6.41

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `db_admin`
--

DROP TABLE IF EXISTS `db_admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_admin`
--

LOCK TABLES `db_admin` WRITE;
/*!40000 ALTER TABLE `db_admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `db_admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `db_collect`
--

DROP TABLE IF EXISTS `db_collect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `db_collect` (
  `cid` int(11) DEFAULT NULL,
  `uid` int(11) NOT NULL,
  `open_id` char(100) NOT NULL,
  `shop_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_collect`
--

LOCK TABLES `db_collect` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_message`
--

DROP TABLE IF EXISTS `db_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `db_message` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` varchar(7000) DEFAULT NULL,
  `create_date` date DEFAULT NULL,
  `from_type` int(11) DEFAULT NULL COMMENT '0-系统 1-个人',
  `class_type` int(11) DEFAULT NULL COMMENT '0-公告 1-供应 2-需求',
  `open_id` char(100) DEFAULT NULL,
  `locate` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_message`
--

LOCK TABLES `db_message` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_recommend`
--

DROP TABLE IF EXISTS `db_recommend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `db_recommend` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` char(100) DEFAULT NULL COMMENT '被推荐的人',
  `source_id` int(11) DEFAULT NULL COMMENT '被推荐的仓库id或者需求id',
  `type` int(11) DEFAULT NULL COMMENT '0是仓库1是需求',
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='推荐表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_recommend`
--

LOCK TABLES `db_recommend` WRITE;
/*!40000 ALTER TABLE `db_recommend` DISABLE KEYS */;
/*!40000 ALTER TABLE `db_recommend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `db_record`
--

DROP TABLE IF EXISTS `db_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `db_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `source_id` int(11) DEFAULT NULL,
  `content` varchar(20000) DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_record`
--

LOCK TABLES `db_record` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_require`
--

DROP TABLE IF EXISTS `db_require`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  `source_rid` int(11) DEFAULT NULL,
  `shop_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=86 DEFAULT CHARSET=utf8 COMMENT='需求表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_require`
--

LOCK TABLES `db_require` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_require_code_pic_cache`
--

DROP TABLE IF EXISTS `db_require_code_pic_cache`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `db_require_code_pic_cache` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `url` char(100) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=MyISAM AUTO_INCREMENT=85 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_require_code_pic_cache`
--

LOCK TABLES `db_require_code_pic_cache` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_user`
--

DROP TABLE IF EXISTS `db_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  `open_up` int(11) DEFAULT '0',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=367 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_user`
--

LOCK TABLES `db_user` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_warehouse`
--

DROP TABLE IF EXISTS `db_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  `shop_id` int(11) DEFAULT NULL,
  `source_wid` int(11) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_warehouse`
--

LOCK TABLES `db_warehouse` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_warehouse_code_pic_cache`
--

DROP TABLE IF EXISTS `db_warehouse_code_pic_cache`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `db_warehouse_code_pic_cache` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `url` char(100) DEFAULT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=MyISAM AUTO_INCREMENT=127 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_warehouse_code_pic_cache`
--

LOCK TABLES `db_warehouse_code_pic_cache` WRITE;
UNLOCK TABLES;

--
-- Table structure for table `db_warehouse_unit`
--

DROP TABLE IF EXISTS `db_warehouse_unit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
) ENGINE=InnoDB AUTO_INCREMENT=210 DEFAULT CHARSET=utf8 COMMENT='单元';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `db_warehouse_unit`
--

LOCK TABLES `db_warehouse_unit` WRITE;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-22 22:58:10
