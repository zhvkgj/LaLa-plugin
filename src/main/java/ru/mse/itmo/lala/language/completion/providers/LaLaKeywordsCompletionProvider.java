package ru.mse.itmo.lala.language.completion.providers;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.completion.CompletionProvider;
import com.intellij.codeInsight.completion.CompletionResultSet;
import com.intellij.patterns.ElementPattern;
import com.intellij.psi.PsiElement;
import com.intellij.util.ProcessingContext;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lala.language.completion.metadata.keywords.LaLaKeywordsProvider;
import ru.mse.itmo.lala.language.completion.providers.patterns.LaLaPatternProvider;

public class LaLaKeywordsCompletionProvider extends CompletionProvider<CompletionParameters> {
    private static final LaLaKeywordsProvider keywordsProvider = new LaLaKeywordsProvider();

    public static final ElementPattern<PsiElement> PATTERN = LaLaPatternProvider.getForKeyword();

    @Override
    protected void addCompletions(@NotNull CompletionParameters parameters,
                                  @NotNull ProcessingContext context,
                                  @NotNull CompletionResultSet result) {
        result.addAllElements(keywordsProvider.getKeywordsLookupElements());
    }
}
