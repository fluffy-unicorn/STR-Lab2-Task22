#!/bin/bash
for f in klee-out-0/*.assert.err
do
	KTEST_FILE=$(echo $f | cut -d. -f1).ktest ./$(basename $PWD)_test.bc >> tmp 2>&1 
	
done
