package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqp extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(17);
    public final int a;
    public final long b;

    public bqp(int i, long j) {
        boolean z = true;
        if (i == 0 && j <= 0) {
            z = false;
        }
        aso.z(z, "Recurrent jobs cannot have non-positive minimal interval.");
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqp)) {
            return false;
        }
        bqp bqpVar = (bqp) obj;
        return this.a == bqpVar.a && this.b == bqpVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, i2);
        bnh.k(parcel, 2, this.b);
        bnh.e(parcel, iC);
    }
}
