#!/bin/bash
rm -f tmp
../get_klee_tmp.sh 2> /dev/null
#echo "tmp0"
ERROR_CODES=$(cat tmp | grep "error_" | cut -d" " -f1 | cut -d"_" -f2 | sort -n | uniq)
echo "Number of error states: $(echo $ERROR_CODES | wc -w)"
echo "Error states: "$ERROR_CODES

#echo "tmp1"
#ERROR_CODES=$(cat tmp1 | grep "error_" | cut -d" " -f1 | cut -d"_" -f2 | sort -n | uniq)
#echo "Number of error states: $(echo $ERROR_CODES | wc -w)"
#echo "Error states: "$ERROR_CODES

