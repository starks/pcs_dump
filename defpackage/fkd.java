package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkd implements Serializable {
    public static final fkd a = new fkd();
    private static final long serialVersionUID = 0;

    private fkd() {
    }

    private final Object readResolve() {
        return fkf.a;
    }
}
