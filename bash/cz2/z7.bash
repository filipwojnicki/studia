#!/usr/bin/env bash

# Zadanie 7
# Napisz skrypt, który wypisze ilość swoich argumentów i jeśli jest ona większa od 2, to poda pierwsze trzy z nich.

if [ "$#" -gt 2 ]; then
    echo $1 $2 $3;
fi

echo "Ilość: $#"