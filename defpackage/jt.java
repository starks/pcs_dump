package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import com.google.android.as.oss.R;
import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jt {
    public jt() {
    }

    public static void A(nx nxVar, int i) {
        nxVar.a = new int[i];
        nxVar.b = new Object[i];
    }

    public static float F(wv wvVar) {
        return ((View) wvVar.b).getElevation();
    }

    public static void H(View view, ml mlVar) {
        view.getClass();
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, mlVar);
    }

    private static nn b(wv wvVar) {
        return (nn) wvVar.a;
    }

    public static void k(View view, float f) {
        try {
            view.setFrameContentVelocity(f);
        } catch (LinkageError unused) {
        }
    }

    public static /* synthetic */ mm n(int i, int i2) {
        return new mm(i, i2, uv.b);
    }

    public static boolean q(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static int r(kj kjVar, jq jqVar, View view, View view2, jy jyVar, boolean z) {
        if (jyVar.am() == 0 || kjVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(jy.bk(view) - jy.bk(view2)) + 1;
        }
        return Math.min(jqVar.k(), jqVar.a(view2) - jqVar.d(view));
    }

    public static int s(kj kjVar, jq jqVar, View view, View view2, jy jyVar, boolean z, boolean z2) {
        if (jyVar.am() == 0 || kjVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (kjVar.a() - Math.max(jy.bk(view), jy.bk(view2))) - 1) : Math.max(0, Math.min(jy.bk(view), jy.bk(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(jqVar.a(view2) - jqVar.d(view)) / (Math.abs(jy.bk(view) - jy.bk(view2)) + 1))) + (jqVar.j() - jqVar.d(view)));
        }
        return iMax;
    }

    public static int t(kj kjVar, jq jqVar, View view, View view2, jy jyVar, boolean z) {
        if (jyVar.am() == 0 || kjVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return kjVar.a();
        }
        return (int) (((jqVar.a(view2) - jqVar.d(view)) / (Math.abs(jy.bk(view) - jy.bk(view2)) + 1)) * kjVar.a());
    }

    public static djy u(os osVar) {
        oq oqVar = new oq();
        ou ouVar = new ou(oqVar);
        oqVar.b = ouVar;
        oqVar.a = osVar.getClass();
        try {
            oqVar.a = osVar.a(oqVar);
            return ouVar;
        } catch (Exception e) {
            ouVar.a(e);
            return ouVar;
        }
    }

    public static void v(String str) {
        throw new IllegalArgumentException(str);
    }

    public static void w(String str) {
        throw new IllegalStateException(str);
    }

    public static int x(nx nxVar, int i) {
        try {
            return of.a(nxVar.a, nxVar.c, i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int y(nx nxVar, Object obj, int i) {
        int i2 = nxVar.c;
        if (i2 == 0) {
            return -1;
        }
        int iX = x(nxVar, i);
        if (iX < 0 || fjs.c(obj, nxVar.b[iX])) {
            return iX;
        }
        int i3 = iX + 1;
        while (i3 < i2 && nxVar.a[i3] == i) {
            if (fjs.c(obj, nxVar.b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iX - 1; i4 >= 0 && nxVar.a[i4] == i; i4--) {
            if (fjs.c(obj, nxVar.b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    public static int z(nx nxVar) {
        return y(nxVar, null, 0);
    }

    public final float B(wv wvVar) {
        return b(wvVar).b;
    }

    public final float C(wv wvVar) {
        return b(wvVar).a;
    }

    public final ColorStateList D(wv wvVar) {
        return b(wvVar).e;
    }

    public final void E(wv wvVar) {
        if (!wvVar.c()) {
            wvVar.a(0, 0, 0, 0);
            return;
        }
        float fB = B(wvVar);
        float fC = C(wvVar);
        int iCeil = (int) Math.ceil(no.a(fB, fC, wvVar.b()));
        int iCeil2 = (int) Math.ceil(no.b(fB, fC, wvVar.b()));
        wvVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void G(wv wvVar, ColorStateList colorStateList, float f, float f2, float f3) {
        nn nnVar = new nn(colorStateList, f);
        wvVar.a = nnVar;
        ((nm) wvVar.b).setBackgroundDrawable(nnVar);
        View view = (View) wvVar.b;
        view.setClipToOutline(true);
        view.setElevation(f2);
        nn nnVarB = b(wvVar);
        boolean zC = wvVar.c();
        boolean zB = wvVar.b();
        if (f3 != nnVarB.b || nnVarB.c != zC || nnVarB.d != zB) {
            nnVarB.b = f3;
            nnVarB.c = zC;
            nnVarB.d = zB;
            nnVarB.a(null);
            nnVarB.invalidateSelf();
        }
        E(wvVar);
    }

    public void a(RecyclerView recyclerView) {
        throw null;
    }

    public void g(Canvas canvas, RecyclerView recyclerView) {
        throw null;
    }

    public EdgeEffect l(RecyclerView recyclerView) {
        throw null;
    }

    public void m(Rect rect, View view, RecyclerView recyclerView) {
        ((jz) view.getLayoutParams()).a();
        rect.set(0, 0, 0, 0);
    }

    public jt(char[] cArr) {
    }

    public void o(Window window) {
    }

    public void p(mm mmVar, mm mmVar2, Window window, View view, boolean z, boolean z2) {
    }
}
