#!/usr/bin/env bash

# Zadanie 9
# Wypisać ilość zbiorów w katalogu bieżącym, które nie są ukryte.


elCounts=$(ls -l | wc -l)
echo "Ilość: $(($elCounts-1))"
exit 0;
