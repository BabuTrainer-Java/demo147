from openjdk:11
LABEL maintainer="javaguides.net"
ADD target/demo147-0.0.1-SNAPSHOT.jar demo147.jar
ENTRYPOINT ["java","-jar","demo147.jar"]