package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bye extends bmr {
    public static final Parcelable.Creator CREATOR = new bji(19);
    public final String a;
    public final byte[] b;
    public final String c;
    public final byd[] d;
    public final Map e = new TreeMap();
    public final boolean f;
    public final long g;

    public bye(String str, String str2, byd[] bydVarArr, boolean z, byte[] bArr, long j) {
        this.a = str;
        this.c = str2;
        this.d = bydVarArr;
        this.f = z;
        this.b = bArr;
        this.g = j;
        for (byd bydVar : bydVarArr) {
            this.e.put(Integer.valueOf(bydVar.a), bydVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bye) {
            bye byeVar = (bye) obj;
            if (a.g(this.a, byeVar.a) && a.g(this.c, byeVar.c) && this.e.equals(byeVar.e) && this.f == byeVar.f && Arrays.equals(this.b, byeVar.b) && this.g == byeVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.e, Boolean.valueOf(this.f), this.b, Long.valueOf(this.g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append((byd) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        byte[] bArr = this.b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.s(parcel, 2, this.a);
        bnh.s(parcel, 3, this.c);
        bnh.v(parcel, 4, this.d, i);
        bnh.f(parcel, 5, this.f);
        bnh.m(parcel, 6, this.b);
        bnh.k(parcel, 7, this.g);
        bnh.e(parcel, iC);
    }
}
