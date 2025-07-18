package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bvn extends akh implements bvo {
    public bvn() {
        super("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                boolean zD = d();
                parcel2.writeNoException();
                int i3 = aki.a;
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case 2:
                String string = parcel.readString();
                enforceNoDataAvail(parcel);
                bpf bpfVarA = a(string);
                parcel2.writeNoException();
                aki.d(parcel2, bpfVarA);
                return true;
            case 3:
                parcel2.writeNoException();
                int i4 = aki.a;
                parcel2.writeInt(1);
                return true;
            case 4:
                parcel2.writeNoException();
                int i5 = aki.a;
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel2.writeNoException();
                int i6 = aki.a;
                parcel2.writeInt(0);
                return true;
            case 6:
                boolean zE = aki.e(parcel);
                enforceNoDataAvail(parcel);
                b(zE);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
