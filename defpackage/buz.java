package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buz extends akh implements bva {
    private final brj a;

    public buz(brj brjVar) {
        this();
        this.a = brjVar;
    }

    public final void a(byte[] bArr) {
        synchronized (this.a) {
            this.a.a(bArr);
        }
    }

    public final void b() {
        synchronized (this.a) {
            this.a.b();
        }
    }

    public final void c(byte[] bArr) {
        synchronized (this.a) {
            this.a.c(bArr);
        }
    }

    public final boolean d(byte[] bArr, int i, int i2) {
        boolean zD;
        synchronized (this.a) {
            zD = this.a.d(bArr, i, i2);
        }
        return zD;
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                long j = parcel.readLong();
                int[] iArrCreateIntArray = parcel.createIntArray();
                enforceNoDataAvail(parcel);
                boolean zF = f(bArrCreateByteArray, j, iArrCreateIntArray);
                parcel2.writeNoException();
                int i3 = aki.a;
                parcel2.writeInt(zF ? 1 : 0);
                parcel2.writeByteArray(bArrCreateByteArray);
                parcel2.writeIntArray(iArrCreateIntArray);
                return true;
            case 2:
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                boolean zE = e(bArrCreateByteArray2);
                parcel2.writeNoException();
                int i4 = aki.a;
                parcel2.writeInt(zE ? 1 : 0);
                return true;
            case 3:
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                c(bArrCreateByteArray3);
                parcel2.writeNoException();
                return true;
            case 4:
                byte[] bArrCreateByteArray4 = parcel.createByteArray();
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                enforceNoDataAvail(parcel);
                boolean zD = d(bArrCreateByteArray4, i5, i6);
                parcel2.writeNoException();
                int i7 = aki.a;
                parcel2.writeInt(zD ? 1 : 0);
                return true;
            case 5:
                byte[] bArrCreateByteArray5 = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                a(bArrCreateByteArray5);
                parcel2.writeNoException();
                return true;
            case 6:
                b();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    public final boolean e(byte[] bArr) {
        boolean zE;
        synchronized (this.a) {
            zE = this.a.e(bArr);
        }
        return zE;
    }

    public final boolean f(byte[] bArr, long j, int[] iArr) {
        boolean zF;
        synchronized (this.a) {
            zF = this.a.f(bArr, j, iArr);
        }
        return zF;
    }

    public buz() {
        super("com.google.android.gms.learning.internal.http.IHttpRequestCallback");
    }
}
