%{
    import java.lang.Math;
    import java.io.Reader;
    import java.io.IOException;
    import main.jflex.Lexer;
  %}
  
  /* Declaraciones de Tokens */
  %token NUM NL ID INT FLOAT ASSIGN PLUS COMMA SEMICOLON
  
  /* Gramática */
  %%
  input: /* vacío */
       | input line
       ;
  
  line: declaration SEMICOLON
      | assignment SEMICOLON
      | NL
      ;
  
  declaration: INT var_list
             | FLOAT var_list
             ;
  
  var_list: ID
          | var_list COMMA ID
          ;
  
  assignment: ID ASSIGN expression
            ;
  
  expression: NUM
            | ID
            | expression PLUS expression
            ;
  %%
  
  Lexer scanner;
  
  public Parser(Reader r) {
    this.scanner = new Lexer(r, this);
  }
  
  public void setYylval(ParserVal yylval) {
    this.yylval = yylval;
  }
  
  public void parse() {
    this.yyparse();
  }
  
  void yyerror(String s) {
    System.out.println("Error sintáctico: " + s);
  }
  
  int yylex() {
    int yyl_return = -1;
    try {
      yyl_return = scanner.yylex();
    } catch (IOException e) {
      System.err.println("IO error: " + e);
    }
    return yyl_return;
  }  

