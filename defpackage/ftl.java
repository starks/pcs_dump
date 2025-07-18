package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftl extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftl(String str, ftv ftvVar, int i, int i2) {
        super(str);
        this.d = ftvVar;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.frk
    public final long a() throws IOException {
        this.d.i(true, this.e, this.f);
        return -1L;
    }
}
