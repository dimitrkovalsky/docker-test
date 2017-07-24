FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD docker-spring.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 9898:9898

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

