package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dv {
    private static final Executor h = new tb(1);
    public final eg a;
    public List d;
    public int f;
    final bnz g;
    public final List c = new CopyOnWriteArrayList();
    public List e = Collections.EMPTY_LIST;
    final Executor b = h;

    public dv(eg egVar, bnz bnzVar) {
        this.a = egVar;
        this.g = bnzVar;
    }

    public final void a(List list, Runnable runnable) {
        for (a aVar : this.c) {
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void b(List list, Runnable runnable) {
        int i = this.f + 1;
        this.f = i;
        List list2 = this.d;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.e;
        if (list == null) {
            int i2 = ((cyp) list2).c;
            this.d = null;
            this.e = Collections.EMPTY_LIST;
            this.a.b(0, i2);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            bnz bnzVar = this.g;
            bnzVar.b.execute(new du(this, list2, list, i, runnable));
        } else {
            this.d = list;
            this.e = DesugarCollections.unmodifiableList(list);
            this.a.a(0, ((cyp) list).c);
            a(list3, runnable);
        }
    }
}
