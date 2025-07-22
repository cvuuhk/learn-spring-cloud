接口风格
    一律使用 POST + 200 + 统一响应体

代码风格
    不要使用 import *

数据库
    MySQL 时间类型使用 timestamp，Java 类型使用 Instant 承接
    数据库时区和 Java 程序时区要一致
    不要继承 com.baomidou.mybatisplus.extension.service.IService
    不要在 service 里暴露 mapper 的细节


注意修改 com.cuishuhao.scaffold.config.MyBatisPlusConfig.mybatisPlusInterceptor SQL 方言