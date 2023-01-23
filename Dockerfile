FROM maven:3.8.3-openjdk-17

WORKDIR /app

CMD ["mvn clean install"]

COPY target/*.jar /app/target/

CMD ["java", "-jar", "/app/target/sandbox-0.0.1-SNAPSHOT.jar"]