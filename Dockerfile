FROM maven:3.8.3-openjdk-17 AS build

WORKDIR /app/

COPY . .

RUN mvn clean package

FROM openjdk:17-alpine

WORKDIR /app/

COPY --from=build /app/target/*.jar /app/target/

CMD ["java", "-jar", "/app/target/sandbox-1.0.0.jar"]