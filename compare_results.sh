#!/bin/bash
echo "Reachability problems 2019"
echo -e "Problem\t\tT KLEE\tT AFL\tKLEE\tAFL\tKLEE ER\tAFL CRS"
for p in `seq 11 19`
do
	ALL_DIFFS=$(diff klee/Problem$p/result.csv afl/Problem$p/result.csv | grep true)
	KLE_TOTAL=$(grep true klee/Problem$p/result.csv | wc -l)
	AFL_TOTAL=$(grep true afl/Problem$p/result.csv | wc -l)
	KLE_DIFFS=$(echo $ALL_DIFFS | tr " " "\n" | grep "<" | wc -l)
	AFL_DIFFS=$(echo $ALL_DIFFS | tr " " "\n" | grep ">" | wc -l)
	KLE_ERROR=$(ls -1 klee/Problem$p/klee-out-0/*.err 2> /dev/null | wc -l)
	AFL_CRSHS=$(grep "uniq crashes" afl/Problem$p/afl-output | cut -d":" -f3 | tr -d " " | tr -d "│")
	
	echo -e "Problem$p\t$KLE_TOTAL\t$AFL_TOTAL\t$KLE_DIFFS\t$AFL_DIFFS\t$KLE_ERROR\t$AFL_CRSHS"
done

echo
echo "Reachability training problems 2019"
echo -e "Problem\t\ttKLEE\ttAFL\tKLEE\tAFL\tKLEE ER\tAFL CRS\tsol\tFP KLEE\tFN KLEE\tFP AFL\tFN AFL"
for p in `seq 11 13`
do
	ALL_DIFFS=$(diff klee_training/Problem$p/result.csv afl_training/Problem$p/result.csv | grep true)
	KLE_TOTAL=$(grep true klee_training/Problem$p/result.csv | wc -l)
	AFL_TOTAL=$(grep true afl_training/Problem$p/result.csv | wc -l)
	KLE_DIFFS=$(echo $ALL_DIFFS | tr " " "\n" | grep "<" | wc -l)
	AFL_DIFFS=$(echo $ALL_DIFFS | tr " " "\n" | grep ">" | wc -l)
	KLE_ERROR=$(ls -1 klee_training/Problem$p/klee-out-0/*.err | wc -l)
	AFL_CRSHS=$(grep "uniq crashes" afl_training/Problem$p/afl-output | cut -d":" -f3 | tr -d " " | tr -d "│")
	SOL_TOTAL=$(grep true afl_training/Problem$p/reachability-solution-Problem$p.csv | wc -l)
	KLS_DIFFS=$(diff klee_training/Problem$p/reachability-solution-Problem$p.csv klee_training/Problem$p/result.csv | grep true)
	AFS_DIFFS=$(diff afl_training/Problem$p/reachability-solution-Problem$p.csv afl_training/Problem$p/result.csv | grep true)
	KLS_FLSPS=$(echo $KLS_DIFFS | tr " " "\n" | grep ">" | wc -l)
	KLS_FLSNG=$(echo $KLS_DIFFS | tr " " "\n" | grep "<" | wc -l)
	AFS_FLSPS=$(echo $AFS_DIFFS | tr " " "\n" | grep ">" | wc -l)
	AFS_FLSNG=$(echo $AFS_DIFFS | tr " " "\n" | grep "<" | wc -l)
	echo -e "Problem$p\t$KLE_TOTAL\t$AFL_TOTAL\t$KLE_DIFFS\t$AFL_DIFFS\t$KLE_ERROR\t$AFL_CRSHS\t$SOL_TOTAL\t$KLS_FLSPS\t$KLS_FLSNG\t$AFS_FLSPS\t$AFS_FLSNG"
done
