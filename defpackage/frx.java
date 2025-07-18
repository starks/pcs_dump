package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class frx implements fin {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ frx(fqc fqcVar, fqn fqnVar, fpw fpwVar, int i) {
        this.d = i;
        this.a = fqcVar;
        this.b = fqnVar;
        this.c = fpwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.fin
    public final Object a() {
        if (this.d == 0) {
            int i = frz.l;
            fvc fvcVar = ((fqc) this.a).c;
            fvcVar.getClass();
            return fvcVar.a(((fqn) this.b).a(), ((fpw) this.c).h.c);
        }
        fvc fvcVar2 = ((fqc) this.b).c;
        ?? r1 = this.a;
        List<Certificate> listA = r1;
        if (fvcVar2 != 0) {
            listA = fvcVar2.a(r1, (String) this.c);
        }
        ArrayList arrayList = new ArrayList(ffh.Q(listA));
        for (Certificate certificate : listA) {
            certificate.getClass();
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public /* synthetic */ frx(fqc fqcVar, List list, String str, int i) {
        this.d = i;
        this.b = fqcVar;
        this.a = list;
        this.c = str;
    }
}
