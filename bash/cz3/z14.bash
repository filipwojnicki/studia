#!/usr/bin/env bash

menu() {
  echo $'\n'
  echo "1 - aktualna data"
  echo "2 - nazwa i czas pracy systemu"
  echo "3 - liczba zalogowanych użytkowników"
  echo $'\n'
}

menu

while read num
do
  echo $'\n'

  if [ $num = 1 ]; then
    echo $(date '+%Y-%m-%d')
  elif [ $num = 2 ]; then
    echo $(uname -a) && echo $'\n' && echo $(uptime)
  elif [ $num = 3 ]; then
    userCount=$(who | wc -l)

    echo "Liczba uzytkownikow: $userCount"
  fi

  menu
done
