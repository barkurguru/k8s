FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
COPY target/k8s-0.0.1-SNAPSHOT.jar k8s.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/k8s.jar"]