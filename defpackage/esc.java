package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esc implements eow {
    private final Parcelable.Creator a;
    private final boolean b;

    public esc(Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.eow
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        boolean z = this.b;
        return new esk(this.a, (Parcelable) obj, z);
    }

    @Override // defpackage.eow
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (!(inputStream instanceof esk)) {
            throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        esk eskVar = (esk) inputStream;
        if (eskVar.b) {
            return eskVar.c;
        }
        if (eskVar.e == null) {
            Parcelable parcelable = eskVar.c;
            Parcelable.Creator creator = eskVar.a;
            creator.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            Parcelable parcelable2 = (Parcelable) creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            eskVar.e = parcelable2;
        }
        return eskVar.e;
    }
}
