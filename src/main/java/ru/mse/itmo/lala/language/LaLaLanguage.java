package ru.mse.itmo.lala.language;

import com.intellij.lang.Language;

public class LaLaLanguage extends Language {
    public static final LaLaLanguage INSTANCE = new LaLaLanguage();

    private LaLaLanguage() {
        super("LaLa");
    }
}
