# 注册中心
FROM anapsix/alpine-java:8_server-jre_unlimited

MAINTAINER jerrychir@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN mkdir -p /discovery

WORKDIR /discovery

EXPOSE 6121

ADD ./discovery/target/discovery.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar discovery.jar
