package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class fss implements fwf {
    public boolean a;
    final /* synthetic */ fsy b;
    private final fvq c;

    public fss(fsy fsyVar) {
        this.b = fsyVar;
        this.c = new fvq(fsyVar.c.a());
    }

    @Override // defpackage.fwf
    public final fwh a() {
        return this.c;
    }

    @Override // defpackage.fwf
    public long b(fvk fvkVar, long j) throws IOException {
        try {
            return this.b.c.b(fvkVar, j);
        } catch (IOException e) {
            this.b.b.e();
            this.c();
            throw e;
        }
    }

    public final void c() {
        int i = this.b.e;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException(a.x(i, "state: "));
        }
        fsy.l(this.c);
        this.b.e = 6;
    }

    protected final void d() {
        this.a = true;
    }
}
