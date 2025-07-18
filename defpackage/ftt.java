package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftt extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ int e;
    final /* synthetic */ fta f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftt(String str, ftv ftvVar, int i, fta ftaVar) {
        super(str);
        this.d = ftvVar;
        this.e = i;
        this.f = ftaVar;
    }

    @Override // defpackage.frk
    public final long a() throws IOException {
        try {
            this.d.j(this.e, this.f);
            return -1L;
        } catch (IOException e) {
            this.d.d(e);
            return -1L;
        }
    }
}
