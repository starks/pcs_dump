package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bym extends bmr {
    public static final Parcelable.Creator CREATOR = new byl(2);
    public final String a;
    public final String b;
    public final byk c;
    public final boolean d;

    public bym(String str, String str2, byk bykVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = bykVar;
        this.d = z;
    }

    final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.a(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bym)) {
            return false;
        }
        bym bymVar = (bym) obj;
        return a.g(this.a, bymVar.a) && a.g(this.b, bymVar.b) && a.g(this.c, bymVar.c) && this.d == bymVar.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 2, this.a);
        bnh.s(parcel, 3, this.b);
        bnh.r(parcel, 4, this.c, i);
        bnh.f(parcel, 5, this.d);
        bnh.e(parcel, iC);
    }
}
