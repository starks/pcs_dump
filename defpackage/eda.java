package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eda extends bmr {
    public static final Parcelable.Creator CREATOR = new byl(14);
    public final String a;
    public final Rect b;
    public final List c;
    public final float d;
    public final float e;

    public eda(String str, Rect rect, List list, float f, float f2) {
        this.a = str;
        this.b = rect;
        this.c = list;
        this.d = f;
        this.e = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iC = bnh.c(parcel);
        bnh.s(parcel, 1, str);
        bnh.r(parcel, 2, this.b, i);
        bnh.w(parcel, 3, this.c);
        bnh.h(parcel, 4, this.d);
        bnh.h(parcel, 5, this.e);
        bnh.e(parcel, iC);
    }
}
