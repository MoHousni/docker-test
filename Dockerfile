FROM openjdk:11
ADD target/Spring-boot-MySql.jar Spring-boot-MySql.jar
ENTRYPOINT ["java", "-jar", "Spring-boot-MySql.jar"]