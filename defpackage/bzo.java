package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bzo extends akh implements bzp {
    public bzo(byte[] bArr) {
        this();
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                enforceNoDataAvail(parcel);
                break;
            case 4:
                enforceNoDataAvail(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                enforceNoDataAvail(parcel);
                break;
            case 7:
                enforceNoDataAvail(parcel);
                break;
            case 8:
                bzv bzvVar = (bzv) aki.a(parcel, bzv.CREATOR);
                enforceNoDataAvail(parcel);
                c(bzvVar);
                break;
            case 9:
                enforceNoDataAvail(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public bzo() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void c(bzv bzvVar) {
    }
}
