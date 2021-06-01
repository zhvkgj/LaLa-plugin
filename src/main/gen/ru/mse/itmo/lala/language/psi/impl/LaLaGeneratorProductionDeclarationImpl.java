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

public class LaLaGeneratorProductionDeclarationImpl extends ASTWrapperPsiElement implements LaLaGeneratorProductionDeclaration {

  public LaLaGeneratorProductionDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LaLaVisitor visitor) {
    visitor.visitGeneratorProductionDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LaLaVisitor) accept((LaLaVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LaLaAnnotation> getAnnotationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LaLaAnnotation.class);
  }

  @Override
  @NotNull
  public List<LaLaAttributeEvaluationRule> getAttributeEvaluationRuleList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LaLaAttributeEvaluationRule.class);
  }

  @Override
  @NotNull
  public LaLaAttributeFunctionCall getAttributeFunctionCall() {
    return findNotNullChildByClass(LaLaAttributeFunctionCall.class);
  }

  @Override
  @NotNull
  public LaLaAttributeTypeName getAttributeTypeName() {
    return findNotNullChildByClass(LaLaAttributeTypeName.class);
  }

  @Override
  @NotNull
  public List<LaLaLocalAttributeDefinition> getLocalAttributeDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LaLaLocalAttributeDefinition.class);
  }

  @Override
  @NotNull
  public PsiElement getIdent() {
    return findNotNullChildByType(IDENT);
  }

}
