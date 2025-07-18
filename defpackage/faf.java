package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faf implements fax {
    public final fag a;
    private final emk b;
    private final fjp c;

    public faf(fag fagVar, fjp fjpVar, emk emkVar) {
        this.a = fagVar;
        this.c = fjpVar;
        this.b = emkVar;
        emkVar.d(new emj(this, 2), diy.a);
    }

    @Override // defpackage.fax
    public final void a(eqo eqoVar) {
        int i = ffg.a;
        ent entVar = null;
        try {
            if (eqoVar.g()) {
                this.c.c();
            } else {
                this.a.d = true;
                this.c.S();
                eqo eqoVarE = eqo.c.e("RPC cancelled");
                eox eoxVar = ens.a;
                entVar = new ent(eqoVarE);
            }
        } finally {
            this.b.j(null);
        }
    }

    @Override // defpackage.fax
    public final void b() {
        int i = ffg.a;
        if (this.a.d) {
            return;
        }
        this.c.d();
    }

    @Override // defpackage.fbk
    public final void d(fbj fbjVar) throws IOException {
        int i = ffg.a;
        if (this.a.d) {
            evt.f(fbjVar);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamA = fbjVar.a();
                if (inputStreamA == null) {
                    return;
                }
                try {
                    this.c.e(this.a.a.d.b(inputStreamA));
                    inputStreamA.close();
                } finally {
                }
            } catch (Throwable th) {
                evt.f(fbjVar);
                csk.b(th);
                throw new RuntimeException(th);
            }
        }
    }

    @Override // defpackage.fbk
    public final void e() {
        int i = ffg.a;
        if (this.a.d) {
            return;
        }
        this.c.f();
    }
}
