// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PigExplicitTypeCast extends PsiElement {

  @Nullable
  PigExplicitBagTypeCast getExplicitBagTypeCast();

  @Nullable
  PigExplicitMapType getExplicitMapType();

  @NotNull
  List<PigExplicitTypeCast> getExplicitTypeCastList();

}