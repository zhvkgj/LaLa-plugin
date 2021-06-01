// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lala.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LaLaGeneratorProductionDeclaration extends PsiElement {

  @NotNull
  List<LaLaAnnotation> getAnnotationList();

  @NotNull
  List<LaLaAttributeEvaluationRule> getAttributeEvaluationRuleList();

  @NotNull
  LaLaAttributeFunctionCall getAttributeFunctionCall();

  @NotNull
  LaLaAttributeTypeName getAttributeTypeName();

  @NotNull
  List<LaLaLocalAttributeDefinition> getLocalAttributeDefinitionList();

  @NotNull
  PsiElement getIdent();

}
