# foril-blog-back-v2
项目已脱敏，请在 `/src/main/resources` 下自建 `application.yml`，内容示例：
```yaml
spring:
  datasource:
    url: jdbc:postgresql://<url>:<port>/<db>
    username: 
    password: 
    driver-class-name: org.postgresql.Driver
  devtools:
    restart:
      enabled: true
      additional-paths: src/mani/java

mybatis:
  mapper-locations: classpath:/mapping/*.xml
  type-aliases-package: space.foril.blog.entity
```