package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crm extends cro implements Serializable {
    public static final crm a = new crm();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.cro
    public final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.cro
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
