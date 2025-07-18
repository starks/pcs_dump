package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class esh {
    public static final Logger a = Logger.getLogger(esh.class.getName());
    public static final fbc c = new fbc();
    protected final IBinder b;

    protected esh(IBinder iBinder) {
        this.b = iBinder;
    }

    public abstract void a(int i, esj esjVar);

    public final boolean b(int i, Parcel parcel) {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
