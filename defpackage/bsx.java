package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsx {
    public final Context a;
    public final bqm b;
    public final bpz c;
    public final String d;
    public final cdm e;
    public final cbx f;
    public final Map g;
    public final Map h;
    public final cca i;
    public final File j;
    public final File k;
    public final cdk l;
    public final bqs m;
    public final cbv n;
    public final bpv o;
    public final btg p;
    public final cdj q;
    public final cdd r;
    public final boolean s;
    public BroadcastReceiver t;
    private final AtomicBoolean u;

    public bsx(Context context, bqm bqmVar, bpz bpzVar, cdm cdmVar, cbx cbxVar, Map map, Map map2, cca ccaVar, File file, File file2, cdk cdkVar, bqs bqsVar, cbv cbvVar, bpv bpvVar, btg btgVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.u = atomicBoolean;
        this.q = new cdj(new bsr(atomicBoolean, 0));
        this.a = context.getApplicationContext();
        this.b = bqmVar;
        this.c = bpzVar;
        this.d = context.getApplicationContext().getPackageName();
        this.e = cdmVar;
        this.f = cbxVar;
        this.g = map;
        this.h = map2;
        this.i = ccaVar;
        this.j = file;
        this.k = file2;
        this.l = cdkVar;
        this.m = bqsVar;
        this.n = cbvVar;
        this.o = bpvVar;
        this.s = bpzVar.bn();
        this.p = btgVar;
        cdd cddVar = new cdd(null);
        cddVar.c(10000);
        cddVar.e(60000);
        cddVar.f(65536);
        cddVar.g(65536);
        cddVar.h(65536);
        cddVar.b(true);
        cddVar.i(true);
        cddVar.d(0.5d);
        cddVar.c(bpzVar.E());
        cddVar.e(bpzVar.G());
        cddVar.f(bpzVar.H());
        cddVar.g(bpzVar.I());
        cddVar.h(bpzVar.J());
        cddVar.b(bpzVar.aU());
        cddVar.d(bpzVar.x());
        this.r = cddVar;
    }

    public final void a() {
        this.b.k(ccj.j);
        this.u.set(true);
        for (Map.Entry entry : this.q.a.entrySet()) {
            ((Executor) entry.getValue()).execute((Runnable) entry.getKey());
        }
    }

    public final void b() {
        BroadcastReceiver broadcastReceiver = this.t;
        if (broadcastReceiver == null) {
            return;
        }
        this.a.unregisterReceiver(broadcastReceiver);
        this.t = null;
    }

    public final boolean c(boolean z, String str, cck cckVar) {
        if (this.u.get()) {
            this.b.k(ccj.j);
            return false;
        }
        Set setA = z ? this.e.a(cckVar, str) : this.e.b(cckVar, str);
        uq.r(setA, null, this.b);
        if (setA.isEmpty()) {
            return true;
        }
        String.valueOf(setA);
        return false;
    }

    public final bxk d(brb brbVar, bqm bqmVar) {
        return new bxk(bqmVar, this.d, new bsp(this, bqmVar, brbVar));
    }
}
