## OAuth2 + JWT using Spring Boot 2 / Spring Security 5

Cousers : https://www.baeldung.com/learn-spring-security-course#table

https://blog.marcosbarbero.com/centralized-authorization-jwt-spring-boot2/
https://www.baeldung.com/spring-security-oauth-jwt

application.yml

```yml
security:
  jwt:
    key-store: classpath:JWTKeystore.p12
    key-store-password: devdcorespass
    key-pair-alias: jwt-key
    key-pair-password: devdcorespass
    public-key: classpath:jwt-signing-public-key.txt
```    