#!"C:\Users\Cristian\Documents\Java\Programacion Avanzada\Corte 1\Proyecto-Programacion\Poryecto-Final-Corte-1\ChicasMagicas\Base-De-Datos\perl\bin\perl.exe"
##
##  printenv -- demo CGI program which just prints its environment
##

print "Content-type: text/plain; charset=iso-8859-1\n\n";
foreach $var (sort(keys(%ENV))) {
	$val = $ENV{$var};
	$val =~ s|\n|\\n|g;
	$val =~ s|"|\\"|g;
	print "${var}=\"${val}\"\n";
}
