#!/usr/bin/env bash
set -e
cd "$(dirname "$0")/.."
find bin -name '*.class' -delete
rm -f dist/*.jar
printf 'Archivos compilados y JAR eliminados.\n'
