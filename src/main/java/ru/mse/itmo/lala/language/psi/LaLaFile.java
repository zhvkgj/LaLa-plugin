package ru.mse.itmo.lala.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import ru.mse.itmo.lala.language.LaLaFileType;
import ru.mse.itmo.lala.language.LaLaLanguage;
import org.jetbrains.annotations.NotNull;

public class LaLaFile extends PsiFileBase {

    public LaLaFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, LaLaLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return LaLaFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "LaLa super file!";
    }

}