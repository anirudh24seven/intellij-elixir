package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.elixir_lang.eex.psi.Types.*;

%%

%{
  public _EExLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _EExLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}        { return WHITE_SPACE; }

  "%>"                 { return CLOSING; }
  "Comment"            { return COMMENT; }
  "#"                  { return COMMENT_MARKER; }
  "Data"               { return DATA; }
  "Empty Marker"       { return EMPTY_MARKER; }
  "="                  { return EQUALS_MARKER; }
  "Elixir"             { return ELIXIR; }
  "<%%"                { return ESCAPED_OPENING; }
  "/"                  { return FORWARD_SLASH_MARKER; }
  "<%"                 { return OPENING; }
  "<."                 { return SLOT_OPENING_OPENING; }
  ">"                  { return SLOT_OPENING_CLOSING; }
  "/>"                 { return SLOT_OPENING_SAME_CLOSING; }
  "</."                { return SLOT_CLOSING_OPENING; }
  ">"                  { return SLOT_CLOSING_CLOSING; }
  "|"                  { return PIPE_MARKER; }


}

[^] { return BAD_CHARACTER; }
