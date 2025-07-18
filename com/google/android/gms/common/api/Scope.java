package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bji;
import defpackage.bmr;
import defpackage.bnh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Scope extends bmr implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bji(1);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, this.a);
        bnh.s(parcel, 2, this.b);
        bnh.e(parcel, iC);
    }

    public Scope(String str) {
        this(1, str);
    }
}
