package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cia extends cic implements cht {
    private final FileOutputStream a;
    private final File b;

    public cia(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.cht
    public final File a() {
        return this.b;
    }

    public final void b() throws SyncFailedException {
        this.a.getFD().sync();
    }
}
