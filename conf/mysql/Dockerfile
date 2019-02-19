# mysql数据库

FROM mysql:5.7

MAINTAINER jerrychir@163.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

COPY ./db/cloud.sql /docker-entrypoint-initdb.d
