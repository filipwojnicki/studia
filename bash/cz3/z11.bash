#!/usr/bin/env bash

SUM=0

while [[ "$#" > 0 ]] ; do
    SUM=$((SUM+$1))
    shift
done

echo $SUM