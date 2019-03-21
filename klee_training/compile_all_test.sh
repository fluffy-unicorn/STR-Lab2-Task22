#!/bin/bash
for i in Problem*
do
	clang -I /home/klee/klee_src/include -L /home/klee/klee_build/lib $i/$i.c -o $i/"$i"_test.bc -lkleeRuntest
done
