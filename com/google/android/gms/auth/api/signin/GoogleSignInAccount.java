package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.apz;
import defpackage.bmr;
import defpackage.bnh;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends bmr implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new apz(8);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    final List i;
    public final String j;
    public final String k;
    private final Set l = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = list;
        this.j = str7;
        this.k = str8;
    }

    public final Set a() {
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.l);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.h.equals(this.h) && googleSignInAccount.a().equals(a());
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 2, str);
        bnh.s(parcel, 3, this.b);
        bnh.s(parcel, 4, this.c);
        bnh.s(parcel, 5, this.d);
        bnh.r(parcel, 6, this.e, i);
        bnh.s(parcel, 7, this.f);
        bnh.k(parcel, 8, this.g);
        bnh.s(parcel, 9, this.h);
        bnh.w(parcel, 10, this.i);
        bnh.s(parcel, 11, this.j);
        bnh.s(parcel, 12, this.k);
        bnh.e(parcel, iC);
    }
}
