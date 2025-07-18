package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffw implements Serializable, ffo {
    private fin a;
    private volatile Object b = ffx.a;
    private final Object c = this;

    public /* synthetic */ ffw(fin finVar) {
        this.a = finVar;
    }

    private final Object writeReplace() {
        return new ffm(a());
    }

    @Override // defpackage.ffo
    public final Object a() {
        Object objA;
        Object obj = this.b;
        if (obj != ffx.a) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.b;
            if (objA == ffx.a) {
                fin finVar = this.a;
                finVar.getClass();
                objA = finVar.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    @Override // defpackage.ffo
    public final boolean b() {
        return this.b != ffx.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
