package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import java.io.Closeable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxq implements Closeable {
    public final Context a;
    public final bpz b;
    public final bqm d;
    public final String e;
    public final String f;
    public final dfa g;
    public final long h;
    public final cix j;
    private final edl k;
    private final bxl l;
    private boolean m;
    private boolean n;
    private bxp o;
    private eea p;
    private final String q;
    private final dzi r;
    public final bxn i = new bxn(this);
    public final cbx c = new cbr("InAppExampleIterator");
    private int s = 1;
    private exo t = null;

    public bxq(Context context, bpz bpzVar, bqm bqmVar, String str, String str2, edl edlVar, eea eeaVar, dfa dfaVar, bxl bxlVar, String str3, dzi dziVar) {
        this.a = context;
        this.b = bpzVar;
        this.d = bqmVar;
        this.e = str;
        this.f = str2;
        this.k = edlVar;
        this.p = eeaVar;
        this.l = bxlVar;
        this.q = str3;
        asr asrVar = (asr) dziVar.toBuilder();
        asr asrVar2 = (asr) edl.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((edl) asrVar2.a).b = "type.googleapis.com/google.android.gms.learning.BrellaPlatformExtras";
        eea byteString = bwo.a.toByteString();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((edl) asrVar2.a).c = byteString;
        edl edlVar2 = (edl) asrVar2.z();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dzi dziVar2 = (dzi) asrVar.a;
        edlVar2.getClass();
        dziVar2.d = edlVar2;
        dziVar2.b |= 2;
        this.r = (dzi) asrVar.z();
        if (bpzVar.aC()) {
            asr asrVar3 = dfaVar != null ? (asr) dfaVar.toBuilder() : (asr) dfa.a.createBuilder();
            asr asrVar4 = (asr) dfb.a.createBuilder();
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            dfb dfbVar = (dfb) asrVar4.a;
            str.getClass();
            dfbVar.b |= 1;
            dfbVar.c = str;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            dfa dfaVar2 = (dfa) asrVar3.a;
            dfb dfbVar2 = (dfb) asrVar4.z();
            dfbVar2.getClass();
            dfaVar2.c = dfbVar2;
            dfaVar2.b |= 1;
            asr asrVar5 = (asr) dfc.a.createBuilder();
            asr asrVar6 = (asr) dfe.a.createBuilder();
            if (!asrVar6.a.isMutable()) {
                asrVar6.B();
            }
            dfe dfeVar = (dfe) asrVar6.a;
            str2.getClass();
            dfeVar.b |= 1;
            dfeVar.c = str2;
            if (!asrVar5.a.isMutable()) {
                asrVar5.B();
            }
            dfc dfcVar = (dfc) asrVar5.a;
            dfe dfeVar2 = (dfe) asrVar6.z();
            dfeVar2.getClass();
            dfcVar.c = dfeVar2;
            dfcVar.b = 1 | dfcVar.b;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            dfa dfaVar3 = (dfa) asrVar3.a;
            dfc dfcVar2 = (dfc) asrVar5.z();
            dfcVar2.getClass();
            dfaVar3.g = dfcVar2;
            dfaVar3.b |= 4096;
            this.g = bqmVar.c((dfa) asrVar3.z());
        } else {
            this.g = dfa.a;
        }
        this.j = bpzVar.aI() ? new cix() : null;
        this.h = bpzVar.S();
    }

    public static final String c(String str, String str2, Status status) {
        int i = status.e;
        return String.format("%s received (statusCode: %s): %s", str, (i < 0 || i > 50) ? ">50" : Integer.toString(i), str2);
    }

    /* JADX WARN: Finally extract failed */
    private final void e() throws ErrorStatusException {
        try {
            cix cixVar = this.j;
            long jA = cixVar != null ? ((csm) cixVar.d).a() : 0L;
            try {
                if (this.o == null) {
                    bqj bqjVarB = this.d.b(bql.EXAMPLE_STORE_START_QUERY_LATENCY, this.g);
                    try {
                        f();
                        bqjVarB.close();
                    } finally {
                    }
                }
                this.t = this.o.a();
                cix cixVar2 = this.j;
                if (cixVar2 != null) {
                    ((AtomicLong) cixVar2.f).addAndGet(((csm) cixVar2.d).a() - jA);
                }
                if (this.t == null) {
                    this.s = 2;
                    return;
                }
                this.s = 3;
                cix cixVar3 = this.j;
                if (cixVar3 != null) {
                    ((AtomicInteger) cixVar3.g).incrementAndGet();
                    ((AtomicInteger) this.j.e).addAndGet(((eea) this.t.b).d());
                }
            } catch (Throwable th) {
                cix cixVar4 = this.j;
                if (cixVar4 != null) {
                    ((AtomicLong) cixVar4.f).addAndGet(((csm) cixVar4.d).a() - jA);
                }
                throw th;
            }
        } catch (ErrorStatusException e) {
            this.n = true;
            throw e;
        }
    }

    private final void f() throws Exception {
        clq.F(this.o == null);
        dki dkiVar = new dki();
        bxm bxmVar = new bxm(this, dkiVar);
        Intent intent = new Intent();
        String str = this.q;
        if (str != null) {
            intent.setAction(String.format("com.google.android.gms.learning.%s.EXAMPLE_STORE", str)).setComponent(btx.a);
        } else {
            intent.setAction("com.google.android.gms.learning.EXAMPLE_STORE_V2").setPackage(this.e);
            intent.setData(new Uri.Builder().scheme("app").authority(this.e).path(this.f).build());
        }
        if (!this.a.bindService(intent, bxmVar, 1)) {
            d(ccj.br);
            if (this.b.bz()) {
                this.a.unbindService(bxmVar);
            }
            throw ErrorStatusException.b(14, "bindService failed for example store service: ".concat(intent.toString()), new Object[0]);
        }
        this.d.l(ccj.bO, this.e);
        try {
            try {
                try {
                    bsd bsdVar = (bsd) dkiVar.get(this.h, TimeUnit.SECONDS);
                    if (this.b.bE()) {
                        try {
                            try {
                                if (!bsdVar.b()) {
                                    d(ccj.by);
                                    throw ErrorStatusException.b(14, "In-app proxy validateConnection returned false", new Object[0]);
                                }
                            } catch (RuntimeException e) {
                                d(ccj.bx);
                                throw ErrorStatusException.c(14, e, "In-app proxy validateConnection threw an exception", new Object[0]);
                            }
                        } catch (RemoteException e2) {
                            d(e2 instanceof DeadObjectException ? ccj.bw : ccj.bu);
                            throw ErrorStatusException.b(14, "Service connection died during in-app proxy validateConnection", new Object[0]);
                        }
                    }
                    dki dkiVar2 = new dki();
                    this.i.a.set(dkiVar2);
                    cix cixVar = this.j;
                    try {
                        bsdVar.a(this.f, this.k.toByteArray(), this.p.x(), new brz(this, cixVar != null ? ((csm) cixVar.d).a() : 0L, dkiVar2), this.r.toByteArray());
                        try {
                            try {
                                crv crvVar = (crv) dkiVar2.get(this.h, TimeUnit.SECONDS);
                                if (crvVar.b == null) {
                                    this.o = new bxp(this, (bru) crvVar.a, bxmVar);
                                } else {
                                    d(ccj.bz);
                                    throw ErrorStatusException.b(14, c("onStartQueryFailure", this.f, (Status) crvVar.b), new Object[0]);
                                }
                            } catch (ExecutionException e3) {
                                throw new dkq(e3);
                            } catch (TimeoutException unused) {
                                d(ccj.bA);
                                throw ErrorStatusException.b(14, "startQuery timed out (%ss): %s", Long.valueOf(this.h), this.f);
                            }
                        } catch (CancellationException unused2) {
                            d(ccj.bw);
                            throw ErrorStatusException.b(14, "startQuery failed due to dead process: " + this.f, new Object[0]);
                        }
                    } catch (RemoteException e4) {
                        d(e4 instanceof DeadObjectException ? ccj.bw : ccj.bu);
                        throw ErrorStatusException.c(14, e4, "startQuery failed", new Object[0]);
                    }
                } catch (ExecutionException e5) {
                    throw new dkq(e5);
                } catch (TimeoutException unused3) {
                    d(ccj.bs);
                    throw ErrorStatusException.b(14, "service connection timed out (%ss) for in-app proxy service", Long.valueOf(this.h));
                }
            } catch (CancellationException unused4) {
                throw ErrorStatusException.b(14, "Service connection died for in-app proxy service", new Object[0]);
            }
        } catch (Exception e6) {
            this.a.unbindService(bxmVar);
            throw e6;
        }
    }

    public final eea a() throws ErrorStatusException {
        clq.G(!this.m, "next() called after close()");
        clq.G(!this.n, "next() called after exception was thrown");
        aso.B();
        int i = this.s;
        if (i != 1 && i == 2) {
            throw new NoSuchElementException("next() called but end of iterator reached");
        }
        if (i == 1) {
            e();
        }
        if (this.s == 2) {
            throw new NoSuchElementException("next() called but end of iterator reached");
        }
        exo exoVar = this.t;
        Object obj = exoVar.b;
        this.p = eea.r((byte[]) exoVar.a);
        this.l.b((byte[]) this.t.a);
        this.t = null;
        this.s = 1;
        return (eea) obj;
    }

    public final boolean b() throws ErrorStatusException {
        clq.G(!this.m, "hasNext() called after close()");
        clq.G(!this.n, "hasNext() called after exception was thrown");
        aso.B();
        int i = this.s;
        if (i != 1) {
            return i == 3;
        }
        e();
        return this.s == 3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aso.B();
        if (this.m) {
            return;
        }
        this.m = true;
        bxp bxpVar = this.o;
        if (bxpVar != null) {
            bxpVar.close();
        }
        cix cixVar = this.j;
        if (cixVar != null) {
            cixVar.c();
            this.j.d();
            TimeUnit.NANOSECONDS.toMillis(this.j.f());
            TimeUnit.NANOSECONDS.toMillis(this.j.e());
            TimeUnit.NANOSECONDS.toMillis(this.j.g());
            TimeUnit.NANOSECONDS.toMillis(this.j.b());
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_COUNT, this.g, this.j.c());
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_OVERALL_EXAMPLE_SIZE, this.g, this.j.d());
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_OVERALL_LATENCY, this.g, TimeUnit.NANOSECONDS.toMillis(this.j.f()));
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_OVERALL_IPC_LATENCY, this.g, TimeUnit.NANOSECONDS.toMillis(this.j.e()));
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_OVERALL_PROXY_LATENCY, this.g, TimeUnit.NANOSECONDS.toMillis(this.j.g()));
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_OVERALL_CLIENT_LATENCY, this.g, TimeUnit.NANOSECONDS.toMillis(this.j.b()));
            this.d.f(bqk.EXAMPLE_STORE_ITERATOR_NEXT_LATENCY, this.g, TimeUnit.NANOSECONDS.toMillis((long) (this.j.f() / (this.j.c() + 1))));
        }
    }

    public final void d(int i) {
        this.d.l(i, this.e);
        if (this.b.be()) {
            this.d.f(bqk.EXAMPLE_STORE_ERROR_COUNT, this.g, ccj.a(i));
        }
    }
}
