#!/bin/bash
for i in Problem*
do
	clang -I /home/klee/klee_src/include -emit-llvm -g -c $i/$i.c -o $i/$i.bc
done
