package defpackage;

import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class erm implements IBinder.DeathRecipient, esa {
    public static final Logger b = Logger.getLogger(erm.class.getName());
    public static final elo c = new elo("internal:remote-uid");
    public static final elo d = new elo("internal:server-authority");
    public static final elo e = new elo("internal:inbound-parcelable-policy");
    private final eyg a;
    public final ScheduledExecutorService f;
    protected elp i;
    public eqo j;
    public esh k;
    protected final fbc l;
    private final eno m;
    private long q;
    private final LinkedHashSet n = new LinkedHashSet();
    private int r = 1;
    public final esb g = new esb(this);
    protected final ConcurrentHashMap h = new ConcurrentHashMap();
    private final erw o = new erw();
    private final AtomicLong p = new AtomicLong();

    public erm(eyg eygVar, elp elpVar, fbc fbcVar, eno enoVar) {
        this.l = fbcVar;
        this.a = eygVar;
        this.i = elpVar;
        this.m = enoVar;
        this.f = (ScheduledExecutorService) eygVar.a();
    }

    private final void a() {
        esh eshVar = this.k;
        if (eshVar != null) {
            try {
                eshVar.b.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
            try {
                esj esjVarC = esj.c();
                try {
                    esjVarC.a().writeInt(0);
                    this.k.a(2, esjVarC);
                    esjVarC.close();
                } finally {
                }
            } catch (RemoteException unused2) {
            }
        }
    }

    public static eqo h(RemoteException remoteException) {
        return ((remoteException instanceof DeadObjectException) || (remoteException instanceof TransactionTooLargeException)) ? eqo.l.d(remoteException) : eqo.k.d(remoteException);
    }

    protected erz b(int i) {
        throw null;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final synchronized void binderDied() {
        p(eqo.l.e("Peer process crashed, exited or was killed (binderDied)"));
    }

    public final eno c() {
        return this.m;
    }

    @Override // defpackage.esa
    public final boolean d(int i, Parcel parcel) {
        esj esjVarC;
        esi esiVar;
        fbk fbkVar;
        try {
            if (i < 1001) {
                synchronized (this) {
                    if (i != 1) {
                        if (i == 2) {
                            p(eqo.l.e("transport shutdown by peer"));
                        } else if (i == 3) {
                            if (this.o.a(parcel.readLong())) {
                                b.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "handleAcknowledgedBytes", "handleAcknowledgedBytes: Transmit Window No-Longer Full. Unblock calls: ".concat(toString()));
                                this.n.addAll(this.h.keySet());
                                Iterator it = this.n.iterator();
                                while (l() && it.hasNext()) {
                                    erz erzVar = (erz) this.h.get(it.next());
                                    it.remove();
                                    if (erzVar != null) {
                                        synchronized (erzVar) {
                                            esiVar = erzVar.d;
                                            fbkVar = erzVar.f;
                                        }
                                        if (fbkVar != null) {
                                            fbkVar.e();
                                        }
                                        if (esiVar != null) {
                                            try {
                                                synchronized (esiVar) {
                                                    esiVar.d();
                                                }
                                            } catch (eqp e2) {
                                                synchronized (erzVar) {
                                                    erzVar.b(e2.a);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                        } else if (i == 4) {
                            int i2 = parcel.readInt();
                            if (this.r == 3) {
                                try {
                                    esjVarC = esj.c();
                                    try {
                                        esjVarC.a().writeInt(i2);
                                        this.k.a(5, esjVarC);
                                        esjVarC.close();
                                    } finally {
                                    }
                                } catch (RemoteException unused) {
                                }
                            }
                        } else if (i != 5) {
                            return false;
                        }
                    }
                }
            } else {
                int iDataSize = parcel.dataSize();
                ConcurrentHashMap concurrentHashMap = this.h;
                Integer numValueOf = Integer.valueOf(i);
                erz erzVarB = (erz) concurrentHashMap.get(numValueOf);
                if (erzVarB == null) {
                    synchronized (this) {
                        if (!m()) {
                            erzVarB = b(i);
                            erz erzVar2 = (erz) this.h.put(numValueOf, erzVarB);
                            dcr.Q(erzVar2 == null, "impossible appearance of %s", erzVar2);
                        }
                    }
                }
                if (erzVarB != null) {
                    erzVarB.e(parcel);
                }
                if (this.p.addAndGet(iDataSize) - this.q <= 16384) {
                    return true;
                }
                synchronized (this) {
                    esh eshVar = this.k;
                    eshVar.getClass();
                    long j = this.p.get();
                    this.q = j;
                    try {
                        esjVarC = esj.c();
                        try {
                            esjVarC.a().writeLong(j);
                            eshVar.a(3, esjVarC);
                            esjVarC.close();
                        } finally {
                        }
                    } catch (RemoteException e3) {
                        p(h(e3));
                    }
                }
            }
            return true;
        } catch (RuntimeException e4) {
            b.logp(Level.SEVERE, "io.grpc.binder.internal.BinderTransport", "handleTransaction", a.x(i, "Terminating transport for uncaught Exception in transaction "), (Throwable) e4);
            synchronized (this) {
                p(eqo.k.d(e4));
                return false;
            }
        }
    }

    public abstract void e();

    public final void i() {
        this.a.b(this.f);
    }

    final void j(int i, esj esjVar) throws eqp {
        int iDataSize = esjVar.a().dataSize();
        try {
            this.k.a(i, esjVar);
            if (this.o.b(iDataSize)) {
                b.logp(Level.FINE, "io.grpc.binder.internal.BinderTransport", "sendTransaction", "transmit window now full ".concat(toString()));
            }
        } catch (RemoteException e2) {
            throw new eqp(h(e2));
        }
    }

    final void k(int i) {
        if (this.h.remove(Integer.valueOf(i)) == null || !this.h.isEmpty()) {
            return;
        }
        this.f.execute(new chg(this, 8));
    }

    final boolean l() {
        return !this.o.a;
    }

    final boolean m() {
        return o(4) || o(5);
    }

    final void n(int i) {
        int i2 = this.r;
        int i3 = i - 1;
        if (i3 == 2) {
            clq.F(i2 == 1 || i2 == 2);
        } else if (i3 != 3) {
            clq.F(i2 == 4);
        } else {
            clq.F(i2 == 1 || i2 == 2 || i2 == 3);
        }
        this.r = i;
    }

    public final boolean o(int i) {
        return this.r == i;
    }

    public final void p(eqo eqoVar) {
        if (!m()) {
            this.j = eqoVar;
            n(4);
        }
        if (o(5)) {
            return;
        }
        this.g.a = null;
        n(5);
        a();
        ArrayList arrayList = new ArrayList(this.h.values());
        this.h.clear();
        this.f.execute(new n(this, arrayList, eqoVar, 7));
    }
}
