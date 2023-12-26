// This is a generated file. Not intended for manual editing.
package org.elixir_lang.eex.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.elixir_lang.eex.psi.impl.*;

public interface Types {

  IElementType SLOT_CLOSING = new ElementType("SLOT_CLOSING");
  IElementType SLOT_OPENING = new ElementType("SLOT_OPENING");
  IElementType TAG = new ElementType("TAG");

  IElementType CLOSING = new TokenType("%>");
  IElementType COMMENT = new TokenType("Comment");
  IElementType COMMENT_MARKER = new TokenType("#");
  IElementType DATA = new TokenType("Data");
  IElementType ELIXIR = new TokenType("Elixir");
  IElementType EMPTY_MARKER = new TokenType("Empty Marker");
  IElementType EQUALS_MARKER = new TokenType("=");
  IElementType ESCAPED_OPENING = new TokenType("<%%");
  IElementType FORWARD_SLASH_MARKER = new TokenType("/");
  IElementType OPENING = new TokenType("<%");
  IElementType PIPE_MARKER = new TokenType("|");
  IElementType SLOT_CLOSING_CLOSING = new TokenType(">");
  IElementType SLOT_CLOSING_OPENING = new TokenType("</.");
  IElementType SLOT_OPENING_CLOSING = new TokenType("SLOT_OPENING_CLOSING");
  IElementType SLOT_OPENING_OPENING = new TokenType("<.");
  IElementType SLOT_OPENING_SAME_CLOSING = new TokenType("/>");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == SLOT_CLOSING) {
        return new EExSlotClosingImpl(node);
      }
      else if (type == SLOT_OPENING) {
        return new EExSlotOpeningImpl(node);
      }
      else if (type == TAG) {
        return new EExTagImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
