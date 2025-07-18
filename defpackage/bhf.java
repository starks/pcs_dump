package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bhf extends akh implements bhg {
    public bhf(byte[] bArr) {
        this();
    }

    public static void c() {
        throw new UnsupportedOperationException();
    }

    public static void d() {
        throw new UnsupportedOperationException();
    }

    public static void e() {
        throw new UnsupportedOperationException();
    }

    public static void f() {
        throw new UnsupportedOperationException();
    }

    public static void g() {
        throw new UnsupportedOperationException();
    }

    public static void h() {
        throw new UnsupportedOperationException();
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Status status = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                b(status);
                return true;
            case 2:
                enforceNoDataAvail(parcel);
                c();
                return true;
            case 3:
                parcel.readLong();
                enforceNoDataAvail(parcel);
                g();
                return true;
            case 4:
                enforceNoDataAvail(parcel);
                h();
                return true;
            case 5:
                parcel.readLong();
                enforceNoDataAvail(parcel);
                d();
                return true;
            case 6:
                enforceNoDataAvail(parcel);
                e();
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                f();
                return true;
            case 8:
                Status status2 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                a(status2);
                return true;
            default:
                return false;
        }
    }

    public bhf() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }
}
