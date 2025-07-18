package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fro implements fqr {
    public static final fro a = new fro();

    private fro() {
    }

    @Override // defpackage.fqr
    public final frb a(fsm fsmVar) throws IOException {
        frw frwVar = fsmVar.a;
        synchronized (frwVar) {
            if (!frwVar.k) {
                throw new IllegalStateException("released");
            }
            if (frwVar.j) {
                throw new IllegalStateException("Check failed.");
            }
            if (frwVar.i) {
                throw new IllegalStateException("Check failed.");
            }
        }
        frt frtVar = frwVar.e;
        frtVar.getClass();
        frs frsVar = new frs(frwVar, frwVar.c, frtVar, frtVar.a(frwVar.a, fsmVar));
        frwVar.h = frsVar;
        frwVar.m = frsVar;
        synchronized (frwVar) {
            frwVar.i = true;
            frwVar.j = true;
        }
        if (frwVar.l) {
            throw new IOException("Canceled");
        }
        return fsm.c(fsmVar, 0, frsVar, null, 61).b(fsmVar.c);
    }
}
