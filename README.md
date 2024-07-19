后端项目模块介绍

1. weblog-module-admin

博客后台管理模块，用于管理博客系统的后台功能。


2. weblog-module-common

通用模块，包含一些通用的工具类、异常处理、全局配置等。


3. weblog-module-jwt

JWT认证、授权模块，用于实现用户身份认证和权限控制。


4. weblog-web

博客前台模块，作为博客系统的启动入口，用于展示博客前台页面和处理用户请求。


技术栈

后端

框架


JDK: 1.8

Spring Boot: 2.6.3

Maven: 3.6.3


数据库


MySQL: 5.7

Mybatis Plus: 3.5.2

HikariCP: 4.0.3


安全


Spring Security: 2.6.3

JWT: 0.11.2


工具和库


Lombok: 1.8.22

Jackson: 2.13.1

Hibernate Validator: 6.2.0.Final

Logback: 1.2.10

Guava: 18.0

p6spy: 3.9.1

Minio: 8.2.1 (用于存储博客中相关图片)

flexmark: 0.62.2 (Markdown解析工具)



