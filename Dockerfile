FROM maven:3.9.2-amazoncorretto-20 AS builder
WORKDIR /app/
COPY pom.xml .
COPY src ./src/
RUN mvn dependency:go-offline
RUN mvn clean package -DskipTests

FROM openjdk:20
COPY --from=builder /app/target/docker-challenge-0.0.1-SNAPSHOT.jar docker-challenge.jar
CMD ["java", "-jar", "docker-challenge.jar"]