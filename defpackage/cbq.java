package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbq implements Closeable {
    private static final cbx a = cbr.c("AndroidLearningContext");
    private static final Map b = new HashMap();
    private static cbq c;
    private final Context d;
    private final Map e = new HashMap();
    private final bqm f;
    private int g;

    private cbq(Context context) {
        this.d = context;
        this.g++;
        bqm bqmVar = (bqm) c(bqm.class);
        this.f = bqmVar;
        bqmVar.h(ccd.LEARNING_CONTEXT_CREATED);
        bqmVar.h(ccd.LEARNING_CONTEXT_REFCOUNT_INCREMENTED);
    }

    public static synchronized cbq b(Context context) {
        context.getClass();
        cbq cbqVar = c;
        if (cbqVar == null) {
            c = new cbq(context.getApplicationContext());
        } else {
            cbqVar.d();
        }
        return c;
    }

    public static synchronized void e(Class cls, crp crpVar) {
        b.put(cls, crpVar);
    }

    public final Context a() {
        Context context;
        synchronized (cbq.class) {
            clq.G(this.g > 0, "#getContext() called after #close()");
            context = this.d;
        }
        return context;
    }

    public final Object c(Class cls) {
        Object objCast;
        synchronized (cbq.class) {
            clq.G(this.g > 0, "#getComponent() called after #close()");
            Object objA = this.e.get(cls);
            if (objA == null) {
                crp crpVar = (crp) b.get(cls);
                if (crpVar == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("requested component type not registered: " + cls.toString());
                    a.f(illegalArgumentException, "cannot retrieve component");
                    throw illegalArgumentException;
                }
                objA = crpVar.a(this);
                this.e.put(cls, objA);
            }
            objCast = cls.cast(objA);
        }
        return objCast;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (cbq.class) {
            if (this.g <= 0) {
                a.e("close() called too many times!");
                this.f.k(ccj.bm);
                return;
            }
            this.f.h(ccd.LEARNING_CONTEXT_REFCOUNT_DECREMENTED);
            try {
                if (this.g == 1) {
                    this.f.h(ccd.LEARNING_CONTEXT_DESTROYED);
                    try {
                        for (Object obj : this.e.values()) {
                            if (obj instanceof AutoCloseable) {
                                try {
                                    ((AutoCloseable) obj).close();
                                } catch (Exception e) {
                                    a.f(e, "Cannot close component instance, ignored.");
                                }
                            }
                        }
                        this.e.clear();
                        c = null;
                    } catch (Throwable th) {
                        this.e.clear();
                        c = null;
                        throw th;
                    }
                }
            } finally {
                this.g--;
            }
        }
    }

    public final void d() {
        synchronized (cbq.class) {
            this.g++;
            ((bqm) c(bqm.class)).h(ccd.LEARNING_CONTEXT_REFCOUNT_INCREMENTED);
        }
    }
}
