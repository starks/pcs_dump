package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhq extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(17);
    public final String a;

    @Deprecated
    public final int b;
    private final long c;

    public bhq(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final long a() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bhq) {
            bhq bhqVar = (bhq) obj;
            String str = this.a;
            if (((str != null && str.equals(bhqVar.a)) || (this.a == null && bhqVar.a == null)) && a() == bhqVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(a())});
    }

    public final String toString() {
        bmf bmfVar = new bmf(this);
        bmfVar.a("name", this.a);
        bmfVar.a("version", Long.valueOf(a()));
        return bmfVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.j(parcel, 2, this.b);
        bnh.k(parcel, 3, a());
        bnh.e(parcel, iC);
    }

    public bhq(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
