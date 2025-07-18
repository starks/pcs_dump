package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cis implements dis {
    public final /* synthetic */ cit a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    private final /* synthetic */ int d;

    public /* synthetic */ cis(cit citVar, int i, List list, int i2) {
        this.d = i2;
        this.a = citVar;
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.dis
    public final djy a(Object obj) {
        if (this.d == 0) {
            int i = this.b;
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                if (((Boolean) cnx.H((Future) this.c.get(i2))).booleanValue()) {
                    arrayList.add(((ciq) this.a.a.get(i2)).a());
                }
            }
            return cnx.M(arrayList).a(new chh(2), diy.a);
        }
        final egi egiVar = (egi) obj;
        final List list = this.c;
        final int i3 = this.b;
        ezo ezoVarL = cnx.L(list);
        final cit citVar = this.a;
        dir dirVarA = cqt.a(new dir() { // from class: cir
            @Override // defpackage.dir
            public final djy a() {
                djy djyVarC = cnx.C(egiVar);
                for (int i4 = 0; i4 < i3; i4++) {
                    if (((Boolean) cnx.H((Future) list.get(i4))).booleanValue()) {
                        djyVarC = dij.j(djyVarC, cqt.b(new bbk((ciq) citVar.a.get(i4), 8)), diy.a);
                    }
                }
                return djyVarC;
            }
        });
        return new dix((cwu) ezoVarL.b, ezoVarL.a, citVar.b, dirVarA);
    }

    public /* synthetic */ cis(cit citVar, List list, int i, int i2) {
        this.d = i2;
        this.a = citVar;
        this.c = list;
        this.b = i;
    }
}
