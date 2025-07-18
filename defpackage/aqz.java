package defpackage;

import android.database.Cursor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqz implements bqd {
    private final Cursor a;
    private final arf b;

    public aqz(Cursor cursor) {
        this.a = cursor;
        this.b = new arf(cursor);
    }

    @Override // defpackage.bqd
    public final void a(bqc bqcVar) {
        try {
            if (this.b.hasNext()) {
                bqcVar.b(this.b.next().toByteArray(), null);
            } else {
                bqcVar.b(null, null);
            }
        } catch (RuntimeException e) {
            this.a.close();
            bqcVar.a(1, "Failed to generate next example from cursor: ".concat(String.valueOf(e.getLocalizedMessage())));
        }
    }

    @Override // defpackage.bqd, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.bqd
    public final void b(int i) {
    }
}
