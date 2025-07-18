package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fki extends fkh {
    public static final fjz f = new fjz();
    public static final fki e = new fki(1, 0);

    public fki(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.fkh
    public final boolean a() {
        return this.a > this.b;
    }

    @Override // defpackage.fkh
    public final boolean equals(Object obj) {
        if (obj instanceof fki) {
            if (a() && ((fki) obj).a()) {
                return true;
            }
            fki fkiVar = (fki) obj;
            return this.a == fkiVar.a && this.b == fkiVar.b;
        }
        return false;
    }

    @Override // defpackage.fkh
    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.fkh
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
