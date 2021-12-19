#!/usr/bin/env bash
echo $1

byteSum=0

if [ ! -d $1 ]; then
  echo "Katalog nie istnieje";
  exit 1
fi

for filename in $1/*; do
  byteCount=$(echo "$filename" | wc -c) # macos -c listuje bajty
  byteSum=$((byteSum+byteCount))
done

echo $byteSum
