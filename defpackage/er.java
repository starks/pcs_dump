package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class er {
    uz b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final va f = new eq(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((fsc) arrayList.get(i)).ak();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fsc fscVar = (fsc) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                fscVar.am(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ((WeakReference) fscVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                fscVar.an(this.f);
            }
            View view2 = (View) ((WeakReference) fscVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void d(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void e(uz uzVar) {
        if (this.c) {
            return;
        }
        this.b = uzVar;
    }

    public final void f(fsc fscVar) {
        if (this.c) {
            return;
        }
        this.a.add(fscVar);
    }
}
