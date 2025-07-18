package defpackage;

import android.os.StrictMode;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cge implements Comparable {
    public static final brb h = new brb((short[]) null, (byte[]) null);
    public final cem a;
    public final String b;
    public final chc f;
    private final Set i;
    public final String c = "";
    public final boolean d = false;
    public final boolean e = false;
    private volatile egc j = null;
    public final brb g = new brb((byte[]) null, (byte[]) null, (byte[]) null);

    public cge(cem cemVar, String str, String str2, Set set) {
        this.a = cemVar;
        this.b = str;
        this.i = set;
        this.f = new chc(cemVar, str, "", false);
    }

    public static /* synthetic */ boolean c(List list) {
        brb brbVar = h;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            cge[] cgeVarArrU = brbVar.u((String) it.next());
            if (cgeVarArrU != null) {
                int i = 0;
                while (i < cgeVarArrU.length) {
                    boolean z2 = cgeVarArrU[i].e;
                    i++;
                    z = true;
                }
            }
        }
        return z;
    }

    public final void a() {
        djy djyVarB = this.f.b(this.c);
        dij.j(djyVarB, new bbk(this.f, 5), this.a.c()).c(new cfz(this, djyVarB, 2), this.a.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[Catch: CancellationException | ExecutionException -> 0x004a, CancellationException | ExecutionException -> 0x004a, TryCatch #1 {CancellationException | ExecutionException -> 0x004a, blocks: (B:2:0x0000, B:4:0x0018, B:21:0x0040, B:21:0x0040, B:14:0x0025, B:14:0x0025, B:15:0x0026, B:15:0x0026, B:17:0x0030, B:17:0x0030, B:19:0x003c, B:19:0x003c), top: B:29:0x0000 }] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void b(defpackage.djy r4) {
        /*
            r3 = this;
            java.lang.Object r4 = defpackage.cnx.H(r4)     // Catch: java.lang.Throwable -> L4a
            chd r4 = (defpackage.chd) r4     // Catch: java.lang.Throwable -> L4a
            chb r0 = new chb     // Catch: java.lang.Throwable -> L4a
            int r1 = defpackage.cey.e     // Catch: java.lang.Throwable -> L4a
            int r2 = defpackage.cex.a     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4a
            egc r1 = new egc     // Catch: java.lang.Throwable -> L4a
            r1.<init>(r4, r0)     // Catch: java.lang.Throwable -> L4a
            egc r4 = r3.j     // Catch: java.lang.Throwable -> L4a
            if (r4 != 0) goto L26
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L4a
            egc r4 = r3.j     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L21
            r3.j = r1     // Catch: java.lang.Throwable -> L23
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            goto L40
        L21:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L23
            throw r4     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
        L26:
            java.lang.Object r4 = r4.d     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            java.lang.Object r0 = r1.d     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            boolean r4 = defpackage.dcr.s(r4, r0)     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            if (r4 != 0) goto L40
            cem r4 = r3.a     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            csg r4 = r4.d     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            java.lang.Object r4 = r4.a()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            cgm r4 = (defpackage.cgm) r4     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            if (r4 == 0) goto L6d
            r4.a()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            return
        L40:
            brb r4 = r3.g     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            java.lang.Object r4 = r4.a     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            java.util.concurrent.atomic.AtomicInteger r4 = (java.util.concurrent.atomic.AtomicInteger) r4     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            r4.incrementAndGet()     // Catch: java.lang.Throwable -> L4a java.lang.Throwable -> L4a
            return
        L4a:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            boolean r0 = r0 instanceof java.lang.SecurityException
            if (r0 != 0) goto L6d
            java.lang.String r3 = r3.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to update local snapshot for "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", may result in stale flags."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "MobStoreFlagStore"
            android.util.Log.w(r0, r3, r4)
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cge.b(djy):void");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.c.compareTo((String) obj);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final egc d() {
        egc egcVar;
        egc egcVar2;
        egc egcVar3 = this.j;
        if (egcVar3 != null) {
            return egcVar3;
        }
        synchronized (this) {
            egcVar = this.j;
            if (egcVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    chc chcVar = this.f;
                    cha chaVarA = chcVar.a();
                    if (chaVarA.a != null) {
                        int i = cgx.a;
                        cgx.a(14903855);
                        cfq cfqVar = chaVarA.a;
                        cfqVar.getClass();
                        egcVar2 = new egc(cfqVar, chaVarA.b);
                    } else {
                        int i2 = cgx.a;
                        cgx.a(14903854);
                        try {
                            egcVar2 = new egc((chd) chcVar.a.e().g(chcVar.b, cif.b(chd.a)), new chb(cey.c, chaVarA.b.c));
                        } catch (IOException | RuntimeException unused) {
                            chc.d.m(Level.INFO, chcVar.a.c(), "Unable to retrieve flag snapshot for %s, using defaults.", chcVar.c);
                            egcVar2 = chcVar.d() ? new egc(cfq.a, new chb(cey.b, cex.o)) : new egc(chd.a, new chb(cey.b, cex.j));
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    chi chiVar = this.a.e;
                    if (!cbl.b(chiVar.c) && chiVar.a().g + TimeUnit.HOURS.toMillis(24L) < System.currentTimeMillis()) {
                        dke dkeVar = (dke) chiVar.e.a();
                        dkeVar.getClass();
                        dij.j(djr.q(cnx.D((djy) chiVar.h.a())), new bbk(chiVar, 7), dkeVar);
                    } else {
                        djy djyVar = dju.a;
                    }
                    byte[] bArr = null;
                    if (this.f.d() || !((String) egcVar2.b).isEmpty()) {
                        this.a.c().execute(new bks(this, 16, bArr));
                        fpv fpvVar = this.a.h;
                        Object obj = egcVar2.c;
                        Set set = this.i;
                        String str = this.b;
                        if (!set.isEmpty() && !((AtomicBoolean) fpvVar.c).getAndSet(true)) {
                            bga.e(new cgc(fpvVar));
                        }
                        byte[] bArrX = ((eea) obj).x();
                        byte[][] bArr2 = byi.a;
                        cgb cgbVar = new cgb(new byi("", bArrX, bArr2, bArr2, bArr2, bArr2, null, null, null, null), str);
                        fpvVar.d.put(str, cgbVar);
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            fpv.i(cgbVar, (String) it.next(), fpvVar.b);
                        }
                        if (!this.c.equals("")) {
                            this.a.c().execute(new bks(this, 17, bArr));
                        }
                        if (this.f.d()) {
                            this.a.c().execute(new bks(this, 18, bArr));
                        }
                        egcVar = egcVar2;
                    } else {
                        this.a.c().execute(new bks(this, 15, bArr));
                        chd chdVar = chd.a;
                        int iB = cey.b(egcVar2.a().c);
                        if (iB == 0) {
                            iB = cey.f;
                        }
                        int iB2 = cex.b(egcVar2.a().d);
                        if (iB2 == 0) {
                            iB2 = cex.p;
                        }
                        egcVar = new egc(chdVar, new chb(iB, iB2));
                    }
                    this.j = egcVar;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            }
        }
        return egcVar;
    }
}
