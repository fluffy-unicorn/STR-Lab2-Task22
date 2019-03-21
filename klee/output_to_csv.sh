#!/bin/bash
ERROR_CODES=$(grep "i=" klee-out-0/*.assert.err | cut -d"=" -f2 | cut -d")" -f1 | sort -n | uniq)
for e in $ERROR_CODES
do
	error_states[${e}]=1
done

rm -f result.csv
for i in `seq 0 99`
do
	if [[ "1" -eq "${error_states[$i]}" ]]
	then
		echo "$i,true" >> result.csv
	else
		echo "$i,false" >> result.csv
	fi
done
