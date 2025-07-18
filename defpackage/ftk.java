package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftk extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ fuc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftk(String str, ftv ftvVar, fuc fucVar) {
        super(str);
        this.d = ftvVar;
        this.e = fucVar;
    }

    @Override // defpackage.frk
    public final long a() {
        try {
            this.d.c.f(this.e);
            return -1L;
        } catch (IOException e) {
            fup.c.k("Http2Connection.Listener failure for ".concat(String.valueOf(this.d.e)), 4, e);
            try {
                this.e.g(fta.b, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
