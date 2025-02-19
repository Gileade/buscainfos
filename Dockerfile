# Fase de build
FROM maven:3.9.6-amazoncorretto-17 AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

# Fase final (imagem menor)
FROM eclipse-temurin:17-jre-alpine

#COPY target/buscainfos-0.0.1-SNAPSHOT.jar /app/app.jar
COPY --from=build /app/target/buscainfos-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]