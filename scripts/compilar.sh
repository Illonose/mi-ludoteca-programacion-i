#!/usr/bin/env bash
set -e
cd "$(dirname "$0")/.."
mkdir -p bin
find src -name '*.java' -print0 | xargs -0 javac -encoding UTF-8 -g -d bin
printf 'Compilación completada.\n'
