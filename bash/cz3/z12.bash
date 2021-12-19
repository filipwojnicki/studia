#!/usr/bin/env bash

cat /dev/null > wynik

filename='dane'
resultFile='wynik'

separator=' '

if ! [[ -r $filename ]]; then
  echo "Pliku nie udało sie odczytać"
  exit 1
fi


while IFS=${separator} read line; do
  numbers=($line)

  if [[ ${numbers[0]} -gt ${numbers[1]} ]]; then 
    echo ${numbers[0]}$separator${numbers[1]} >> $resultFile
  else
    echo ${numbers[1]}$separator${numbers[0]} >> $resultFile
  fi
done < $filename