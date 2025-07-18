package defpackage;

import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emo {
    private final String a;

    public emo(String str) {
        Logger logger = emr.c;
        this.a = str;
    }

    public final Object a() {
        epx epxVar = emr.l().f;
        Object objC = epxVar == null ? null : epxVar.c(this, hashCode(), 0);
        if (objC == null) {
            return null;
        }
        return objC;
    }

    public final String toString() {
        return this.a;
    }
}
