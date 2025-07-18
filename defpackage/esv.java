package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class esv implements fbi {
    public static final Logger d = Logger.getLogger(esv.class.getName());

    protected abstract esu a();

    protected abstract evn b();

    @Override // defpackage.fbi
    public final void f() {
        if (b().e()) {
            return;
        }
        b().b();
    }

    @Override // defpackage.fbi
    public final void g() {
        esu esuVarA = a();
        eya eyaVar = esuVarA.d;
        eyaVar.a = esuVarA;
        esuVarA.a = eyaVar;
    }

    @Override // defpackage.fbi
    public final void h(int i) {
        esu esuVarA = a();
        eul eulVar = esuVarA.a;
        esuVarA.j(new bdq(esuVarA, ffg.b(), i, 4));
    }

    @Override // defpackage.fbi
    public final void i(eme emeVar) {
        b().f(emeVar);
    }

    @Override // defpackage.fbi
    public final void k(InputStream inputStream) throws IOException {
        try {
            if (!b().e()) {
                b().d(inputStream);
            }
        } finally {
            evt.g(inputStream);
        }
    }

    @Override // defpackage.fbi
    public boolean l() {
        return a().d();
    }

    public final void t(int i) {
        esu esuVarA = a();
        synchronized (esuVarA.b) {
            esuVarA.e += i;
        }
    }
}
