package ru.mse.itmo.lala.language.completion;

import com.intellij.codeInsight.completion.CompletionContributor;
import com.intellij.codeInsight.completion.CompletionType;
import ru.mse.itmo.lala.language.completion.providers.LaLaKeywordsCompletionProvider;

public class LaLaCompletionContributor extends CompletionContributor {
    public LaLaCompletionContributor() {
        extend(CompletionType.BASIC, LaLaKeywordsCompletionProvider.PATTERN, new LaLaKeywordsCompletionProvider());
    }
}
