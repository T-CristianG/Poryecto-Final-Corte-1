@echo off
rem START or STOP Services
rem ----------------------------------
rem Check if argument is STOP or START

if not ""%1"" == ""START"" goto stop


"C:\Users\Cristian\Documents\Java\Programacion Avanzada\Corte 1\Proyecto-Programacion\Poryecto-Final-Corte-1\ChicasMagicas\Base-De-Datos\mysql\bin\mysqld" --defaults-file="C:\Users\Cristian\Documents\Java\Programacion Avanzada\Corte 1\Proyecto-Programacion\Poryecto-Final-Corte-1\ChicasMagicas\Base-De-Datos\mysql\bin\my.ini" --standalone
if errorlevel 1 goto error
goto finish

:stop
cmd.exe /C start "" /MIN call "C:\Users\Cristian\Documents\Java\Programacion Avanzada\Corte 1\Proyecto-Programacion\Poryecto-Final-Corte-1\ChicasMagicas\Base-De-Datos\killprocess.bat" "mysqld.exe"

if not exist "C:\Users\Cristian\Documents\Java\Programacion Avanzada\Corte 1\Proyecto-Programacion\Poryecto-Final-Corte-1\ChicasMagicas\Base-De-Datos\mysql\data\%computername%.pid" goto finish
echo Delete %computername%.pid ...
del "C:\Users\Cristian\Documents\Java\Programacion Avanzada\Corte 1\Proyecto-Programacion\Poryecto-Final-Corte-1\ChicasMagicas\Base-De-Datos\mysql\data\%computername%.pid"
goto finish


:error
echo MySQL could not be started

:finish
exit
