#!/usr/bin/env bash
set -e
cd "$(dirname "$0")/.."
bash scripts/compilar.sh
java -cp bin presentacion.Main
