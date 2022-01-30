#!/usr/bin/env bash

menu() {
  echo $'\n'
  echo "1 - aktualna data"
  echo "2 - nazwa uzytkownika"
  echo "3 - liczba zalogowanych użytkowników"
  echo "q - wyjscie " 
  echo $'\n'
}

menu

while read num
do
  echo $'\n'

  if [ $num = 1 ]; then
    echo $(date '+%Y-%m-%d')
    read
  elif [ $num = 2 ]; then
    echo "$USER"
    read
  elif [ $num = 3 ]; then
    userCount=$(who | wc -l)

    echo "Liczba uzytkownikow: $userCount"
    read
  elif [ $num = "q" ]; then
    exit;
  fi

  menu
done
