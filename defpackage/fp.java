package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fp {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final ff e;
    private final boolean f;
    private final int g;
    private boolean h;
    private fq i;
    private fn j;
    private final PopupWindow.OnDismissListener k;

    public fp(Context context, ff ffVar, View view, boolean z) {
        this(context, ffVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final fn a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            fn ezVar = Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new ez(this.d, this.a, this.g, this.f) : new fx(this.d, this.e, this.a, this.g, this.f);
            ezVar.b(this.e);
            ezVar.p(this.k);
            ezVar.k(this.a);
            ezVar.e(this.i);
            ezVar.m(this.h);
            ezVar.n(this.b);
            this.j = ezVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.f();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        fn fnVar = this.j;
        if (fnVar != null) {
            fnVar.m(z);
        }
    }

    public final void e(fq fqVar) {
        this.i = fqVar;
        fn fnVar = this.j;
        if (fnVar != null) {
            fnVar.e(fqVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        fn fnVarA = a();
        fnVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            fnVarA.o(i);
            fnVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            fnVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        fnVarA.s();
    }

    public final boolean g() {
        fn fnVar = this.j;
        return fnVar != null && fnVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }

    public fp(Context context, ff ffVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new fo(this);
        this.d = context;
        this.e = ffVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
