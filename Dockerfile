# Use Eclipse Adoptium JDK 17 as the base image
FROM eclipse-temurin:17-jdk

# Set the working directory inside the container
WORKDIR /app

#copy the application jar file
COPY target/GCP-CRUD-RestAPI-0.0.1-SNAPSHOT.jar /app/gcp_with_spring.jar

#port for the web services
EXPOSE 8080

#run the webservice on container startup
CMD ["java", "-jar", "gcp_with_spring.jar"]