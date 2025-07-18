package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exe extends fjp {
    final exd a;
    final epo b;
    final /* synthetic */ exm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exe(exm exmVar, exd exdVar, epo epoVar) {
        super((char[]) null);
        this.c = exmVar;
        this.a = exdVar;
        epoVar.getClass();
        this.b = epoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x021b  */
    @Override // defpackage.fjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqo T(defpackage.epm r18) throws defpackage.etf {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exe.T(epm):eqo");
    }

    public final void h(eqo eqoVar) {
        exm.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.h, eqoVar});
        exi exiVar = this.c.I;
        if (exiVar.a.get() == exm.e) {
            exm exmVar = exiVar.c;
            exiVar.d(null);
        }
        if (this.c.S != 3) {
            this.c.G.b(3, "Failed to resolve name: {0}", eqoVar);
            this.c.S = 3;
        }
        exd exdVar = this.a;
        if (exdVar != this.c.t) {
            return;
        }
        exdVar.a.b.b(eqoVar);
    }
}
