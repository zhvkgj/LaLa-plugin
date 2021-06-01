package ru.mse.itmo.lala.language.highlighting;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import ru.mse.itmo.lala.language.LaLaLexerAdapter;
import ru.mse.itmo.lala.language.psi.LaLaTypes;

import java.util.Set;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class LaLaSyntaxHighlighter extends SyntaxHighlighterBase {

    private static final Set<IElementType> LALA_KEYWORD_TYPES =
            Set.of(
                    LaLaTypes.INH,
                    LaLaTypes.GRD,
                    LaLaTypes.LOC,
                    LaLaTypes.SYN,
                    LaLaTypes.USE,
                    LaLaTypes.NIL,
                    LaLaTypes.TRUE,
                    LaLaTypes.FALSE,
                    LaLaTypes.CLASS
            );

    public static final TextAttributesKey COMMENT_ = createTextAttributesKey("LALA_SINGLECOMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey KEYWORD_ = createTextAttributesKey("KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING_ = createTextAttributesKey("LALA_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey IDENT_ = createTextAttributesKey("LALA_IDENT", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey NUMBER_ = createTextAttributesKey("LALA_DECIMAL", DefaultLanguageHighlighterColors.NUMBER);

    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT_};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD_};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING_};
    private static final TextAttributesKey[] IDENT_KEYS = new TextAttributesKey[]{IDENT_};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER_};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];


    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new LaLaLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(LaLaTypes.COMMENT)) {
            return COMMENT_KEYS;
        } else if (LALA_KEYWORD_TYPES.contains(tokenType)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(LaLaTypes.STRING) ||
                tokenType.equals(LaLaTypes.CHARLITERAL)) {
            return STRING_KEYS;
        } else if (tokenType.equals(LaLaTypes.IDENT)) {
            return IDENT_KEYS;
        } else if (tokenType.equals(LaLaTypes.NUMBER)) {
            return NUMBER_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}