package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class blg {
    private static final bhq[] s = new bhq[0];
    public final Context a;
    public final Looper b;
    final Handler c;
    public bma f;
    protected blb g;
    public volatile String j;
    dld o;
    public volatile brb p;
    public final fuu q;
    public final fuu r;
    private final blp u;
    private final bht v;
    private IInterface w;
    private blc x;
    private final int y;
    private final String z;
    private volatile String t = null;
    public final Object d = new Object();
    public final Object e = new Object();
    public final ArrayList h = new ArrayList();
    public int i = 1;
    public bho k = null;
    public boolean l = false;
    public volatile blj m = null;
    protected final AtomicInteger n = new AtomicInteger(0);

    protected blg(Context context, Looper looper, blp blpVar, bht bhtVar, int i, fuu fuuVar, fuu fuuVar2, String str) {
        aso.G(context, "Context must not be null");
        this.a = context;
        aso.G(looper, "Looper must not be null");
        this.b = looper;
        aso.G(blpVar, "Supervisor must not be null");
        this.u = blpVar;
        aso.G(bhtVar, "API availability must not be null");
        this.v = bhtVar;
        this.c = new bkz(this, looper);
        this.y = i;
        this.r = fuuVar;
        this.q = fuuVar2;
        this.z = str;
    }

    protected static final void F(bho bhoVar) {
        System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i, IInterface iInterface) {
        dld dldVar;
        aso.y((i == 4) == (iInterface != null));
        synchronized (this.d) {
            this.i = i;
            this.w = iInterface;
            Bundle bundle = null;
            if (i == 1) {
                blc blcVar = this.x;
                if (blcVar != null) {
                    blp blpVar = this.u;
                    Object obj = this.o.d;
                    aso.F(obj);
                    dld dldVar2 = this.o;
                    Object obj2 = dldVar2.c;
                    int i2 = dldVar2.a;
                    blpVar.a((String) obj, (String) obj2, blp.a, blcVar, u(), this.o.b);
                    this.x = null;
                }
            } else if (i == 2 || i == 3) {
                blc blcVar2 = this.x;
                if (blcVar2 != null && (dldVar = this.o) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) dldVar.d) + " on " + ((String) dldVar.c));
                    blp blpVar2 = this.u;
                    Object obj3 = this.o.d;
                    aso.F(obj3);
                    dld dldVar3 = this.o;
                    Object obj4 = dldVar3.c;
                    int i3 = dldVar3.a;
                    blpVar2.a((String) obj3, (String) obj4, blp.a, blcVar2, u(), this.o.b);
                    this.n.incrementAndGet();
                }
                blc blcVar3 = new blc(this, this.n.get());
                this.x = blcVar3;
                dld dldVar4 = new dld("com.google.android.gms", d(), blp.a, B());
                this.o = dldVar4;
                if (dldVar4.b && a() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.o.d)));
                }
                blp blpVar3 = this.u;
                Object obj5 = this.o.d;
                aso.F(obj5);
                dld dldVar5 = this.o;
                Object obj6 = dldVar5.c;
                int i4 = dldVar5.a;
                String strU = u();
                boolean z = this.o.b;
                E();
                bho bhoVarB = blpVar3.b(new blo((String) obj5, (String) obj6, blp.a, z), blcVar3, strU);
                if (!bhoVarB.c()) {
                    dld dldVar6 = this.o;
                    Log.w("GmsClient", "unable to connect to service: " + ((String) dldVar6.d) + " on " + ((String) dldVar6.c));
                    int i5 = bhoVarB.c;
                    if (i5 == -1) {
                        i5 = 16;
                    }
                    if (bhoVarB.d != null) {
                        bundle = new Bundle();
                        bundle.putParcelable("pendingIntent", bhoVarB.d);
                    }
                    z(i5, bundle, this.n.get());
                }
            } else if (i == 4) {
                aso.F(iInterface);
                System.currentTimeMillis();
            }
        }
    }

    public final boolean A(int i, int i2, IInterface iInterface) {
        synchronized (this.d) {
            if (this.i != i) {
                return false;
            }
            I(i2, iInterface);
            return true;
        }
    }

    protected boolean B() {
        return false;
    }

    public bhq[] C() {
        throw null;
    }

    protected void E() {
        throw null;
    }

    public int a() {
        throw null;
    }

    protected abstract IInterface b(IBinder iBinder);

    protected abstract String c();

    protected abstract String d();

    public bhq[] e() {
        return s;
    }

    public final String f() {
        return this.t;
    }

    public final void h(blb blbVar) {
        this.g = blbVar;
        I(2, null);
    }

    public final void i(String str) {
        this.t = str;
        x();
    }

    public final void j(blt bltVar, Set set) {
        Object obj;
        String attributionTag;
        Bundle bundleS = s();
        if (this.p == null || (obj = this.p.a) == null) {
            attributionTag = this.j;
        } else {
            AttributionSource attributionSource = (AttributionSource) obj;
            attributionTag = attributionSource.getAttributionTag() == null ? this.j : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.y;
        int i2 = bht.c;
        Scope[] scopeArr = blm.a;
        Bundle bundle = new Bundle();
        bhq[] bhqVarArr = blm.b;
        blm blmVar = new blm(6, i, i2, null, null, scopeArr, bundle, null, bhqVarArr, bhqVarArr, true, 0, false, str);
        blmVar.f = this.a.getPackageName();
        blmVar.i = bundleS;
        if (set != null) {
            blmVar.h = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account accountR = r();
            if (accountR == null) {
                accountR = new Account("<<default account>>", "com.google");
            }
            blmVar.j = accountR;
            if (bltVar != null) {
                blmVar.g = bltVar.asBinder();
            }
        }
        blmVar.k = C();
        blmVar.l = e();
        try {
            try {
                synchronized (this.e) {
                    bma bmaVar = this.f;
                    if (bmaVar != null) {
                        bmaVar.a(new blx(this, this.n.get()), blmVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                }
            } catch (DeadObjectException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                Handler handler = this.c;
                handler.sendMessage(handler.obtainMessage(6, this.n.get(), 3));
            } catch (SecurityException e2) {
                throw e2;
            }
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            y(8, null, null, this.n.get());
        }
    }

    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.i == 4;
        }
        return z;
    }

    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            int i = this.i;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean m() {
        return false;
    }

    public final bhq[] n() {
        blj bljVar = this.m;
        if (bljVar == null) {
            return null;
        }
        return bljVar.b;
    }

    public final void o() {
        if (!k() || this.o == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void q(fuu fuuVar) {
        ((bkb) fuuVar.a).h.n.post(new bks(fuuVar, 1));
    }

    public Account r() {
        throw null;
    }

    protected Bundle s() {
        return new Bundle();
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.d) {
            if (this.i == 5) {
                throw new DeadObjectException();
            }
            if (!k()) {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
            iInterface = this.w;
            aso.G(iInterface, "Client is connected but service is null");
        }
        return iInterface;
    }

    protected final String u() {
        String str = this.z;
        return str == null ? this.a.getClass().getName() : str;
    }

    protected Set v() {
        throw null;
    }

    public final void w() throws PackageManager.NameNotFoundException {
        int iE = this.v.e(this.a, a());
        if (iE == 0) {
            h(new bld(this));
            return;
        }
        I(1, null);
        this.g = new bld(this);
        Handler handler = this.c;
        handler.sendMessage(handler.obtainMessage(3, this.n.get(), iE, null));
    }

    public final void x() {
        this.n.incrementAndGet();
        synchronized (this.h) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                ((bla) this.h.get(i)).e();
            }
            this.h.clear();
        }
        synchronized (this.e) {
            this.f = null;
        }
        I(1, null);
    }

    protected final void y(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.c.sendMessage(this.c.obtainMessage(1, i2, -1, new ble(this, i, iBinder, bundle)));
    }

    protected final void z(int i, Bundle bundle, int i2) {
        this.c.sendMessage(this.c.obtainMessage(7, i2, -1, new blf(this, i, bundle)));
    }

    public final void p() {
    }
}
