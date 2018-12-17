#!/usr/bin/env bash

cd `dirname $0`

source_dir=./gen-java/com/mhy/springboot/thrift/account/
target_dir=../src/main/java/com/mhy/springboot/thrift/account/

if [ ! -d ${target_dir} ];
then
    mkdir -p ${target_dir}
fi

thrift --gen java:hashcode account.thrift
cp -R ./gen-java/com/mhy/springboot/thrift/account/ ../src/main/java/com/mhy/springboot/thrift/account/
rm -rf ./gen-java/