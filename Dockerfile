FROM openjdk:17
COPY "CRUD-Empleados-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 9898
ENTRYPOINT [ "java","-jar","app.jar" ]