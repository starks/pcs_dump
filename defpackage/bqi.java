package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqi extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(16);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public bqi(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqi)) {
            return false;
        }
        bqi bqiVar = (bqi) obj;
        return this.a == bqiVar.a && this.b == bqiVar.b && this.c == bqiVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iC = bnh.c(parcel);
        bnh.f(parcel, 1, z);
        bnh.f(parcel, 2, this.b);
        bnh.f(parcel, 3, this.c);
        bnh.e(parcel, iC);
    }
}
