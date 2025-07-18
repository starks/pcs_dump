package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftw implements fsj {
    private final frz d;
    private final fsm e;
    private final ftv f;
    private volatile fuc g;
    private final fqv h;
    private volatile boolean i;
    public static final fwv c = new fwv();
    public static final List a = frh.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List b = frh.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    public ftw(fqu fquVar, frz frzVar, fsm fsmVar, ftv ftvVar) {
        this.d = frzVar;
        this.e = fsmVar;
        this.f = ftvVar;
        this.h = fquVar.q.contains(fqv.e) ? fqv.e : fqv.d;
    }

    @Override // defpackage.fsj
    public final long a(frb frbVar) {
        if (fsk.b(frbVar)) {
            return frh.i(frbVar);
        }
        return 0L;
    }

    @Override // defpackage.fsj
    public final fra b(boolean z) throws NumberFormatException, IOException {
        fuc fucVar = this.g;
        if (fucVar == null) {
            throw new IOException("stream wasn't created");
        }
        fqv fqvVar = this.h;
        fqo fqoVarA = fucVar.a();
        fqvVar.getClass();
        fsc fscVar = new fsc((byte[]) null);
        int iA = fqoVarA.a();
        fsq fsqVarV = null;
        for (int i = 0; i < iA; i++) {
            String strC = fqoVarA.c(i);
            String strD = fqoVarA.d(i);
            if (fjs.c(strC, ":status")) {
                fsqVarV = fwv.v("HTTP/1.1 ".concat(String.valueOf(strD)));
            } else if (!b.contains(strC)) {
                fscVar.j(strC, strD);
            }
        }
        if (fsqVarV == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        fra fraVarD = new fra().d(fqvVar);
        fraVarD.a = fsqVarV.b;
        fraVarD.b = fsqVarV.c;
        fra fraVarB = fraVarD.b(fscVar.h());
        if (z && fraVarB.a == 100) {
            return null;
        }
        return fraVarB;
    }

    @Override // defpackage.fsj
    public final frz c() {
        return this.d;
    }

    @Override // defpackage.fsj
    public final fwf d(frb frbVar) {
        fuc fucVar = this.g;
        fucVar.getClass();
        return fucVar.g;
    }

    @Override // defpackage.fsj
    public final void e() {
        this.i = true;
        fuc fucVar = this.g;
        if (fucVar != null) {
            fucVar.h(fta.i);
        }
    }

    @Override // defpackage.fsj
    public final void f() {
        fuc fucVar = this.g;
        fucVar.getClass();
        fucVar.c().close();
    }

    @Override // defpackage.fsj
    public final void g() {
        this.f.e();
    }

    @Override // defpackage.fsj
    public final void h(fqx fqxVar) throws IOException {
        int i;
        fuc fucVar;
        boolean z;
        if (this.g == null) {
            boolean z2 = fqxVar.d != null;
            fqo fqoVar = fqxVar.c;
            ArrayList arrayList = new ArrayList(fqoVar.a() + 4);
            arrayList.add(new ftb(ftb.c, fqxVar.b));
            arrayList.add(new ftb(ftb.d, fso.a(fqxVar.a)));
            String strA = fqxVar.a("Host");
            if (strA != null) {
                arrayList.add(new ftb(ftb.f, strA));
            }
            arrayList.add(new ftb(ftb.e, fqxVar.a.b));
            int iA = fqoVar.a();
            for (int i2 = 0; i2 < iA; i2++) {
                String strC = fqoVar.c(i2);
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = strC.toLowerCase(locale);
                lowerCase.getClass();
                if (!a.contains(lowerCase) || (fjs.c(lowerCase, "te") && fjs.c(fqoVar.d(i2), "trailers"))) {
                    arrayList.add(new ftb(lowerCase, fqoVar.d(i2)));
                }
            }
            ftv ftvVar = this.f;
            boolean z3 = !z2;
            synchronized (ftvVar.w) {
                synchronized (ftvVar) {
                    if (ftvVar.g > 1073741823) {
                        ftvVar.f(fta.h);
                    }
                    if (ftvVar.h) {
                        throw new fsz();
                    }
                    i = ftvVar.g;
                    ftvVar.g = i + 2;
                    fucVar = new fuc(i, ftvVar, z3, false, null);
                    z = !z2 || ftvVar.u >= ftvVar.v || fucVar.e >= fucVar.f;
                    if (fucVar.m()) {
                        ftvVar.d.put(Integer.valueOf(i), fucVar);
                    }
                }
                ftvVar.w.f(z3, i, arrayList);
            }
            if (z) {
                ftvVar.w.d();
            }
            this.g = fucVar;
            if (this.i) {
                fuc fucVar2 = this.g;
                fucVar2.getClass();
                fucVar2.h(fta.i);
                throw new IOException("Canceled");
            }
            fuc fucVar3 = this.g;
            fucVar3.getClass();
            fucVar3.i.k(this.e.e, TimeUnit.MILLISECONDS);
            fuc fucVar4 = this.g;
            fucVar4.getClass();
            fucVar4.j.k(this.e.f, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.fsj
    public final fwd i(fqx fqxVar) {
        fuc fucVar = this.g;
        fucVar.getClass();
        return fucVar.c();
    }
}
