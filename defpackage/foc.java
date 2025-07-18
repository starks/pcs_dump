package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foc extends flk {
    public final fob b;

    public foc(fhq fhqVar) {
        super(fhqVar, true);
        this.b = new fob(this);
    }

    @Override // defpackage.flk
    protected final void j(Object obj) {
        this.b.a.d(obj);
    }

    @Override // defpackage.flk
    protected final void l(Throwable th) {
        fob fobVar = this.b;
        if (th instanceof CancellationException) {
            fobVar.a.d(new foa((CancellationException) th));
        } else if (fobVar.a.e(th)) {
            fobVar.b = true;
        }
    }
}
