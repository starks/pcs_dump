package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class div extends diw {
    final /* synthetic */ dix a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public div(dix dixVar, Callable callable, Executor executor) {
        super(dixVar, executor);
        this.a = dixVar;
        this.c = callable;
    }

    @Override // defpackage.djw
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.djw
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.diw
    public final void c(Object obj) {
        this.a.d(obj);
    }
}
