FROM maven AS build
COPY /tempCon/src /src
COPY /tempCon/pom.xml .
WORKDIR .
RUN mvn clean install


FROM openjdk:11-jre-slim
COPY --from=build /target/tempCon-0.0.1-SNAPSHOT.jar /app.jar
expose 8080
ENTRYPOINT ["java","-jar","/app.jar"]