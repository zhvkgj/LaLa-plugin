package ru.mse.itmo.lala.language.parser;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static ru.mse.itmo.lala.language.psi.LaLaTypes.*;

%%

%{
  public _LaLaLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _LaLaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

NUMBER=-?[0-9]+
IDENT=[a-zA-Z_]+[a-zA-Z0-9_]*
CHARLITERAL='[^']'
SPACE=[ \t\n\x0B\f\r]+
COMMENT=#[^\r\n]*
STRING=\"([^\"]|\\\\\")*\"

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "class"            { return CLASS; }
  "inh"              { return INH; }
  "syn"              { return SYN; }
  "grd"              { return GRD; }
  "loc"              { return LOC; }
  "use"              { return USE; }
  "nil"              { return NIL; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "("                { return LB; }
  ")"                { return RB; }
  "{"                { return LCURLY; }
  "}"                { return RCURLY; }
  "["                { return LSQUARE; }
  "]"                { return RSQUARE; }

  {NUMBER}           { return NUMBER; }
  {IDENT}            { return IDENT; }
  {CHARLITERAL}      { return CHARLITERAL; }
  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
