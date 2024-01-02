package org.elixir_lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.elixir_lang.psi.ElixirTypes.*;

%%

%{
  public _ElixirLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ElixirLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}                                                                                            { return WHITE_SPACE; }

  "+"                                                                                                      { return ADDITION_OPERATOR; }
  "after"                                                                                                  { return AFTER; }
  "Alias"                                                                                                  { return ALIAS_TOKEN; }
  "&&&, &&"                                                                                                { return AND_SYMBOL_OPERATOR; }
  "`and`"                                                                                                  { return AND_WORD_OPERATOR; }
  "<<<, <<~, <|>, <~>, >>>, ~>>, <~, |>, ~>"                                                               { return ARROW_OPERATOR; }
  "=>"                                                                                                     { return ASSOCIATION_OPERATOR; }
  "A-Z, a-z, _, @, 0-9. ?, !"                                                                              { return ATOM_FRAGMENT; }
  "@"                                                                                                      { return AT_OPERATOR; }
  "0"                                                                                                      { return BASE_WHOLE_NUMBER_PREFIX; }
  "b"                                                                                                      { return BINARY_WHOLE_NUMBER_BASE; }
  "<<>>"                                                                                                   { return BIT_STRING_OPERATOR; }
  "<zero-width-call>"                                                                                      { return CALL; }
  "&"                                                                                                      { return CAPTURE_OPERATOR; }
  "catch"                                                                                                  { return CATCH; }
  "?"                                                                                                      { return CHAR_TOKENIZER; }
  ">>"                                                                                                     { return CLOSING_BIT; }
  "]"                                                                                                      { return CLOSING_BRACKET; }
  "}"                                                                                                      { return CLOSING_CURLY; }
  ")"                                                                                                      { return CLOSING_PARENTHESIS; }
  ":"                                                                                                      { return COLON; }
  ","                                                                                                      { return COMMA; }
  "#"                                                                                                      { return COMMENT; }
  "!==, ===, !=, ==, =~"                                                                                   { return COMPARISON_OPERATOR; }
  "Decimal Mark (.)"                                                                                       { return DECIMAL_MARK; }
  "/"                                                                                                      { return DIVISION_OPERATOR; }
  "do"                                                                                                     { return DO; }
  "."                                                                                                      { return DOT_OPERATOR; }
  "%>"                                                                                                     { return EEX_CLOSING; }
  "EEx Comment"                                                                                            { return EEX_COMMENT; }
  "EEx Comment Marker (#)"                                                                                 { return EEX_COMMENT_MARKER; }
  "EEx Data"                                                                                               { return EEX_DATA; }
  "EEx Empty Marker"                                                                                       { return EEX_EMPTY_MARKER; }
  "EEx Equals Marker (=)"                                                                                  { return EEX_EQUALS_MARKER; }
  "<%%"                                                                                                    { return EEX_ESCAPED_OPENING; }
  "<%!--"                                                                                                  { return EEX_COMMENTED_OPENING; }
  "--%>"                                                                                                   { return EEX_COMMENTED_CLOSING; }
  "EEx Forward Slash Marker (/)"                                                                           { return EEX_FORWARD_SLASH_MARKER; }
  "<%"                                                                                                     { return EEX_OPENING; }
  "EEx Pipe Marker (|)"                                                                                    { return EEX_PIPE_MARKER; }
  "else"                                                                                                   { return ELSE; }
  "\\\\n, \\\\r\\\\n"                                                                                      { return EOL; }
  "end"                                                                                                    { return END; }
  "\\\\"                                                                                                   { return ESCAPE; }
  "\\\\<character>, \\\\x{<hexadecimal-digit>}, \\\\x<hexadecimal-digit>, \\\\\\\\n, \\\\\\\\r\\\\n"       { return ESCAPED_CHARACTER_TOKEN; }
  "E, e"                                                                                                   { return EXPONENT_MARK; }
  "false"                                                                                                  { return FALSE; }
  "fn"                                                                                                     { return FN; }
  "Fragment"                                                                                               { return FRAGMENT; }
  "Whitespace at beginning of line of heredoc"                                                             { return HEREDOC_LINE_WHITE_SPACE_TOKEN; }
  "Whitespace at beginning of last line of heredoc before terminator"                                      { return HEREDOC_PREFIX_WHITE_SPACE; }
  "Heredoc Promoter (\"\"\", ''')"                                                                         { return HEREDOC_PROMOTER; }
  "Heredoc Terminator (\"\"\", ''')"                                                                       { return HEREDOC_TERMINATOR; }
  "x"                                                                                                      { return HEXADECIMAL_WHOLE_NUMBER_BASE; }
  "identifier"                                                                                             { return IDENTIFIER_TOKEN; }
  "a-z"                                                                                                    { return INTERPOLATING_SIGIL_NAME; }
  "Interpolation End (})"                                                                                  { return INTERPOLATION_END; }
  "Interpolation Start (#{)"                                                                               { return INTERPOLATION_START; }
  "A-Z, a-z, 2-9"                                                                                          { return INVALID_BINARY_DIGITS; }
  "A-Z, a-z"                                                                                               { return INVALID_DECIMAL_DIGITS; }
  "G-Z, g-z"                                                                                               { return INVALID_HEXADECIMAL_DIGITS; }
  "A-Z, a-z, 8-9"                                                                                          { return INVALID_OCTAL_DIGITS; }
  "A-Z, a-z, 0-9"                                                                                          { return INVALID_UNKNOWN_BASE_DIGITS; }
  "<-, \\\\\\\\"                                                                                           { return IN_MATCH_OPERATOR; }
  "in"                                                                                                     { return IN_OPERATOR; }
  "Keyword Pair Colon (:)"                                                                                 { return KEYWORD_PAIR_COLON; }
  "{, [, <, \", /, (, |, '"                                                                                { return LINE_PROMOTER; }
  "}, ], >, \", /, ), |, '"                                                                                { return LINE_TERMINATOR; }
  "A-Z"                                                                                                    { return LITERAL_SIGIL_NAME; }
  "%{}"                                                                                                    { return MAP_OPERATOR; }
  "="                                                                                                      { return MATCH_OPERATOR; }
  "-"                                                                                                      { return MINUS_OPERATOR; }
  "*"                                                                                                      { return MULTIPLICATION_OPERATOR; }
  "-"                                                                                                      { return NEGATE_OPERATOR; }
  "nil"                                                                                                    { return NIL; }
  "not"                                                                                                    { return NOT_OPERATOR; }
  "_"                                                                                                      { return NUMBER_SEPARATOR; }
  "+"                                                                                                      { return NUMBER_OR_BADARITH_OPERATOR; }
  "B"                                                                                                      { return OBSOLETE_BINARY_WHOLE_NUMBER_BASE; }
  "X"                                                                                                      { return OBSOLETE_HEXADECIMAL_WHOLE_NUMBER_BASE; }
  "o"                                                                                                      { return OCTAL_WHOLE_NUMBER_BASE; }
  "<<"                                                                                                     { return OPENING_BIT; }
  "["                                                                                                      { return OPENING_BRACKET; }
  "{"                                                                                                      { return OPENING_CURLY; }
  "("                                                                                                      { return OPENING_PARENTHESIS; }
  "|||, ||"                                                                                                { return OR_SYMBOL_OPERATOR; }
  "`or`"                                                                                                   { return OR_WORD_OPERATOR; }
  "|"                                                                                                      { return PIPE_OPERATOR; }
  "+"                                                                                                      { return PLUS_OPERATOR; }
  "**"                                                                                                     { return POWER_OPERATOR; }
  ".."                                                                                                     { return RANGE_OPERATOR; }
  "<, <=, >=, >"                                                                                           { return RELATIONAL_OPERATOR; }
  "rescue"                                                                                                 { return RESCUE; }
  ";"                                                                                                      { return SEMICOLON; }
  "Sigil Modifier (A-Z, a-z)"                                                                              { return SIGIL_MODIFIER; }
  "Sign Operator (+, -)"                                                                                   { return SIGN_OPERATOR; }
  "->"                                                                                                     { return STAB_OPERATOR; }
  "//"                                                                                                     { return TERNARY_OPERATOR; }
  "%"                                                                                                      { return STRUCT_OPERATOR; }
  "-"                                                                                                      { return SUBTRACTION_OPERATOR; }
  "~"                                                                                                      { return TILDE; }
  "true"                                                                                                   { return TRUE; }
  "{}"                                                                                                     { return TUPLE_OPERATOR; }
  "++, --, <>"                                                                                             { return TWO_OPERATOR; }
  "^^^"                                                                                                    { return THREE_OPERATOR; }
  "::"                                                                                                     { return TYPE_OPERATOR; }
  "~~~, !, ^"                                                                                              { return UNARY_OPERATOR; }
  "u"                                                                                                      { return UNICODE_ESCAPE_CHARACTER; }
  "A-Z, a, c-n, p-w, z"                                                                                    { return UNKNOWN_WHOLE_NUMBER_BASE; }
  "0-1"                                                                                                    { return VALID_BINARY_DIGITS; }
  "0-9"                                                                                                    { return VALID_DECIMAL_DIGITS; }
  "A-F, a-f, 0-9"                                                                                          { return VALID_HEXADECIMAL_DIGITS; }
  "0-7"                                                                                                    { return VALID_OCTAL_DIGITS; }
  "when"                                                                                                   { return WHEN_OPERATOR; }


}

[^] { return BAD_CHARACTER; }
