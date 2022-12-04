# Spring-minio
MinIO 是一个基于Apache License v2.0开源协议的对象存储服务。它兼容亚马逊S3云存储服务接口，非常适合于存储大容量非结构化的数据，例如图片、视频、日志文件、备份数据和容器/虚拟机镜像等，而一个对象文件可以是任意大小，从几kb到最大5T不等。
本项目集成Minio的java客户端SDK，对Minio文件服务器进行读写，将操作封装为MinioUtil工具，直接在项目中可以复用。其操作主要包括：
- 上传文件
- 下载文件
- 读取桶列表
- 读取桶中的文件列表
- 删除桶
- 删除文件
### 附录：中央技术储备仓库（Central Technique Reserve Repository）

#### 基础篇:职业化，从做好OA系统开始
1. [Spring boot整合Mybatis实现增删改查（支持多数据源）](https://gitee.com/shenzhanwang/SSM)![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题")
2. [Spring,SpringMVC和Hibernate的整合实现增删改查](https://gitee.com/shenzhanwang/SSH)
3. [Spring boot整合activiti工作流引擎实现OA开发](https://gitee.com/shenzhanwang/Spring-activiti)![输入图片说明](https://img.shields.io/badge/-%E6%8B%9B%E7%89%8C-yellow.svg)   
4. [Ruoyi-boot集成工作流引擎Flowable实例](https://gitee.com/shenzhanwang/Ruoyi-flowable)![输入图片说明](https://img.shields.io/badge/-%E6%8B%9B%E7%89%8C-yellow.svg) 
5. [Spring发布与调用REST风格的WebService](https://gitee.com/shenzhanwang/Spring-REST)
6. [Spring boot整合Axis调用SOAP风格的web服务](https://gitee.com/shenzhanwang/Spring-axis)
7. [Spring boot整合Apache Shiro实现RBAC权限控制](https://gitee.com/shenzhanwang/Spring-shiro)
8. [使用Spring security实现RBAC权限控制](https://gitee.com/shenzhanwang/spring-security-demo)
#### 中级篇：中间件的各种姿势
9. [Spring boot整合mongoDB文档数据库实现增删改查](https://gitee.com/shenzhanwang/Spring-mongoDB)
10. [Spring连接Redis实现缓存](https://gitee.com/shenzhanwang/Spring-redis)
11. [Spring连接图存数据库Neo4j实现增删改查](https://gitee.com/shenzhanwang/Spring-neo4j)
12. Spring boot整合列存数据库hbase实现增删改查
13. [Spring平台整合消息队列ActiveMQ实现发布订阅、生产者消费者模型（JMS）](https://gitee.com/shenzhanwang/Spring-activeMQ)
14. [Spring boot整合消息队列RabbitMQ实现四种消息模式（AMQP）](https://gitee.com/shenzhanwang/Spring-rabbitMQ)
15. Spring boot整合kafka 2.1.0实现大数据消息管道
16. [Spring boot整合websocket实现即时通讯](https://gitee.com/shenzhanwang/Spring-websocket)![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题")
17. [Spring security整合oauth2实现token认证](https://gitee.com/shenzhanwang/Spring-security-oauth2)
18. [Spring boot整合MinIO客户端实现文件管理](https://gitee.com/shenzhanwang/Spring-minio)
19. 23种设计模式，源码、注释、使用场景 
20. [使用ETL工具Kettle的实例](https://gitee.com/shenzhanwang/Kettle-demo)
21. Git指南和分支管理策略 
22. 使用数据仓库进行OLAP数据分析（Mysql+Kettle+Zeppelin）
#### 高级篇：分布式系统和大数据开发
23. [zookeeper原理、架构、使用场景和可视化](https://gitee.com/shenzhanwang/zookeeper-practice)
24. Spring boot整合Apache dubbo v2.7.5实现分布式服务治理（SOA架构） ![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题") 
>  包含组件Spring boot v2.2.2+Dubbo v2.7.5+Nacos v1.1.1
<a href="https://images.gitee.com/uploads/images/2020/0114/084731_fd0b7a82_1110335.gif" target="_blank">效果图</a>
25. 使用Spring Cloud Alibaba v2.2.7实现微服务架构（MSA架构）![输入图片说明](https://img.shields.io/badge/-%E6%8B%9B%E7%89%8C-yellow.svg)   
>  包含组件Nacos+Feign+Gateway+Ribbon+Sentinel+Zipkin
<a href="https://images.gitee.com/uploads/images/2020/0106/201827_ac61db63_1110335.gif" target="_blank">效果图</a>
26. 使用jenkins+centos+git+maven搭建持续集成环境自动化部署分布式服务 
27. 使用docker+compose+jenkins+gitlab+spring cloud实现微服务的编排、持续集成和动态扩容 
28. 使用Spark进行分布式计算
- Spark SQL做离线计算
- Spark Streaming做实时计算
- Structured Streaming做实时计算
29. 使用Flink实现流批一体化的分布式计算
30. 搭建高可用nginx集群和Tomcat负载均衡 
31. 使用mycat实现Mysql数据库的主从复制、读写分离、分表分库、负载均衡和高可用 
32. [Spring boot整合Elastic search实现全文检索和大数据分析](https://gitee.com/shenzhanwang/Spring-elastic_search) ![输入图片说明](https://img.shields.io/badge/-%E6%8B%9B%E7%89%8C-yellow.svg "在这里输入图片标题")
#### 特别篇：分布式事务和并发控制
33. 基于可靠消息最终一致性实现分布式事务（activeMQ）
34. Spring boot dubbo整合seata实现分布式事务![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题")
> 包含组件nacos v2.0.2 + seata v1.4.2 +spring boot dubbo v2.7.5
<a href="https://images.gitee.com/uploads/images/2020/0119/112233_62a33a77_1110335.gif" target="_blank">效果图</a>
35. Spring cloud alibaba v2.2.7整合seata实现分布式事务 ![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题")
> 包含组件nacos v2.0.2 + seata v1.4.2 +spring cloud alibaba v2.2.7
<a href="https://images.gitee.com/uploads/images/2020/0119/134408_ee14a016_1110335.gif" target="_blank">效果图</a>
36. 并发控制：数据库锁机制和事务隔离级别的实现![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题") 
37. 并发控制：使用redission实现分布式锁 
38. 并发控制：使用zookeeper实现分布式锁 
39. 并发控制：Java多线程编程实例
40. 并发控制：使用netty实现高性能NIO通信 
### 视频教程
![输入图片说明](%E5%B0%81%E9%9D%A2.png)
<a href="https://www.roncoo.com/view/1551481849552183297" target="_blank">RuoYi-activiti开发指南</a>
### 关注微信公众号获取更多技术文章和源码
![输入图片说明](https://images.gitee.com/uploads/images/2021/1022/183316_f03b4f99_1110335.jpeg "qrcode_for_gh_4c2318bb0f7f_258.jpg")