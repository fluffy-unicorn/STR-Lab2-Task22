#!/bin/bash
if [ -z "$1" ]
  then
    echo "Select a problem"
else
	afl-fuzz -i $1/cmin -o $1/out $1/$1 &
	sleep 5s # To accomodate for startup time
	time=600s
	if [ ! -z "$2" ]
	then
		time=$2
	fi
	sleep $time
	kill -s 2 %1
fi
