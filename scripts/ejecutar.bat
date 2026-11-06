@echo off
cd /d "%~dp0.."
call scripts\compilar.bat || exit /b 1
java -cp bin presentacion.Main
