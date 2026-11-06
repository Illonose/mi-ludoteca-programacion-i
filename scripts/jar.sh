#!/usr/bin/env bash
set -e
cd "$(dirname "$0")/.."
bash scripts/compilar.sh
mkdir -p dist
jar --create --file dist/mi-proyecto.jar --main-class presentacion.Main -C bin .
printf 'Creado dist/mi-proyecto.jar\n'
