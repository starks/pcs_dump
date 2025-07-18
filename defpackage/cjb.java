package defpackage;

import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cjb implements dir {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cjb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [djy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [btq, java.lang.Object] */
    @Override // defpackage.dir
    public final djy a() {
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            dis disVarB = cqt.b(new bbk(obj, 11));
            cjd cjdVar = (cjd) obj;
            return cnx.D(dij.j(cjdVar.b, disVarB, cjdVar.c));
        }
        if (i == 1) {
            return this.a.a();
        }
        if (i != 2) {
            return this.a;
        }
        Object obj2 = this.a;
        cjd cjdVar2 = (cjd) obj2;
        try {
            return cnx.C(((cjd) obj2).b((Uri) cnx.H(cjdVar2.b)));
        } catch (IOException e) {
            return !cjdVar2.d.c() ? cnx.B(e) : ((e instanceof chu) || (e.getCause() instanceof chu)) ? cnx.B(e) : dij.j(((brb) cjdVar2.d.a()).O(e, new brb(obj2)), cqt.b(new bbk(obj2, 10)), cjdVar2.c);
        }
    }
}
