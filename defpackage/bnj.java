package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnj extends bmr {
    public final Bundle a;
    private static final int b = (int) TimeUnit.SECONDS.toMillis(60);
    public static final Parcelable.Creator CREATOR = new bji(11);

    public bnj() {
        String property;
        Bundle bundle = new Bundle();
        this.a = bundle;
        bundle.putInt("clientVersion", bhs.b);
        try {
            property = System.getProperty("os.arch");
        } catch (Exception unused) {
            property = "?";
        }
        this.a.putString("appArchitecture", property);
    }

    public final int a() {
        return this.a.getInt("timeoutMs", b);
    }

    public final void b(int i) {
        this.a.putInt("openHandles", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iC = bnh.c(parcel);
        bnh.l(parcel, 2, this.a);
        bnh.e(parcel, iC);
    }

    public bnj(Bundle bundle) {
        new Bundle();
        this.a = bundle;
    }
}
