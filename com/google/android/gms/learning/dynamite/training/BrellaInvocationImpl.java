package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.asr;
import defpackage.bkj;
import defpackage.bmz;
import defpackage.bpe;
import defpackage.bpf;
import defpackage.bpy;
import defpackage.bpz;
import defpackage.bqm;
import defpackage.bqt;
import defpackage.brg;
import defpackage.bsk;
import defpackage.btd;
import defpackage.bvi;
import defpackage.bvl;
import defpackage.bvo;
import defpackage.bwq;
import defpackage.bwr;
import defpackage.bwt;
import defpackage.cbq;
import defpackage.cbr;
import defpackage.cbx;
import defpackage.ccj;
import defpackage.clq;
import defpackage.cnx;
import defpackage.djz;
import defpackage.dkq;
import defpackage.uq;
import j$.util.DesugarCollections;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BrellaInvocationImpl extends bvi {
    public static final cbx a = cbr.d("brella", "InvocationImpl");
    Context c;
    btd d;
    ServiceConnection e;
    public bvl f;
    public final Object b = new Object();
    private final Map h = DesugarCollections.synchronizedMap(new HashMap());
    private final long i = new SecureRandom().nextLong();
    private final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean(false);

    public static void a(bvl bvlVar, bwr bwrVar) {
        try {
            bvlVar.a(bwrVar.toByteArray());
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e A[Catch: all -> 0x0311, TRY_LEAVE, TryCatch #27 {all -> 0x0311, blocks: (B:73:0x0186, B:75:0x018e, B:81:0x01c0, B:77:0x019e, B:80:0x01bd, B:194:0x033b, B:162:0x02ef, B:163:0x02fb), top: B:297:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c7 A[Catch: ExecutionException -> 0x029d, TimeoutException -> 0x02a4, InterruptedException -> 0x02c6, all -> 0x033d, RuntimeException -> 0x0341, TryCatch #33 {InterruptedException -> 0x02c6, ExecutionException -> 0x029d, TimeoutException -> 0x02a4, blocks: (B:82:0x01c1, B:84:0x01c7, B:85:0x01e7), top: B:320:0x01c1, outer: #35 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl] */
    /* JADX WARN: Type inference failed for: r4v10, types: [bmz] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v19, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [dki] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46, types: [int] */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.content.ServiceConnection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16, types: [bkd, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.bpz r26, final defpackage.bqm r27, defpackage.bpy r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 973
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.BrellaInvocationImpl.b(bpz, bqm, bpy):void");
    }

    private final void c(int i, bwt bwtVar) {
        btd btdVar = this.d;
        if (btdVar != null) {
            try {
                btdVar.a(this.i);
            } catch (RemoteException unused) {
            }
        }
        if (this.e != null) {
            bmz bmzVarA = bmz.a();
            Context context = this.c;
            context.getClass();
            ServiceConnection serviceConnection = this.e;
            serviceConnection.getClass();
            bmzVarA.b(context, serviceConnection);
            this.e = null;
        }
        if (this.f != null) {
            if (!this.g.get()) {
                asr asrVar = (asr) bwr.a.createBuilder();
                int i2 = i == 0 ? bwq.b : bwq.c;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ((bwr) asrVar.a).c = bwq.a(i2);
                bwr bwrVar = (bwr) asrVar.z();
                bvl bvlVar = this.f;
                bvlVar.getClass();
                a(bvlVar, bwrVar);
            }
            if (bwtVar == null) {
                bwtVar = bwt.a;
            }
            bvl bvlVar2 = this.f;
            bvlVar2.getClass();
            try {
                bvlVar2.b(bwtVar.toByteArray());
            } catch (RemoteException unused2) {
            }
            this.f = null;
        }
    }

    @Override // defpackage.bvj
    public void addHttpUrlConnectionFactory(String str, bvo bvoVar) {
        this.h.put(str, bvoVar);
    }

    @Override // defpackage.bvj
    public void cancel(bkj bkjVar) {
        this.j.set(true);
        synchronized (this.b) {
            c(1, null);
        }
        try {
            bkjVar.a(new Status(0, "Successfully cancelled."));
        } catch (RemoteException e) {
            throw new dkq(e);
        }
    }

    @Override // defpackage.bvj
    public void runInBackgroundProcess(bpf bpfVar, bpf bpfVar2, bpy bpyVar, bkj bkjVar, bvl bvlVar) {
        this.c = (Context) bpe.a(bpfVar);
        synchronized (this.b) {
            this.f = bvlVar;
        }
        djz djzVarV = cnx.v((ExecutorService) bpe.a(bpfVar2));
        brg.b();
        Context context = this.c;
        context.getClass();
        cbq cbqVarB = cbq.b(context);
        try {
            bpz bpzVar = (bpz) cbqVarB.c(bpz.class);
            bqt bqtVar = new bqt(bpzVar, (bqm) cbqVarB.c(bqm.class), this.i);
            bqtVar.k(ccj.fH);
            try {
                if (clq.O(bpyVar.a) || clq.O(bpyVar.b)) {
                    bkjVar.a(new Status(10, "Invalid BrellaInvocationOptions"));
                } else {
                    bkjVar.a(Status.a);
                }
                Context context2 = this.c;
                if (context2 != null) {
                    this.g.set(bpzVar.br(uq.u(context2.getPackageName() + "/" + bpyVar.a, bpyVar.b)));
                }
                djzVarV.execute(new bsk(this, bpzVar, bqtVar, bpyVar, 0));
                if (cbqVarB != null) {
                    cbqVarB.close();
                }
            } catch (RemoteException e) {
                throw new dkq(e);
            }
        } finally {
        }
    }
}
