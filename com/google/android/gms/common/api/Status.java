package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.bho;
import defpackage.bjh;
import defpackage.bji;
import defpackage.bmf;
import defpackage.bmr;
import defpackage.bnh;
import defpackage.yt;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends bmr implements ReflectedParcelable, bjh {
    public final int e;
    public final String f;
    public final PendingIntent g;
    public final bho h;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Parcelable.Creator CREATOR = new bji(0);

    public Status(int i, String str, PendingIntent pendingIntent, bho bhoVar) {
        this.e = i;
        this.f = str;
        this.g = pendingIntent;
        this.h = bhoVar;
    }

    public final boolean a() {
        return this.e <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.e == status.e && a.g(this.f, status.f) && a.g(this.g, status.g) && a.g(this.h, status.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        bmf bmfVar = new bmf(this);
        String strD = this.f;
        if (strD == null) {
            strD = yt.d(this.e);
        }
        bmfVar.a("statusCode", strD);
        bmfVar.a("resolution", this.g);
        return bmfVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.e;
        int iC = bnh.c(parcel);
        bnh.j(parcel, 1, i2);
        bnh.s(parcel, 2, this.f);
        bnh.r(parcel, 3, this.g, i);
        bnh.r(parcel, 4, this.h, i);
        bnh.e(parcel, iC);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(bho bhoVar, String str) {
        this(17, str, bhoVar.d, bhoVar);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, byte[] bArr) {
        this(i, str, null, null);
    }
}
