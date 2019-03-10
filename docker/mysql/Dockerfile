FROM mysql:5.7

MAINTAINER jerrychir(jerrychir@163.com)

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

COPY ./cloud.sql /docker-entrypoint-initdb.d
