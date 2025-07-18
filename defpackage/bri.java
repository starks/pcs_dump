package defpackage;

import android.os.RemoteException;
import com.google.android.libraries.micore.learning.base.ErrorStatusException;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bri implements dww {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ bri(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v37, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.dww, java.util.concurrent.Callable
    public final Object call() {
        StatusOr statusOr;
        int i = this.b;
        if (i == 0) {
            try {
                return ((brj) this.a).a.d();
            } catch (RemoteException e) {
                throw new brk(e);
            }
        }
        int i2 = 5;
        int i3 = 4;
        boolean z = true;
        byte[] bArr = null;
        if (i == 1) {
            Object[] objArr = (Object[]) this.a;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                brj brjVar = (brj) obj;
                arrayList.add(brjVar);
                brjVar.b.S(new bks(brjVar, i2, bArr));
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                brj brjVar2 = (brj) arrayList.get(i4);
                brjVar2.b.S(new bks(brjVar2, i3, bArr));
            }
            asr asrVar = (asr) eit.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ((eit) asrVar.a).b = 0;
            return ((eit) asrVar.z()).toByteArray();
        }
        if (i == 2) {
            Object obj2 = this.a;
            synchronized (((cct) obj2).a.b) {
                try {
                    try {
                        if (((cct) obj2).b.b()) {
                            return new StatusOr(((cct) obj2).b.a().x(), null);
                        }
                        return new StatusOr(null, new cbw(11, null));
                    } catch (ErrorStatusException e2) {
                        statusOr = new StatusOr(null, new cbw(3, e2.getMessage()));
                        return statusOr;
                    } catch (InterruptedException e3) {
                        statusOr = new StatusOr(null, new cbw(1, e3.getMessage()));
                        return statusOr;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (i == 3) {
            if (Thread.interrupted()) {
                z = false;
            } else {
                cdg cdgVar = (cdg) this.a;
                boolean zBooleanValue = ((Boolean) cdgVar.b.a()).booleanValue();
                bqm bqmVar = cdgVar.f;
                String str = cdgVar.c;
                if (zBooleanValue) {
                    bqmVar.l(ccj.j, str);
                } else {
                    cck cckVar = cdgVar.e;
                    String str2 = cdgVar.d;
                    cdm cdmVar = cdgVar.g;
                    Set setA = cdgVar.j ? cdmVar.a(cckVar, str2) : cdmVar.b(cckVar, str2);
                    if (!setA.isEmpty()) {
                        cdgVar.a.g("Interrupting training due to %s", setA);
                        uq.r(setA, str, bqmVar);
                    }
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i == 4) {
            return ((File) this.a).getPath();
        }
        if (i == 5) {
            this.a.run();
            return null;
        }
        Object[] objArr2 = (Object[]) this.a;
        ArrayList arrayList2 = new ArrayList(objArr2.length);
        for (Object obj3 : objArr2) {
            dxe dxeVar = (dxe) obj3;
            arrayList2.add(dxeVar);
            dxeVar.o();
        }
        int size2 = arrayList2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((dxe) arrayList2.get(i5)).p();
        }
        asr asrVar2 = (asr) eit.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((eit) asrVar2.a).b = 0;
        return ((eit) asrVar2.z()).toByteArray();
    }
}
