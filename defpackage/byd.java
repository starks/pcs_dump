package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byd extends bmr implements Comparable {
    public static final Parcelable.Creator CREATOR = new bji(18);
    public final int a;
    public final byk[] b;
    public final String[] c;
    public final Map d = new TreeMap();

    public byd(int i, byk[] bykVarArr, String[] strArr) {
        this.a = i;
        this.b = bykVarArr;
        for (byk bykVar : bykVarArr) {
            this.d.put(bykVar.a, bykVar);
        }
        this.c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a - ((byd) obj).a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof byd) {
            byd bydVar = (byd) obj;
            if (this.a == bydVar.a && a.g(this.d, bydVar.d) && Arrays.equals(this.c, bydVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append((byk) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.j(parcel, 2, this.a);
        bnh.v(parcel, 3, this.b, i);
        bnh.t(parcel, 4, this.c);
        bnh.e(parcel, iC);
    }
}
