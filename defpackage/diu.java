package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class diu extends diw {
    final /* synthetic */ dix a;
    private final dir c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diu(dix dixVar, dir dirVar, Executor executor) {
        super(dixVar, executor);
        this.a = dixVar;
        this.c = dirVar;
    }

    @Override // defpackage.djw
    public final /* bridge */ /* synthetic */ Object a() {
        djy djyVarA = this.c.a();
        djyVarA.getClass();
        return djyVarA;
    }

    @Override // defpackage.djw
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.diw
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.f((djy) obj);
    }
}
