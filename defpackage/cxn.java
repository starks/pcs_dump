package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxn implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public cxn(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return cxo.n(this.a);
    }
}
