#!/bin/bash

BASEDIR=$(dirname "$0")
cd $BASEDIR

./mvnw clean install && ./mvnw spring-boot:run
