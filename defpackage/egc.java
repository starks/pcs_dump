package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egc {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public egc(ehs ehsVar, Object obj, ehs ehsVar2, Object obj2) {
        this.c = ehsVar;
        this.a = "";
        this.d = ehsVar2;
        this.b = obj2;
    }

    public final cez a() {
        chb chbVar = (chb) this.a;
        if (chbVar.a) {
            return cez.a;
        }
        asr asrVar = (asr) cez.a.createBuilder();
        int i = chbVar.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cez cezVar = (cez) asrVar.a;
        cezVar.c = cey.a(i);
        cezVar.b |= 1;
        int i2 = chbVar.c;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        cez cezVar2 = (cez) asrVar.a;
        cezVar2.d = cex.a(i2);
        cezVar2.b |= 2;
        return (cez) asrVar.z();
    }

    public final long b() {
        return ((AtomicLong) ((bnz) this.d).a).get();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [feu, java.lang.Object] */
    public final void c() {
        das dasVar = bdj.a;
        if (((AtomicBoolean) ((bnz) this.d).b).get()) {
            return;
        }
        ((AtomicLong) ((bnz) this.d).a).set(0L);
        try {
            ?? r0 = this.c;
            asr asrVar = (asr) bdd.a.createBuilder();
            bda bdaVar = bda.a;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            bdd bddVar = (bdd) asrVar.a;
            bdaVar.getClass();
            bddVar.c = bdaVar;
            bddVar.b = 4;
            r0.c((bdd) asrVar.z());
        } catch (eqr e) {
            ((bdh) this.a).c((String) this.b, e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [feu, java.lang.Object] */
    public final void d(byte[] bArr, long j, int i) {
        das dasVar = bdj.a;
        if (((AtomicBoolean) ((bnz) this.d).b).get()) {
            return;
        }
        ((AtomicLong) ((bnz) this.d).a).set(i + j);
        try {
            ?? r0 = this.c;
            asr asrVar = (asr) bdd.a.createBuilder();
            asr asrVar2 = (asr) bcz.a.createBuilder();
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            bcz bczVar = (bcz) asrVar2.a;
            bczVar.b |= 1;
            bczVar.c = j;
            eea eeaVarS = eea.s(bArr, 0, i);
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            bcz bczVar2 = (bcz) asrVar2.a;
            bczVar2.b |= 2;
            bczVar2.d = eeaVarS;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            bdd bddVar = (bdd) asrVar.a;
            bcz bczVar3 = (bcz) asrVar2.z();
            bczVar3.getClass();
            bddVar.c = bczVar3;
            bddVar.b = 3;
            r0.c((bdd) asrVar.z());
        } catch (eqr e) {
            ((bdh) this.a).c((String) this.b, e);
        }
    }

    public egc(feu feuVar, bdh bdhVar, bnz bnzVar, String str) {
        this.c = feuVar;
        this.a = bdhVar;
        this.d = bnzVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public egc(defpackage.cfq r32, defpackage.chb r33) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egc.<init>(cfq, chb):void");
    }

    public egc(chd chdVar, chb chbVar) {
        int i;
        eea eeaVar;
        String str;
        chd.a.equals(chdVar);
        this.b = chdVar.c;
        this.c = chdVar.d;
        String str2 = chdVar.e;
        long j = chdVar.f;
        cyv cyvVar = cyv.a;
        cxe cxeVarE = cxg.e(chdVar.g.size() + 3);
        for (chf chfVar : chdVar.g) {
            int i2 = chfVar.c;
            if (i2 == 0) {
                i = che.f;
            } else if (i2 == 2) {
                i = che.a;
            } else if (i2 == 3) {
                i = che.b;
            } else if (i2 == 4) {
                i = che.c;
            } else if (i2 != 5) {
                i = i2 != 6 ? 0 : che.e;
            } else {
                i = che.d;
            }
            if (i == 0) {
                throw null;
            }
            int i3 = i - 1;
            if (i3 == 0) {
                cxeVarE.b(chfVar.e, Long.valueOf(chfVar.c == 2 ? ((Long) chfVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                cxeVarE.b(chfVar.e, Boolean.valueOf(chfVar.c == 3 ? ((Boolean) chfVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                cxeVarE.b(chfVar.e, Double.valueOf(chfVar.c == 4 ? ((Double) chfVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = chfVar.e;
                if (chfVar.c == 5) {
                    str = (String) chfVar.d;
                } else {
                    str = "";
                }
                cxeVarE.b(str3, str);
            } else if (i3 == 4) {
                String str4 = chfVar.e;
                if (chfVar.c == 6) {
                    eeaVar = (eea) chfVar.d;
                } else {
                    eeaVar = eea.b;
                }
                cxeVarE.b(str4, eeaVar.x());
            }
        }
        cxeVarE.b("__phenotype_server_token", chdVar.e);
        cxeVarE.b("__phenotype_snapshot_token", chdVar.c);
        cxeVarE.b("__phenotype_configuration_version", Long.valueOf(chdVar.f));
        this.d = cxeVarE.g();
        this.a = chbVar;
    }

    public egc() {
        this.d = new HashMap();
        this.c = new HashMap();
        this.b = new HashMap();
        this.a = new HashMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public egc(egc egcVar) {
        this.d = new HashMap((Map) egcVar.d);
        this.c = new HashMap((Map) egcVar.c);
        this.b = new HashMap((Map) egcVar.b);
        this.a = new HashMap((Map) egcVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public egc(egc egcVar, byte[] bArr) {
        this.d = new HashMap((Map) egcVar.d);
        this.c = new HashMap((Map) egcVar.c);
        this.b = new HashMap((Map) egcVar.b);
        this.a = new HashMap((Map) egcVar.a);
    }
}
