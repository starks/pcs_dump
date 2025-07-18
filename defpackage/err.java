package defpackage;

import android.util.StateSet;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class err {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public err(cos cosVar) {
        this.a = cosVar.a;
        this.d = cosVar.b;
        this.c = cosVar.c;
        this.b = cosVar.d;
    }

    public final int a(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(((int[][]) this.c)[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public err(int i, fuu fuuVar, Executor executor) {
        this.a = i;
        this.d = fuuVar;
        this.c = executor;
        this.b = new ConcurrentHashMap(8);
    }
}
