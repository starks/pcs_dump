package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxh {
    public static final cbx a = cbr.d("brella", "InAppTrngSchdlr");
    private static final Executor g = diy.a;
    public final Context b;
    public final bpz c;
    public final bqm d;
    public final cbu e;
    public final bxi f;
    private final Random h;
    private final cjg i;

    public bxh(Context context, bpz bpzVar, bqm bqmVar, cjg cjgVar, cbu cbuVar, bxi bxiVar) {
        Random random = new Random();
        this.b = context;
        this.c = bpzVar;
        this.d = bqmVar;
        this.i = cjgVar;
        this.e = cbuVar;
        this.f = bxiVar;
        this.h = random;
    }

    private final asr A(bqg bqgVar, String str) {
        asr asrVar;
        bqi bqiVar = bqgVar.g;
        boolean z = false;
        if (bqiVar != null) {
            if (!bqiVar.a) {
                this.d.k(ccj.dn);
            }
            if (!bqiVar.b) {
                this.d.k(ccj.f2do);
            }
            if (!bqiVar.c) {
                this.d.k(ccj.dp);
            }
            asrVar = (asr) cck.a.createBuilder();
            if (!this.c.bs() && !this.c.aL(str)) {
                z = true;
            }
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((cck) asrVar.a).d = z;
            boolean z2 = bqiVar.b;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((cck) asrVar.a).e = z2;
            boolean z3 = bqiVar.c;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((cck) asrVar.a).f = z3;
            edp edpVarA = edp.a(bqgVar.g.a);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cck cckVar = (cck) asrVar.a;
            edpVarA.getClass();
            cckVar.g = edpVarA;
            cckVar.b |= 2;
        } else {
            asrVar = (asr) cck.a.createBuilder();
            if (!this.c.bs() && !this.c.aL(str)) {
                z = true;
            }
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((cck) asrVar.a).d = z;
            boolean z4 = !this.c.aX();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((cck) asrVar.a).e = z4;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((cck) asrVar.a).f = true;
            edp edpVarA2 = edp.a(true);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cck cckVar2 = (cck) asrVar.a;
            edpVarA2.getClass();
            cckVar2.g = edpVarA2;
            cckVar2.b |= 2;
        }
        long jT = this.c.T();
        if (jT > 0) {
            eek eekVarB = ehx.b(jT);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            cck cckVar3 = (cck) asrVar.a;
            eekVarB.getClass();
            cckVar3.c = eekVarB;
            cckVar3.b |= 1;
        }
        return asrVar;
    }

    public static long b(cci cciVar) {
        if (i(cciVar)) {
            return 0L;
        }
        ccm ccmVar = cciVar.f;
        if (ccmVar == null) {
            ccmVar = ccm.a;
        }
        eek eekVar = ccmVar.d;
        if (eekVar == null) {
            eekVar = eek.a;
        }
        return ehx.a(eekVar);
    }

    public static boolean i(cci cciVar) {
        ccm ccmVar = cciVar.f;
        if (ccmVar == null) {
            ccmVar = ccm.a;
        }
        int iB = ccl.b(ccmVar.c);
        if (iB == 0) {
            iB = ccl.d;
        }
        return iB == ccl.c;
    }

    public static cco n(asr asrVar, final int i) {
        return y(asrVar, new crw() { // from class: bxd
            @Override // defpackage.crw
            public final boolean a(Object obj) {
                return ((cco) obj).g == i;
            }
        });
    }

    public static cco o(asr asrVar, String str) {
        return y(asrVar, new bwy(str, 2));
    }

    public static cco p(asr asrVar, final String str, final btw btwVar, final int i) {
        if (btwVar.b() - 1 != 0) {
            final int i2 = 0;
            return y(asrVar, new crw() { // from class: bwz
                @Override // defpackage.crw
                public final boolean a(Object obj) {
                    if (i2 != 0) {
                        cco ccoVar = (cco) obj;
                        if (ccoVar.f.equals(str)) {
                            if ((ccoVar.c == 4 ? (ccg) ccoVar.d : ccg.a).c.equals(btwVar.a().c)) {
                                if (ccoVar.g == i) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    cco ccoVar2 = (cco) obj;
                    if (ccoVar2.f.equals(str)) {
                        if ((ccoVar2.c == 13 ? (cci) ccoVar2.d : cci.a).equals(btwVar.c())) {
                            if (ccoVar2.g == i) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            });
        }
        final int i3 = 1;
        return y(asrVar, new crw() { // from class: bwz
            @Override // defpackage.crw
            public final boolean a(Object obj) {
                if (i3 != 0) {
                    cco ccoVar = (cco) obj;
                    if (ccoVar.f.equals(str)) {
                        if ((ccoVar.c == 4 ? (ccg) ccoVar.d : ccg.a).c.equals(btwVar.a().c)) {
                            if (ccoVar.g == i) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                cco ccoVar2 = (cco) obj;
                if (ccoVar2.f.equals(str)) {
                    if ((ccoVar2.c == 13 ? (cci) ccoVar2.d : cci.a).equals(btwVar.c())) {
                        if (ccoVar2.g == i) {
                            return true;
                        }
                    }
                }
                return false;
            }
        });
    }

    static List q(asr asrVar, crw crwVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (cco ccoVar : DesugarCollections.unmodifiableList(((ccp) asrVar.a).b)) {
            if (crwVar.a(ccoVar)) {
                arrayList2.add(ccoVar);
            } else {
                arrayList.add(ccoVar);
            }
        }
        if (!arrayList2.isEmpty()) {
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((ccp) asrVar.a).b = ccp.emptyProtobufList();
            asrVar.e(arrayList);
        }
        return arrayList2;
    }

    private final ehf r(long j, long j2, bqg bqgVar) {
        return s(j, j2, bqgVar, true);
    }

    private final ehf s(long j, long j2, bqg bqgVar, boolean z) {
        long millis = TimeUnit.SECONDS.toMillis(this.c.X()) + j;
        bqp bqpVar = bqgVar.j;
        int iK = bqpVar != null ? bcp.k(bqpVar.a) : ccl.a;
        if (iK != ccl.b) {
            return ehz.b(millis);
        }
        long jL = l(bqgVar.j.b, iK, z);
        long jMin = Math.min(j + jL, millis);
        return j2 == 0 ? ehz.b(jMin) : ehz.b(Math.max(j2 + jL, jMin));
    }

    private final ehf t(long j, long j2, bqg bqgVar) {
        return s(j, j2, bqgVar, false);
    }

    private static boolean u(Uri uri, String str) {
        return uri == null ? str.isEmpty() : str.equals(uri.toString());
    }

    private final synchronized djr v(final int i, final String str, final btw btwVar, final dzm dzmVar, final int i2) throws Throwable {
        try {
            try {
                return x(new bxg() { // from class: bxb
                    @Override // defpackage.bxg
                    public final crv a(ccp ccpVar) {
                        boolean z;
                        long jA;
                        asr asrVar = (asr) ccpVar.toBuilder();
                        String str2 = str;
                        btw btwVar2 = btwVar;
                        cco ccoVarP = bxh.p(asrVar, str2, btwVar2, i);
                        if (ccoVarP == null) {
                            return new crv(ccpVar, true);
                        }
                        boolean z2 = i2 == 0;
                        ccg ccgVarA = btwVar2.a();
                        ccm ccmVar = ccgVarA.e;
                        if (ccmVar == null) {
                            ccmVar = ccm.a;
                        }
                        int iB = ccl.b(ccmVar.c);
                        if (iB == 0) {
                            iB = ccl.d;
                        }
                        bxh bxhVar = this.a;
                        if (iB == ccl.c && z2) {
                            bxhVar.f.b(ccoVarP);
                            bxhVar.d.k(ccj.cV);
                            return new crv((ccp) asrVar.z(), true);
                        }
                        dzm dzmVar2 = dzmVar;
                        long jA2 = bxhVar.e.a();
                        if (dzmVar2 == null || (dzmVar2.c <= 0 && dzmVar2.d <= 0)) {
                            z = false;
                            double dMin = Math.min(1.0d, Math.max(0.0d, bxhVar.c.A()));
                            double millis = TimeUnit.SECONDS.toMillis(bxhVar.c.R());
                            jA = bxhVar.a((long) (millis * (1.0d - dMin)), (long) ((dMin + 1.0d) * millis));
                        } else {
                            ccm ccmVar2 = ccgVarA.e;
                            if (ccmVar2 == null) {
                                ccmVar2 = ccm.a;
                            }
                            z = false;
                            jA = bxhVar.l(bxhVar.a(dzmVar2.c, dzmVar2.d), ccl.a, true);
                            int iB2 = ccl.b(ccmVar2.c);
                            if (iB2 == 0) {
                                iB2 = ccl.d;
                            }
                            if (iB2 == ccl.b && z2) {
                                eek eekVar = ccmVar2.d;
                                if (eekVar == null) {
                                    eekVar = eek.a;
                                }
                                jA = Math.max(bxhVar.l(ehx.a(eekVar), ccl.b, true), jA);
                            }
                        }
                        ehf ehfVarB = ehz.b(jA + jA2);
                        asr asrVar2 = (asr) ccoVarP.toBuilder();
                        ehf ehfVarB2 = ehz.b(jA2);
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        cco ccoVar = (cco) asrVar2.a;
                        ehfVarB2.getClass();
                        ccoVar.k = ehfVarB2;
                        ccoVar.b |= 8;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        cco ccoVar2 = (cco) asrVar2.a;
                        ehfVarB.getClass();
                        ccoVar2.l = ehfVarB;
                        ccoVar2.b |= 16;
                        if (dzmVar2 != null) {
                            String str3 = dzmVar2.b;
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            cco ccoVar3 = (cco) asrVar2.a;
                            str3.getClass();
                            ccoVar3.m = str3;
                            int i3 = ccn.c;
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            ((cco) asrVar2.a).o = ccn.a(i3);
                        } else {
                            int i4 = ccn.e;
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            ((cco) asrVar2.a).o = ccn.a(i4);
                        }
                        cco ccoVar4 = (cco) asrVar2.z();
                        asrVar.f(ccoVar4);
                        ccp ccpVar2 = (ccp) asrVar.z();
                        return !bxhVar.f.c(ccoVar4, 0L) ? new crv(ccpVar2, Boolean.valueOf(z)) : new crv(ccpVar2, true);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private final synchronized djr w(final int i, final String str, final btw btwVar, final int i2) throws Throwable {
        try {
            try {
                return x(new bxg() { // from class: bwx
                    @Override // defpackage.bxg
                    public final crv a(ccp ccpVar) {
                        ehf ehfVarB;
                        asr asrVar = (asr) ccpVar.toBuilder();
                        String str2 = str;
                        btw btwVar2 = btwVar;
                        cco ccoVarP = bxh.p(asrVar, str2, btwVar2, i);
                        if (ccoVarP == null) {
                            return new crv(ccpVar, true);
                        }
                        bxh bxhVar = this.a;
                        cci cciVarC = btwVar2.c();
                        if ((cciVarC.b & 1) == 0) {
                            bxhVar.f.b(ccoVarP);
                            bxhVar.d.k(ccj.cW);
                            bxhVar.k(cciVarC);
                            return new crv((ccp) asrVar.z(), true);
                        }
                        int i3 = i2;
                        if (bxh.i(cciVarC) && i3 == 0) {
                            bxhVar.f.b(ccoVarP);
                            bxhVar.d.k(ccj.cV);
                            bxhVar.k(cciVarC);
                            return new crv((ccp) asrVar.z(), true);
                        }
                        long jB = bxh.b(btwVar2.c());
                        long jA = bxhVar.e.a();
                        ccm ccmVar = cciVarC.f;
                        if (ccmVar == null) {
                            ccmVar = ccm.a;
                        }
                        int iB = ccl.b(ccmVar.c);
                        if (iB == 0) {
                            iB = ccl.d;
                        }
                        if (i3 == 2) {
                            ehfVarB = ehz.b(TimeUnit.SECONDS.toMillis(bxhVar.c.P()) + jA);
                        } else {
                            long millis = TimeUnit.SECONDS.toMillis(bxhVar.c.Y());
                            if (i3 != 0) {
                                jB = millis;
                            }
                            ehfVarB = ehz.b(bxhVar.l(jB, iB, false) + jA);
                        }
                        int i4 = i3 != 0 ? i3 != 1 ? i3 != 2 ? ccn.a : ccn.f : ccn.e : ccn.d;
                        asr asrVar2 = (asr) ccoVarP.toBuilder();
                        ehf ehfVarB2 = ehz.b(jA);
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        cco ccoVar = (cco) asrVar2.a;
                        ehfVarB2.getClass();
                        ccoVar.k = ehfVarB2;
                        ccoVar.b |= 8;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        cco ccoVar2 = (cco) asrVar2.a;
                        ehfVarB.getClass();
                        ccoVar2.l = ehfVarB;
                        ccoVar2.b |= 16;
                        if (!asrVar2.a.isMutable()) {
                            asrVar2.B();
                        }
                        ((cco) asrVar2.a).o = ccn.a(i4);
                        cco ccoVar3 = (cco) asrVar2.z();
                        asrVar.f(ccoVar3);
                        ccp ccpVar2 = (ccp) asrVar.z();
                        return !bxhVar.f.c(ccoVar3, 0L) ? new crv(ccpVar2, false) : new crv(ccpVar2, true);
                    }
                });
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    private final djr x(final bxg bxgVar) {
        final AtomicReference atomicReference = new AtomicReference(null);
        dis disVar = new dis() { // from class: bxc
            @Override // defpackage.dis
            public final djy a(Object obj) {
                asr asrVar = (asr) ((ccp) obj).toBuilder();
                bxh.q(asrVar, new bwv(5));
                crv crvVarA = bxgVar.a((ccp) asrVar.z());
                atomicReference.set(crvVarA.b);
                ccp ccpVar = (ccp) crvVarA.a;
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                for (cco ccoVar : ccpVar.b) {
                    if (ccoVar.e.isEmpty()) {
                        throw new IllegalStateException("Empty app package name");
                    }
                    if (!hashSet.add(ccoVar.f)) {
                        throw new IllegalStateException("Duplicate session names");
                    }
                    if (ccoVar.f.isEmpty()) {
                        throw new IllegalStateException("Empty session name");
                    }
                    if (!hashSet5.add(Integer.valueOf(ccoVar.g))) {
                        throw new IllegalStateException("Duplicate job IDs");
                    }
                    if (ccoVar.g == 0) {
                        throw new IllegalStateException("Job ID == 0");
                    }
                    if (ccoVar.c == 4 && ((ccg) ccoVar.d).c.isEmpty()) {
                        throw new IllegalStateException("Empty population name");
                    }
                    if (ccoVar.c == 4 && !hashSet2.add(((ccg) ccoVar.d).c)) {
                        throw new IllegalStateException("Duplicate population names");
                    }
                    if (ccoVar.c == 13 && ((cci) ccoVar.d).c.isEmpty()) {
                        throw new IllegalStateException("Missing personlization plan URI");
                    }
                    if (ccoVar.c == 13 && !((cci) ccoVar.d).d.isEmpty()) {
                        throw new IllegalStateException("Initial params is set for PersonalizedOptions, but it's no longer supported.");
                    }
                    if (ccoVar.c == 13 && ((cci) ccoVar.d).g.isEmpty()) {
                        if ((ccoVar.c == 13 ? (cci) ccoVar.d : cci.a).h.isEmpty()) {
                            throw new IllegalStateException("Missing input directory and input resources.");
                        }
                    }
                    if (ccoVar.c == 13) {
                        if (!hashSet3.add(new crv(((cci) ccoVar.d).c, (ccoVar.c == 13 ? (cci) ccoVar.d : cci.a).g))) {
                            throw new IllegalStateException("Duplicate (personalization plan, input directory)");
                        }
                    }
                    if (ccoVar.c == 13 && ((cci) ccoVar.d).e.isEmpty()) {
                        throw new IllegalStateException("Missing output directory");
                    }
                    if (ccoVar.c == 13 && !hashSet4.add(((cci) ccoVar.d).e)) {
                        throw new IllegalStateException("Duplicate output directory");
                    }
                    ccm ccmVar = (ccoVar.c == 13 ? (cci) ccoVar.d : cci.a).f;
                    if (ccmVar == null) {
                        ccmVar = ccm.a;
                    }
                    int iB = ccl.b(ccmVar.c);
                    if (iB == 0) {
                        iB = ccl.d;
                    }
                    if (iB == ccl.b) {
                        if (bxh.b(ccoVar.c == 13 ? (cci) ccoVar.d : cci.a) <= 0) {
                            throw new IllegalStateException("Invalid value for user defined minimum training interval");
                        }
                    }
                    if ((ccoVar.b & 1) != 0) {
                        ehf ehfVar = ccoVar.h;
                        if (ehfVar == null) {
                            ehfVar = ehf.a;
                        }
                        if (ehz.d(ehfVar)) {
                            if ((ccoVar.b & 2) != 0) {
                                ehf ehfVar2 = ccoVar.i;
                                if (ehfVar2 == null) {
                                    ehfVar2 = ehf.a;
                                }
                                if (ehz.d(ehfVar2)) {
                                    if ((ccoVar.b & 4) != 0) {
                                        ehf ehfVar3 = ccoVar.j;
                                        if (ehfVar3 == null) {
                                            ehfVar3 = ehf.a;
                                        }
                                        if (!ehz.d(ehfVar3)) {
                                            throw new IllegalStateException("Invalid last run start time");
                                        }
                                    }
                                    if ((ccoVar.b & 8) != 0) {
                                        ehf ehfVar4 = ccoVar.k;
                                        if (ehfVar4 == null) {
                                            ehfVar4 = ehf.a;
                                        }
                                        if (!ehz.d(ehfVar4)) {
                                            throw new IllegalStateException("Invalid last run end time");
                                        }
                                    }
                                    if ((ccoVar.b & 16) != 0) {
                                        ehf ehfVar5 = ccoVar.l;
                                        if (ehfVar5 == null) {
                                            ehfVar5 = ehf.a;
                                        }
                                        if (ehz.d(ehfVar5)) {
                                        }
                                    }
                                    throw new IllegalStateException("Missing/invalid earliest next run time");
                                }
                            }
                            throw new IllegalStateException("Missing/invalid last scheduled time");
                        }
                    }
                    throw new IllegalStateException("Missing/invalid creation time");
                }
                return cnx.C((ccp) crvVarA.a);
            }
        };
        cjg cjgVar = this.i;
        Executor executor = g;
        return (djr) dhq.j(dij.i(djr.q(cjgVar.c(disVar, executor)), new arl(atomicReference, 12), executor), IOException.class, new bbk(this, 3), executor);
    }

    private static cco y(asr asrVar, crw crwVar) {
        int i = 0;
        for (cco ccoVar : DesugarCollections.unmodifiableList(((ccp) asrVar.a).b)) {
            if (crwVar.a(ccoVar)) {
                asrVar.g(i);
                return ccoVar;
            }
            i++;
        }
        return null;
    }

    private final void z(int i, asr asrVar) {
        if (n(asrVar, i) != null) {
            this.d.k(ccj.cQ);
        }
    }

    public final long a(long j, long j2) {
        return Math.max(0L, j) + ((long) ((Math.max(r3, j2) - r3) * this.h.nextDouble()));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.crv c(java.lang.String r21, boolean r22, int r23, java.lang.String r24, android.net.Uri r25, android.net.Uri r26, android.net.Uri r27, final java.util.List r28, defpackage.bqg r29, java.lang.String r30, defpackage.ccf r31, long r32, defpackage.ccp r34) throws defpackage.bxf {
        /*
            Method dump skipped, instructions count: 1661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxh.c(java.lang.String, boolean, int, java.lang.String, android.net.Uri, android.net.Uri, android.net.Uri, java.util.List, bqg, java.lang.String, ccf, long, ccp):crv");
    }

    public final synchronized djy d(int i) {
        return x(new bxe(this, i, 0));
    }

    public final synchronized djy e(final bqg bqgVar) {
        final String strU;
        final ccf ccfVarF;
        final List listJ;
        final long j;
        final Uri uri;
        final Uri uri2;
        final boolean z;
        final Uri uri3;
        final String str;
        final String str2;
        final int i;
        String str3 = this.b.getPackageName() + "/" + bqgVar.a;
        String strN = clq.N(bqgVar.d);
        int i2 = bqgVar.e;
        strU = uq.u(str3, strN);
        ccfVarF = bcp.f(i2);
        listJ = bcp.j(bqgVar.l);
        j = this.c.az() ? bqgVar.h : 0L;
        if (j > 0) {
            this.d.k(ccj.dk);
        }
        uri = bqgVar.k;
        uri2 = bqgVar.i;
        boolean z2 = false;
        z = bqgVar.d != null;
        if (z || (uri2 != null && (uri != null || !listJ.isEmpty()))) {
            z2 = true;
        }
        uri3 = bqgVar.f;
        str = bqgVar.d;
        str2 = bqgVar.a;
        i = bqgVar.b;
        clq.v(z2);
        return x(new bxg() { // from class: bww
            @Override // defpackage.bxg
            public final crv a(ccp ccpVar) {
                return this.a.c(str2, z, i, str, uri3, uri2, uri, listJ, bqgVar, strU, ccfVarF, j, ccpVar);
            }
        });
    }

    public final synchronized djy f(final String str) {
        return x(new bxg() { // from class: bwu
            @Override // defpackage.bxg
            public final crv a(ccp ccpVar) {
                asr asrVar = (asr) ccpVar.toBuilder();
                cco ccoVarO = bxh.o(asrVar, str);
                if (ccoVarO == null) {
                    return new crv(ccpVar, true);
                }
                bxh bxhVar = this.a;
                ccp ccpVar2 = (ccp) asrVar.z();
                bxhVar.f.b(ccoVarO);
                return new crv(ccpVar2, Boolean.valueOf(ccoVarO.c == 13 ? bxhVar.k((cci) ccoVarO.d) : true));
            }
        });
    }

    public final synchronized djy g(int i, String str, btw btwVar, dzm dzmVar, int i2) {
        djr djrVarV;
        arl arlVar;
        Executor executor;
        djrVarV = btwVar.b() == 1 ? v(i, str, btwVar, dzmVar, i2) : w(i, str, btwVar, i2);
        arlVar = new arl(this, 11);
        executor = g;
        return dhq.i(dij.i(djrVarV, arlVar, executor), IOException.class, new bre(5), executor);
    }

    public final synchronized djy h(int i) {
        return dhq.i(x(new bxe(this, i, 1)), IOException.class, new bre(4), g);
    }

    public final boolean j(cci cciVar) {
        if (cciVar.e.isEmpty()) {
            return true;
        }
        try {
            return brb.a(new File(bxr.c(this.b, cciVar.e)));
        } catch (ErrorStatusException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean k(cci cciVar) {
        boolean zJ = j(cciVar);
        if (!zJ) {
            this.d.k(ccj.dt);
        }
        return zJ;
    }

    public final long l(long j, int i, boolean z) {
        long millis;
        long millis2;
        if (!z) {
            millis = TimeUnit.SECONDS.toMillis(this.c.aj());
            millis2 = TimeUnit.SECONDS.toMillis(this.c.ae());
        } else if (i == ccl.b) {
            millis = TimeUnit.SECONDS.toMillis(this.c.ai());
            millis2 = TimeUnit.SECONDS.toMillis(this.c.af());
        } else {
            millis2 = TimeUnit.SECONDS.toMillis(this.c.Z());
            millis = 0;
        }
        return Math.max(millis, Math.min(millis2, j));
    }

    public final void m(int i, cru cruVar, cru cruVar2) {
        if (this.c.bi()) {
            asr asrVar = (asr) dff.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dff dffVar = (dff) asrVar.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            dffVar.c = i2;
            dffVar.b |= 1;
            if (cruVar.c()) {
                Object objA = cruVar.a();
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                dff dffVar2 = (dff) asrVar.a;
                dffVar2.d = ((dfi) objA).f;
                dffVar2.b |= 2;
            }
            asr asrVar2 = (asr) dfo.a.createBuilder();
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dfo dfoVar = (dfo) asrVar2.a;
            dff dffVar3 = (dff) asrVar.z();
            dffVar3.getClass();
            dfoVar.f = dffVar3;
            dfoVar.e = 4;
            if (cruVar2.c()) {
                String str = ((bqg) cruVar2.a()).a;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                dfo dfoVar2 = (dfo) asrVar2.a;
                str.getClass();
                dfoVar2.b |= 1;
                dfoVar2.g = str;
                if (((bqg) cruVar2.a()).d != null) {
                    asr asrVar3 = (asr) dfj.a.createBuilder();
                    String str2 = ((bqg) cruVar2.a()).d;
                    if (!asrVar3.a.isMutable()) {
                        asrVar3.B();
                    }
                    dfj dfjVar = (dfj) asrVar3.a;
                    str2.getClass();
                    dfjVar.b |= 1;
                    dfjVar.c = str2;
                    if (!asrVar2.a.isMutable()) {
                        asrVar2.B();
                    }
                    dfo dfoVar3 = (dfo) asrVar2.a;
                    dfj dfjVar2 = (dfj) asrVar3.z();
                    dfjVar2.getClass();
                    dfoVar3.d = dfjVar2;
                    dfoVar3.c = 1;
                } else {
                    dfl dflVar = dfl.a;
                    if (!asrVar2.a.isMutable()) {
                        asrVar2.B();
                    }
                    dfo dfoVar4 = (dfo) asrVar2.a;
                    dflVar.getClass();
                    dfoVar4.d = dflVar;
                    dfoVar4.c = 2;
                }
            }
            bqm bqmVar = this.d;
            asr asrVar4 = (asr) dfa.a.createBuilder();
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            dfa dfaVar = (dfa) asrVar4.a;
            dfo dfoVar5 = (dfo) asrVar2.z();
            dfoVar5.getClass();
            dfaVar.h = dfoVar5;
            dfaVar.b |= 8192;
            bqmVar.j((dfa) asrVar4.z());
        }
    }
}
