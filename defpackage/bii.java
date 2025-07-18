package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bii extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(20);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final blv d;

    public bii(String str, blv blvVar, boolean z, boolean z2) {
        this.a = str;
        this.d = blvVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        blv blvVar = this.d;
        if (blvVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            blvVar = null;
        }
        bnh.o(parcel, 2, blvVar);
        bnh.f(parcel, 3, this.b);
        bnh.f(parcel, 4, this.c);
        bnh.e(parcel, iC);
    }

    public bii(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        bib bibVar = null;
        if (iBinder != null) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                bpf bpfVarB = (iInterfaceQueryLocalInterface instanceof blw ? (blw) iInterfaceQueryLocalInterface : new blu(iBinder)).b();
                byte[] bArr = bpfVarB == null ? null : (byte[]) bpe.a(bpfVarB);
                if (bArr != null) {
                    bibVar = new bib(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = bibVar;
        this.b = z;
        this.c = z2;
    }
}
