// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lala.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LaLaProductionClassDeclaration extends PsiElement {

  @NotNull
  List<LaLaAnnotation> getAnnotationList();

  @NotNull
  List<LaLaAttributeDeclaration> getAttributeDeclarationList();

  @NotNull
  List<LaLaProductionDeclaration> getProductionDeclarationList();

  @NotNull
  PsiElement getIdent();

}
