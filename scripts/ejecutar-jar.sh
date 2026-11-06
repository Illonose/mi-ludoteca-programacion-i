#!/usr/bin/env bash
set -e
cd "$(dirname "$0")/.."
bash scripts/jar.sh
java -jar dist/mi-proyecto.jar
