package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byx extends akh implements byy {
    final /* synthetic */ bkl a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public byx(bkl bklVar) {
        this();
        this.a = bklVar;
    }

    public final void a(byte[] bArr) {
        fuu fuuVar = new fuu(bArr, null);
        bkl bklVar = this.a;
        bklVar.a.execute(new bkd(bklVar, fuuVar, 2));
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        a(bArrCreateByteArray);
        return true;
    }

    public byx() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }
}
