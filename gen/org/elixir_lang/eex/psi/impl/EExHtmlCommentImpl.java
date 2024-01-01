// This is a generated file. Not intended for manual editing.
package org.elixir_lang.eex.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.elixir_lang.eex.psi.Types.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.elixir_lang.eex.psi.*;

public class EExHtmlCommentImpl extends ASTWrapperPsiElement implements EExHtmlComment {

  public EExHtmlCommentImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull EExVisitor visitor) {
    visitor.visitHtmlComment(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof EExVisitor) accept((EExVisitor)visitor);
    else super.accept(visitor);
  }

}
