/**
 * Escáner que detecta números, palabras, palabras reservadas, identificadores y hexadecimales
*/

%%

%public
%class Lexer
%standalone

digito=[0-9]
letra=[a-zA-Z]
palabra={letra}+
espacio=[ \t\n]
hexadecimal=0[xX]{digito}+({digito}|[a-fA-F])+
identificador={letra}({letra}|{digito}){0,31}
reservadas=public|private|protected|static|final

%%

{espacio} {/* La acción léxica puede ir vacía si queremos que el escáner ignore la regla*/}
{hexadecimal} { System.out.print("Encontré un número hexadecimal: "+yytext()+"\n"); }
{reservadas} { System.out.print("Encontré una palabra reservada: "+yytext()+"\n"); }
{identificador} { System.out.print("Encontré una palabra: "+yytext()+"\n"); }
{digito}+ { System.out.print("Encontré un número: "+yytext()+"\n"); }
{palabra} { System.out.print("Encontré una palabra: "+yytext()+"\n"); }