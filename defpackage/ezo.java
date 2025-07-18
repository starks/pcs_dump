package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezo {
    public final boolean a;
    public final Object b;

    public ezo(emt emtVar, boolean z) {
        this.b = emtVar;
        this.a = z;
    }

    public final djy a(Callable callable, Executor executor) {
        return new dix((cwu) this.b, this.a, executor, callable);
    }

    public ezo(boolean z, cxc cxcVar) {
        this.a = z;
        this.b = cxcVar;
    }

    public ezo(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }
}
