package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blx extends akh implements bly {
    private blg a;
    private final int b;

    public blx(blg blgVar, int i) {
        this();
        this.a = blgVar;
        this.b = i;
    }

    public static void c() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        aso.G(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.y(i, iBinder, bundle, this.b);
        this.a = null;
    }

    public final void b(int i, IBinder iBinder, blj bljVar) {
        blg blgVar = this.a;
        aso.G(blgVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        aso.F(bljVar);
        blgVar.m = bljVar;
        a(i, iBinder, bljVar.a);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) aki.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            a(i3, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            enforceNoDataAvail(parcel);
            c();
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            blj bljVar = (blj) aki.a(parcel, blj.CREATOR);
            enforceNoDataAvail(parcel);
            b(i4, strongBinder2, bljVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public blx() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
