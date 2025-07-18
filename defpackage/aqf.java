package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.system.virtualmachine.VirtualMachine;
import android.util.Log;
import com.google.android.apps.miphone.astrea.fl.brella.service.AstreaResultHandlingService;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aqf implements dis {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aqf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [bbn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v31, types: [djy, java.lang.Object] */
    @Override // defpackage.dis
    public final djy a(Object obj) throws IOException {
        cpi cphVar = null;
        boolean zA = true;
        switch (this.c) {
            case 0:
                return ((AstreaResultHandlingService) this.a).h.b((String) this.b);
            case 1:
                return ((anj) this.b).a((and) this.a, (ebn) obj);
            case 2:
                return ((aqq) this.b).c.b((and) this.a);
            case 3:
                return ((bbq) this.b).c((bbc) obj, this.a, false);
            case 4:
                bbo bboVar = (bbo) this.a;
                ((bbq) this.b).i.b(bboVar.d(), 2, bboVar.a());
                return cnx.B((Exception) obj);
            case 5:
                ((bbq) this.a).i.b((String) this.b, 2, 0);
                return cnx.B((Exception) obj);
            case 6:
                bbc bbcVar = (bbc) obj;
                IBinder iBinderConnectToVsockServer = ((VirtualMachine) this.a).connectToVsockServer(1688L);
                if (iBinderConnectToVsockServer != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderConnectToVsockServer.queryLocalInterface("com.google.android.pd.ISecureService");
                    cphVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof cpi)) ? new cph(iBinderConnectToVsockServer) : (cpi) iInterfaceQueryLocalInterface;
                }
                byte[] bArrA = cphVar.a();
                asr asrVar = (asr) bbcVar.toBuilder();
                eea eeaVarR = eea.r(bArrA);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                Object obj2 = this.b;
                bbc bbcVar2 = (bbc) asrVar.a;
                bbcVar2.b |= 1;
                bbcVar2.c = eeaVarR;
                return ((bcy) obj2).d.e("VM_CLIENT", (bbc) asrVar.z());
            case 7:
                bgf bgfVar = (bgf) obj;
                ?? r0 = this.b;
                if (bgfVar != null) {
                    return r0;
                }
                djy djyVar = ((bfx) this.a).j;
                return djyVar == null ? cnx.C(null) : djyVar;
            case 8:
                int i = cgi.a;
                int i2 = cxc.d;
                cwy cwyVar = new cwy();
                cem cemVar = (cem) this.a;
                cwyVar.h(cemVar.c);
                int i3 = cbl.a;
                cwyVar.h(cbl.a(cemVar.c));
                cxc cxcVarG = cwyVar.g();
                int i4 = ((cyp) cxcVarG).c;
                for (int i5 = 0; i5 < i4; i5++) {
                    Object obj3 = this.b;
                    File file = new File(String.valueOf(((Context) cxcVarG.get(i5)).getFilesDir()) + "/phenotype/shared/" + ((String) obj3));
                    Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
                    if (file.exists()) {
                        zA = cgi.a(file);
                    }
                }
                return zA ? dju.a : cnx.B(new IOException("Unable to remove snapshots for removed user"));
            default:
                Object obj4 = this.a;
                cjd cjdVar = (cjd) obj4;
                cjdVar.c((Uri) cnx.H(cjdVar.b), obj);
                Object obj5 = cjdVar.e;
                ?? r7 = this.b;
                synchronized (obj5) {
                    ((cjd) obj4).f = r7;
                }
                return cnx.C(obj);
        }
    }

    public /* synthetic */ aqf(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
