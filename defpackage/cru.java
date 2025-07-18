package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cru implements Serializable {
    private static final long serialVersionUID = 0;

    public static cru d(Object obj) {
        obj.getClass();
        return new crx(obj);
    }

    public abstract Object a();

    public abstract Object b();

    public abstract boolean c();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();
}
