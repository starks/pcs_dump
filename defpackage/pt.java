package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pt extends ps {
    public int m;

    public pt(qa qaVar, byte[] bArr) {
        this(qaVar);
    }

    @Override // defpackage.ps
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        for (pq pqVar : this.j) {
            pqVar.e(pqVar);
        }
    }

    public pt(qa qaVar) {
        super(qaVar);
        this.l = qaVar instanceof px ? 2 : 3;
    }
}
