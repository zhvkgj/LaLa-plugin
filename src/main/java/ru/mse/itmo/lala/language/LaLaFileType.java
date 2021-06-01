package ru.mse.itmo.lala.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class LaLaFileType extends LanguageFileType {
    public static final LaLaFileType INSTANCE = new LaLaFileType();

    private LaLaFileType() {
        super(LaLaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "LaLa File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "LaLa language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "ls";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return null;
    }
}
