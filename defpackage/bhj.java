package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhj extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(12);
    public final String a;
    public final int b;
    public int c;

    public bhj(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhj)) {
            return false;
        }
        bhj bhjVar = (bhj) obj;
        return Objects.equals(this.a, bhjVar.a) && this.b == bhjVar.b && this.c == bhjVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.a + ", ClearcutStatusCode: " + this.b + ", ErrorCount: " + this.c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, this.a);
        bnh.j(parcel, 2, this.b);
        bnh.j(parcel, 3, this.c);
        bnh.e(parcel, iC);
    }
}
