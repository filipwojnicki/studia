#!/usr/bin/env bash

SAVE_DIR="${HOME}/${1}"
COPY_DIR="/bin"

if [[ -f $SAVE_DIR ]]; then
  exit 1;
fi;

mkdir -p "${SAVE_DIR}"

for file in $COPY_DIR/${2}*; do
  if [[ -f $file ]]; then
    cp ${file} ${SAVE_DIR}/
  fi
done