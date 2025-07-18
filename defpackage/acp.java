package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acp implements fin {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ acp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [fin, java.lang.Object] */
    @Override // defpackage.fin
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            return ffz.a;
        }
        boolean z = true;
        if (i == 1) {
            return ffz.a;
        }
        if (i == 2) {
            acs acsVar = (acs) this.a;
            if (acsVar.a.i() && !acsVar.a.j()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i == 3) {
            afo afoVar = (afo) this.a;
            afn afnVar = new afn(afoVar.a, afoVar.b, new ekb((byte[]) null, (char[]) null, (byte[]) null), afoVar.c);
            afnVar.setWriteAheadLoggingEnabled(afoVar.f);
            return afnVar;
        }
        if (i == 4) {
            return fqn.b(this.a);
        }
        if (i == 5) {
            return this.a;
        }
        fqn fqnVar = ((frz) this.a).d;
        fqnVar.getClass();
        List<Certificate> listA = fqnVar.a();
        ArrayList arrayList = new ArrayList(ffh.Q(listA));
        for (Certificate certificate : listA) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
