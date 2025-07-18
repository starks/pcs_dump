package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjk implements Serializable {
    public static final fjk a = new fjk();

    private Object readResolve() {
        return a;
    }
}
