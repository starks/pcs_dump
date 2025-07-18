package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class app extends akh implements apq {
    private final bqc a;

    public app(bqc bqcVar) {
        this();
        this.a = bqcVar;
    }

    public final void a(int i, String str) {
        this.a.a(i, str);
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        this.a.b(bArr, bArr2);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            b(bArrCreateByteArray, bArrCreateByteArray2);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = parcel.readInt();
            String string = parcel.readString();
            enforceNoDataAvail(parcel);
            a(i3, string);
        }
        parcel2.writeNoException();
        return true;
    }

    public app() {
        super("com.google.android.apps.miphone.astrea.fl.brella.api.IExampleStoreIteratorCallback");
    }
}
