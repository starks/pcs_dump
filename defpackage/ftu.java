package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftu extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ int e;
    final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftu(String str, ftv ftvVar, int i, long j) {
        super(str);
        this.d = ftvVar;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.frk
    public final long a() throws IOException {
        try {
            this.d.w.j(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.d(e);
            return -1L;
        }
    }
}
