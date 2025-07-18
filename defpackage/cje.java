package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cje implements dir {
    public final /* synthetic */ djy a;
    public final /* synthetic */ dis b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ cje(Object obj, djy djyVar, dis disVar, Executor executor, int i) {
        this.e = i;
        this.d = obj;
        this.a = djyVar;
        this.b = disVar;
        this.c = executor;
    }

    @Override // defpackage.dir
    public final djy a() {
        if (this.e == 0) {
            Executor executor = this.c;
            return dij.j(this.a, cqt.b(new cgn(this.d, this.b, executor, 3)), diy.a);
        }
        Object obj = this.d;
        bbk bbkVar = new bbk(obj, 12);
        Executor executor2 = this.c;
        dis disVar = this.b;
        djy djyVarJ = dij.j(this.a, bbkVar, diy.a);
        djy djyVarJ2 = dij.j(djyVarJ, disVar, executor2);
        return dij.j(djyVarJ2, cqt.b(new cgn(obj, djyVarJ, djyVarJ2, 2)), diy.a);
    }
}
