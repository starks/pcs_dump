package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cww implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public cww(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new cwx(this.a.clone());
    }
}
