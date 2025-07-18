package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.ayn;
import defpackage.bcp;
import defpackage.bkj;
import defpackage.bks;
import defpackage.bnb;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bpz;
import defpackage.bqg;
import defpackage.bqm;
import defpackage.btk;
import defpackage.btl;
import defpackage.bvw;
import defpackage.bxf;
import defpackage.bxh;
import defpackage.cbq;
import defpackage.cbr;
import defpackage.cbx;
import defpackage.ccj;
import defpackage.clq;
import defpackage.cnx;
import defpackage.crd;
import defpackage.cru;
import defpackage.cxc;
import defpackage.dfg;
import defpackage.dfi;
import defpackage.dhq;
import defpackage.dif;
import defpackage.dij;
import defpackage.diy;
import defpackage.djr;
import defpackage.djy;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class InAppTrainerImpl extends bvw {
    public static final /* synthetic */ int a = 0;
    private static final cbx b = cbr.d("brella", "InAppTrainerImpl");
    private static final cxc c = cxc.r("android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE");
    private static final cxc d = cxc.q("android.permission.RECEIVE_BOOT_COMPLETED");
    private Context e;
    private Executor f;
    private String g;
    private bqg h;

    public static /* synthetic */ Status $r8$lambda$97OQ_75UeTG3jVunfznmec81ylw(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, Boolean bool) {
        if (bool.booleanValue()) {
            bxhVar.m(dfg.c, crd.a, cru.d(inAppTrainerImpl.h));
            return Status.a;
        }
        bxhVar.m(dfg.c, cru.d(dfi.ERROR_REASON_FILE_DELETION), cru.d(inAppTrainerImpl.h));
        return new Status(25001, "Error occurs when deleting output directory!");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        defpackage.brg.b();
        r0 = defpackage.cbq.b(r7.e.getApplicationContext());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r1 = (defpackage.bpz) r0.c(defpackage.bpz.class);
        r3 = (defpackage.bqm) r0.c(defpackage.bqm.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r7.a(r3, r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        r1 = new com.google.android.gms.common.api.Status(17, "InAppTraining API not enabled!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (b(r3, r1, r7.h) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        r1 = new com.google.android.gms.common.api.Status(17, "In-app Personalization API is not enabled.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r3 = r1.ac();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (r3 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r7.h.c().length <= r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r1 = new com.google.android.gms.common.api.Status(10, "Context data size exceeds the limit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        r0 = com.google.android.gms.common.api.Status.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ defpackage.djy $r8$lambda$LOea8v46z5le_gs7E8JRTHW9KM4(com.google.android.gms.learning.dynamite.training.InAppTrainerImpl r7) {
        /*
            bqg r0 = r7.h     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> Lb0
            if (r0 == 0) goto L9
            cxc r0 = com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.c     // Catch: java.lang.Throwable -> Lb0
            goto Lb
        L9:
            cxc r0 = com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.d     // Catch: java.lang.Throwable -> Lb0
        Lb:
            czd r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lb0
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lb0
            r2 = 10
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r3 = r7.e     // Catch: java.lang.Throwable -> Lb0
            int r3 = defpackage.rm.a(r3, r1)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto Lf
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r3 = "Must hold "
            java.lang.String r4 = " permission!"
            java.lang.String r1 = defpackage.a.z(r1, r3, r4)     // Catch: java.lang.Throwable -> Lb0
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> Lb0
            goto L9f
        L33:
            defpackage.brg.b()     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r0 = r7.e     // Catch: java.lang.Throwable -> Lb0
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> Lb0
            cbq r0 = defpackage.cbq.b(r0)     // Catch: java.lang.Throwable -> Lb0
            java.lang.Class<bpz> r1 = defpackage.bpz.class
            java.lang.Object r1 = r0.c(r1)     // Catch: java.lang.Throwable -> La4
            bpz r1 = (defpackage.bpz) r1     // Catch: java.lang.Throwable -> La4
            java.lang.Class<bqm> r3 = defpackage.bqm.class
            java.lang.Object r3 = r0.c(r3)     // Catch: java.lang.Throwable -> La4
            bqm r3 = (defpackage.bqm) r3     // Catch: java.lang.Throwable -> La4
            boolean r4 = r7.a(r3, r1)     // Catch: java.lang.Throwable -> La4
            r5 = 17
            if (r4 == 0) goto L66
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "InAppTraining API not enabled!"
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L64
        L61:
            r0.close()     // Catch: java.lang.Throwable -> Lb0
        L64:
            r0 = r1
            goto L9f
        L66:
            bqg r4 = r7.h     // Catch: java.lang.Throwable -> La4
            boolean r3 = b(r3, r1, r4)     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto L78
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> La4
            java.lang.String r2 = "In-app Personalization API is not enabled."
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L64
            goto L61
        L78:
            long r3 = r1.ac()     // Catch: java.lang.Throwable -> La4
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L98
            bqg r1 = r7.h     // Catch: java.lang.Throwable -> La4
            byte[] r1 = r1.c()     // Catch: java.lang.Throwable -> La4
            int r1 = r1.length     // Catch: java.lang.Throwable -> La4
            long r5 = (long) r1     // Catch: java.lang.Throwable -> La4
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L98
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch: java.lang.Throwable -> La4
            java.lang.String r3 = "Context data size exceeds the limit"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L64
            goto L61
        L98:
            if (r0 == 0) goto L9d
            r0.close()     // Catch: java.lang.Throwable -> Lb0
        L9d:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a     // Catch: java.lang.Throwable -> Lb0
        L9f:
            djy r7 = defpackage.cnx.C(r0)
            return r7
        La4:
            r1 = move-exception
            if (r0 == 0) goto Laf
            r0.close()     // Catch: java.lang.Throwable -> Lab
            goto Laf
        Lab:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lb0
        Laf:
            throw r1     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r0 = move-exception
            android.content.Context r7 = r7.e
            android.content.Context r7 = r7.getApplicationContext()
            defpackage.bnb.a(r7, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.$r8$lambda$LOea8v46z5le_gs7E8JRTHW9KM4(com.google.android.gms.learning.dynamite.training.InAppTrainerImpl):djy");
    }

    public static /* synthetic */ Status $r8$lambda$LuBzWy4wstyNXKJnW07wxeh91n8(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, IOException iOException) {
        bxhVar.m(dfg.b, cru.d(dfi.ERROR_REASON_IO_EXCEPTION), cru.d(inAppTrainerImpl.h));
        return new Status(8, "IOException");
    }

    /* renamed from: $r8$lambda$PySnkXf-tCowkSDxm2KfNnLj1kk, reason: not valid java name */
    public static /* synthetic */ Status m17$r8$lambda$PySnkXftCowkSDxm2KfNnLj1kk(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, bpz bpzVar, Context context, RuntimeException runtimeException) {
        bxhVar.m(dfg.c, cru.d(dfi.ERROR_REASON_RUNTIME_EXCEPTION), cru.d(inAppTrainerImpl.h));
        if (!bpzVar.bo()) {
            throw runtimeException;
        }
        bnb.a(context, runtimeException);
        throw runtimeException;
    }

    public static /* synthetic */ Status $r8$lambda$R_YmcIhsVd8wIQoa0VUWJYUdglc(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, IOException iOException) {
        bxhVar.m(dfg.c, cru.d(dfi.ERROR_REASON_IO_EXCEPTION), cru.d(inAppTrainerImpl.h));
        return new Status(8, "IOException");
    }

    /* renamed from: $r8$lambda$S7Oh0YAlT-hKLuXLgs2djCsEnlE, reason: not valid java name */
    public static /* synthetic */ djy m18$r8$lambda$S7Oh0YAlThKLuXLgs2djCsEnlE(InAppTrainerImpl inAppTrainerImpl) {
        djy djyVarI;
        Context applicationContext = inAppTrainerImpl.e.getApplicationContext();
        try {
            cbq cbqVarB = cbq.b(applicationContext);
            try {
                bqm bqmVar = (bqm) cbqVarB.c(bqm.class);
                bpz bpzVar = (bpz) cbqVarB.c(bpz.class);
                if (inAppTrainerImpl.a(bqmVar, bpzVar)) {
                    djyVarI = cnx.C(new Status(17, "InAppTraining API not enabled!"));
                    if (cbqVarB != null) {
                    }
                    return djyVarI;
                }
                if (b(bqmVar, bpzVar, inAppTrainerImpl.h)) {
                    djyVarI = cnx.C(new Status(17, "InApp Personalization is not enabled."));
                    if (cbqVarB == null) {
                        return djyVarI;
                    }
                } else {
                    Bundle bundle = inAppTrainerImpl.h.l;
                    if (bundle == null || bundle.size() == 0 || bpzVar.bt()) {
                        bqmVar.k(ccj.aF);
                        byte[] bArr = null;
                        cbq cbqVarB2 = bpzVar.aS() ? cbq.b(applicationContext) : null;
                        bxh bxhVar = (bxh) cbqVarB.c(bxh.class);
                        int i = 8;
                        djyVarI = dhq.i(dhq.i(dhq.i(dij.i(djr.q(bxhVar.e(inAppTrainerImpl.h)), new ayn(inAppTrainerImpl, bxhVar, i), diy.a), bxf.class, new ayn(inAppTrainerImpl, bxhVar, 9), diy.a), IOException.class, new ayn(inAppTrainerImpl, bxhVar, 10), diy.a), RuntimeException.class, new btk(inAppTrainerImpl, bxhVar, bpzVar, applicationContext, 1), diy.a);
                        ((dif) djyVarI).c(new bks(cbqVarB2, i, bArr), inAppTrainerImpl.f);
                        if (cbqVarB == null) {
                            return djyVarI;
                        }
                    } else {
                        bqmVar.k(ccj.dJ);
                        djyVarI = cnx.C(new Status(17, "Local computation with multiple input resources is not enabled."));
                        if (cbqVarB == null) {
                            return djyVarI;
                        }
                    }
                }
                cbqVarB.close();
                return djyVarI;
            } finally {
            }
        } catch (Throwable th) {
            bnb.a(applicationContext, th);
            throw th;
        }
    }

    public static /* synthetic */ Status $r8$lambda$YlO8MyQP7SrPfvT1vOUSdP_YKBc(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, bxf bxfVar) {
        bxhVar.m(dfg.b, cru.d(dfi.ERROR_REASON_JOB_SCHEDULER), cru.d(inAppTrainerImpl.h));
        return new Status(8, "JobScheduler returned failure");
    }

    /* renamed from: $r8$lambda$la1LnQIx2Jdc3-Ai9gU7LAtJkuk, reason: not valid java name */
    public static /* synthetic */ Status m19$r8$lambda$la1LnQIx2Jdc3Ai9gU7LAtJkuk(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, bpz bpzVar, Context context, RuntimeException runtimeException) {
        bxhVar.m(dfg.b, cru.d(dfi.ERROR_REASON_RUNTIME_EXCEPTION), cru.d(inAppTrainerImpl.h));
        if (!bpzVar.bo()) {
            throw runtimeException;
        }
        bnb.a(context, runtimeException);
        throw runtimeException;
    }

    /* renamed from: $r8$lambda$nXLQM9aoMYeviY1aLxC-hFHUC6E, reason: not valid java name */
    public static /* synthetic */ Status m20$r8$lambda$nXLQM9aoMYeviY1aLxChFHUC6E(InAppTrainerImpl inAppTrainerImpl, bxh bxhVar, Void r3) {
        bxhVar.m(dfg.b, crd.a, cru.d(inAppTrainerImpl.h));
        return Status.a;
    }

    public static /* synthetic */ djy $r8$lambda$poFBky4XYIfHtirXo9fhijCnZIs(InAppTrainerImpl inAppTrainerImpl) {
        djy djyVarI;
        Context applicationContext = inAppTrainerImpl.e.getApplicationContext();
        try {
            cbq cbqVarB = cbq.b(applicationContext);
            try {
                bqm bqmVar = (bqm) cbqVarB.c(bqm.class);
                bpz bpzVar = (bpz) cbqVarB.c(bpz.class);
                if (inAppTrainerImpl.a(bqmVar, bpzVar)) {
                    djyVarI = cnx.C(new Status(17, "InAppTraining API not enabled!"));
                    if (cbqVarB != null) {
                    }
                    return djyVarI;
                }
                bqmVar.k(ccj.aG);
                byte[] bArr = null;
                cbq cbqVarB2 = bpzVar.aS() ? cbq.b(applicationContext) : null;
                bxh bxhVar = (bxh) cbqVarB.c(bxh.class);
                djyVarI = dhq.i(dhq.i(dij.i(djr.q(bxhVar.f(inAppTrainerImpl.g)), new ayn(inAppTrainerImpl, bxhVar, 6), diy.a), IOException.class, new ayn(inAppTrainerImpl, bxhVar, 7), diy.a), RuntimeException.class, new btk(inAppTrainerImpl, bxhVar, bpzVar, applicationContext, 0), diy.a);
                ((dif) djyVarI).c(new bks(cbqVarB2, 9, bArr), inAppTrainerImpl.f);
                if (cbqVarB == null) {
                    return djyVarI;
                }
                cbqVarB.close();
                return djyVarI;
            } finally {
            }
        } catch (Throwable th) {
            bnb.a(applicationContext, th);
            throw th;
        }
    }

    private final boolean a(bqm bqmVar, bpz bpzVar) {
        if (bpzVar.aY(this.e.getApplicationContext().getPackageName())) {
            return false;
        }
        bqmVar.k(ccj.cM);
        return true;
    }

    private static boolean b(bqm bqmVar, bpz bpzVar, bqg bqgVar) {
        if (bqgVar.f == null || bpzVar.aM()) {
            return false;
        }
        bqmVar.k(ccj.dm);
        return true;
    }

    @Override // defpackage.bvx
    public boolean initV26(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initW24(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initW24(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initY2020W18(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initY2020W18(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initY2020W30(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initY2020W30(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initY2020W36(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initY2020W36(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initY2021W30(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initY2021W30(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initY2022W24(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initY2022W24(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        return initY2023W12(bpfVar, bpfVar2, bqgVar, bkjVar);
    }

    @Override // defpackage.bvx
    public boolean initY2023W12(bpf bpfVar, bpf bpfVar2, bqg bqgVar, bkj bkjVar) {
        this.e = (Context) bpe.a(bpfVar);
        try {
            if (clq.O(bqgVar.a)) {
                bcp.c(bkjVar, new Status(10, "Invalid session name"), b);
                return true;
            }
            if (bqgVar.b == 0) {
                bcp.c(bkjVar, new Status(10, "Invalid job ID"), b);
                return true;
            }
            if (bqgVar.f == null && clq.O(bqgVar.d)) {
                bcp.c(bkjVar, new Status(10, "Missing population name or plan URI"), b);
                return true;
            }
            if (bqgVar.f != null) {
                if (!clq.O(bqgVar.d)) {
                    bcp.c(bkjVar, new Status(10, "Cannot set options for both federation and local computation"), b);
                    return true;
                }
                if (bqgVar.k == null && bqgVar.l.isEmpty()) {
                    bcp.c(bkjVar, new Status(10, "Missing input directory"), b);
                    return true;
                }
                if (bqgVar.i == null) {
                    bcp.c(bkjVar, new Status(10, "Missing output directory"), b);
                    return true;
                }
                if (bqgVar.j == null) {
                    bcp.c(bkjVar, new Status(10, "Missing training interval"), b);
                    return true;
                }
            }
            this.f = (Executor) bpe.a(bpfVar2);
            this.h = bqgVar;
            this.g = bqgVar.a;
            bcp.d(new btl(this, 2), bkjVar, this.f, b, this.e);
            return true;
        } catch (Error | RuntimeException e) {
            bnb.a(this.e, e);
            throw e;
        }
    }

    @Override // defpackage.bvx
    public void start(int i, bkj bkjVar) {
        bcp.d(new btl(this, 3), bkjVar, this.f, b, this.e);
    }

    @Override // defpackage.bvx
    public void stop(bkj bkjVar) {
        bcp.d(new btl(this, 0), bkjVar, this.f, b, this.e);
    }
}
