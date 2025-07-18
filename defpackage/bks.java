package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.dynamite.training.InAppTrainerImpl;
import com.google.android.gms.learning.internal.training.InAppJobService;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bks implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bks(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [bkj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v35, types: [caa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v60, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // java.lang.Runnable
    public final void run() {
        djy djyVarV;
        djy djyVarZ;
        int i = 4;
        switch (this.b) {
            case 0:
                ((bkt) this.a).f.b(new bho(4));
                return;
            case 1:
                biw biwVar = ((bkb) ((fuu) this.a).a).b;
                biwVar.i(String.valueOf(biwVar.getClass().getName()).concat(" disconnecting because it was signed out."));
                return;
            case 2:
                ((bno) this.a).b();
                return;
            case 3:
                try {
                    ((brj) this.a).a.a();
                    return;
                } catch (RemoteException e) {
                    throw new brk(e);
                }
            case 4:
                try {
                    ((brj) this.a).a.c();
                    return;
                } catch (RemoteException e2) {
                    throw new brk(e2);
                }
            case 5:
                Object obj = this.a;
                try {
                    ((brj) obj).a.b(new buz((brj) obj));
                    return;
                } catch (RemoteException e3) {
                    throw new brk(e3);
                }
            case 6:
                try {
                    this.a.a(new Status(0));
                    return;
                } catch (RemoteException e4) {
                    Log.w("ExmplStrChkngIterator", "Failed to call close IStatusCallback", e4);
                    return;
                }
            case 7:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((cbq) obj2).close();
                    return;
                }
                return;
            case 8:
                int i2 = InAppTrainerImpl.a;
                Object obj3 = this.a;
                if (obj3 != null) {
                    ((cbq) obj3).close();
                    return;
                }
                return;
            case 9:
                int i3 = InAppTrainerImpl.a;
                Object obj4 = this.a;
                if (obj4 != null) {
                    ((cbq) obj4).close();
                    return;
                }
                return;
            case 10:
                ((InAppJobService) this.a).lambda$onDestroy$0();
                return;
            case 11:
                synchronized (((bzz) this.a).a) {
                    ((bzz) this.a).b.b();
                }
                return;
            case 12:
                ((brb) this.a).E(new TimeoutException());
                return;
            case 13:
                Object obj5 = this.a;
                synchronized (((ccu) obj5).b) {
                    Iterator it = ((ccu) obj5).c.iterator();
                    while (it.hasNext()) {
                        ((bxq) it.next()).close();
                    }
                }
                return;
            case 14:
                ((ccu) this.a).close();
                return;
            case 15:
                ((cge) this.a).a();
                return;
            case 16:
                Object obj6 = this.a;
                cge cgeVar = (cge) obj6;
                egc egcVarD = cgeVar.d();
                Object obj7 = egcVarD.b;
                cgy cgyVarB = cgeVar.a.e.b(false);
                if (cgyVarB.h) {
                    String str = (String) obj7;
                    if (clq.O(str) && !cgyVarB.g) {
                        djy djyVar = dju.a;
                        return;
                    }
                    asr asrVar = (asr) cfa.a.createBuilder();
                    cez cezVarA = egcVarD.a();
                    if (!asrVar.a.isMutable()) {
                        asrVar.B();
                    }
                    cfa cfaVar = (cfa) asrVar.a;
                    cezVarA.getClass();
                    cfaVar.d = cezVarA;
                    cfaVar.b |= 2;
                    if (!clq.O(str)) {
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        cfa cfaVar2 = (cfa) asrVar.a;
                        obj7.getClass();
                        cfaVar2.b = 1 | cfaVar2.b;
                        cfaVar2.c = str;
                    }
                    if (cgyVarB.g) {
                        String str2 = cgeVar.b;
                        if (!asrVar.a.isMutable()) {
                            asrVar.B();
                        }
                        cfa cfaVar3 = (cfa) asrVar.a;
                        cfaVar3.b |= 4;
                        cfaVar3.e = str2;
                    }
                    djyVarV = cgeVar.a.f().w((cfa) asrVar.z());
                } else {
                    String str3 = (String) obj7;
                    if (clq.O(str3)) {
                        djy djyVar2 = dju.a;
                        return;
                    }
                    djyVarV = cgeVar.a.f().v(str3);
                }
                dhq.j(djyVarV, cfe.class, new bbk(obj6, i), cgeVar.a.c());
                return;
            case 17:
                Object obj8 = this.a;
                cge cgeVar2 = (cge) obj8;
                cem cemVar = cgeVar2.a;
                djy djyVarB = cgi.b(cemVar).b(new ayn(cgeVar2.b, cgeVar2.c, 12), cemVar.c());
                djyVarB.c(new cfz(obj8, djyVarB, i), cgeVar2.a.c());
                return;
            case 18:
                dwu dwuVar = dwu.FILE;
                clq clqVar = new clq();
                Object obj9 = this.a;
                cge cgeVar3 = (cge) obj9;
                cgk cgkVar = cgeVar3.a.g;
                cgm cgmVar = (cgm) cgkVar.a.a();
                if (cgmVar == null) {
                    djyVarZ = dju.a;
                } else {
                    int i4 = dwuVar.h;
                    clq.v(true);
                    int i5 = 1 << i4;
                    if ((cgkVar.c & i5) == 0) {
                        synchronized (cgkVar.d) {
                            int i6 = cgkVar.c;
                            if ((i6 & i5) == 0) {
                                cgkVar.d.add(clqVar);
                                cgkVar.c = i5 | i6;
                            }
                        }
                    }
                    djyVarZ = cgkVar.f;
                    if (djyVarZ == null) {
                        synchronized (cgkVar.e) {
                            djyVarZ = cgkVar.f;
                            if (djyVarZ == null) {
                                djyVarZ = ((brb) cgkVar.b.a()).z(new cgj(cgkVar, cgmVar));
                                cgkVar.f = djyVarZ;
                            }
                        }
                    }
                }
                djyVarZ.c(new cfz(obj9, djyVarZ, 3), cgeVar3.a.c());
                return;
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                try {
                    cnx.H(this.a);
                    return;
                } catch (ExecutionException e5) {
                    chj.b(new bks(e5, 20, null));
                    return;
                }
            default:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
        }
    }

    public /* synthetic */ bks(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
