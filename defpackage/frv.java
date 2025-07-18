package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frv extends fvj {
    final /* synthetic */ frw a;

    public frv(frw frwVar) {
        this.a = frwVar;
    }

    @Override // defpackage.fvj
    protected final void a() throws IOException {
        frw frwVar = this.a;
        if (frwVar.l) {
            return;
        }
        frwVar.l = true;
        frs frsVar = frwVar.m;
        if (frsVar != null) {
            frsVar.c.e();
        }
        frz frzVar = frwVar.n;
        if (frzVar != null) {
            frzVar.b();
        }
    }
}
