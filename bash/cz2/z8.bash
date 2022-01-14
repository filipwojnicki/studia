#!/usr/bin/env bash

# Zadanie 8
# Sprawdzić czy skrypt uruchomiono z trzema argumentami. Jeżeli $1 i $2 są nazwami istniejących plików zwykłych, które można czytać, zaś $3 nazwą nieistniejącego zbioru, który można utworzyć, to utworzyć plik o nazwie $3 i umieścić w nim zawartość plików $1 i $2.

if [ "$#" -ne 3 ]; then
  exit 1;
fi

if ! [[ -r $1 ]]; then
  exit 1
fi

if ! [[ -r $2 ]]; then
  exit 1
fi

if [[ -f $3 ]]; then
  exit 1
fi


cat $1 $2 > $3