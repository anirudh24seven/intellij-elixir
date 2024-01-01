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
OPENING = "<%"
CLOSING = "%>"

COMMENT_MARKER = "#"
EQUALS_MARKER = "="
// See https://github.com/elixir-lang/elixir/pull/6281
FORWARD_SLASH_MARKER = "/"
PIPE_MARKER = "|"
ESCAPED_OPENING = "<%%"
COMMENT_OPENING = "<%!--"
PROCEDURAL_OPENING = {OPENING} " "

WHITE_SPACE = [\ \t\f\r\n]+
ANY = [^]

%%
<YYINITIAL> {
  {ESCAPED_OPENING}                { return ESCAPED_OPENING; }
  {COMMENT_OPENING}                { return COMMENT_OPENING; }
  {OPENING}                 { return OPENING; }
}

<MARKER_MAYBE> {
  {COMMENT_MARKER}                  { return COMMENT_MARKER; }
  {EQUALS_MARKER}                  { return EQUALS_MARKER; }
  {FORWARD_SLASH_MARKER}                  { return FORWARD_SLASH_MARKER; }
  {PIPE_MARKER}                  { return PIPE_MARKER; }
  {WHITE_SPACE}        { return WHITE_SPACE; }
}

<COMMENT, ELIXIR> {
  {CLOSING}                 { return CLOSING; }
}

<COMMENT> {
  "Comment"            { return COMMENT; }
}

<ELIXIR> {
  "Elixir"             { return ELIXIR; }
}

<WHITESPACE_MAYBE> {
  "Data"               { return DATA; }
  "Empty Marker"       { return EMPTY_MARKER; }

}

[^] { return BAD_CHARACTER; }
