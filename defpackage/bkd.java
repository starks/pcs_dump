package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.util.Log;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.learning.dynamite.training.InAppTrainingServiceImpl;
import com.google.android.gms.learning.internal.training.InAppJobService;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkd implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bkd(bke bkeVar, bho bhoVar, int i) {
        this.c = i;
        this.a = bhoVar;
        this.b = bkeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [cad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [android.os.IBinder$DeathRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [bzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v90, types: [cab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v96, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v19, types: [caa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30, types: [bje, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v47, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v55, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v58, types: [android.os.IBinder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [caa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [cad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [cad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [cac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.c) {
            case 0:
                bke bkeVar = (bke) this.b;
                bkb bkbVar = (bkb) bkeVar.f.l.get(bkeVar.b);
                if (bkbVar == null) {
                    return;
                }
                if (!((bho) this.a).c()) {
                    bkbVar.i((bho) this.a);
                    return;
                }
                bke bkeVar2 = (bke) this.b;
                bkeVar2.e = true;
                if (bkeVar2.a.m()) {
                    ((bke) this.b).c();
                    return;
                }
                try {
                    biw biwVar = ((bke) this.b).a;
                    biwVar.j(null, biwVar.g());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    ((bke) this.b).a.i("Failed to get service from broker.");
                    bkbVar.i(new bho(10));
                    return;
                }
            case 1:
                ThreadLocal threadLocal = BasePendingResult.b;
                this.a.a((Status) this.b);
                return;
            case 2:
                Object obj = ((bkl) this.a).b;
                Object obj2 = this.b;
                if (obj != null) {
                    try {
                        Object obj3 = ((fuu) obj2).a;
                        een eenVar = een.a;
                        egr egrVar = egr.a;
                        ((cgj) obj).a((cgf) efb.parseFrom(cgf.a, (byte[]) obj3, een.a));
                        return;
                    } catch (efp unused) {
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    }
                }
                return;
            case 3:
                bzv bzvVar = (bzv) this.b;
                bho bhoVar = bzvVar.b;
                boolean zC = bhoVar.c();
                Object obj4 = this.a;
                if (zC) {
                    bmk bmkVar = bzvVar.c;
                    aso.F(bmkVar);
                    bho bhoVar2 = bmkVar.c;
                    if (!bhoVar2.c()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(bhoVar2))), new Exception());
                        bkt bktVar = (bkt) obj4;
                        bktVar.f.b(bhoVar2);
                        bktVar.e.x();
                        return;
                    }
                    bkt bktVar2 = (bkt) obj4;
                    bke bkeVar3 = bktVar2.f;
                    blt bltVarA = bmkVar.a();
                    Set set = bktVar2.c;
                    if (bltVarA == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        bkeVar3.b(new bho(4));
                    } else {
                        bkeVar3.c = bltVarA;
                        bkeVar3.d = set;
                        bkeVar3.c();
                    }
                } else {
                    ((bkt) obj4).f.b(bhoVar);
                }
                ((bkt) obj4).e.x();
                return;
            case 4:
                ((bnm) this.a).d.q((String) this.b);
                return;
            case 5:
                this.b.unlinkToDeath(this.a, 0);
                return;
            case 6:
                InAppTrainingServiceImpl.a(this.b, (Context) this.a);
                return;
            case 7:
                dkq dkqVar = new dkq((Throwable) this.b);
                bnb.a((Context) this.a, dkqVar);
                throw dkqVar;
            case 8:
                ((btv) this.b).c((btu) this.a);
                return;
            case 9:
                btv.b(this.b, ((btv) this.a).c);
                return;
            case 10:
                this.b.unlinkToDeath(this.a, 0);
                return;
            case 11:
                ((InAppJobService) this.b).lambda$onStopJob$0((JobParameters) this.a);
                return;
            case 12:
                this.b.unlinkToDeath(this.a, 0);
                return;
            case 13:
                if (((cal) this.b).c) {
                    ((cal) ((bzz) this.a).a).p();
                    return;
                }
                try {
                    ((cal) ((bzz) this.a).a).n(((bzz) this.a).b.a((cag) this.b));
                    return;
                } catch (caf e3) {
                    if (!(e3.getCause() instanceof Exception)) {
                        ((cal) ((bzz) this.a).a).m(e3);
                        return;
                    }
                    ((cal) ((bzz) this.a).a).m((Exception) e3.getCause());
                    return;
                } catch (Exception e4) {
                    ((cal) ((bzz) this.a).a).m(e4);
                    return;
                }
            case 14:
                try {
                    cag cagVar = (cag) ((cae) this.a).b.a((cag) this.b);
                    if (cagVar == 0) {
                        ((cae) this.a).c(new NullPointerException("Continuation returned null"));
                        return;
                    } else {
                        cagVar.k(cak.b, this.a);
                        cagVar.j(cak.b, this.a);
                        cagVar.f(cak.b, this.a);
                        return;
                    }
                } catch (caf e5) {
                    if (!(e5.getCause() instanceof Exception)) {
                        ((cae) this.a).a.m(e5);
                        return;
                    }
                    ((cae) this.a).a.m((Exception) e5.getCause());
                    return;
                } catch (Exception e6) {
                    ((cae) this.a).a.m(e6);
                    return;
                }
            case 15:
                synchronized (((bzz) this.a).a) {
                    ((bzz) this.a).b.a((cag) this.b);
                }
                return;
            case 16:
                synchronized (((bzz) this.a).a) {
                    ?? r0 = ((bzz) this.a).b;
                    Exception excB = ((cag) this.b).b();
                    aso.F(excB);
                    r0.c(excB);
                }
                return;
            case 17:
                synchronized (((bzz) this.a).a) {
                    ((bzz) this.a).b.d(((cag) this.b).c());
                }
                return;
            case 18:
                try {
                    Object obj5 = ((cae) this.a).b;
                    Object objC = ((cag) this.b).c();
                    Object obj6 = ((bot) obj5).a;
                    bpb bpbVar = (bpb) objC;
                    cag cagVarA = bpbVar.a(((bot) obj5).b);
                    cagVarA.h(((fcy) obj6).c, new cbn(bpbVar, i));
                    cagVarA.k(cak.b, this.a);
                    cagVarA.j(cak.b, this.a);
                    cagVarA.f(cak.b, this.a);
                    return;
                } catch (caf e7) {
                    if (!(e7.getCause() instanceof Exception)) {
                        ((cae) this.a).c(e7);
                        return;
                    }
                    ((cae) this.a).c((Exception) e7.getCause());
                    return;
                } catch (CancellationException unused2) {
                    ((cae) this.a).b();
                    return;
                } catch (Exception e8) {
                    ((cae) this.a).c(e8);
                    return;
                }
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                Object obj7 = this.b;
                ccu ccuVar = ((cct) obj7).a;
                Object obj8 = this.a;
                synchronized (ccuVar.b) {
                    if (((cct) obj7).a.c.remove(obj8)) {
                        ((cct) obj7).b.close();
                    }
                }
                return;
            default:
                Object obj9 = this.b;
                Object obj10 = this.a;
                try {
                    asr asrVar = (asr) ((dfv) efb.parseFrom(dfv.a, (byte[]) obj9, een.a())).toBuilder();
                    long j = ((cdg) obj10).k;
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    dfv dfvVar = (dfv) asrVar.a;
                    dfvVar.b |= 16;
                    dfvVar.g = j;
                    synchronized (((cdg) obj10).l) {
                        dfv dfvVar2 = ((cdg) obj10).p.d;
                        if (dfvVar2 == null) {
                            dfvVar2 = dfv.a;
                        }
                        if (!dfvVar2.m.equals(((dfv) asrVar.a).m)) {
                            asr asrVar2 = (asr) ((cdg) obj10).p.toBuilder();
                            dfv dfvVar3 = ((cdg) obj10).p.d;
                            if (dfvVar3 == null) {
                                dfvVar3 = dfv.a;
                            }
                            asr asrVar3 = (asr) dfvVar3.toBuilder();
                            String str = ((dfv) asrVar.a).m;
                            if (!asrVar3.a.isMutable()) {
                                asrVar3.B();
                            }
                            dfv dfvVar4 = (dfv) asrVar3.a;
                            str.getClass();
                            dfvVar4.b |= 4096;
                            dfvVar4.m = str;
                            if (!asrVar2.a.isMutable()) {
                                asrVar2.B();
                            }
                            dfa dfaVar = (dfa) asrVar2.a;
                            dfv dfvVar5 = (dfv) asrVar3.z();
                            dfvVar5.getClass();
                            dfaVar.d = dfvVar5;
                            dfaVar.b |= 4;
                            ((cdg) obj10).p = (dfa) asrVar2.z();
                        }
                        ((cdg) obj10).h.a(asrVar, ((cdg) obj10).j, ((cdg) obj10).p, ((cdg) obj10).n, ((cdg) obj10).k);
                    }
                    asr asrVar4 = (asr) dfa.a.createBuilder();
                    asr asrVar5 = (asr) dfb.a.createBuilder();
                    String str2 = ((cdg) obj10).c;
                    if (!asrVar5.a.isMutable()) {
                        asrVar5.B();
                    }
                    dfb dfbVar = (dfb) asrVar5.a;
                    str2.getClass();
                    dfbVar.b |= 1;
                    dfbVar.c = str2;
                    if (!asrVar4.a.isMutable()) {
                        asrVar4.B();
                    }
                    dfa dfaVar2 = (dfa) asrVar4.a;
                    dfb dfbVar2 = (dfb) asrVar5.z();
                    dfbVar2.getClass();
                    dfaVar2.c = dfbVar2;
                    dfaVar2.b |= 1;
                    if (!asrVar4.a.isMutable()) {
                        asrVar4.B();
                    }
                    dfa dfaVar3 = (dfa) asrVar4.a;
                    dfv dfvVar6 = (dfv) asrVar.z();
                    dfvVar6.getClass();
                    dfaVar3.d = dfvVar6;
                    dfaVar3.b = 4 | dfaVar3.b;
                    ((cdg) obj10).f.j((dfa) asrVar4.z());
                    return;
                } catch (efp e9) {
                    throw new IllegalArgumentException(e9);
                }
        }
    }

    public /* synthetic */ bkd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public bkd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj2;
        this.a = obj;
    }

    public /* synthetic */ bkd(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
