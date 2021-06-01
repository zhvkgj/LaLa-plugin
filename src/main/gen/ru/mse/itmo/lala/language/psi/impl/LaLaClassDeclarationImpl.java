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

public class LaLaClassDeclarationImpl extends ASTWrapperPsiElement implements LaLaClassDeclaration {

  public LaLaClassDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LaLaVisitor visitor) {
    visitor.visitClassDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LaLaVisitor) accept((LaLaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public LaLaLiteralClassDeclaration getLiteralClassDeclaration() {
    return findChildByClass(LaLaLiteralClassDeclaration.class);
  }

  @Override
  @Nullable
  public LaLaProductionClassDeclaration getProductionClassDeclaration() {
    return findChildByClass(LaLaProductionClassDeclaration.class);
  }

}
