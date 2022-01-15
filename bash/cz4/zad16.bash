#!/usr/bin/env bash

# Zadanie 16
# Napisać skrypt, który wszystkie pliki z przyrostkiem ~ (np. plik.txt~), skopiuje (jeżeli takie są) do katalogu BACKUP
# w bieżącym katalogu. Jeżeli katalog BACKUP nie istnieje, skrypt powinien go założyć. Jeżeli jest już plik (lub inny nie-katalog)
# o nazwie BACKUP, skrypt powinien zgłosić błąd.

BACKUP_DIR="BACKUP"

if [[ -e $BACKUP_DIR ]]; then
  echo "$BACKUP_DIR exist"
  exit 1
fi

mkdir -p ${BACKUP_DIR}

cp *.*~ ${BACKUP_DIR}/ 

