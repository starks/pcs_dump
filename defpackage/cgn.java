package defpackage;

import android.content.Context;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgn implements dis {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ cgn(bbq bbqVar, bbn bbnVar, bbc bbcVar, int i) {
        this.d = i;
        this.b = bbqVar;
        this.a = bbnVar;
        this.c = bbcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v17, types: [dis, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r10v15, types: [dis, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bbn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [djy, java.lang.Object, java.util.concurrent.Future] */
    @Override // defpackage.dis
    public final djy a(Object obj) throws GeneralSecurityException, IOException {
        String string;
        int i = this.d;
        if (i != 0) {
            int i2 = 3;
            if (i == 1) {
                csd csdVar = (csd) obj;
                String strA = this.a.a(csdVar.k());
                bbq bbqVar = (bbq) this.b;
                djr djrVarQ = djr.q(bbqVar.g.a(strA));
                Object obj2 = this.c;
                byte[] bArr = null;
                return dhq.i(dij.i(djrVarQ, new ayn(obj2, csdVar, i2, bArr), bbqVar.d), Exception.class, new ayn(obj2, csdVar, 4, bArr), bbqVar.d);
            }
            if (i != 2) {
                if (i == 3) {
                    ?? r11 = this.b;
                    return ((cjg) this.c).e.d(this.a, r11);
                }
                return ((cjg) ((fuu) this.c).a).e.d(this.a, this.b);
            }
            ?? r0 = this.a;
            ?? r1 = this.b;
            boolean zEquals = cnx.H(r0).equals(cnx.H(r1));
            Object obj3 = this.c;
            if (zEquals) {
                return cnx.C(obj);
            }
            dis disVarB = cqt.b(new aqf(obj3, r1, 9));
            cjd cjdVar = (cjd) obj3;
            djy djyVarJ = dij.j(r1, disVarB, cjdVar.c);
            synchronized (cjdVar.e) {
            }
            return djyVarJ;
        }
        List listQ = (List) obj;
        cgg cggVar = (cgg) this.a;
        if (!cggVar.e) {
            listQ = cxc.q("");
        }
        int i3 = cxc.d;
        cwy cwyVar = new cwy();
        Iterator it = listQ.iterator();
        while (true) {
            Object obj4 = this.c;
            if (!it.hasNext()) {
                return cnx.L(cwyVar.g()).a(new chh(1), ((cem) obj4).c());
            }
            Object obj5 = this.b;
            String str = (String) it.next();
            fuu fuuVar = cgp.a;
            if (fuuVar == null || !fuuVar.n((String) obj5, str)) {
                cem cemVar = (cem) obj4;
                chc chcVar = new chc(cemVar, (String) obj5, str, cggVar.c);
                if (cggVar.d) {
                    Context context = cemVar.c;
                    string = clq.q(context).getString(cggVar.a, "");
                } else {
                    string = str;
                }
                djy djyVarB = chcVar.b(string);
                cwyVar.h(dij.j(dij.j(djr.q(djyVarB), new bbk(chcVar, 6), cemVar.c()), new cgo(cemVar, djyVarB, cggVar, str, 1), cemVar.c()));
            }
        }
    }

    public /* synthetic */ cgn(cgg cggVar, String str, cem cemVar, int i) {
        this.d = i;
        this.a = cggVar;
        this.b = str;
        this.c = cemVar;
    }

    public /* synthetic */ cgn(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
