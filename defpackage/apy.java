package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apy extends bpw {
    public static final Parcelable.Creator CREATOR = new apz(0);
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final Uri f;
    public final Uri g;
    public final aqa h;
    public final long i;
    public final Uri j;
    public final aqd k;
    public final Uri l;
    private final byte[] n;

    public apy(String str, int i, boolean z, String str2, int i2, Uri uri, Uri uri2, aqa aqaVar, long j, Uri uri3, aqd aqdVar, byte[] bArr, Uri uri4) {
        clq.v(!str.isEmpty());
        clq.v(i != 0);
        if (uri != null && str2 == null) {
            clq.v(i2 == 3);
            uri3.getClass();
            aqdVar.getClass();
            if (uri4 == null) {
                uri2.getClass();
            } else {
                clq.v(uri2 == null);
            }
        } else {
            if (uri != null || str2 == null) {
                if (uri != null) {
                    throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
                }
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            clq.v(true ^ str2.isEmpty());
            clq.v(b(i2));
        }
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = str2;
        this.e = i2;
        this.f = uri;
        this.g = uri2;
        this.j = uri3;
        this.h = aqaVar;
        this.i = j;
        this.k = aqdVar;
        this.n = bArr == null ? new byte[0] : bArr;
        this.l = uri4;
    }

    public static void a(Uri uri) {
        clq.A(uri.isAbsolute(), "%s is not absolute.", uri);
        clq.A(uri.isHierarchical(), "%s is not hierarchical.", uri);
        clq.w(uri.getAuthority() == null, "Uri cannot have authority.");
        clq.w(uri.getFragment() == null, "Uri cannot have fragment part.");
        clq.w(uri.getQuery() == null, "Uri cannot have query part.");
        clq.A("appfiles".equals(uri.getScheme()) || "appcache".equals(uri.getScheme()), "Unsupported scheme: %s", uri.getScheme());
    }

    public static boolean b(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apy)) {
            return false;
        }
        apy apyVar = (apy) obj;
        return a.g(this.a, apyVar.a) && a.g(Integer.valueOf(this.b), Integer.valueOf(apyVar.b)) && a.g(Boolean.valueOf(this.c), Boolean.valueOf(apyVar.c)) && a.g(this.d, apyVar.d) && this.e == apyVar.e && a.g(this.f, apyVar.f) && a.g(this.g, apyVar.g) && a.g(this.j, apyVar.j) && a.g(this.h, apyVar.h) && this.i == apyVar.i && a.g(this.k, apyVar.k) && Arrays.equals(this.n, apyVar.n) && a.g(this.l, apyVar.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, this.g, this.j, this.h, Long.valueOf(this.i), this.k, Integer.valueOf(Arrays.hashCode(this.n)), this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.j(parcel, 2, this.b);
        bnh.f(parcel, 3, this.c);
        bnh.s(parcel, 4, this.d);
        bnh.j(parcel, 5, this.e);
        bnh.r(parcel, 6, this.f, i);
        bnh.r(parcel, 7, this.g, i);
        bnh.r(parcel, 9, this.h, i);
        bnh.k(parcel, 10, this.i);
        bnh.r(parcel, 11, this.j, i);
        bnh.r(parcel, 12, this.k, i);
        byte[] bArr = this.n;
        bnh.m(parcel, 13, Arrays.copyOf(bArr, bArr.length));
        bnh.r(parcel, 14, this.l, i);
        bnh.e(parcel, iC);
    }
}
