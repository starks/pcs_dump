package defpackage;

import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fge extends fgf implements RandomAccess {
    private final fgf b;
    private final int c;
    private final int d;

    public fge(fgf fgfVar, int i, int i2) {
        this.b = fgfVar;
        this.c = i;
        ffh.ar(i, i2, fgfVar.a());
        this.d = i2 - i;
    }

    @Override // defpackage.fgb
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fgf, java.util.List
    public final Object get(int i) {
        ffh.ap(i, this.d);
        return this.b.get(this.c + i);
    }
}
