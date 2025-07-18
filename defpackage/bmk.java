package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmk extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(8);
    final int a;
    final IBinder b;
    public final bho c;
    public final boolean d;
    public final boolean e;

    public bmk(int i, IBinder iBinder, bho bhoVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = bhoVar;
        this.d = z;
        this.e = z2;
    }

    public final blt a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof blt ? (blt) iInterfaceQueryLocalInterface : new bls(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmk)) {
            return false;
        }
        bmk bmkVar = (bmk) obj;
        return this.c.equals(bmkVar.c) && a.g(a(), bmkVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.a);
        bnh.o(parcel, 2, this.b);
        bnh.r(parcel, 3, this.c, i);
        bnh.f(parcel, 4, this.d);
        bnh.f(parcel, 5, this.e);
        bnh.e(parcel, iC);
    }
}
