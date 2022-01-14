#!/usr/bin/env bash

# Zadanie 10
# Sprawdzić czy skrypt uruchomiono z jednym argumentem. Jeżeli $1 jest nazwą istniejącego katalogu, który można czytać, to wypisać ilość plików zwykłych i ilość katalogów w katalogu.

echo $1

if [ "$#" -ne 1 ]; then
  exit 1;
fi

if [ -d $1 ] && [ -r $1 ]; then
  elCounts=$(ls -l $1 | wc -l)
  echo "Ilość: $(($elCounts-1))"
  exit 0;
fi

exit 1