FROM azul/zulu-openjdk-alpine:25.0.0-25.28

VOLUME /tmp

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
