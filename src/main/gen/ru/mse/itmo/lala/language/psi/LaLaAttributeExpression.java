// This is a generated file. Not intended for manual editing.
package ru.mse.itmo.lala.language.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface LaLaAttributeExpression extends PsiElement {

  @Nullable
  LaLaAttributeAtom getAttributeAtom();

  @Nullable
  LaLaAttributeFunctionCall getAttributeFunctionCall();

  @Nullable
  LaLaChildReference getChildReference();

}
