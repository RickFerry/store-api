# Usando uma imagem base do Maven para compilar o projeto
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Usando uma imagem base do JDK para rodar a aplicação
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/produto-api-0.0.1-SNAPSHOT.jar produto-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "produto-api.jar"]
