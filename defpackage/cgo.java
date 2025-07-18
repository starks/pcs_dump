package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgo implements dis {
    public final /* synthetic */ String a;
    public final /* synthetic */ cgg b;
    public final /* synthetic */ cem c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ cgo(cem cemVar, djy djyVar, cgg cggVar, String str, int i) {
        this.e = i;
        this.c = cemVar;
        this.d = djyVar;
        this.b = cggVar;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.dis
    public final djy a(Object obj) {
        if (this.e != 0) {
            chd chdVar = (chd) cnx.H(this.d);
            if (chdVar.c.isEmpty()) {
                return dju.a;
            }
            String str = this.a;
            cgg cggVar = this.b;
            cem cemVar = this.c;
            return dij.j(djr.q(dij.i(djr.q(cgi.b(cemVar).a()), new arl(cggVar.a, 16), cemVar.c())), new cgo(str, cggVar, cemVar, chdVar, 0), cemVar.c());
        }
        String str2 = this.a;
        if (!((String) obj).equals(str2)) {
            return dju.a;
        }
        fuu fuuVar = cgp.a;
        if (fuuVar != null && fuuVar.n(this.b.a, str2)) {
            return dju.a;
        }
        return this.c.f().v(((chd) this.d).c);
    }

    public /* synthetic */ cgo(String str, cgg cggVar, cem cemVar, chd chdVar, int i) {
        this.e = i;
        this.a = str;
        this.b = cggVar;
        this.c = cemVar;
        this.d = chdVar;
    }
}
