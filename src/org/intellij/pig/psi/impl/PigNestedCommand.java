// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigNestedCommand extends PsiElement {

  @NotNull
  List<PigIDENTIFIER> getIDENTIFIERList();

  @Nullable
  PigColRef getColRef();

  @Nullable
  PigColRefList getColRefList();

  @Nullable
  PigExpr getExpr();

  @Nullable
  PigNestedOp getNestedOp();

  @Nullable
  PigNestedProj getNestedProj();

  @Nullable
  PsiElement getInput();

}