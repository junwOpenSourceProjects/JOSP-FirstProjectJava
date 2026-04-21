# JOSP-FirstProjectJava - 通用增删改查模板项目

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen.svg)
![Java](https://img.shields.io/badge/Java-25-blue.svg)
![MyBatis-Plus](https://img.shields.io/badge/MyBatis--Plus-3.5.7-blue.svg)
![License](https://img.shields.io/badge/License-MIT-yellow.svg)

基于 Spring Boot 3.4.4 + MyBatis-Plus 的通用增删改查后端模板项目，提供完整的后台管理接口结构。

## 技术栈

- **Java**: 25
- **Spring Boot**: 3.4.4
- **MyBatis-Plus**: 3.5.7
- **数据库**: MySQL + Redis
- **认证**: JWT
- **构建工具**: Maven

## 项目结构

```
src/main/java/com/josp/
├── JospApplication.java          # 启动类
├── config/                       # 配置类
│   ├── CorsConfig.java          # 跨域配置
│   ├── RedisConfig.java         # Redis 配置
│   └── WebMvcConfig.java        # Web MVC 配置
├── controller/                    # 控制器层
├── service/                      # 服务层
├── mapper/                       # 数据访问层
├── entity/                       # 实体类
└── common/                       # 通用工具
    ├── Result.java              # 统一响应封装
    ├── constants/               # 常量定义
    └── utils/                   # 工具类
```

## 主要功能

- 统一 RESTful API 响应格式
- JWT 认证机制
- Redis 缓存支持
- CORS 跨域配置
- 通用 CRUD 基类
- 统一异常处理

## 快速开始

### 环境要求

- JDK 25+
- Maven 3.8+
- MySQL 8.0+
- Redis 6.0+

### 配置

修改 `src/main/resources/application.yml` 中的数据库连接信息：

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/your_database
    username: your_username
    password: your_password
  redis:
    host: localhost
    port: 6379
```

### 编译运行

```bash
mvn compile
mvn spring-boot:run
```

### 构建

```bash
mvn clean package -DskipTests
```

## API 接口

| 接口 | 方法 | 描述 |
|------|------|------|
| `/api/auth/login` | POST | 用户登录 |
| `/api/user/**` | * | 用户管理接口 |

## License

MIT
