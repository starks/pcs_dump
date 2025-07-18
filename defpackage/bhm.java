package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhm extends bmr {
    public static final Parcelable.Creator CREATOR = new apz(14);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final int h;
    public final Integer i;
    public final boolean j;
    public final int k;

    public bhm(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = z2;
        this.h = i3;
        this.i = num;
        this.j = z3;
        this.k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhm) {
            bhm bhmVar = (bhm) obj;
            if (a.g(this.a, bhmVar.a) && this.b == bhmVar.b && this.c == bhmVar.c && a.g(this.f, bhmVar.f) && a.g(this.d, bhmVar.d) && this.e == bhmVar.e && this.g == bhmVar.g && this.h == bhmVar.h && a.g(this.i, bhmVar.i) && this.j == bhmVar.j && this.k == bhmVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.f, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.a + ",packageVersionCode=" + this.b + ",logSource=" + this.c + ",logSourceName=" + this.f + ",uploadAccount=" + this.d + ",logAndroidId=" + this.e + ",isAnonymous=" + this.g + ",qosTier=" + this.h + ",appMobilespecId=" + this.i + ",scrubMccMnc=" + this.j + "piiLevelset=" + this.k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 2, this.a);
        bnh.j(parcel, 3, this.b);
        bnh.j(parcel, 4, this.c);
        bnh.s(parcel, 5, this.d);
        bnh.f(parcel, 7, this.e);
        bnh.s(parcel, 8, this.f);
        bnh.f(parcel, 9, this.g);
        bnh.j(parcel, 10, this.h);
        bnh.q(parcel, 11, this.i);
        bnh.f(parcel, 12, this.j);
        bnh.j(parcel, 13, this.k);
        bnh.e(parcel, iC);
    }
}
