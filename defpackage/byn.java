package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byn extends bmr {
    public static final Parcelable.Creator CREATOR = new byl(3);
    public final List a;

    public byn(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof byn) {
            return this.a.equals(((byn) obj).a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (bym bymVar : this.a) {
            if (!z) {
                sb.append(", ");
            }
            bymVar.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.w(parcel, 2, this.a);
        bnh.e(parcel, iC);
    }
}
