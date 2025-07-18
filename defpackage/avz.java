package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avz implements avw {
    private final /* synthetic */ int a;

    public avz(int i) {
        this.a = i;
    }

    public static boolean b(aww awwVar) {
        return aux.a.contains(awwVar.a().b());
    }

    @Override // defpackage.avw
    public final cxc a(cxc cxcVar) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                Stream map = Collection.EL.stream(dcr.o(cxcVar, new avf(3)).j().values()).map(new akn(this, 6));
                int i2 = cxc.d;
                return (cxc) map.collect(cvu.a);
            }
            Stream streamFilter = Collection.EL.stream(cxcVar).filter(new ari(2));
            int i3 = cxc.d;
            return (cxc) streamFilter.collect(cvu.a);
        }
        Stream streamFilter2 = Collection.EL.stream(cxcVar).filter(new ari(3));
        int i4 = cxc.d;
        cxc cxcVar2 = (cxc) streamFilter2.collect(cvu.a);
        cxc cxcVar3 = (cxc) Collection.EL.stream(cxcVar).filter(new ari(4)).collect(cvu.a);
        cwy cwyVar = new cwy();
        Iterable$EL.forEach(cxcVar3, new awp(cwyVar, 1));
        cxc cxcVar4 = (cxc) Collection.EL.stream(dcr.o(cwyVar.g(), new avf(2)).j().values()).map(new alg(9)).collect(cvu.a);
        cwy cwyVar2 = new cwy();
        cwyVar2.j(cxcVar4);
        cwyVar2.j(cxcVar2);
        return cwyVar2.g();
    }
}
