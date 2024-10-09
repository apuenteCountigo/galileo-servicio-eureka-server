FROM openjdk:17-alpine
VOLUME /tmp
ADD ./servicio-eureka-server.jar servicio-eureka-server.jar
ENTRYPOINT ["java","-jar","/servicio-eureka-server.jar"]