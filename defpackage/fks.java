package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fks implements fku {
    public final fku a;
    public final int b;

    public fks(fku fkuVar, int i) {
        this.a = fkuVar;
        this.b = i;
    }

    @Override // defpackage.fku
    public final Iterator a() {
        return new fkr(this, 0);
    }
}
