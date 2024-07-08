# 使用 Ubuntu 20.04 基础镜像
FROM ubuntu:20.04

# 设置环境变量，以避免安装过程中交互式提示
ENV DEBIAN_FRONTEND=noninteractive

# 更新包列表并安装必要的软件包，包括 OpenJDK 17
RUN apt-get update && \
    apt-get install -y openjdk-17-jre-headless && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# 复制应用程序文件到镜像中
COPY target/sleep-dev-*.jar /app/sleep.jar

# 设置工作目录
WORKDIR /app

# 设置 Java 环境变量
ENV JAR_FILE="sleep.jar"
ENV JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64"
ENV PATH="$JAVA_HOME/bin:$PATH"

# 暴露应用程序端口
EXPOSE 8080

# 设置启动命令
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar $JAR_FILE"]