#!/usr/bin/env bash

# Zadanie 6
# Wczytać nazwę zbioru F. Jeżeli zbiór jest plikiem zwykłym i ma przyznane prawo wykonywania, to uruchomić go i po jego zakończeniu podać kod wyjścia wykonanego polecenia lub programu.

read F

if ! [[ -x $F ]]; then
  exit 1
fi

./$F

echo $?