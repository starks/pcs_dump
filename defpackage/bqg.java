package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqg extends bpw {
    public static final Parcelable.Creator CREATOR = new bji(15);
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;
    public final int e;
    public final Uri f;
    public final bqi g;
    public final long h;
    public final Uri i;
    public final bqp j;
    public final Uri k;
    public final Bundle l;
    public final byte[] n;
    private final byte[] o;

    public bqg(String str, int i, boolean z, String str2, int i2, Uri uri, bqi bqiVar, long j, Uri uri2, bqp bqpVar, byte[] bArr, Uri uri3, Bundle bundle, byte[] bArr2) {
        boolean z2 = true;
        clq.v(!str.isEmpty());
        clq.v(i != 0);
        if (uri != null && str2 == null) {
            clq.v(i2 == 3);
            uri2.getClass();
            bqpVar.getClass();
            if (uri3 == null && (bundle == null || bundle == Bundle.EMPTY)) {
                z2 = false;
            }
            clq.v(z2);
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
        this.i = uri2;
        this.g = bqiVar;
        this.h = j;
        this.j = bqpVar;
        this.o = bArr == null ? new byte[0] : bArr;
        this.k = uri3;
        this.l = bundle;
        this.n = bArr2 == null ? dzn.a.toByteArray() : bArr2;
    }

    public static void a(Uri uri) {
        clq.A(uri.isAbsolute(), "%s is not absolute.", uri);
        clq.A(uri.isHierarchical(), "%s is not hierarchical.", uri);
        clq.w(uri.getAuthority() == null, "Uri cannot have authority.");
        clq.w(uri.getFragment() == null, "Uri cannot have fragment part.");
        clq.w(uri.getQuery() == null, "Uri cannot have query part.");
        clq.A("appfiles".equals(uri.getScheme()) || "appcache".equals(uri.getScheme()) || "appdir".equals(uri.getScheme()), "Unsupported scheme: %s", uri.getScheme());
    }

    public static boolean b(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3;
    }

    public final byte[] c() {
        byte[] bArr = this.o;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.bqg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bqg r8 = (defpackage.bqg) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            int r1 = r7.b
            int r3 = r8.b
            if (r1 != r3) goto Lc4
            boolean r1 = r7.c
            boolean r3 = r8.c
            if (r1 != r3) goto Lc4
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            int r1 = r7.e
            int r3 = r8.e
            if (r1 != r3) goto Lc4
            android.net.Uri r1 = r7.f
            android.net.Uri r3 = r8.f
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            android.net.Uri r1 = r7.i
            android.net.Uri r3 = r8.i
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            bqi r1 = r7.g
            bqi r3 = r8.g
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            long r3 = r7.h
            long r5 = r8.h
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto Lc4
            bqp r1 = r7.j
            bqp r3 = r8.j
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            byte[] r1 = r7.o
            byte[] r3 = r8.o
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto Lc4
            android.net.Uri r1 = r7.k
            android.net.Uri r3 = r8.k
            boolean r1 = defpackage.a.g(r1, r3)
            if (r1 == 0) goto Lc4
            android.os.Bundle r1 = r7.l
            android.os.Bundle r3 = r8.l
            if (r1 == 0) goto Lb7
            if (r3 != 0) goto L7f
            goto Lb7
        L7f:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L8a
            goto Lc4
        L8a:
            java.util.Set r4 = r1.keySet()
            java.util.Set r5 = r3.keySet()
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto Lc4
            java.util.Iterator r4 = r4.iterator()
        L9c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb9
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r1.get(r5)
            java.lang.Object r5 = r3.get(r5)
            boolean r5 = defpackage.a.g(r6, r5)
            if (r5 != 0) goto L9c
            goto Lc4
        Lb7:
            if (r1 != r3) goto Lc4
        Lb9:
            byte[] r7 = r7.n
            byte[] r8 = r8.n
            boolean r7 = java.util.Arrays.equals(r7, r8)
            if (r7 == 0) goto Lc4
            return r0
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, this.i, this.g, Long.valueOf(this.h), this.j, Integer.valueOf(Arrays.hashCode(this.o)), this.k, this.l, Integer.valueOf(Arrays.hashCode(this.n))});
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
        bnh.r(parcel, 9, this.g, i);
        bnh.k(parcel, 10, this.h);
        bnh.r(parcel, 11, this.i, i);
        bnh.r(parcel, 12, this.j, i);
        bnh.m(parcel, 13, c());
        bnh.r(parcel, 14, this.k, i);
        bnh.l(parcel, 15, this.l);
        bnh.m(parcel, 16, this.n);
        bnh.e(parcel, iC);
    }
}
