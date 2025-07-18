package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckn extends wr {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public ckn(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.wr
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.wr
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            this.a.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            this.a.b = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.view.View r6, float r7, float r8) {
        /*
            r5 = this;
            r8 = -1
            r5.c = r8
            r8 = 0
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            int r1 = r6.getWidth()
            if (r0 == 0) goto L2f
            int r2 = r6.getLayoutDirection()
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r5.a
            int r3 = r3.c
            r4 = 2
            if (r3 != r4) goto L18
            goto L48
        L18:
            r4 = 1
            if (r3 != 0) goto L25
            if (r2 != r4) goto L22
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 < 0) goto L48
            goto L5c
        L22:
            if (r0 <= 0) goto L5c
            goto L48
        L25:
            if (r2 != r4) goto L2a
            if (r0 <= 0) goto L5c
            goto L48
        L2a:
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L48
        L2f:
            int r0 = r6.getLeft()
            int r2 = r5.b
            int r0 = r0 - r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r2) goto L5c
        L48:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 < 0) goto L57
            int r7 = r6.getLeft()
            int r8 = r5.b
            if (r7 >= r8) goto L55
            goto L57
        L55:
            int r8 = r8 + r1
            goto L5e
        L57:
            int r7 = r5.b
            int r8 = r7 - r1
            goto L5e
        L5c:
            int r8 = r5.b
        L5e:
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r5.a
            ws r7 = r7.a
            int r0 = r6.getTop()
            boolean r7 = r7.i(r8, r0)
            if (r7 == 0) goto L77
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r5.a
            ckp r7 = new ckp
            r8 = 0
            r7.<init>(r5, r6, r8)
            r6.postOnAnimation(r7)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckn.d(android.view.View, float, float):void");
    }

    @Override // defpackage.wr
    public final boolean e(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.D(view);
    }

    @Override // defpackage.wr
    public final int f(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            if (layoutDirection == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = this.b + view.getWidth();
        } else if (layoutDirection == 1) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.wr
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.wr
    public final void i(View view, int i, int i2) {
        float width = view.getWidth() * this.a.e;
        float width2 = view.getWidth() * this.a.f;
        float fAbs = Math.abs(i - this.b);
        if (fAbs <= width) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.E(1.0f - ((fAbs - width) / (width2 - width))));
        }
    }

    @Override // defpackage.wr
    public final void c(int i) {
    }
}
