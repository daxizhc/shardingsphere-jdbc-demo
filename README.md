# ShardingSphere示例，整合SpringBoot、MybatisPlus、SpringDataJpa，实现分库分表、读写分离

## 0、项目简介
本项目用于学习分库分表插件[ShardingSphere](https://shardingsphere.apache.org)，整合两大ORM框架：SpringDataJpa和Mybatis，实现数据分片、读写分离、分布式事务等功能。

## 1、技术选型

```
SrpingBoot2.1.13 + SpringDataJpa2.1.16 + ShardingSphere4.0.1
```

## 2、项目结构

```
shardingsphere-jdbc-demo
  ├── shardingsphere-jdbc-common # 公共接口定义
  ├── shardingsphere-jdbc-jpa    # jpa实现的操作
  ├── shardingsphere-jdbc-sharding-jpa # jpa整合ShardingSphere实现分库分表
  └── sql
        └── init.sql #数据库脚本
```

## 3、启动流程

- 在MySQL创建两个数据库shardingsphere_1、shardingsphere_2，运行sql文件夹下的init.sql文件

- 在shardingsphere-jdbc-common文件夹下运行 mvn clean install

- 在shardingsphere-jdbc-jpa文件夹下运行 mvn clean install

- 运行shardingsphere-jdbc-sharding-jpa下的JpaShardingMain类中的main方法

