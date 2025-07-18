package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fij extends fjp {
    public fij() {
        super((char[]) null);
    }

    @Override // defpackage.fjp
    public final void i(Throwable th, Throwable th2) {
        if (fii.a == null || fii.a.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.i(th, th2);
        }
    }
}
