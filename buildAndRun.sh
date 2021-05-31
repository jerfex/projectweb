#!/bin/sh
mvn clean package && docker build -t jerfex.com/projectweb .
docker rm -f projectweb || true && docker run -d -p 9080:9080 -p 9443:9443 --name projectweb jerfex.com/projectweb