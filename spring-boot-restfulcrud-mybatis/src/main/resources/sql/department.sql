/*
SQLyog Ultimate v8.32 
MySQL - 5.5.5-10.3.10-MariaDB 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `employee` (
	`id` double ,
	`lastName` varchar (765),
	`email` varchar (765),
	`gender` double ,
	`birth` varchar (765),
	`depId` double ,
	`department` varchar (765)
); 
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('1','zhangsan','1','1','2018-11-17 18:22:18','1',NULL);
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('2','lisi','1','0','2018-11-19 09:44:38','1',NULL);
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('4','wangwu','wangwu@163.com','0','2018-11-19 00:00:00','2',NULL);
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('5','E-CCqqqq','1562@162','1','2999-11-17 00:00:00','3',NULL);
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('7','zhaoliu123','zhaoliu@163.com','0','2018-11-20 00:00:00','4','DD');
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('10','qq123','qq@qq','0','2999-11-17 00:00:00','2','DD');
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('12','xiongda','xiongda@qq.com','1','2018-12-21 00:00:00','2',NULL);
insert into `employee` (`id`, `lastName`, `email`, `gender`, `birth`, `depId`, `department`) values('13','qiang','qiang@qq.com','0','2999-11-17 00:00:00','3','CC');
