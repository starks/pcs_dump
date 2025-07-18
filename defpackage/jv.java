package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jv {
    public fuu e = null;
    private final ArrayList f = new ArrayList();
    public final long a = 120;
    public final long b = 120;
    public final long c = 250;
    public final long d = 250;

    public static int a(km kmVar) {
        int i = kmVar.j;
        int i2 = i & 14;
        if (kmVar.t()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i3 = kmVar.d;
            int iA = kmVar.a();
            if (i3 != -1 && iA != -1 && i3 != iA) {
                return i2 | AIFeature.Id.PIXEL_AI_FEATURE_48;
            }
        }
        return i2;
    }

    public static final tz h(km kmVar) {
        return new tz().e(kmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.km r8) {
        /*
            r7 = this;
            fuu r7 = r7.e
            if (r7 == 0) goto L9d
            r0 = 1
            r8.n(r0)
            km r1 = r8.h
            r2 = 0
            if (r1 == 0) goto L13
            km r1 = r8.i
            if (r1 != 0) goto L13
            r8.h = r2
        L13:
            r8.i = r2
            int r1 = r8.j
            r1 = r1 & 16
            if (r1 == 0) goto L1d
            goto L9d
        L1d:
            java.lang.Object r1 = r7.a
            android.view.View r2 = r8.a
            android.support.v7.widget.RecyclerView r1 = (android.support.v7.widget.RecyclerView) r1
            r1.W()
            ic r3 = r1.i
            int r4 = r3.c
            r5 = 0
            if (r4 != r0) goto L3b
            android.view.View r0 = r3.d
            if (r0 != r2) goto L33
        L31:
            r0 = r5
            goto L6a
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r7.<init>(r8)
            throw r7
        L3b:
            r6 = 2
            if (r4 == r6) goto L95
            r3.c = r6     // Catch: java.lang.Throwable -> L91
            fuu r4 = r3.e     // Catch: java.lang.Throwable -> L91
            int r4 = r4.H(r2)     // Catch: java.lang.Throwable -> L91
            r6 = -1
            if (r4 != r6) goto L4f
            r3.l(r2)     // Catch: java.lang.Throwable -> L91
            r3.c = r5
            goto L6a
        L4f:
            ib r6 = r3.a     // Catch: java.lang.Throwable -> L91
            boolean r6 = r6.f(r4)     // Catch: java.lang.Throwable -> L91
            if (r6 == 0) goto L67
            ib r6 = r3.a     // Catch: java.lang.Throwable -> L91
            r6.g(r4)     // Catch: java.lang.Throwable -> L91
            r3.l(r2)     // Catch: java.lang.Throwable -> L91
            fuu r6 = r3.e     // Catch: java.lang.Throwable -> L91
            r6.K(r4)     // Catch: java.lang.Throwable -> L91
            r3.c = r5
            goto L6a
        L67:
            r3.c = r5
            goto L31
        L6a:
            if (r0 == 0) goto L7a
            km r2 = android.support.v7.widget.RecyclerView.g(r2)
            kc r3 = r1.f
            r3.m(r2)
            kc r3 = r1.f
            r3.k(r2)
        L7a:
            r2 = r0 ^ 1
            r1.X(r2)
            if (r0 != 0) goto L9d
            boolean r0 = r8.x()
            if (r0 == 0) goto L9d
            java.lang.Object r7 = r7.a
            android.view.View r8 = r8.a
            android.support.v7.widget.RecyclerView r7 = (android.support.v7.widget.RecyclerView) r7
            r7.removeDetachedView(r8, r5)
            return
        L91:
            r7 = move-exception
            r3.c = r5
            throw r7
        L95:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r7.<init>(r8)
            throw r7
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jv.b(km):void");
    }

    public final void c() {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ((ju) this.f.get(i)).a();
        }
        this.f.clear();
    }

    public abstract void d(km kmVar);

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g(km kmVar, km kmVar2, tz tzVar, tz tzVar2);
}
