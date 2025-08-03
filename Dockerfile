FROM bellsoft/liberica-runtime-container:jre-17-stream-musl
COPY target/k8s-0.0.1-SNAPSHOT.jar k8sd.jar
EXPOSE 8060
ENTRYPOINT ["java", "-jar", "/k8sd.jar"]