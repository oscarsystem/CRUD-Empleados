FROM openjdk:11
COPY "CRUD-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 9898
ENTRYPOINT [ "java","-jar","app.jar" ]