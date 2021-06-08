package ru.mse.itmo.lala.language.completion.providers.patterns;

import com.intellij.patterns.ElementPattern;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.psi.PsiElement;
import ru.mse.itmo.lala.language.LaLaLanguage;
import ru.mse.itmo.lala.language.psi.LaLaTypes;

public class LaLaPatternProvider {
    public static ElementPattern<PsiElement> getForKeyword() {
        return PlatformPatterns
                .psiElement()
                .withLanguage(LaLaLanguage.INSTANCE)
                .andNot(getForLineComment());
    }

    private static ElementPattern<PsiElement> getForLineComment() {
        return PlatformPatterns.psiElement(LaLaTypes.COMMENT);
    }

    public static ElementPattern<PsiElement> getForBuiltIn() {
        return PlatformPatterns
                .psiElement()
                .withLanguage(LaLaLanguage.INSTANCE)
                .andNot(getForLineComment());
    }
}
