/*
SQLyog Ultimate v8.32 
MySQL - 5.5.5-10.3.10-MariaDB : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis`;

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`id`,`departmentName`) values (1,'AA'),(2,'BB'),(3,'CC'),(4,'DD');

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int(2) DEFAULT NULL,
  `birth` varchar(255) DEFAULT NULL,
  `depId` int(2) DEFAULT NULL,
  `department` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

insert  into `employee`(`id`,`lastName`,`email`,`gender`,`birth`,`depId`,`department`) values (1,'zhangsan','1',1,'2018-11-17 18:22:18',1,NULL),(2,'lisi','1',0,'2018-11-19 09:44:38',1,NULL),(4,'wangwu','wangwu@163.com',0,'2018-11-19 00:00:00',2,NULL),(5,'E-CCqqqq','1562@162',1,'2999-11-17 00:00:00',3,NULL),(7,'zhaoliu123','zhaoliu@163.com',0,'2018-11-20 00:00:00',4,'DD'),(10,'qq123','qq@qq',0,'2999-11-17 00:00:00',2,'DD'),(12,'xiongda','xiongda@qq.com',1,'2018-12-21 00:00:00',2,NULL),(13,'qiang','qiang@qq.com',0,'2999-11-17 00:00:00',3,'CC');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
