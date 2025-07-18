package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsy implements fsj {
    public final fqu a;
    public final frz b;
    public final fvm c;
    public final fvl d;
    public int e;
    public final fsr f;
    public fqo g;

    public fsy(fqu fquVar, frz frzVar, fvm fvmVar, fvl fvlVar) {
        this.a = fquVar;
        this.b = frzVar;
        this.c = fvmVar;
        this.d = fvlVar;
        this.f = new fsr(fvmVar);
    }

    public static final void l(fvq fvqVar) {
        fwh fwhVar = fvqVar.a;
        fvqVar.a = fwh.k;
        fwhVar.i();
        fwhVar.m();
    }

    private static final boolean m(frb frbVar) {
        return fjz.q("chunked", frb.a(frbVar, "Transfer-Encoding"));
    }

    @Override // defpackage.fsj
    public final long a(frb frbVar) {
        if (!fsk.b(frbVar)) {
            return 0L;
        }
        if (m(frbVar)) {
            return -1L;
        }
        return frh.i(frbVar);
    }

    @Override // defpackage.fsj
    public final fra b(boolean z) {
        int i = this.e;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(a.x(i, "state: "));
        }
        try {
            fsq fsqVarV = fwv.v(this.f.a());
            fra fraVarD = new fra().d(fsqVarV.a);
            fraVarD.a = fsqVarV.b;
            fraVarD.b = fsqVarV.c;
            fra fraVarB = fraVarD.b(this.f.b());
            if (z && fsqVarV.b == 100) {
                return null;
            }
            int i2 = fsqVarV.b;
            if (i2 != 100 && (i2 < 102 || i2 >= 200)) {
                this.e = 4;
                return fraVarB;
            }
            this.e = 3;
            return fraVarB;
        } catch (EOFException e) {
            fqp fqpVarG = this.b.a.a.h.g("/...");
            fqpVarG.getClass();
            fqpVarG.b = fwv.I(fqq.g, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, AIFeature.Id.JARVIS);
            fqpVarG.c = fwv.I(fqq.g, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, AIFeature.Id.JARVIS);
            throw new IOException("unexpected end of stream on ".concat(fqpVarG.a().e), e);
        }
    }

    @Override // defpackage.fsj
    public final frz c() {
        return this.b;
    }

    @Override // defpackage.fsj
    public final fwf d(frb frbVar) {
        if (!fsk.b(frbVar)) {
            return j(0L);
        }
        if (m(frbVar)) {
            fqx fqxVar = frbVar.a;
            int i = this.e;
            if (i != 4) {
                throw new IllegalStateException(a.x(i, "state: "));
            }
            fqq fqqVar = fqxVar.a;
            this.e = 5;
            return new fsu(this, fqqVar);
        }
        long jI = frh.i(frbVar);
        if (jI != -1) {
            return j(jI);
        }
        int i2 = this.e;
        if (i2 != 4) {
            throw new IllegalStateException(a.x(i2, "state: "));
        }
        this.e = 5;
        this.b.e();
        return new fsx(this);
    }

    @Override // defpackage.fsj
    public final void e() throws IOException {
        this.b.b();
    }

    @Override // defpackage.fsj
    public final void f() {
        this.d.flush();
    }

    @Override // defpackage.fsj
    public final void g() {
        this.d.flush();
    }

    @Override // defpackage.fsj
    public final void h(fqx fqxVar) {
        Proxy.Type type = this.b.a.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fqxVar.b);
        sb.append(' ');
        if (fqxVar.a.f || type != Proxy.Type.HTTP) {
            sb.append(fso.a(fqxVar.a));
        } else {
            sb.append(fqxVar.a);
        }
        sb.append(" HTTP/1.1");
        k(fqxVar.c, sb.toString());
    }

    @Override // defpackage.fsj
    public final fwd i(fqx fqxVar) {
        if (fjz.q("chunked", fqxVar.a("Transfer-Encoding"))) {
            int i = this.e;
            if (i != 1) {
                throw new IllegalStateException(a.x(i, "state: "));
            }
            this.e = 2;
            return new fst(this);
        }
        int i2 = this.e;
        if (i2 != 1) {
            throw new IllegalStateException(a.x(i2, "state: "));
        }
        this.e = 2;
        return new fsw(this);
    }

    public final fwf j(long j) {
        int i = this.e;
        if (i != 4) {
            throw new IllegalStateException(a.x(i, "state: "));
        }
        this.e = 5;
        return new fsv(this, j);
    }

    public final void k(fqo fqoVar, String str) {
        int i = this.e;
        if (i != 0) {
            throw new IllegalStateException(a.x(i, "state: "));
        }
        this.d.t(str).t("\r\n");
        int iA = fqoVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            this.d.t(fqoVar.c(i2)).t(": ").t(fqoVar.d(i2)).t("\r\n");
        }
        this.d.t("\r\n");
        this.e = 1;
    }
}
