package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bic extends blv {
    private static final WeakReference a = new WeakReference(null);
    private WeakReference b;

    public bic(byte[] bArr) {
        super(bArr);
        this.b = a;
    }

    protected abstract byte[] a();

    @Override // defpackage.blv
    public final byte[] aU() {
        byte[] bArrA;
        synchronized (this) {
            bArrA = (byte[]) this.b.get();
            if (bArrA == null) {
                bArrA = a();
                this.b = new WeakReference(bArrA);
            }
        }
        return bArrA;
    }
}
