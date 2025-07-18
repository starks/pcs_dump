package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eoj extends eny {
    public epj b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("policy", c());
        return crtVarQ.a("priority", 5).c("available", true).toString();
    }
}
