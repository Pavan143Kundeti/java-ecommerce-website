# Build stage
FROM maven:3.8.8-eclipse-temurin-11 AS build
WORKDIR /app
COPY . .
WORKDIR /app/EcommerceApp
RUN mvn clean package -DskipTests

# Package stage
FROM tomcat:9.0-jdk11
COPY --from=build /app/EcommerceApp/target/EcommerceApp.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
