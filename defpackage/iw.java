package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iw implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new it(0);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final km b(RecyclerView recyclerView, int i, long j) {
        int iC = recyclerView.i.c();
        for (int i2 = 0; i2 < iC; i2++) {
            km kmVarG = RecyclerView.g(recyclerView.i.f(i2));
            if (kmVarG.c == i && !kmVarG.t()) {
                return null;
            }
        }
        kc kcVar = recyclerView.f;
        if (j == Long.MAX_VALUE) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.M(false);
                Trace.endSection();
            }
        }
        recyclerView.K();
        km kmVarO = kcVar.o(i, j);
        if (kmVarO != null) {
            if (!kmVarO.s() || kmVarO.t()) {
                kcVar.c(kmVarO, false);
            } else {
                kcVar.j(kmVarO.a);
            }
        }
        return kmVarO;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.s && this.d == 0) {
            this.d = RecyclerView.aj();
            recyclerView.post(this);
        }
        iu iuVar = recyclerView.J;
        iuVar.a = i;
        iuVar.b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00d2, code lost:
    
        continue;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw.run():void");
    }
}
