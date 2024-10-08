FROM openjdk:17-alpine
VOLUME /tmp
ADD ./servicio-config-server.jar servicio-config-server.jar
ENTRYPOINT ["java","-jar","/servicio-config-server.jar"]