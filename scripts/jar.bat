@echo off
cd /d "%~dp0.."
call scripts\compilar.bat || exit /b 1
if not exist dist mkdir dist
jar --create --file dist\mi-proyecto.jar --main-class presentacion.Main -C bin .
