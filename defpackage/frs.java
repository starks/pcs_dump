package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frs {
    public final frw a;
    public final frt b;
    public final fsj c;
    public boolean d;
    public boolean e;
    public final frz f;
    private final fqm g;

    public frs(frw frwVar, fqm fqmVar, frt frtVar, fsj fsjVar) {
        this.a = frwVar;
        this.g = fqmVar;
        this.b = frtVar;
        this.c = fsjVar;
        this.f = fsjVar.c();
    }

    public final fra a(boolean z) throws IOException {
        try {
            fra fraVarB = this.c.b(z);
            if (fraVarB != null) {
                fraVarB.h = this;
            }
            return fraVarB;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    public final void b() {
        this.c.c().e();
    }

    public final void c() {
        this.a.a(this, true, false, null);
    }

    public final void d(IOException iOException) {
        this.e = true;
        this.b.b(iOException);
        this.c.c().g(this.a, iOException);
    }

    public final IOException e(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        return this.a.a(this, z2, z, iOException);
    }
}
