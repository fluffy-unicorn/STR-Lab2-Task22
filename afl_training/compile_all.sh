#!/bin/bash
for i in Problem*
do
	afl-clang $i/$i.c -o $i/$i
done
