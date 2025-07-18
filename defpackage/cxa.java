package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxa implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public cxa(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return cxc.p(this.a);
    }
}
