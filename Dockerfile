FROM ubuntu:20.04
COPY ./sleep-dev/target/sleep-dev-0.0.1-SNAPSHOT.jar /app/sleep.jar
WORKDIR /app
ENV JAR_FILE="sleep.jar"
ENV JAVA_HOME /home/jdk-11.0.19+7
ENV PATH $JAVA_HOME/bin:$PATH
EXPOSE 8092
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar $JAR_FILE" ]