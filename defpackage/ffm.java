package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffm implements Serializable, ffo {
    private final Object a;

    public ffm(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ffo
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.ffo
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
