#!/bin/bash
rm -f tmp
../get_tmp.sh 2> /dev/null
ERROR_CODES=$(cat tmp | grep "error_" | cut -d" " -f1 | cut -d"_" -f2 | sort -n | uniq)
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
