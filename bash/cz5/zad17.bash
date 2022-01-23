#!/usr/bin/env bash

plik="answer.$$"

function koniec {
  if [ "$result" = "$1" ]
  then
    echo "Nacisneles $2"
    rm -f $plik
    exit $3
  fi
} 

dialog --menu "Wybierz jedna z opcji" 15 30 10 \
  1 "Data" \
  2 "Uptime" \
  3 "Zalogowani uzytkownicy" \
  2>$plik 
result=$?
clear

koniec "1" "Anuluj lub Nie" "1"
koniec "255" "ESC" "2"

odpowiedz=`cat $plik`

case $odpowiedz in
  "1") echo $(date '+%Y-%m-%d') ;;
  "2") echo $(uname -a) && echo $'\n' && echo $(uptime) ;;
  "3") userCount=$(who | wc -l); echo "Liczba uzytkownikow: $userCount" ;;
esac
rm -f $plik
