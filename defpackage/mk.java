package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mk {
    public final fgk a;
    public me b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public mk() {
        this(null);
    }

    private final void e(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z) {
            if (this.f) {
                return;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (this.f) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        me meVarPrevious;
        me meVar = this.b;
        if (meVar == null) {
            fgk fgkVar = this.a;
            ListIterator listIterator = fgkVar.listIterator(fgkVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    meVarPrevious = 0;
                    break;
                } else {
                    meVarPrevious = listIterator.previous();
                    if (((me) meVarPrevious).b) {
                        break;
                    }
                }
            }
            meVar = meVarPrevious;
        }
        this.b = null;
        if (meVar != null) {
            meVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        me meVarPrevious;
        me meVar = this.b;
        if (meVar == null) {
            fgk fgkVar = this.a;
            ListIterator listIterator = fgkVar.listIterator(fgkVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    meVarPrevious = 0;
                    break;
                } else {
                    meVarPrevious = listIterator.previous();
                    if (((me) meVarPrevious).b) {
                        break;
                    }
                }
            }
            meVar = meVarPrevious;
        }
        this.b = null;
        if (meVar != null) {
            meVar.b();
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        e(this.g);
    }

    public final void d() {
        boolean z = this.g;
        fgk fgkVar = this.a;
        boolean z2 = false;
        if (!fgkVar.isEmpty()) {
            Iterator<E> it = fgkVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((me) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z) {
            e(z2);
        }
    }

    public mk(Runnable runnable) {
        this.c = runnable;
        this.a = new fgk();
        this.d = new mg(new mf(this, 0), new mf(this, 2), new lw(this, 3), new lw(this, 4));
    }
}
