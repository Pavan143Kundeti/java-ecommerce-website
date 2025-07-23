FROM tomcat:9.0-jdk11

# Copy the WAR file to the Tomcat webapps directory
COPY EcommerceApp/target/EcommerceApp.war /usr/local/tomcat/webapps/

EXPOSE 8080 