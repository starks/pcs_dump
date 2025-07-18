package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ax {
    static final boolean a = true;
    private final Map A;
    private final Map B;
    private final tj C;
    private final tj D;
    private final tj E;
    private final tj F;
    private ai G;
    private boolean H;
    private ArrayList I;
    private ArrayList J;
    private ArrayList K;
    private Runnable L;
    private bot M;
    private bot N;
    private bot O;
    private a P;
    private final fuu Q;
    public final ArrayList b;
    public final bd c;
    ArrayList d;
    public final al e;
    d f;
    boolean g;
    public final AtomicInteger h;
    ArrayList i;
    public final CopyOnWriteArrayList j;
    int k;
    public aj l;
    public ag m;
    public ab n;
    ab o;
    ArrayDeque p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public az u;
    public final bnz v;
    private boolean w;
    private ArrayList x;
    private mk y;
    private final me z;

    public ax() {
        this.b = new ArrayList();
        this.c = new bd();
        this.d = new ArrayList();
        this.e = new al(this);
        this.f = null;
        this.g = false;
        this.z = new an(this);
        this.h = new AtomicInteger();
        this.A = DesugarCollections.synchronizedMap(new HashMap());
        this.B = DesugarCollections.synchronizedMap(new HashMap());
        DesugarCollections.synchronizedMap(new HashMap());
        this.i = new ArrayList();
        this.v = new bnz(this);
        this.j = new CopyOnWriteArrayList();
        this.C = new ac(this, 2);
        this.D = new ac(this, 3);
        this.E = new ac(this, 4);
        this.F = new ac(this, 5);
        this.Q = new fuu(this, null);
        this.k = -1;
        this.G = new ao(this);
        this.P = new a();
        this.p = new ArrayDeque();
        this.L = new p(this, 5, null);
    }

    public static boolean X(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    static final Set ac(d dVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < dVar.d.size(); i++) {
            ab abVar = ((be) dVar.d.get(i)).b;
            if (abVar != null && dVar.j) {
                hashSet.add(abVar);
            }
        }
        return hashSet;
    }

    public static final boolean ad(ab abVar) {
        boolean z = abVar.K;
        boolean zAd = false;
        for (ab abVar2 : abVar.B.c.f()) {
            if (abVar2 != null) {
                zAd = ad(abVar2);
            }
            if (zAd) {
                return true;
            }
        }
        return false;
    }

    static final boolean ae(ab abVar) {
        if (abVar == null) {
            return true;
        }
        if (abVar.L) {
            return abVar.z == null || ae(abVar.C);
        }
        return false;
    }

    static final void ag(ab abVar) {
        if (X(2)) {
            Objects.toString(abVar);
        }
        if (abVar.G) {
            abVar.G = false;
            abVar.S = !abVar.S;
        }
    }

    private final ViewGroup ai(ab abVar) {
        ViewGroup viewGroup = abVar.N;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abVar.E > 0 && this.m.b()) {
            View viewA = this.m.a(abVar.E);
            if (viewA instanceof ViewGroup) {
                return (ViewGroup) viewA;
            }
        }
        return null;
    }

    private final Set aj() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((bc) it.next()).a.N;
            if (viewGroup != null) {
                hashSet.add(a.m(viewGroup, ah()));
            }
        }
        return hashSet;
    }

    private final void ak() {
        if (aa()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void al() {
        this.w = false;
        this.J.clear();
        this.I.clear();
    }

    private final void am() {
        if (this.H) {
            this.H = false;
            ar();
        }
    }

    private final void an(boolean z) {
        if (this.w) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.l == null) {
            if (!this.t) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.l.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            ak();
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0246 A[PHI: r12
  0x0246: PHI (r12v48 int) = (r12v47 int), (r12v49 int) binds: [B:102:0x0236, B:107:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ao(java.util.ArrayList r25, java.util.ArrayList r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax.ao(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void ap(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((d) arrayList.get(i)).s) {
                if (i2 != i) {
                    ao(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((d) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                ao(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ao(arrayList, arrayList2, i2, size);
        }
    }

    private final void aq(ab abVar) {
        ViewGroup viewGroupAi = ai(abVar);
        if (viewGroupAi == null || abVar.n() + abVar.o() + abVar.p() + abVar.q() <= 0) {
            return;
        }
        if (viewGroupAi.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAi.setTag(R.id.visible_removing_fragment_view_tag, abVar);
        }
        ((ab) viewGroupAi.getTag(R.id.visible_removing_fragment_view_tag)).Y(abVar.aa());
    }

    private final void ar() {
        for (bc bcVar : this.c.e()) {
            ab abVar = bcVar.a;
            if (abVar.P) {
                if (this.w) {
                    this.H = true;
                } else {
                    abVar.P = false;
                    bcVar.d();
                }
            }
        }
    }

    private final void as(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new bq());
        aj ajVar = this.l;
        if (ajVar != null) {
            try {
                ajVar.q(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            D("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    static ab f(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ab) {
            return (ab) tag;
        }
        return null;
    }

    final void A() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        B(5);
    }

    public final void B(int i) {
        try {
            this.w = true;
            for (bc bcVar : this.c.b.values()) {
                if (bcVar != null) {
                    bcVar.b = i;
                }
            }
            K(i, false);
            Iterator it = aj().iterator();
            while (it.hasNext()) {
                ((bx) it.next()).f();
            }
            this.w = false;
            W(true);
        } catch (Throwable th) {
            this.w = false;
            throw th;
        }
    }

    final void C() {
        this.s = true;
        this.u.g = true;
        B(4);
    }

    public final void D(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        bd bdVar = this.c;
        if (!bdVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (bc bcVar : bdVar.b.values()) {
                printWriter.print(str);
                if (bcVar != null) {
                    String strValueOf = String.valueOf(str);
                    ab abVar = bcVar.a;
                    printWriter.println(abVar);
                    String strConcat = strValueOf.concat("    ");
                    printWriter.print(strConcat);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abVar.D));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abVar.E));
                    printWriter.print(" mTag=");
                    printWriter.println(abVar.F);
                    printWriter.print(strConcat);
                    printWriter.print("mState=");
                    printWriter.print(abVar.f);
                    printWriter.print(" mWho=");
                    printWriter.print(abVar.k);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abVar.y);
                    printWriter.print(strConcat);
                    printWriter.print("mAdded=");
                    printWriter.print(abVar.p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abVar.q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abVar.t);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abVar.u);
                    printWriter.print(strConcat);
                    printWriter.print("mHidden=");
                    printWriter.print(abVar.G);
                    printWriter.print(" mDetached=");
                    printWriter.print(abVar.H);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abVar.L);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(strConcat);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abVar.I);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abVar.Q);
                    if (abVar.z != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abVar.z);
                    }
                    if (abVar.A != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mHost=");
                        printWriter.println(abVar.A);
                    }
                    if (abVar.C != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abVar.C);
                    }
                    if (abVar.l != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mArguments=");
                        printWriter.println(abVar.l);
                    }
                    if (abVar.g != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abVar.g);
                    }
                    if (abVar.h != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abVar.h);
                    }
                    if (abVar.i != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abVar.i);
                    }
                    Object objX = abVar.x(false);
                    if (objX != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mTarget=");
                        printWriter.print(objX);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abVar.o);
                    }
                    printWriter.print(strConcat);
                    printWriter.print("mPopDirection=");
                    printWriter.println(abVar.aa());
                    if (abVar.n() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getEnterAnim=");
                        printWriter.println(abVar.n());
                    }
                    if (abVar.o() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getExitAnim=");
                        printWriter.println(abVar.o());
                    }
                    if (abVar.p() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getPopEnterAnim=");
                        printWriter.println(abVar.p());
                    }
                    if (abVar.q() != 0) {
                        printWriter.print(strConcat);
                        printWriter.print("getPopExitAnim=");
                        printWriter.println(abVar.q());
                    }
                    if (abVar.N != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mContainer=");
                        printWriter.println(abVar.N);
                    }
                    if (abVar.O != null) {
                        printWriter.print(strConcat);
                        printWriter.print("mView=");
                        printWriter.println(abVar.O);
                    }
                    z zVar = abVar.R;
                    if (abVar.r() != null) {
                        aak.a(abVar).b(strConcat, printWriter);
                    }
                    printWriter.print(strConcat);
                    printWriter.println("Child " + abVar.B + ":");
                    abVar.B.D(String.valueOf(strConcat).concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = bdVar.a.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                ab abVar2 = (ab) bdVar.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abVar2.toString());
            }
        }
        ArrayList arrayList = this.x;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                ab abVar3 = (ab) this.x.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String strValueOf2 = String.valueOf(str);
                d dVar = (d) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(dVar.toString());
                dVar.g(strValueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.h.get());
        synchronized (this.b) {
            int size4 = this.b.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (au) this.b.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.n);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.k);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.r);
        printWriter.print(" mStopped=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.q) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.q);
        }
    }

    public final void E() {
        Iterator it = aj().iterator();
        while (it.hasNext()) {
            ((bx) it.next()).f();
        }
    }

    final void F(au auVar, boolean z) {
        if (!z) {
            if (this.l == null) {
                if (!this.t) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            ak();
        }
        synchronized (this.b) {
            if (this.l == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.b.add(auVar);
            synchronized (this.b) {
                if (this.b.size() == 1) {
                    this.l.d.removeCallbacks(this.L);
                    this.l.d.post(this.L);
                    R();
                }
            }
        }
    }

    public final void G(au auVar, boolean z) {
        if (z && (this.l == null || this.t)) {
            return;
        }
        an(z);
        d dVar = this.f;
        if (dVar != null) {
            dVar.b = false;
            dVar.d();
            if (X(3)) {
                Objects.toString(this.f);
                Objects.toString(auVar);
            }
            this.f.a(false, false);
            this.f.i(this.I, this.J);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ab abVar = ((be) arrayList.get(i)).b;
                if (abVar != null) {
                    abVar.r = false;
                }
            }
            this.f = null;
        }
        auVar.i(this.I, this.J);
        this.w = true;
        try {
            ap(this.I, this.J);
            al();
            R();
            am();
            this.c.i();
        } catch (Throwable th) {
            al();
            throw th;
        }
    }

    public final void H() {
        for (bx bxVar : aj()) {
        }
    }

    final void I() {
        int i;
        this.g = true;
        W(true);
        this.g = false;
        if (this.f == null) {
            if (this.z.b) {
                X(3);
                ab();
                return;
            } else {
                X(3);
                this.y.b();
                return;
            }
        }
        if (!this.i.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(ac(this.f));
            ArrayList arrayList = this.i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                at atVar = (at) arrayList.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        atVar.c();
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = this.f.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ab abVar = ((be) arrayList2.get(i3)).b;
            if (abVar != null) {
                abVar.r = false;
            }
        }
        for (bx bxVar : j(new ArrayList(Collections.singletonList(this.f)), 0, 1)) {
            X(3);
            bxVar.g(bxVar.c);
            bxVar.e(bxVar.c);
        }
        ArrayList arrayList3 = this.f.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ab abVar2 = ((be) arrayList3.get(i4)).b;
            if (abVar2 != null && abVar2.N == null) {
                i(abVar2).d();
            }
        }
        this.f = null;
        R();
        if (X(3)) {
            boolean z = this.z.b;
            toString();
        }
    }

    final void J(ab abVar) {
        if (X(2)) {
            Objects.toString(abVar);
        }
        if (abVar.G) {
            return;
        }
        abVar.G = true;
        abVar.S = true ^ abVar.S;
        aq(abVar);
    }

    final void K(int i, boolean z) {
        aj ajVar;
        if (this.l == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.k) {
            this.k = i;
            bd bdVar = this.c;
            ArrayList arrayList = bdVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                bc bcVar = (bc) bdVar.b.get(((ab) arrayList.get(i2)).k);
                if (bcVar != null) {
                    bcVar.d();
                }
            }
            for (bc bcVar2 : bdVar.b.values()) {
                if (bcVar2 != null) {
                    bcVar2.d();
                    ab abVar = bcVar2.a;
                    if (abVar.q && !abVar.ac()) {
                        boolean z2 = abVar.s;
                        bdVar.k(bcVar2);
                    }
                }
            }
            ar();
            if (this.q && (ajVar = this.l) != null && this.k == 7) {
                ajVar.k();
                this.q = false;
            }
        }
    }

    public final void L() {
        if (this.l == null) {
            return;
        }
        this.r = false;
        this.s = false;
        this.u.g = false;
        for (ab abVar : this.c.g()) {
            if (abVar != null) {
                abVar.B.L();
            }
        }
    }

    final void M(ab abVar) {
        if (X(2)) {
            Objects.toString(abVar);
            int i = abVar.y;
        }
        boolean zAc = abVar.ac();
        if (abVar.H && zAc) {
            return;
        }
        this.c.l(abVar);
        if (ad(abVar)) {
            this.q = true;
        }
        abVar.q = true;
        aq(abVar);
    }

    final void N(Parcelable parcelable) {
        bc bcVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.l.c.getClassLoader());
                this.B.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.l.c.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        bd bdVar = this.c;
        bdVar.c.clear();
        bdVar.c.putAll(map);
        ay ayVar = (ay) bundle3.getParcelable("state");
        if (ayVar == null) {
            return;
        }
        this.c.b.clear();
        ArrayList arrayList = ayVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle bundleA = this.c.a((String) arrayList.get(i), null);
            if (bundleA != null) {
                ab abVar = (ab) this.u.b.get(((bb) bundleA.getParcelable("state")).b);
                if (abVar != null) {
                    if (X(2)) {
                        Objects.toString(abVar);
                    }
                    bcVar = new bc(this.v, this.c, abVar, bundleA);
                } else {
                    bcVar = new bc(this.v, this.c, this.l.c.getClassLoader(), g(), bundleA);
                }
                ab abVar2 = bcVar.a;
                abVar2.g = bundleA;
                abVar2.z = this;
                if (X(2)) {
                    String str3 = abVar2.k;
                    Objects.toString(abVar2);
                }
                bcVar.e(this.l.c.getClassLoader());
                this.c.j(bcVar);
                bcVar.b = this.k;
            }
        }
        for (ab abVar3 : new ArrayList(this.u.b.values())) {
            if (!this.c.m(abVar3.k)) {
                if (X(2)) {
                    Objects.toString(abVar3);
                    Objects.toString(ayVar.a);
                }
                this.u.d(abVar3);
                abVar3.z = this;
                bc bcVar2 = new bc(this.v, this.c, abVar3);
                bcVar2.b = 1;
                bcVar2.d();
                abVar3.q = true;
                bcVar2.d();
            }
        }
        bd bdVar2 = this.c;
        ArrayList<String> arrayList2 = ayVar.b;
        bdVar2.a.clear();
        if (arrayList2 != null) {
            for (String str4 : arrayList2) {
                ab abVarB = bdVar2.b(str4);
                if (abVarB == null) {
                    throw new IllegalStateException(a.z(str4, "No instantiated fragment for (", ")"));
                }
                if (X(2)) {
                    Objects.toString(abVarB);
                }
                bdVar2.h(abVarB);
            }
        }
        e[] eVarArr = ayVar.c;
        if (eVarArr != null) {
            this.d = new ArrayList(eVarArr.length);
            int i2 = 0;
            while (true) {
                e[] eVarArr2 = ayVar.c;
                if (i2 >= eVarArr2.length) {
                    break;
                }
                e eVar = eVarArr2[i2];
                d dVar = new d(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = eVar.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    be beVar = new be();
                    int i5 = i3 + 1;
                    beVar.a = iArr[i3];
                    if (X(2)) {
                        dVar.toString();
                        int i6 = eVar.a[i5];
                    }
                    beVar.h = yv.values()[eVar.c[i4]];
                    beVar.i = yv.values()[eVar.d[i4]];
                    int[] iArr2 = eVar.a;
                    int i7 = i3 + 2;
                    beVar.c = iArr2[i5] != 0;
                    int i8 = iArr2[i7];
                    beVar.d = i8;
                    int i9 = iArr2[i3 + 3];
                    beVar.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr2[i3 + 4];
                    beVar.f = i11;
                    i3 += 6;
                    int i12 = iArr2[i10];
                    beVar.g = i12;
                    dVar.e = i8;
                    dVar.f = i9;
                    dVar.g = i11;
                    dVar.h = i12;
                    dVar.l(beVar);
                    i4++;
                }
                dVar.i = eVar.e;
                dVar.l = eVar.f;
                dVar.j = true;
                dVar.m = eVar.h;
                dVar.n = eVar.i;
                dVar.o = eVar.j;
                dVar.p = eVar.k;
                dVar.q = eVar.l;
                dVar.r = eVar.m;
                dVar.s = eVar.n;
                dVar.c = eVar.g;
                for (int i13 = 0; i13 < eVar.b.size(); i13++) {
                    String str5 = (String) eVar.b.get(i13);
                    if (str5 != null) {
                        ((be) dVar.d.get(i13)).b = c(str5);
                    }
                }
                dVar.c(1);
                if (X(2)) {
                    int i14 = dVar.c;
                    dVar.toString();
                    PrintWriter printWriter = new PrintWriter(new bq());
                    dVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(dVar);
                i2++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.h.set(ayVar.d);
        String str6 = ayVar.e;
        if (str6 != null) {
            ab abVarC = c(str6);
            this.o = abVarC;
            w(abVarC);
        }
        ArrayList arrayList3 = ayVar.f;
        if (arrayList3 != null) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                this.A.put((String) arrayList3.get(i15), (g) ayVar.g.get(i15));
            }
        }
        this.p = new ArrayDeque(ayVar.h);
    }

    final void O(ab abVar, boolean z) {
        ViewGroup viewGroupAi = ai(abVar);
        if (viewGroupAi == null || !(viewGroupAi instanceof ah)) {
            return;
        }
        ((ah) viewGroupAi).a = !z;
    }

    final void P(ab abVar, yv yvVar) {
        if (!abVar.equals(c(abVar.k)) || (abVar.A != null && abVar.z != this)) {
            throw new IllegalArgumentException(a.B(this, abVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        abVar.W = yvVar;
    }

    final void Q(ab abVar) {
        if (abVar != null && (!abVar.equals(c(abVar.k)) || (abVar.A != null && abVar.z != this))) {
            throw new IllegalArgumentException(a.B(this, abVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        ab abVar2 = this.o;
        this.o = abVar;
        w(abVar2);
        w(this.o);
    }

    public final void R() {
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                this.z.g(true);
                if (X(3)) {
                    toString();
                }
            } else {
                boolean z = a() > 0 && Z(this.n);
                if (X(3)) {
                    toString();
                }
                this.z.g(z);
            }
        }
    }

    final boolean S(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null && !abVar.G && abVar.B.S(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean T(Menu menu, MenuInflater menuInflater) {
        if (this.k <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (ab abVar : this.c.g()) {
            if (abVar != null && ae(abVar) && !abVar.G && abVar.B.T(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abVar);
                z = true;
            }
        }
        if (this.x != null) {
            for (int i = 0; i < this.x.size(); i++) {
                ab abVar2 = (ab) this.x.get(i);
                if (arrayList != null) {
                    arrayList.contains(abVar2);
                }
            }
        }
        this.x = arrayList;
        return z;
    }

    public final boolean U(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null && !abVar.G && abVar.B.U(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean V(Menu menu) {
        boolean z = false;
        if (this.k <= 0) {
            return false;
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null && ae(abVar) && !abVar.G && abVar.B.V(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean W(boolean z) {
        d dVar;
        an(z);
        if (!this.g && (dVar = this.f) != null) {
            dVar.b = false;
            dVar.d();
            if (X(3)) {
                Objects.toString(this.f);
                Objects.toString(this.b);
            }
            this.f.a(false, false);
            this.b.add(0, this.f);
            ArrayList arrayList = this.f.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ab abVar = ((be) arrayList.get(i)).b;
                if (abVar != null) {
                    abVar.r = false;
                }
            }
            this.f = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.I;
            ArrayList arrayList3 = this.J;
            synchronized (this.b) {
                if (this.b.isEmpty()) {
                    break;
                }
                try {
                    int size2 = this.b.size();
                    boolean zI = false;
                    for (int i2 = 0; i2 < size2; i2++) {
                        zI |= ((au) this.b.get(i2)).i(arrayList2, arrayList3);
                    }
                    if (!zI) {
                        break;
                    }
                    z2 = true;
                    this.w = true;
                    try {
                        ap(this.I, this.J);
                    } finally {
                        al();
                    }
                } finally {
                    this.b.clear();
                    this.l.d.removeCallbacks(this.L);
                }
            }
        }
        R();
        am();
        this.c.i();
        return z2;
    }

    public final boolean Y() {
        ab abVar = this.n;
        if (abVar == null) {
            return true;
        }
        return abVar.ab() && this.n.B().Y();
    }

    final boolean Z(ab abVar) {
        if (abVar == null) {
            return true;
        }
        ax axVar = abVar.z;
        return abVar.equals(axVar.o) && Z(axVar.n);
    }

    public final int a() {
        return this.d.size() + (this.f != null ? 1 : 0);
    }

    public final boolean aa() {
        return this.r || this.s;
    }

    public final boolean ab() {
        W(false);
        an(true);
        ab abVar = this.o;
        if (abVar != null && abVar.A().ab()) {
            return true;
        }
        boolean zAf = af(this.I, this.J, -1, 0);
        if (zAf) {
            this.w = true;
            try {
                ap(this.I, this.J);
            } finally {
                al();
            }
        }
        R();
        am();
        this.c.i();
        return zAf;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final boolean af(java.util.ArrayList r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.d
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = -1
            if (r0 == 0) goto Lc
        La:
            r7 = r2
            goto L58
        Lc:
            if (r7 >= 0) goto L1a
            if (r8 == 0) goto L12
            r7 = r1
            goto L58
        L12:
            java.util.ArrayList r7 = r4.d
            int r7 = r7.size()
            int r7 = r7 + r2
            goto L58
        L1a:
            java.util.ArrayList r0 = r4.d
            int r0 = r0.size()
            int r0 = r0 + r2
        L21:
            if (r0 < 0) goto L33
            java.util.ArrayList r3 = r4.d
            java.lang.Object r3 = r3.get(r0)
            d r3 = (defpackage.d) r3
            int r3 = r3.c
            if (r7 != r3) goto L30
            goto L33
        L30:
            int r0 = r0 + (-1)
            goto L21
        L33:
            if (r0 >= 0) goto L37
        L35:
            r7 = r0
            goto L58
        L37:
            if (r8 != 0) goto L46
            java.util.ArrayList r7 = r4.d
            int r7 = r7.size()
            int r7 = r7 + r2
            if (r0 != r7) goto L43
            goto La
        L43:
            int r7 = r0 + 1
            goto L58
        L46:
            if (r0 <= 0) goto L35
            java.util.ArrayList r8 = r4.d
            int r3 = r0 + (-1)
            java.lang.Object r8 = r8.get(r3)
            d r8 = (defpackage.d) r8
            int r8 = r8.c
            if (r7 != r8) goto L35
            r0 = r3
            goto L46
        L58:
            if (r7 >= 0) goto L5b
            return r1
        L5b:
            java.util.ArrayList r8 = r4.d
            int r8 = r8.size()
            int r8 = r8 + r2
        L62:
            r0 = 1
            if (r8 < r7) goto L7a
            java.util.ArrayList r1 = r4.d
            java.lang.Object r1 = r1.remove(r8)
            d r1 = (defpackage.d) r1
            r5.add(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.add(r0)
            int r8 = r8 + (-1)
            goto L62
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax.af(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    final a ah() {
        ab abVar = this.n;
        return abVar != null ? abVar.z.ah() : this.P;
    }

    final Bundle b() {
        int i;
        e[] eVarArr;
        ArrayList arrayList;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        H();
        E();
        W(true);
        this.r = true;
        this.u.g = true;
        bd bdVar = this.c;
        ArrayList arrayList2 = new ArrayList(bdVar.b.size());
        Iterator it = bdVar.b.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bc bcVar = (bc) it.next();
            if (bcVar != null) {
                ab abVar = bcVar.a;
                String str = abVar.k;
                Bundle bundle3 = new Bundle();
                ab abVar2 = bcVar.a;
                if (abVar2.f == -1 && (bundle = abVar2.g) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new bb(bcVar.a));
                if (bcVar.a.f >= 0) {
                    Bundle bundle4 = new Bundle();
                    bcVar.a.g(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    bcVar.c.v(bcVar.a, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    bcVar.a.aa.d(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleB = bcVar.a.B.b();
                    if (!bundleB.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleB);
                    }
                    if (bcVar.a.O != null) {
                        bcVar.f();
                    }
                    SparseArray<? extends Parcelable> sparseArray = bcVar.a.h;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = bcVar.a.i;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = bcVar.a.l;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                bdVar.a(str, bundle3);
                arrayList2.add(abVar.k);
                if (X(2)) {
                    Objects.toString(abVar);
                    Objects.toString(abVar.g);
                }
            }
        }
        HashMap map = this.c.c;
        if (map.isEmpty()) {
            X(2);
            return bundle2;
        }
        bd bdVar2 = this.c;
        synchronized (bdVar2.a) {
            eVarArr = null;
            if (bdVar2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(bdVar2.a.size());
                Iterator it2 = bdVar2.a.iterator();
                while (it2.hasNext()) {
                    ab abVar3 = (ab) it2.next();
                    arrayList.add(abVar3.k);
                    if (X(2)) {
                        String str2 = abVar3.k;
                        Objects.toString(abVar3);
                    }
                }
            }
        }
        int size = this.d.size();
        if (size > 0) {
            eVarArr = new e[size];
            for (i = 0; i < size; i++) {
                eVarArr[i] = new e((d) this.d.get(i));
                if (X(2)) {
                    Objects.toString(this.d.get(i));
                }
            }
        }
        ay ayVar = new ay();
        ayVar.a = arrayList2;
        ayVar.b = arrayList;
        ayVar.c = eVarArr;
        ayVar.d = this.h.get();
        ab abVar4 = this.o;
        if (abVar4 != null) {
            ayVar.e = abVar4.k;
        }
        ayVar.f.addAll(this.A.keySet());
        ayVar.g.addAll(this.A.values());
        ayVar.h = new ArrayList(this.p);
        bundle2.putParcelable("state", ayVar);
        for (String str3 : this.B.keySet()) {
            bundle2.putBundle("result_".concat(String.valueOf(str3)), (Bundle) this.B.get(str3));
        }
        for (String str4 : map.keySet()) {
            bundle2.putBundle("fragment_".concat(String.valueOf(str4)), (Bundle) map.get(str4));
        }
        return bundle2;
    }

    final ab c(String str) {
        return this.c.b(str);
    }

    public final ab d(int i) {
        bd bdVar = this.c;
        int size = bdVar.a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (bc bcVar : bdVar.b.values()) {
                    if (bcVar != null) {
                        ab abVar = bcVar.a;
                        if (abVar.D == i) {
                            return abVar;
                        }
                    }
                }
                return null;
            }
            ab abVar2 = (ab) bdVar.a.get(size);
            if (abVar2 != null && abVar2.D == i) {
                return abVar2;
            }
        }
    }

    public final ab e(String str) {
        bd bdVar = this.c;
        int size = bdVar.a.size();
        while (true) {
            size--;
            if (size < 0) {
                for (bc bcVar : bdVar.b.values()) {
                    if (bcVar != null) {
                        ab abVar = bcVar.a;
                        if (str.equals(abVar.F)) {
                            return abVar;
                        }
                    }
                }
                return null;
            }
            ab abVar2 = (ab) bdVar.a.get(size);
            if (abVar2 != null && str.equals(abVar2.F)) {
                return abVar2;
            }
        }
    }

    public final ai g() {
        ab abVar = this.n;
        return abVar != null ? abVar.z.g() : this.G;
    }

    final bc h(ab abVar) {
        String str = abVar.V;
        if (str != null) {
            yb.a(abVar, str);
        }
        if (X(2)) {
            Objects.toString(abVar);
        }
        bc bcVarI = i(abVar);
        abVar.z = this;
        this.c.j(bcVarI);
        if (!abVar.H) {
            this.c.h(abVar);
            abVar.q = false;
            if (abVar.O == null) {
                abVar.S = false;
            }
            if (ad(abVar)) {
                this.q = true;
            }
        }
        return bcVarI;
    }

    final bc i(ab abVar) {
        bc bcVarD = this.c.d(abVar.k);
        if (bcVarD != null) {
            return bcVarD;
        }
        bc bcVar = new bc(this.v, this.c, abVar);
        bcVar.e(this.l.c.getClassLoader());
        bcVar.b = this.k;
        return bcVar;
    }

    final Set j(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((d) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ab abVar = ((be) arrayList2.get(i3)).b;
                if (abVar != null && (viewGroup = abVar.N) != null) {
                    hashSet.add(bx.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void k(ba baVar) {
        this.j.add(baVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [aj, rn] */
    /* JADX WARN: Type inference failed for: r6v11, types: [aj, ro] */
    /* JADX WARN: Type inference failed for: r6v12, types: [aj, br] */
    /* JADX WARN: Type inference failed for: r6v13, types: [aj, bs] */
    /* JADX WARN: Type inference failed for: r6v14, types: [aj, tu] */
    /* JADX WARN: Type inference failed for: r6v8, types: [aey, aj] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aj, mt] */
    public final void l(aj ajVar, ag agVar, ab abVar) {
        if (this.l != null) {
            throw new IllegalStateException("Already attached");
        }
        this.l = ajVar;
        this.m = agVar;
        this.n = abVar;
        if (abVar != null) {
            k(new ap(abVar));
        } else if (ajVar instanceof ba) {
            k(ajVar);
        }
        if (this.n != null) {
            R();
        }
        if (ajVar instanceof ml) {
            mk mkVarD = ajVar.d();
            this.y = mkVarD;
            ab abVar2 = abVar != null ? abVar : ajVar;
            me meVar = this.z;
            abVar2.getClass();
            meVar.getClass();
            yw ywVarE = abVar2.E();
            if (ywVarE.a() != yv.DESTROYED) {
                meVar.e(new mh(mkVarD, ywVarE, meVar));
                mkVarD.d();
                meVar.d = new mj(mkVarD, 1);
            }
        }
        int i = 0;
        if (abVar != null) {
            az azVar = abVar.z.u;
            az azVar2 = (az) azVar.c.get(abVar.k);
            if (azVar2 == null) {
                az azVar3 = new az(azVar.e);
                azVar.c.put(abVar.k, azVar3);
                azVar2 = azVar3;
            }
            this.u = azVar2;
        } else {
            if (ajVar instanceof aad) {
                this.u = (az) new aac(ajVar.ak(), az.a).a(az.class);
            } else {
                this.u = new az(false);
            }
            abVar = null;
        }
        az azVar4 = this.u;
        azVar4.g = aa();
        this.c.d = azVar4;
        ?? r6 = this.l;
        if ((r6 instanceof aey) && abVar == null) {
            fsc fscVarAj = r6.aj();
            fscVarAj.ag("android:support:fragments", new am(this, i));
            Bundle bundleAf = fscVarAj.af("android:support:fragments");
            if (bundleAf != null) {
                N(bundleAf);
            }
        }
        ?? r62 = this.l;
        if (r62 instanceof mt) {
            ms msVarE = r62.e();
            String strConcat = abVar != null ? String.valueOf(abVar.k).concat(":") : "";
            mw mwVar = new mw();
            aq aqVar = new aq(this, 0);
            String strConcat2 = "FragmentManager:".concat(strConcat);
            this.M = msVarE.c(strConcat2.concat("StartActivityForResult"), mwVar, aqVar);
            this.N = msVarE.c(strConcat2.concat("StartIntentSenderForResult"), new ar(), new aq(this, 2));
            this.O = msVarE.c(strConcat2.concat("RequestPermissions"), new mv(), new aq(this, 1));
        }
        ?? r63 = this.l;
        if (r63 instanceof rn) {
            r63.g(this.C);
        }
        ?? r64 = this.l;
        if (r64 instanceof ro) {
            r64.j(this.D);
        }
        ?? r65 = this.l;
        if (r65 instanceof br) {
            r65.h(this.E);
        }
        ?? r66 = this.l;
        if (r66 instanceof bs) {
            r66.i(this.F);
        }
        ?? r67 = this.l;
        if ((r67 instanceof tu) && abVar == null) {
            r67.r(this.Q);
        }
    }

    final void m(ab abVar) {
        if (X(2)) {
            Objects.toString(abVar);
        }
        if (abVar.H) {
            abVar.H = false;
            if (abVar.p) {
                return;
            }
            this.c.h(abVar);
            if (X(2)) {
                Objects.toString(abVar);
            }
            if (ad(abVar)) {
                this.q = true;
            }
        }
    }

    final void n(ab abVar) {
        if (X(2)) {
            Objects.toString(abVar);
        }
        if (abVar.H) {
            return;
        }
        abVar.H = true;
        if (abVar.p) {
            if (X(2)) {
                Objects.toString(abVar);
            }
            this.c.l(abVar);
            if (ad(abVar)) {
                this.q = true;
            }
            aq(abVar);
        }
    }

    final void o() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        B(4);
    }

    final void p(Configuration configuration, boolean z) {
        if (z && (this.l instanceof rn)) {
            as(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null) {
                abVar.onConfigurationChanged(configuration);
                if (z) {
                    abVar.B.p(configuration, true);
                }
            }
        }
    }

    final void q() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        B(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [aj, ro] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aj, rn] */
    /* JADX WARN: Type inference failed for: r0v6, types: [aj, br] */
    /* JADX WARN: Type inference failed for: r0v7, types: [aj, bs] */
    /* JADX WARN: Type inference failed for: r0v8, types: [aj, tu] */
    final void r() {
        this.t = true;
        W(true);
        E();
        aj ajVar = this.l;
        if (ajVar instanceof aad ? this.c.d.f : true ^ ((Activity) ajVar.c).isChangingConfigurations()) {
            Iterator it = this.A.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((g) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.c.d.b((String) it2.next(), false);
                }
            }
        }
        B(-1);
        ?? r0 = this.l;
        if (r0 instanceof ro) {
            r0.o(this.D);
        }
        ?? r02 = this.l;
        if (r02 instanceof rn) {
            r02.l(this.C);
        }
        ?? r03 = this.l;
        if (r03 instanceof br) {
            r03.m(this.E);
        }
        ?? r04 = this.l;
        if (r04 instanceof bs) {
            r04.n(this.F);
        }
        ?? r05 = this.l;
        if ((r05 instanceof tu) && this.n == null) {
            r05.s(this.Q);
        }
        this.l = null;
        this.m = null;
        this.n = null;
        if (this.y != null) {
            Iterator it3 = this.z.c.iterator();
            while (it3.hasNext()) {
                ((lr) it3.next()).a();
            }
            this.y = null;
        }
        bot botVar = this.M;
        if (botVar != null) {
            botVar.c();
            this.N.c();
            this.O.c();
        }
    }

    final void s(boolean z) {
        if (z && (this.l instanceof ro)) {
            as(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null) {
                abVar.onLowMemory();
                if (z) {
                    abVar.B.s(true);
                }
            }
        }
    }

    final void t(boolean z, boolean z2) {
        if (z2 && (this.l instanceof br)) {
            as(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null && z2) {
                abVar.B.t(z, true);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ab abVar = this.n;
        if (abVar != null) {
            sb.append(abVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.n)));
            sb.append("}");
        } else {
            aj ajVar = this.l;
            if (ajVar != null) {
                sb.append(ajVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.l)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u() {
        for (ab abVar : this.c.f()) {
            if (abVar != null) {
                abVar.B.u();
            }
        }
    }

    public final void v(Menu menu) {
        if (this.k <= 0) {
            return;
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null && !abVar.G) {
                abVar.B.v(menu);
            }
        }
    }

    public final void w(ab abVar) {
        if (abVar == null || !abVar.equals(c(abVar.k))) {
            return;
        }
        abVar.R();
    }

    final void x() {
        B(5);
    }

    final void y(boolean z, boolean z2) {
        if (z2 && (this.l instanceof bs)) {
            as(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ab abVar : this.c.g()) {
            if (abVar != null && z2) {
                abVar.B.y(z, true);
            }
        }
    }

    final void z() {
        this.r = false;
        this.s = false;
        this.u.g = false;
        B(7);
    }

    public ax(byte[] bArr) {
        this();
    }
}
