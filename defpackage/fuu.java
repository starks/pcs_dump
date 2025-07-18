package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuu {
    public final /* synthetic */ Object a;

    public fuu() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public static final fux b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (superclass != null && !fjs.c(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                Objects.toString(cls);
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type ".concat(String.valueOf(cls)));
            }
        }
        superclass.getClass();
        return new fuv(superclass);
    }

    public static /* bridge */ /* synthetic */ void y(afa afaVar, Object obj) {
        ava avaVar = (ava) obj;
        afaVar.f(1, avaVar.b());
        afaVar.h(2, avaVar.j());
        afaVar.h(3, avaVar.k() + (-1) != 0 ? "FAILED" : "SUCCEEDED");
        afaVar.f(4, avaVar.c());
        afaVar.f(5, avaVar.e());
        afaVar.f(6, avaVar.i().toEpochMilli());
        afaVar.f(7, avaVar.d());
        afaVar.e(8, avaVar.f().toByteArray());
        aux auxVarG = avaVar.g();
        afaVar.e(9, auxVarG.a().toByteArray());
        String strName = auxVarG.b().name();
        if (strName == null) {
            afaVar.g(10);
        } else {
            afaVar.h(10, strName);
        }
        afaVar.h(11, auxVarG.c());
    }

    public static String z() {
        return "INSERT OR ABORT INTO `NetworkUsageLog` (`id`,`url`,`status`,`downloadSize`,`uploadSize`,`creationTime`,`fcRunId`,`policyProto`,`connectionKey`,`type`,`packageName`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
    }

    public final km A(int i) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.i.c();
        int i2 = 0;
        km kmVar = null;
        while (true) {
            if (i2 >= iC) {
                break;
            }
            km kmVarG = RecyclerView.g(recyclerView.i.f(i2));
            if (kmVarG != null && !kmVarG.v() && kmVarG.c == i) {
                if (!recyclerView.i.k(kmVarG.a)) {
                    kmVar = kmVarG;
                    break;
                }
                kmVar = kmVarG;
            }
            i2++;
        }
        if (kmVar == null || ((RecyclerView) this.a).i.k(kmVar.a)) {
            return null;
        }
        return kmVar;
    }

    public final void B(gp gpVar) {
        int i = gpVar.a;
        if (i == 1) {
            ((RecyclerView) this.a).n.w(gpVar.b, gpVar.d);
            return;
        }
        if (i == 2) {
            ((RecyclerView) this.a).n.z(gpVar.b, gpVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            ((RecyclerView) this.a).n.y(gpVar.b, gpVar.d);
        } else {
            jy jyVar = ((RecyclerView) this.a).n;
            int i2 = gpVar.b;
            int i3 = gpVar.d;
            Object obj = gpVar.c;
            jyVar.A(i2, i3);
        }
    }

    public final void C(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.i.c();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= iC) {
                break;
            }
            View viewF = recyclerView.i.f(i6);
            km kmVarG = RecyclerView.g(viewF);
            if (kmVarG != null && !kmVarG.A() && (i5 = kmVarG.c) >= i && i5 < i3) {
                kmVarG.f(2);
                kmVarG.e(obj);
                ((jz) viewF.getLayoutParams()).e = true;
            }
            i6++;
        }
        kc kcVar = recyclerView.f;
        int size = kcVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                ((RecyclerView) this.a).N = true;
                return;
            }
            km kmVar = (km) kcVar.c.get(size);
            if (kmVar != null && (i4 = kmVar.c) >= i && i4 < i3) {
                kmVar.f(2);
                kcVar.i(size);
            }
        }
    }

    public final void D(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.i.c();
        for (int i3 = 0; i3 < iC; i3++) {
            km kmVarG = RecyclerView.g(recyclerView.i.f(i3));
            if (kmVarG != null && !kmVarG.A() && kmVarG.c >= i) {
                kmVarG.k(i2, false);
                recyclerView.K.f = true;
            }
        }
        kc kcVar = recyclerView.f;
        int size = kcVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            km kmVar = (km) kcVar.c.get(i4);
            if (kmVar != null && kmVar.c >= i) {
                kmVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).M = true;
    }

    public final void E(int i, int i2) {
        int i3;
        RecyclerView recyclerView = (RecyclerView) this.a;
        int iC = recyclerView.i.c();
        int i4 = 0;
        while (true) {
            if (i4 >= iC) {
                break;
            }
            km kmVarG = RecyclerView.g(recyclerView.i.f(i4));
            if (kmVarG != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = kmVarG.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            kmVarG.k(i2 - i, false);
                        } else {
                            kmVarG.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.K.f = true;
                    }
                }
            }
            i4++;
        }
        kc kcVar = recyclerView.f;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        int size = kcVar.c.size();
        for (int i9 = 0; i9 < size; i9++) {
            km kmVar = (km) kcVar.c.get(i9);
            if (kmVar != null && (i3 = kmVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    kmVar.k(i2 - i, false);
                } else {
                    kmVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        ((RecyclerView) this.a).M = true;
    }

    public final void F(int i, int i2) {
        ((RecyclerView) this.a).J(i, i2, true);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.M = true;
        recyclerView.K.c += i2;
    }

    public final int G() {
        return ((RecyclerView) this.a).getChildCount();
    }

    public final int H(View view) {
        return ((RecyclerView) this.a).indexOfChild(view);
    }

    public final View I(int i) {
        return ((RecyclerView) this.a).getChildAt(i);
    }

    public final void J(View view) {
        km kmVarG = RecyclerView.g(view);
        if (kmVarG != null) {
            ((RecyclerView) this.a).ak(kmVarG, kmVarG.o);
            kmVarG.o = 0;
        }
    }

    public final void K(int i) {
        View childAt = ((RecyclerView) this.a).getChildAt(i);
        if (childAt != null) {
            RecyclerView.ai(childAt);
            childAt.clearAnimation();
        }
        ((RecyclerView) this.a).removeViewAt(i);
    }

    public final void L(km kmVar) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.n.aO(kmVar.a, recyclerView.f);
    }

    public final void M(km kmVar, tz tzVar, tz tzVar2) {
        int i;
        int i2;
        kmVar.n(false);
        RecyclerView recyclerView = (RecyclerView) this.a;
        jv jvVar = recyclerView.E;
        if (tzVar == null || ((i = tzVar.b) == (i2 = tzVar2.b) && tzVar.a == tzVar2.a)) {
            ((ks) jvVar).l(kmVar);
        } else if (!((ks) jvVar).k(kmVar, i, tzVar.a, i2, tzVar2.a)) {
            return;
        }
        recyclerView.N();
    }

    public final void N(km kmVar, tz tzVar, tz tzVar2) {
        ((RecyclerView) this.a).f.m(kmVar);
        RecyclerView recyclerView = (RecyclerView) this.a;
        recyclerView.p(kmVar);
        kmVar.n(false);
        jv jvVar = recyclerView.E;
        int i = tzVar.b;
        int i2 = tzVar.a;
        View view = kmVar.a;
        int left = tzVar2 == null ? view.getLeft() : tzVar2.b;
        int top = tzVar2 == null ? view.getTop() : tzVar2.a;
        if (kmVar.v() || (i == left && i2 == top)) {
            ((ks) jvVar).m(kmVar);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!((ks) jvVar).k(kmVar, i, i2, left, top)) {
                return;
            }
        }
        recyclerView.N();
    }

    public final void O(Menu menu, MenuInflater menuInflater) {
        ((ax) this.a).T(menu, menuInflater);
    }

    public final void P(Menu menu) {
        ((ax) this.a).v(menu);
    }

    public final void Q(Menu menu) {
        ((ax) this.a).V(menu);
    }

    public final boolean R(MenuItem menuItem) {
        return ((ax) this.a).U(menuItem);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aey, java.lang.Object] */
    public final void S() {
        ((ab) this.a).aa.b();
        zs.b(this.a);
        Bundle bundle = ((ab) this.a).g;
        ((ab) this.a).aa.c(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final boolean a(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        name.getClass();
        return fjz.E(name, ((String) this.a).concat("."));
    }

    public final void c(eqo eqoVar) {
        int i = ffg.a;
        evw evwVar = ((fcb) this.a).k;
        eox eoxVar = evw.p;
        synchronized (evwVar.u) {
            ((fcb) this.a).k.p(eqoVar, true, null);
        }
    }

    public final void d(epc epcVar, byte[] bArr) {
        int i = ffg.a;
        String str = "/" + ((fcb) this.a).f.b;
        if (bArr != null) {
            ((fcb) this.a).j = true;
            str = str + "?" + det.e.h(bArr);
        }
        evw evwVar = ((fcb) this.a).k;
        eox eoxVar = evw.p;
        synchronized (evwVar.u) {
            ((fcb) this.a).k.t(epcVar, str);
        }
    }

    public final eub e() {
        fbz fbzVar = (fbz) this.a;
        boolean z = fbzVar.g != Long.MAX_VALUE;
        ekf ekfVar = fbzVar.m;
        long j = fbzVar.h;
        SSLSocketFactory sSLSocketFactoryC = fbzVar.c();
        int i = fbzVar.j;
        long j2 = fbzVar.g;
        fcu fcuVar = fbzVar.f;
        return new fby(fbzVar.d, fbzVar.e, sSLSocketFactoryC, fcuVar, i, z, j2, j, 65535, Integer.MAX_VALUE, ekfVar);
    }

    public final int f() {
        return 443;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [eui, java.lang.Object] */
    public final void g() {
        ((fsc) this.a).a.e(eqo.l.e("Keepalive failed. The connection is likely gone"));
    }

    public final int h() {
        return ((eea) this.a).d();
    }

    public final cnv i(cnv cnvVar) {
        return cnvVar instanceof coc ? cnvVar : new cnt(-((coa) this.a).b(), cnvVar);
    }

    public final void j(Drawable drawable) {
        if (drawable != null) {
            super/*cng*/.setBackgroundDrawable(drawable);
        }
    }

    public final boolean k() {
        return ((FloatingActionButton) this.a).b;
    }

    public final void l(int i) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.a;
        collapsingToolbarLayout.e = i;
        vs vsVar = collapsingToolbarLayout.f;
        int iD = vsVar != null ? vsVar.d() : 0;
        int childCount = ((CollapsingToolbarLayout) this.a).getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = ((CollapsingToolbarLayout) this.a).getChildAt(i2);
            cjx cjxVar = (cjx) childAt.getLayoutParams();
            ckd ckdVarC = CollapsingToolbarLayout.c(childAt);
            int i3 = cjxVar.a;
            if (i3 == 1) {
                ckdVarC.c(un.F(-i, 0, ((CollapsingToolbarLayout) this.a).a(childAt)));
            } else if (i3 == 2) {
                ckdVarC.c(Math.round((-i) * cjxVar.b));
            }
        }
        ((CollapsingToolbarLayout) this.a).h();
        CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) this.a;
        if (collapsingToolbarLayout2.d != null && iD > 0) {
            collapsingToolbarLayout2.postInvalidateOnAnimation();
        }
        Object obj = this.a;
        int height = ((CollapsingToolbarLayout) obj).getHeight();
        int minimumHeight = height - ((CollapsingToolbarLayout) obj).getMinimumHeight();
        int iB = height - ((CollapsingToolbarLayout) this.a).b();
        int i4 = minimumHeight - iD;
        int i5 = ((CollapsingToolbarLayout) this.a).e + i4;
        float fAbs = Math.abs(i);
        float f = i4;
        float f2 = iB / f;
        ((CollapsingToolbarLayout) this.a).a.r(Math.min(1.0f, f2));
        cms cmsVar = ((CollapsingToolbarLayout) this.a).a;
        cmsVar.e = i5;
        float f3 = fAbs / f;
        cmsVar.q(f3);
        ((CollapsingToolbarLayout) this.a).b.r(Math.min(1.0f, f2));
        cms cmsVar2 = ((CollapsingToolbarLayout) this.a).b;
        cmsVar2.e = i5;
        cmsVar2.q(f3);
    }

    public final djy m(dis disVar, Executor executor) {
        return clq.n(dij.j(cnx.D(((cjg) this.a).b.c()), cqt.b(new cgn(this, disVar, executor, 4)), diy.a));
    }

    public final boolean n(String str, String str2) {
        cge[] cgeVarArrU = ((brb) this.a).u(str);
        if (cgeVarArrU == null || cgeVarArrU.length == 0) {
            return false;
        }
        if (!str2.equals("")) {
            return Arrays.binarySearch(cgeVarArrU, str2) >= 0;
        }
        cge cgeVar = cgeVarArrU[0];
        brb brbVar = cge.h;
        return cgeVar.c.equals("");
    }

    public final void o(String str) {
        ((brb) this.a).t(str);
    }

    public final void p(int i, String str) {
        ((InAppExampleStoreProxyImpl) this.a).a(i, str);
    }

    public final void q(String str) {
        ((ccx) this.a).a.d(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bkn, java.lang.Object] */
    public final void r(bho bhoVar) {
        this.a.i(bhoVar);
    }

    public final void s(boolean z) {
        Object obj = this.a;
        Boolean boolValueOf = Boolean.valueOf(z);
        Handler handler = ((bkf) obj).n;
        handler.sendMessage(handler.obtainMessage(1, boolValueOf));
    }

    public final boolean t() {
        if (((Optional) aok.c.a).isPresent()) {
            return ((Boolean) ((Optional) aok.c.a).get()).booleanValue();
        }
        synchronized (aok.b) {
            if (((Optional) aok.c.a).isEmpty()) {
                aok.c.a = Optional.of(Boolean.valueOf(((Context) this.a).checkSelfPermission("android.permission.READ_DEVICE_CONFIG") == 0));
            }
        }
        if (!((Boolean) ((Optional) aok.c.a).get()).booleanValue()) {
            ((czl) ((czl) aok.a.d()).i("com/google/android/apps/miphone/astrea/common/config/impl/DeviceFlagManager$1", "deviceConfigAvailable", 75, "DeviceFlagManager.java")).p("Device Config not available: relying on defaults");
        }
        return ((Boolean) ((Optional) aok.c.a).get()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void u(Object obj) {
        czn cznVar = aok.a;
        ((aob) obj).a(this.a);
    }

    public final void v(xh xhVar, float f, float f2) {
        ((agy) this.a).k(f);
    }

    public final String w() {
        return ((aef) this.a).g;
    }

    public final void x(aff affVar) {
        int length = ((aed) this.a).a.length;
        for (int i = 1; i < length; i++) {
            aed aedVar = (aed) this.a;
            int i2 = aedVar.a[i];
            if (i2 == 1) {
                affVar.c(i, aedVar.b[i]);
            } else if (i2 == 2) {
                affVar.b(i, aedVar.c[i]);
            } else if (i2 == 3) {
                String str = aedVar.d[i];
                str.getClass();
                affVar.e(i, str);
            } else if (i2 == 4) {
                byte[] bArr = aedVar.e[i];
                bArr.getClass();
                affVar.a(i, bArr);
            } else if (i2 == 5) {
                affVar.d(i);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fuu(ab abVar) {
        this((byte[]) null);
        this.a = abVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fuu(ave aveVar) {
        this((byte[]) null);
        this.a = aveVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fuu(gl glVar) {
        this((byte[]) null);
        this.a = glVar;
    }

    public /* synthetic */ fuu(Object obj) {
        this.a = obj;
    }

    public fuu(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public fuu(byte[] bArr) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fuu(Set set) {
        this((byte[]) null);
        this.a = set;
        dbq.a(set);
    }
}
