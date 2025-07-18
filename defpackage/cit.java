package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cit implements dis {
    public final List a;
    public final Executor b;

    public cit(List list, Executor executor) {
        this.a = list;
        this.b = executor;
    }

    @Override // defpackage.dis
    public final /* bridge */ /* synthetic */ djy a(Object obj) {
        fuu fuuVar = (fuu) obj;
        int i = ((cyp) this.a).c;
        ArrayList arrayList = new ArrayList(i);
        czd it = ((cxc) this.a).iterator();
        while (it.hasNext()) {
            arrayList.add(((ciq) it.next()).b());
        }
        return dij.j(fuuVar.m(cqt.b(new cis(this, arrayList, i, 1)), diy.a), cqt.b(new cis(this, i, arrayList, 0)), diy.a);
    }
}
