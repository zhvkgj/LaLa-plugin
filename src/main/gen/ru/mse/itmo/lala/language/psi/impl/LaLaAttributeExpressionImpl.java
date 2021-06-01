// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lala.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static ru.mse.itmo.lala.language.psi.LaLaTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import ru.mse.itmo.lala.language.psi.*;

public class LaLaAttributeExpressionImpl extends ASTWrapperPsiElement implements LaLaAttributeExpression {

  public LaLaAttributeExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LaLaVisitor visitor) {
    visitor.visitAttributeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LaLaVisitor) accept((LaLaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LaLaAttributeAtom getAttributeAtom() {
    return findChildByClass(LaLaAttributeAtom.class);
  }

  @Override
  @Nullable
  public LaLaAttributeFunctionCall getAttributeFunctionCall() {
    return findChildByClass(LaLaAttributeFunctionCall.class);
  }

  @Override
  @Nullable
  public LaLaChildReference getChildReference() {
    return findChildByClass(LaLaChildReference.class);
  }

}
