package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fts extends frk {
    final /* synthetic */ ftv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fts(String str, ftv ftvVar) {
        super(str);
        this.d = ftvVar;
    }

    @Override // defpackage.frk
    public final long a() throws IOException {
        this.d.i(false, 2, 0);
        return -1L;
    }
}
