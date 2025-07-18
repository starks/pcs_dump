package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cjz extends ckc {
    private Runnable a;
    private boolean b;
    OverScroller c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public cjz() {
        this.d = -1;
        this.f = -1;
    }

    public int D(View view) {
        throw null;
    }

    public int E(View view) {
        throw null;
    }

    public int F() {
        throw null;
    }

    public int G(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void I(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean L(View view) {
        throw null;
    }

    public final int U(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return G(coordinatorLayout, view, F() - i, i2, i3);
    }

    public final void V(CoordinatorLayout coordinatorLayout, View view, int i) {
        G(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    @Override // defpackage.qy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.f
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L41
            boolean r0 = r6.b
            if (r0 == 0) goto L41
            int r0 = r6.d
            if (r0 != r3) goto L26
            goto L90
        L26:
            int r0 = r9.findPointerIndex(r0)
            if (r0 == r3) goto L90
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.e
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.f
            if (r1 > r5) goto L3e
            goto L41
        L3e:
            r6.e = r0
            return r2
        L41:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L89
            r6.d = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.L(r8)
            if (r3 == 0) goto L61
            boolean r7 = r7.k(r8, r0, r1)
            if (r7 == 0) goto L61
            r7 = r2
            goto L62
        L61:
            r7 = r4
        L62:
            r6.b = r7
            if (r7 == 0) goto L89
            r6.e = r1
            int r7 = r9.getPointerId(r4)
            r6.d = r7
            android.view.VelocityTracker r7 = r6.g
            if (r7 != 0) goto L78
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.g = r7
        L78:
            android.widget.OverScroller r7 = r6.c
            if (r7 == 0) goto L89
            boolean r7 = r7.isFinished()
            if (r7 == 0) goto L83
            goto L89
        L83:
            android.widget.OverScroller r6 = r6.c
            r6.abortAnimation()
            return r2
        L89:
            android.view.VelocityTracker r6 = r6.g
            if (r6 == 0) goto L90
            r6.addMovement(r9)
        L90:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjz.i(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2 A[ADDED_TO_REGION] */
    @Override // defpackage.qy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjz.m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public cjz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
