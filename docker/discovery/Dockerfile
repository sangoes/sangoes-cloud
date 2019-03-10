# discovery

# environment
FROM anapsix/alpine-java:8_server-jre_unlimited

# maintainer
MAINTAINER jerrychir(jerrychir@163.com)

# datetime
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

# make folder
RUN mkdir -p /discovery

# workdir
WORKDIR /discovery

# add app
ADD discovery.jar app.jar

# run bash
RUN bash -c 'touch /app.jar'

# entrypoint
#ENTRYPOINT ["java","-Xmx100m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
CMD java -Djava.security.egd=file:/dev/./urandom -jar /app.jar

# expose port
EXPOSE 6121