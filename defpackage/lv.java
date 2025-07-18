package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lv implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable a;
    final /* synthetic */ lx b;
    private final long c = SystemClock.uptimeMillis() + 10000;
    private boolean d;

    public lv(lx lxVar) {
        this.b = lxVar;
    }

    public final void a() {
        this.b.getWindow().getDecorView().removeCallbacks(this);
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public final void b(View view) {
        if (this.d) {
            return;
        }
        this.d = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
        View decorView = this.b.getWindow().getDecorView();
        decorView.getClass();
        if (!this.d) {
            decorView.postOnAnimation(new ls(this, 2));
        } else if (fjs.c(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.a;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.c) {
                this.d = false;
                this.b.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.a = null;
        acv acvVarA = this.b.A();
        synchronized (acvVarA.b) {
            z = acvVarA.a;
        }
        if (z) {
            this.d = false;
            this.b.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
