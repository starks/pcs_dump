package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ki {
    public int a;
    public RecyclerView b;
    public jy c;
    public boolean d;
    public boolean e;
    public View f;
    public boolean g;
    protected final LinearInterpolator h;
    protected final DecelerateInterpolator i;
    protected PointF j;
    protected int k;
    protected int l;
    private final kg m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public ki() {
        this.a = -1;
        this.m = new kg();
    }

    public static int f(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public static final int g(View view) {
        km kmVarG = RecyclerView.g(view);
        if (kmVarG != null) {
            return kmVarG.c();
        }
        return -1;
    }

    private static int j(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public final PointF a(int i) {
        Object obj = this.c;
        if (obj instanceof kh) {
            return ((kh) obj).K(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(kh.class.getCanonicalName())));
        return null;
    }

    final void b(int i, int i2) {
        PointF pointFA;
        RecyclerView recyclerView = this.b;
        if (this.a == -1 || recyclerView == null) {
            c();
        }
        if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null && (pointFA.x != 0.0f || pointFA.y != 0.0f)) {
            recyclerView.Q((int) Math.signum(pointFA.x), (int) Math.signum(pointFA.y), null);
        }
        this.d = false;
        View view = this.f;
        if (view != null) {
            if (g(view) == this.a) {
                View view2 = this.f;
                kj kjVar = recyclerView.K;
                i(view2, this.m);
                this.m.a(recyclerView);
                c();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            kj kjVar2 = recyclerView.K;
            h(i, i2, this.m);
            kg kgVar = this.m;
            int i3 = kgVar.a;
            kgVar.a(recyclerView);
            if (i3 < 0 || !this.e) {
                return;
            }
            this.d = true;
            recyclerView.H.b();
        }
    }

    public final void c() {
        if (this.e) {
            this.e = false;
            e();
            this.b.K.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            jy jyVar = this.c;
            if (jyVar.t == this) {
                jyVar.t = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    protected final int d(int i) {
        float fAbs = Math.abs(i);
        if (!this.o) {
            this.p = 25.0f / this.n.densityDpi;
            this.o = true;
        }
        return (int) Math.ceil(fAbs * this.p);
    }

    protected final void e() {
        this.l = 0;
        this.k = 0;
        this.j = null;
    }

    protected final void h(int i, int i2, kg kgVar) {
        if (this.b.n.am() == 0) {
            c();
            return;
        }
        int iJ = j(this.k, i);
        this.k = iJ;
        int iJ2 = j(this.l, i2);
        this.l = iJ2;
        if (iJ == 0 && iJ2 == 0) {
            PointF pointFA = a(this.a);
            if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
                kgVar.a = this.a;
                c();
                return;
            }
            float fSqrt = (float) Math.sqrt((pointFA.x * pointFA.x) + (pointFA.y * pointFA.y));
            pointFA.x /= fSqrt;
            pointFA.y /= fSqrt;
            this.j = pointFA;
            this.k = (int) (pointFA.x * 10000.0f);
            this.l = (int) (pointFA.y * 10000.0f);
            int iD = d(10000);
            kgVar.b((int) (this.k * 1.2f), (int) (this.l * 1.2f), (int) (iD * 1.2f), this.h);
        }
    }

    protected final void i(View view, kg kgVar) {
        int iF;
        PointF pointF = this.j;
        int i = 1;
        int iF2 = 0;
        int i2 = (pointF == null || pointF.x == 0.0f) ? 0 : this.j.x > 0.0f ? 1 : -1;
        jy jyVar = this.c;
        if (jyVar == null || !jyVar.W()) {
            iF = 0;
        } else {
            jz jzVar = (jz) view.getLayoutParams();
            iF = f(jy.bf(view) - jzVar.leftMargin, jy.bi(view) + jzVar.rightMargin, jyVar.at(), jyVar.C - jyVar.au(), i2);
        }
        PointF pointF2 = this.j;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i = 0;
        } else if (this.j.y <= 0.0f) {
            i = -1;
        }
        jy jyVar2 = this.c;
        if (jyVar2 != null && jyVar2.X()) {
            jz jzVar2 = (jz) view.getLayoutParams();
            iF2 = f(jy.bj(view) - jzVar2.topMargin, jy.be(view) + jzVar2.bottomMargin, jyVar2.av(), jyVar2.D - jyVar2.as(), i);
        }
        int iCeil = (int) Math.ceil(d((int) Math.sqrt((iF * iF) + (iF2 * iF2))) / 0.3356d);
        if (iCeil > 0) {
            kgVar.b(-iF, -iF2, iCeil, this.i);
        }
    }

    public ki(Context context) {
        this();
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.o = false;
        this.k = 0;
        this.l = 0;
        this.n = context.getResources().getDisplayMetrics();
    }
}
