package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjf implements dir {
    public List a;
    public final /* synthetic */ cjg b;

    public cjf(cjg cjgVar) {
        this.b = cjgVar;
    }

    @Override // defpackage.dir
    public final djy a() {
        cqg cqgVarZ = clq.Z("Initialize ".concat(String.valueOf(this.b.a)), 1);
        try {
            synchronized (this.b.c) {
                if (this.a == null) {
                    cjg cjgVar = this.b;
                    this.a = cjgVar.d;
                    cjgVar.d = Collections.EMPTY_LIST;
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            fuu fuuVar = new fuu(this.b, null);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((dis) it.next()).a(fuuVar));
                } catch (Exception e) {
                    arrayList.add(cnx.B(e));
                }
            }
            djy djyVarA = cnx.M(arrayList).a(new bcv(this, 3), diy.a);
            cqgVarZ.a(djyVarA);
            cqgVarZ.close();
            return djyVarA;
        } catch (Throwable th) {
            try {
                cqgVarZ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
