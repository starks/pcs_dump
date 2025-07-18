package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ab implements ComponentCallbacks, View.OnCreateContextMenuListener, yz, aad, ys, aey {
    static final Object e = new Object();
    aj A;
    ax B;
    public ab C;
    int D;
    int E;
    String F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    public boolean M;
    public ViewGroup N;
    public View O;
    boolean P;
    boolean Q;
    public z R;
    boolean S;
    public LayoutInflater T;
    boolean U;
    public String V;
    yv W;
    public za X;
    bp Y;
    zi Z;
    private Boolean a;
    public aex aa;
    int f;
    public Bundle g;
    SparseArray h;
    Bundle i;
    Boolean j;
    String k;
    private int ka;
    private final ArrayList kb;
    private final fuu kc;
    public Bundle l;
    ab m;
    String n;
    int o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    int y;
    ax z;

    public ab() {
        this.f = -1;
        this.k = UUID.randomUUID().toString();
        this.n = null;
        this.a = null;
        this.B = new ax(null);
        this.L = true;
        this.Q = true;
        this.W = yv.RESUMED;
        this.Z = new zi();
        new AtomicInteger();
        this.kb = new ArrayList();
        this.kc = new fuu(this);
        m();
    }

    @Deprecated
    public static ab ae(Context context, String str) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = ai.a;
            try {
                return (ab) ai.a(classLoader, str).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                throw new aa("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
            } catch (ClassNotFoundException e3) {
                throw new aa("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
            }
        } catch (IllegalAccessException e4) {
            throw new aa(a.z(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e5) {
            throw new aa(a.z(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (NoSuchMethodException e6) {
            throw new aa(a.z(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e6);
        } catch (InvocationTargetException e7) {
            throw new aa(a.z(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e7);
        }
    }

    private final int l() {
        return (this.W == yv.INITIALIZED || this.C == null) ? this.W.ordinal() : Math.min(this.W.ordinal(), this.C.l());
    }

    private final void m() {
        this.X = new za(this);
        this.aa = aex.a(this);
        if (this.kb.contains(this.kc)) {
            return;
        }
        fuu fuuVar = this.kc;
        if (this.f >= 0) {
            fuuVar.S();
        } else {
            this.kb.add(fuuVar);
        }
    }

    public final ax A() {
        if (this.A != null) {
            return this.B;
        }
        throw new IllegalStateException(a.y(this, "Fragment ", " has not been attached yet."));
    }

    public final ax B() {
        ax axVar = this.z;
        if (axVar != null) {
            return axVar;
        }
        throw new IllegalStateException(a.y(this, "Fragment ", " not associated with a fragment manager."));
    }

    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater layoutInflaterB = b(bundle);
        this.T = layoutInflaterB;
        return layoutInflaterB;
    }

    public final View D() {
        View view = this.O;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.y(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    @Override // defpackage.yz
    public final yw E() {
        return this.X;
    }

    @Override // defpackage.ys
    public final aag F() {
        Application application;
        Context applicationContext = s().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ax.X(3)) {
            Objects.toString(s().getApplicationContext());
        }
        aah aahVar = new aah();
        if (application != null) {
            aahVar.a(zy.a, application);
        }
        aahVar.a(zs.a, this);
        aahVar.a(zs.b, this);
        Bundle bundle = this.l;
        if (bundle != null) {
            aahVar.a(zs.c, bundle);
        }
        return aahVar;
    }

    public final Object G() {
        aj ajVar = this.A;
        if (ajVar == null) {
            return null;
        }
        return ajVar.f();
    }

    public final String H(int i) {
        return t().getString(i);
    }

    final ArrayList I() {
        ArrayList arrayList;
        z zVar = this.R;
        return (zVar == null || (arrayList = zVar.g) == null) ? new ArrayList() : arrayList;
    }

    final ArrayList J() {
        ArrayList arrayList;
        z zVar = this.R;
        return (zVar == null || (arrayList = zVar.h) == null) ? new ArrayList() : arrayList;
    }

    final void K() {
        m();
        this.V = this.k;
        this.k = UUID.randomUUID().toString();
        this.p = false;
        this.q = false;
        this.t = false;
        this.u = false;
        this.w = false;
        this.y = 0;
        this.z = null;
        this.B = new ax(null);
        this.A = null;
        this.D = 0;
        this.E = 0;
        this.F = null;
        this.G = false;
        this.H = false;
    }

    @Deprecated
    public final void L(int i, int i2, Intent intent) {
        if (ax.X(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void M(Activity activity) {
        this.M = true;
    }

    public void N() {
        this.M = true;
    }

    final void P() {
        ArrayList arrayList = this.kb;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fuu) arrayList.get(i)).S();
        }
        this.kb.clear();
        this.B.l(this.A, aN(), this);
        this.f = 0;
        this.M = false;
        c(this.A.c);
        if (!this.M) {
            throw new by(a.y(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        Iterator it = this.z.j.iterator();
        while (it.hasNext()) {
            ((ba) it.next()).p();
        }
        ax axVar = this.B;
        axVar.r = false;
        axVar.s = false;
        axVar.u.g = false;
        axVar.B(0);
    }

    final void Q() {
        this.B.B(1);
        if (this.O != null && ((za) this.Y.E()).a.a(yv.CREATED)) {
            this.Y.a(yu.ON_DESTROY);
        }
        this.f = 1;
        this.M = false;
        e();
        if (!this.M) {
            throw new by(a.y(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        aao aaoVar = ((aap) aak.a(this)).b;
        int iB = aaoVar.b.b();
        for (int i = 0; i < iB; i++) {
            ((aal) aaoVar.b.c(i)).k();
        }
        this.x = false;
    }

    final void R() {
        boolean Z = this.z.Z(this);
        Boolean bool = this.a;
        if (bool == null || bool.booleanValue() != Z) {
            this.a = Boolean.valueOf(Z);
            ax axVar = this.B;
            axVar.R();
            axVar.w(axVar.o);
        }
    }

    final void S() {
        Bundle bundle = this.g;
        O(this.O, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.B.B(2);
    }

    final void T() {
        Bundle bundle;
        Bundle bundle2 = this.g;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.B.N(bundle);
        this.B.q();
    }

    public final void U(int i, int i2, int i3, int i4) {
        if (this.R == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        v().b = i;
        v().c = i2;
        v().d = i3;
        v().e = i4;
    }

    public final void V(Bundle bundle) {
        ax axVar = this.z;
        if (axVar != null && axVar.aa()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.l = bundle;
    }

    final void W(View view) {
        v().p = view;
    }

    final void X(int i) {
        if (this.R == null && i == 0) {
            return;
        }
        v();
        this.R.f = i;
    }

    final void Y(boolean z) {
        if (this.R == null) {
            return;
        }
        v().a = z;
    }

    final void Z(ArrayList arrayList, ArrayList arrayList2) {
        v();
        z zVar = this.R;
        zVar.g = arrayList;
        zVar.h = arrayList2;
    }

    public ag aN() {
        return new y(this);
    }

    final boolean aa() {
        z zVar = this.R;
        if (zVar == null) {
            return false;
        }
        return zVar.a;
    }

    public final boolean ab() {
        return this.A != null && this.p;
    }

    final boolean ac() {
        return this.y > 0;
    }

    @Deprecated
    public final LayoutInflater ad() {
        aj ajVar = this.A;
        if (ajVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = ajVar.c();
        layoutInflaterC.setFactory2(this.B.e);
        return layoutInflaterC;
    }

    @Deprecated
    public final void af() {
        this.M = true;
    }

    public View ag(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = this.ka;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public final void ah() {
        this.M = true;
        aj ajVar = this.A;
        if ((ajVar == null ? null : ajVar.b) != null) {
            this.M = true;
        }
    }

    @Deprecated
    public final void ai(ab abVar) {
        yb ybVar = yb.a;
        ye yeVar = new ye(this, abVar);
        yb.d(yeVar);
        ya yaVarB = yb.b(this);
        if (yaVarB.b.contains(xz.DETECT_TARGET_FRAGMENT_USAGE) && yb.e(yaVarB, getClass(), yeVar.getClass())) {
            yb.c(yaVarB, yeVar);
        }
        ax axVar = this.z;
        ax axVar2 = abVar.z;
        if (axVar != null && axVar2 != null && axVar != axVar2) {
            throw new IllegalArgumentException(a.y(abVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (ab abVarX = abVar; abVarX != null; abVarX = abVarX.x(false)) {
            if (abVarX.equals(this)) {
                throw new IllegalArgumentException("Setting " + abVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.z == null || abVar.z == null) {
            this.n = null;
            this.m = abVar;
        } else {
            this.n = abVar.k;
            this.m = null;
        }
        this.o = 0;
    }

    @Override // defpackage.aey
    public final fsc aj() {
        return this.aa.b;
    }

    @Override // defpackage.aad
    public final fsc ak() {
        if (this.z == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (l() == yv.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        az azVar = this.z.u;
        fsc fscVar = (fsc) azVar.d.get(this.k);
        if (fscVar != null) {
            return fscVar;
        }
        fsc fscVar2 = new fsc((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
        azVar.d.put(this.k, fscVar2);
        return fscVar2;
    }

    public LayoutInflater b(Bundle bundle) {
        return ad();
    }

    public void c(Context context) {
        this.M = true;
        aj ajVar = this.A;
        Activity activity = ajVar == null ? null : ajVar.b;
        if (activity != null) {
            this.M = false;
            M(activity);
        }
    }

    public void d(Bundle bundle) {
        this.M = true;
        T();
        ax axVar = this.B;
        if (axVar.k > 0) {
            return;
        }
        axVar.q();
    }

    public void e() {
        this.M = true;
    }

    public void f() {
        this.M = true;
    }

    public void h() {
        this.M = true;
    }

    public void i() {
        this.M = true;
    }

    public void j(Bundle bundle) {
        this.M = true;
    }

    public void k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B.L();
        this.x = true;
        this.Y = new bp(this, ak(), new p(this, 3));
        View viewAg = ag(layoutInflater, viewGroup);
        this.O = viewAg;
        if (viewAg == null) {
            if (this.Y.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.Y = null;
            return;
        }
        this.Y.b();
        if (ax.X(3)) {
            Objects.toString(this.O);
            toString();
        }
        us.e(this.O, this.Y);
        vq.e(this.O, this.Y);
        up.d(this.O, this.Y);
        this.Z.i(this.Y);
    }

    public final int n() {
        z zVar = this.R;
        if (zVar == null) {
            return 0;
        }
        return zVar.b;
    }

    public final int o() {
        z zVar = this.R;
        if (zVar == null) {
            return 0;
        }
        return zVar.c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.M = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        z().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.M = true;
    }

    public final int p() {
        z zVar = this.R;
        if (zVar == null) {
            return 0;
        }
        return zVar.d;
    }

    public final int q() {
        z zVar = this.R;
        if (zVar == null) {
            return 0;
        }
        return zVar.e;
    }

    public Context r() {
        aj ajVar = this.A;
        if (ajVar == null) {
            return null;
        }
        return ajVar.c;
    }

    public final Context s() {
        Context contextR = r();
        if (contextR != null) {
            return contextR;
        }
        throw new IllegalStateException(a.y(this, "Fragment ", " not attached to a context."));
    }

    public final Resources t() {
        return s().getResources();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.k);
        if (this.D != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.D));
        }
        if (this.F != null) {
            sb.append(" tag=");
            sb.append(this.F);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Bundle u() {
        Bundle bundle = this.l;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a.y(this, "Fragment ", " does not have any arguments."));
    }

    public final z v() {
        if (this.R == null) {
            this.R = new z();
        }
        return this.R;
    }

    @Deprecated
    public final ab w() {
        return x(true);
    }

    public final ab x(boolean z) {
        String str;
        if (z) {
            yb ybVar = yb.a;
            yd ydVar = new yd(this);
            yb.d(ydVar);
            ya yaVarB = yb.b(this);
            if (yaVarB.b.contains(xz.DETECT_TARGET_FRAGMENT_USAGE) && yb.e(yaVarB, getClass(), ydVar.getClass())) {
                yb.c(yaVarB, ydVar);
            }
        }
        ab abVar = this.m;
        if (abVar != null) {
            return abVar;
        }
        ax axVar = this.z;
        if (axVar == null || (str = this.n) == null) {
            return null;
        }
        return axVar.c(str);
    }

    public final ae y() {
        aj ajVar = this.A;
        if (ajVar == null) {
            return null;
        }
        return (ae) ajVar.b;
    }

    public final ae z() {
        ae aeVarY = y();
        if (aeVarY != null) {
            return aeVarY;
        }
        throw new IllegalStateException(a.y(this, "Fragment ", " not attached to an activity."));
    }

    public ab(int i) {
        this();
        this.ka = i;
    }

    public void g(Bundle bundle) {
    }

    public void O(View view, Bundle bundle) {
    }
}
