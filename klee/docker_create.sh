#!/bin/bash
docker run -v /home/tinus/master/2018-19/2A/STR/lab2_new/klee:/home/klee/lab2 -ti --name=lab2_klee --ulimit='stack=-1:-1' klee/klee
