package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class big extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(18);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final bif f;
    private final Context g;

    public big(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, bif bifVar) {
        bpf bpdVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            bpdVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bpdVar = iInterfaceQueryLocalInterface instanceof bpf ? (bpf) iInterfaceQueryLocalInterface : new bpd(iBinder);
        }
        this.g = (Context) bpe.a(bpdVar);
        this.d = z3;
        this.e = z4;
        this.f = bifVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.f(parcel, 2, this.b);
        bnh.f(parcel, 3, this.c);
        bnh.o(parcel, 4, new bpe(this.g));
        bnh.f(parcel, 5, this.d);
        bnh.f(parcel, 6, this.e);
        bnh.r(parcel, 7, this.f, i);
        bnh.e(parcel, iC);
    }
}
