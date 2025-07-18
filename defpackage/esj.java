package defpackage;

import android.os.Parcel;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esj implements Closeable {
    private Parcel a;

    public esj(Parcel parcel) {
        this.a = parcel;
    }

    public static esj c() {
        return new esj(Parcel.obtain());
    }

    public final Parcel a() {
        clq.G(this.a != null, "get() after close()/release()");
        return this.a;
    }

    public final Parcel b() {
        Parcel parcelA = a();
        this.a = null;
        return parcelA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Parcel parcel = this.a;
        if (parcel != null) {
            parcel.recycle();
            this.a = null;
        }
    }
}
