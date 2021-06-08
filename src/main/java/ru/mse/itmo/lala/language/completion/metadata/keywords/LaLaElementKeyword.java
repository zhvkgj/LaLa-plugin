package ru.mse.itmo.lala.language.completion.metadata.keywords;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import ru.mse.itmo.lala.language.completion.metadata.LaLaElement;

public class LaLaElementKeyword implements LaLaElement {
    private final String keywordStringRepresentation;

    public LaLaElementKeyword(String keywordStringRepresentation) {
        this.keywordStringRepresentation = keywordStringRepresentation;
    }

    @Override
    public LookupElement getLookupElement() {
        return LookupElementBuilder.create(this.keywordStringRepresentation).bold();
    }
}
