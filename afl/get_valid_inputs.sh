#!/bin/bash
for p in Problem*
do
	cd "$p"
	mkdir -p in
	for i in $(tail $p.c -n 5 | head -n 1 | sed -e 's/[^0-9 ]//g')
	do 
		echo -e "$i\n" > in/seed.$i
	done
	rm -rf cmin
	afl-cmin -i in -o cmin ./$p
	cd ..
done
