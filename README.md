后端项目模块介绍
模块名	说明
weblog-module-admin	博客后台管理模块
weblog-module-common	通用模块
weblog-module-jwt	JWT 认证、授权模块
weblog-web	博客前台（启动入口）
技术栈
后端
框架	说明	版本号	备注
JDK	Java 开发工具包	1.8	目前企业项目比较主流的版本
Spring Boot	Web 应用开发框架	2.6.3	
Maven	项目构建工具	3.6.3	企业主流的构建工具
MySQL	数据库	5.7	
Mybatis Plus	Mybatis 增强版持久层框架	3.5.2	
HikariCP	数据库连接池	4.0.3	Spring Boot 内置数据库连接池，号称性能最强
Spring Security	安全框架	2.6.3	
JWT	Web 应用令牌	0.11.2	
Lombok	消除冗余的样板式代码	1.8.22	
Jackson	JSON 工具库	2.13.1	
Hibernate Validator	参数校验组件	6.2.0.Final	
Logback	日志组件	1.2.10	
Guava	Google 开源的工具库	18.0	
p6spy	动态监测框架	3.9.1	
Minio	对象存储	8.2.1	用于存储博客中相关图片
flexmark	Markdown 解析	0.62.2	
