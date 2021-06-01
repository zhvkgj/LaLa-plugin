package ru.mse.itmo.lala.language;

import com.intellij.lexer.FlexAdapter;
import ru.mse.itmo.lala.language.parser._LaLaLexer;

public class LaLaLexerAdapter extends FlexAdapter {
    public LaLaLexerAdapter() {
        super(new _LaLaLexer(null));
    }
}
