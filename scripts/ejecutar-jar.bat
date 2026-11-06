@echo off
cd /d "%~dp0.."
call scripts\jar.bat || exit /b 1
java -jar dist\mi-proyecto.jar
