#!/bin/sh
for p in `seq 11 19`
do
	for t in 'klee' 'afl'
	do 
		cd $t/Problem$p
		echo "Problem$p ($t):"
		../get_errors.sh
		cd ../..
	done
done

