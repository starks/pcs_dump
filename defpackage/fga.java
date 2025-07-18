package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fga implements Serializable, ffo {
    private fin a;
    private Object b = ffx.a;

    public fga(fin finVar) {
        this.a = finVar;
    }

    private final Object writeReplace() {
        return new ffm(a());
    }

    @Override // defpackage.ffo
    public final Object a() {
        if (this.b == ffx.a) {
            fin finVar = this.a;
            finVar.getClass();
            this.b = finVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.ffo
    public final boolean b() {
        return this.b != ffx.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
