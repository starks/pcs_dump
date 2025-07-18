package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqa extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(2);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public aqa(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqa)) {
            return false;
        }
        aqa aqaVar = (aqa) obj;
        return this.a == aqaVar.a && this.b == aqaVar.b && this.c == aqaVar.c;
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
