package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbm implements djj {
    final /* synthetic */ djy a;
    final /* synthetic */ brb b;
    final /* synthetic */ brb c;

    public cbm(brb brbVar, djy djyVar, brb brbVar2) {
        this.b = brbVar;
        this.a = djyVar;
        this.c = brbVar2;
    }

    @Override // defpackage.djj
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            ((brb) this.c.a).G();
        } else if (th instanceof Exception) {
            this.b.C((Exception) th);
        } else {
            this.b.C(new ExecutionException(th));
        }
    }

    @Override // defpackage.djj
    public final void b(Object obj) {
        this.b.D(obj);
    }
}
