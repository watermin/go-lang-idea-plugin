// This is a generated file. Not intended for manual editing.
package com.plan9.intel.lang.core.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.plan9.intel.lang.core.psi.AsmIntelTypes.*;
import com.plan9.intel.lang.core.psi.*;

public class AsmIntelFunctionImpl extends AsmIntelElementImpl implements AsmIntelFunction {

  public AsmIntelFunctionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull AsmIntelVisitor visitor) {
    visitor.visitFunction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof AsmIntelVisitor) accept((AsmIntelVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public AsmIntelFunctionBody getFunctionBody() {
    return findNotNullChildByClass(AsmIntelFunctionBody.class);
  }

  @Override
  @NotNull
  public AsmIntelFunctionHeader getFunctionHeader() {
    return findNotNullChildByClass(AsmIntelFunctionHeader.class);
  }

}
