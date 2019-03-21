#!/bin/bash
if [ -z "$1" ]
  then
    echo "Select a problem"
else
	cd $1
	time=600s
	if [ ! -z "$2" ]
	then
		time=$2
	fi
	klee -only-output-states-covering-new -emit-all-errors --max-time=$time $1.bc
fi
