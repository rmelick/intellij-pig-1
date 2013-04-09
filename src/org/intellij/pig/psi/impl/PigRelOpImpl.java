// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.pig.psi.PigTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.pig.psi.*;

public class PigRelOpImpl extends ASTWrapperPsiElement implements PigRelOp {

  public PigRelOpImpl(ASTNode node) {
    super(node);
  }

  @Override
  @Nullable
  public PigRelStrOp getRelStrOp() {
    return findChildByClass(PigRelStrOp.class);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PigVisitor) ((PigVisitor)visitor).visitRelOp(this);
    else super.accept(visitor);
  }

}