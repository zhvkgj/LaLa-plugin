package ru.mse.itmo.lala.language.highlighting;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.mse.itmo.lala.language.psi.LaLaTypes;

public class PairedBrackets implements PairedBraceMatcher {
    private final static BracePair[] BRACE_PAIRS = new BracePair[]{
            // brackets
            new BracePair(LaLaTypes.LB, LaLaTypes.RB, true),
            new BracePair(LaLaTypes.LCURLY, LaLaTypes.RCURLY, true),
            new BracePair(LaLaTypes.LSQUARE, LaLaTypes.RSQUARE, true)
    };

    @Override
    public BracePair @NotNull [] getPairs() {
        return BRACE_PAIRS;
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return 0;
    }
}
