@echo off
cd /d "%~dp0.."
if exist bin for /r bin %%F in (*.class) do del /q "%%F"
if exist dist for %%F in (dist\*.jar) do del /q "%%F"
echo Archivos compilados y JAR eliminados.
