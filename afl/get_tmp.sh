#!/bin/bash
for f in out/crashes/i*
do 
	cat "$f" | ./$(basename $PWD) >> tmp 2>&1
done
