package ru.mse.itmo.lala.language.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lala.language.LaLaLanguage;

public class LaLaTokenType extends IElementType {
    public LaLaTokenType(@NotNull @NonNls String debugName) {
        super(debugName, LaLaLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}