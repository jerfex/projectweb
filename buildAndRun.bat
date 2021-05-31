@echo off
call mvn clean package
call docker build -t jerfex.com/projectweb .
call docker rm -f projectweb
call docker run -d -p 9080:9080 -p 9443:9443 --name projectweb jerfex.com/projectweb