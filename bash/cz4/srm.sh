#!/usr/bin/env bash

# Zadanie 15
# Napisz skrypt “bezpiecznego usuwania” srm.sh, który podane jako argumenty pliki skompresuje (o ile już nie są skompresowane - należy to sprawdzić, 
# np. przy pomocy polecenia file) a następnie przeniesie je do folderu ~/trash. Przy wywołaniu skrypt powinien sprawdzić folder trash i usunąć z niego 
# pliku starsze niż 48 godzin.

fileNames=""

currentTime=$(date "+%Y.%m.%d-%H.%M.%S")

TRASH_DIR="${HOME}/trash/"


for file in $TRASH_DIR*; do
  if [[ -f $file ]]; then
    if [[ ! $(find "$file" -newermt "48 hours ago") ]]; then
      rm $file
    fi
  fi
done

while [[ "$#" > 0 ]] ; do
    if [[ -f $1 ]]; then
      if file $1 | grep -q 'gzip compressed data'; then
        shift
        continue
      fi

      fileNames="$fileNames $1"
    fi
    
    shift
done


echo "backup-${currentTime}.tgz"
echo $fileNames


if [[ -z $fileNames ]]; then
  exit 1
fi

tar cfz backup-${currentTime}.tgz${fileNames}
mv backup-${currentTime}.tgz "${TRASH_DIR}"
