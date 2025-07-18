package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ctu extends cty implements cta {
    private static final long serialVersionUID = 1;
    transient cta a;

    public ctu(cuu cuuVar) {
        super(cuuVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = c().a(this.k);
    }

    private Object readResolve() {
        return this.a;
    }

    @Override // defpackage.crp
    public final Object a(Object obj) {
        return ((ctw) this.a).b(obj);
    }

    @Override // defpackage.cta
    public final Object b(Object obj) {
        throw null;
    }
}
