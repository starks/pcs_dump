package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxl extends cvm implements Serializable {
    public static final cxl a;
    public static final cxl b;
    private final transient cxc c;

    static {
        int i = cxc.d;
        a = new cxl(cyp.a);
        b = new cxl(cxc.q(cyl.a));
    }

    public cxl(cxc cxcVar) {
        this.c = cxcVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.cyn
    public final /* bridge */ /* synthetic */ Set a() {
        if (this.c.isEmpty()) {
            return cyv.a;
        }
        cxc cxcVar = this.c;
        cyl cylVar = cyl.a;
        return new cyw(cxcVar, cyk.a);
    }

    Object writeReplace() {
        return new cxk(this.c);
    }
}
