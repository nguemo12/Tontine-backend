FROM openjdk:11-apline
ENV APP_DIR = /spring-devops
WORKDIR $APP_DIR
COPY /build/lib/*.jar app.jar
CMD ["java","-jar","app.jar"]
