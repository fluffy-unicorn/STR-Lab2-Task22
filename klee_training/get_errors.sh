#!/bin/bash
rm -f tmp_fast
../get_tmp.sh
ERROR_CODES=$(cat tmp_fast)
echo "Number of error states: $(echo $ERROR_CODES | wc -w)"
echo "Error states: "$ERROR_CODES

