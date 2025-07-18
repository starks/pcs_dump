package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wg implements View.OnTouchListener {
    private static final int f = ViewConfiguration.getTapTimeout();
    public final wf a;
    public final View b;
    public boolean c;
    public boolean d;
    public boolean e;
    private final Interpolator g;
    private Runnable h;
    private float[] i;
    private float[] j;
    private int k;
    private int l;
    private float[] m;
    private float[] n;
    private float[] o;
    private boolean p;
    private boolean q;
    private final ListView r;

    public wg(View view) {
        wf wfVar = new wf();
        this.a = wfVar;
        this.g = new AccelerateInterpolator();
        this.i = new float[]{0.0f, 0.0f};
        this.j = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.m = new float[]{0.0f, 0.0f};
        this.n = new float[]{0.0f, 0.0f};
        this.o = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = displayMetrics.density * 1575.0f;
        float f3 = displayMetrics.density * 315.0f;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        float[] fArr = this.o;
        fArr[0] = f4;
        fArr[1] = f4;
        float f5 = ((int) (f3 + 0.5f)) / 1000.0f;
        float[] fArr2 = this.n;
        fArr2[0] = f5;
        fArr2[1] = f5;
        this.k = 1;
        float[] fArr3 = this.j;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.i;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.m;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.l = f;
        wfVar.a = 500;
        wfVar.b = 500;
    }

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float f(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.i
            r0 = r0[r4]
            float[] r1 = r3.j
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r6 = r6 - r5
            float r5 = r3.g(r5, r0)
            float r6 = r3.g(r6, r0)
            float r6 = r6 - r5
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L25
            android.view.animation.Interpolator r5 = r3.g
            float r6 = -r6
            float r5 = r5.getInterpolation(r6)
            float r5 = -r5
            goto L2f
        L25:
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L38
            android.view.animation.Interpolator r5 = r3.g
            float r5 = r5.getInterpolation(r6)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.m
            r0 = r0[r4]
            float[] r1 = r3.n
            r1 = r1[r4]
            float[] r3 = r3.o
            r3 = r3[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r3 = a(r5, r1, r3)
            return r3
        L53:
            float r4 = -r5
            float r4 = r4 * r0
            float r3 = a(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.f(int, float, float, float):float");
    }

    private final float g(float f2, float f3) {
        if (f3 != 0.0f && f2 < f3) {
            if (f2 >= 0.0f) {
                return 1.0f - (f2 / f3);
            }
            if (this.e && this.k == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void h() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        wf wfVar = this.a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - wfVar.e);
        int i3 = wfVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        wfVar.k = i;
        wfVar.j = wfVar.a(jCurrentAnimationTimeMillis);
        wfVar.i = jCurrentAnimationTimeMillis;
    }

    public final boolean b() {
        wf wfVar = this.a;
        float f2 = wfVar.d;
        float fAbs = f2 / Math.abs(f2);
        Math.abs(wfVar.c);
        int i = (int) fAbs;
        return i != 0 && c(i);
    }

    public final boolean c(int i) {
        ListView listView = this.r;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            return i2 < count || listView.getChildAt(childCount + (-1)).getBottom() > listView.getHeight();
        }
        if (i < 0) {
            return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
        }
        return false;
    }

    public final void d(int i) {
        this.r.scrollListBy(i);
    }

    public final void e(boolean z) {
        if (this.q && !z) {
            h();
        }
        this.q = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.q
            r1 = 0
            if (r0 != 0) goto L7
            goto L82
        L7:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r6 = 3
            if (r0 == r6) goto L17
            goto L82
        L17:
            r5.h()
            goto L82
        L1b:
            r5.d = r2
            r5.p = r1
        L1f:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.b
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.f(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.f(r2, r7, r6, r3)
            wf r7 = r5.a
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.e
            if (r6 != 0) goto L82
            boolean r6 = r5.b()
            if (r6 == 0) goto L82
            java.lang.Runnable r6 = r5.h
            if (r6 != 0) goto L64
            ls r6 = new ls
            r7 = 5
            r0 = 0
            r6.<init>(r5, r7, r0)
            r5.h = r6
        L64:
            r5.e = r2
            r5.c = r2
            boolean r6 = r5.p
            if (r6 != 0) goto L7b
            int r6 = r5.l
            if (r6 <= 0) goto L7b
            android.view.View r7 = r5.b
            java.lang.Runnable r0 = r5.h
            int[] r3 = defpackage.ut.a
            long r3 = (long) r6
            r7.postOnAnimationDelayed(r0, r3)
            goto L80
        L7b:
            java.lang.Runnable r6 = r5.h
            r6.run()
        L80:
            r5.p = r2
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public wg(ListView listView) {
        this((View) listView);
        this.r = listView;
    }
}
