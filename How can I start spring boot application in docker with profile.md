### How can I start spring boot application in docker with profile?
#### https://stackoverflow.com/questions/55752013/how-can-i-start-spring-boot-application-in-docker-with-profile
#### https://www.baeldung.com/spring-profiles

## We have 3 ways:

1. Passing Spring Profile in a Dockerfile

```dockerfile
FROM openjdk:8-jre-alpine
...
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=test","-jar","app.jar"]
```


2. Passing Spring Profile in Docker run

```bash
docker run -d -p 8080:8080 -e "SPRING_PROFILES_ACTIVE=test" --name my-app:latest
```
3. Passing Spring Profile in DockerCompose

```yml
 version: "3.5"
 services:
   my-app:
     image: my-app:latest
     ports:
       - "8080:8080"
     environment:
       - "SPRING_PROFILES_ACTIVE=test"
```

 