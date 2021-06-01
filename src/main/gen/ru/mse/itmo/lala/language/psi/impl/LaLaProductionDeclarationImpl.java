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

public class LaLaProductionDeclarationImpl extends ASTWrapperPsiElement implements LaLaProductionDeclaration {

  public LaLaProductionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LaLaVisitor visitor) {
    visitor.visitProductionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LaLaVisitor) accept((LaLaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LaLaGeneratorProductionDeclaration getGeneratorProductionDeclaration() {
    return findChildByClass(LaLaGeneratorProductionDeclaration.class);
  }

  @Override
  @Nullable
  public LaLaTreeProductionDeclaration getTreeProductionDeclaration() {
    return findChildByClass(LaLaTreeProductionDeclaration.class);
  }

}
