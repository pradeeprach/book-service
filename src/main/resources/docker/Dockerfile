FROM java:8

VOLUME /tmp

ADD book-service-0.0.1-SNAPSHOT.jar app.jar

RUN bash -c 'touch /app.jar'

EXPOSE 10001

ENTRYPOINT ["java", "-jar", "/app.jar"]