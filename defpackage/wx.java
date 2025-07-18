package defpackage;

import android.os.Looper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wx {
    private static final ThreadLocal j = new ThreadLocal();
    public wv g;
    public final bnz h;
    public final oc a = new oc();
    public final ArrayList b = new ArrayList();
    public final fuu i = new fuu(this, null);
    public final Runnable c = new ls(this, 7);
    public long d = 0;
    public boolean e = false;
    public float f = 1.0f;

    public wx(bnz bnzVar) {
        this.h = bnzVar;
    }

    public static wx a() {
        ThreadLocal threadLocal = j;
        if (threadLocal.get() == null) {
            threadLocal.set(new wx(new bnz((char[]) null)));
        }
        return (wx) threadLocal.get();
    }

    public final boolean b() {
        return Thread.currentThread() == ((Looper) this.h.b).getThread();
    }
}
