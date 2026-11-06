@echo off
setlocal
cd /d "%~dp0.."
if not exist bin mkdir bin
set "LIST=%TEMP%\java_sources_%RANDOM%.txt"
dir /s /b src\*.java > "%LIST%"
javac -encoding UTF-8 -g -d bin @"%LIST%"
set "RESULT=%ERRORLEVEL%"
del "%LIST%" >nul 2>&1
if not "%RESULT%"=="0" exit /b %RESULT%
echo Compilacion completada.
