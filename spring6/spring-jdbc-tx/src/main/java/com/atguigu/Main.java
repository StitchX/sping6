package com.atguigu;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*
什么事事务？
    数据库事务(transaction)是访问并可能操作各种数据项的一个数据库操作序列，这些操作要么全部执行,要么全部不执行，
    是一个不可分割的工作单位。事务由事务开始与事务结束之间执行的全部数据库操作组成。
事务的特性：
    原子性(Atomicity)、一致性(Consistency)、隔离性(lsolation)、持久性(Durability)

spring中有两种事务：
    编程式事务：自己写完整的过程；细节多繁琐、代码复用性不高

    声明式事务：框架会考虑健壮性、性能优化，消除冗余代码，提高开发效率
 */


/*
CREATE TABLE `t_book`
(
    `book_id`   int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `book_name` varchar(20)      DEFAULT NULL COMMENT '图书名称',
    `price`     int(11)          DEFAULT NULL COMMENT '价格',
    `stock`     int(10) unsigned DEFAULT NULL COMMENT '库存(无符号)',
    PRIMARY KEY (`book_id`)
)ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
insert into `t_book`(`book_id`,`book_name`,`price`,`stock`)
values (1,'斗破苍穹',80,100),(2,'斗罗大陆',50,100);

CREATE TABLE `t_user`(
    `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `username` varchar(20) DEFAULT NULL COMMENT'用户名' ,
    `balance` int(10) unsigned DEFAULT NULL COMMENT '余额(无符号)',
    PRIMARY KEY (`user_id`)
                     )ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
insert into `t_user` (`user_id`,`username`, `balance`) values (1,'admin',50);
 */