package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cxk implements Serializable {
    private final cxc a;

    public cxk(cxc cxcVar) {
        this.a = cxcVar;
    }

    Object readResolve() {
        return this.a.isEmpty() ? cxl.a : dcr.v(this.a, cxc.q(cyl.a)) ? cxl.b : new cxl(this.a);
    }
}
