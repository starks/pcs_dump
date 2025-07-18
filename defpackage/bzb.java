package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzb extends akh implements bzc {
    private final brb a;

    public bzb(brb brbVar) {
        this();
        this.a = brbVar;
    }

    public final void a(Status status) {
        api.e(status, this.a);
    }

    public final void b(Status status, byf byfVar) {
        api.f(status, byfVar, this.a);
    }

    public final void c(Status status) {
        api.e(status, this.a);
    }

    public final void d(Status status, byi byiVar) {
        api.f(status, byiVar, this.a);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                Status status = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                j(status);
                return true;
            case 2:
                Status status2 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                o(status2);
                return true;
            case 3:
                Status status3 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                n(status3);
                return true;
            case 4:
                Status status4 = (Status) aki.a(parcel, Status.CREATOR);
                bye byeVar = (bye) aki.a(parcel, bye.CREATOR);
                enforceNoDataAvail(parcel);
                f(status4, byeVar);
                return true;
            case 5:
                Status status5 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                a(status5);
                return true;
            case 6:
                Status status6 = (Status) aki.a(parcel, Status.CREATOR);
                byi byiVar = (byi) aki.a(parcel, byi.CREATOR);
                enforceNoDataAvail(parcel);
                d(status6, byiVar);
                return true;
            case 7:
                Status status7 = (Status) aki.a(parcel, Status.CREATOR);
                byf byfVar = (byf) aki.a(parcel, byf.CREATOR);
                enforceNoDataAvail(parcel);
                b(status7, byfVar);
                return true;
            case 8:
                Status status8 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                c(status8);
                return true;
            case 9:
                Status status9 = (Status) aki.a(parcel, Status.CREATOR);
                byk bykVar = (byk) aki.a(parcel, byk.CREATOR);
                enforceNoDataAvail(parcel);
                g(status9, bykVar);
                return true;
            case 10:
                Status status10 = (Status) aki.a(parcel, Status.CREATOR);
                bye byeVar2 = (bye) aki.a(parcel, bye.CREATOR);
                enforceNoDataAvail(parcel);
                e(status10, byeVar2);
                return true;
            case 11:
                Status status11 = (Status) aki.a(parcel, Status.CREATOR);
                parcel.readLong();
                enforceNoDataAvail(parcel);
                p(status11);
                return true;
            case 12:
                Status status12 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                m(status12);
                return true;
            case 13:
                Status status13 = (Status) aki.a(parcel, Status.CREATOR);
                byn bynVar = (byn) aki.a(parcel, byn.CREATOR);
                enforceNoDataAvail(parcel);
                i(status13, bynVar);
                return true;
            case 14:
                Status status14 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                k(status14);
                return true;
            case 15:
                Status status15 = (Status) aki.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                l(status15);
                return true;
            case 16:
                Status status16 = (Status) aki.a(parcel, Status.CREATOR);
                long j = parcel.readLong();
                enforceNoDataAvail(parcel);
                h(status16, j);
                return true;
            default:
                return false;
        }
    }

    public final void e(Status status, bye byeVar) {
        api.f(status, byeVar, this.a);
    }

    public final void f(Status status, bye byeVar) {
        api.f(status, byeVar, this.a);
    }

    public final void g(Status status, byk bykVar) {
        api.f(status, bykVar, this.a);
    }

    public final void h(Status status, long j) {
        api.f(status, Long.valueOf(j), this.a);
    }

    public final void i(Status status, byn bynVar) {
        api.f(status, bynVar, this.a);
    }

    public final void j(Status status) {
        api.e(status, this.a);
    }

    public final void k(Status status) {
        api.e(status, this.a);
    }

    public final void l(Status status) {
        api.e(status, this.a);
    }

    public final void m(Status status) {
        api.e(status, this.a);
    }

    public final void n(Status status) {
        api.e(status, this.a);
    }

    public final void o(Status status) {
        api.e(status, this.a);
    }

    public final void p(Status status) {
        api.f(status, null, this.a);
    }

    public bzb() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }
}
