package ru.mse.itmo.lala.language.completion.metadata.keywords;

import com.intellij.codeInsight.lookup.LookupElement;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LaLaKeywordsProvider {
    public Collection<String> getLamaKeywordsAsStrings() {
        return new HashSet<>(Arrays.asList(
                "loc", "grd", "inh",
                "syn", "use", "nil",
                "true", "false", "class",
                "@weight", "@list", "@precedence",
                "@feature", "@unit", "@count",
                "@max_height", "@max_alternatives",
                "@hidden", "@copy"));
    }

    public List<LookupElement> getKeywordsLookupElements() {
        return this.getLamaKeywordsAsStrings().stream()
                .map(LaLaElementKeyword::new)
                .map(LaLaElementKeyword::getLookupElement)
                .collect(Collectors.toList());
    }
}
