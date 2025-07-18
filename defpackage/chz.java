package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chz extends cib implements cht {
    private final FileInputStream a;
    private final File b;

    public chz(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.cht
    public final File a() {
        return this.b;
    }
}
