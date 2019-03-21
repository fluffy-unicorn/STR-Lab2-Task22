#!/bin/bash
grep "i=" klee-out-0/*.assert.err | cut -d"=" -f2 | cut -d")" -f1 | sort -n | uniq >> tmp_fast
