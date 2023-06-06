#!/bin/bash

BASEDIR=/home/site/wwwroot
cd $BASEDIR

$BASEDIR/mvnw --batch-mode clean install && $BASEDIR/mvnw spring-boot:run \
 -Dspring-boot.run.jvmArguments='-Dserver.port=80'