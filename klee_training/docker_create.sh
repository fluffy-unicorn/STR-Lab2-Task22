#!/bin/bash
docker run -v /home/tinus/master/2018-19/2A/STR/lab2_new/klee_training:/home/klee/lab2 -ti --name=lab2_klee_train --ulimit='stack=-1:-1' klee/klee
