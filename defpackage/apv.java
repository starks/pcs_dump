package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apv extends akh implements apw {
    private final brb a;

    public apv() {
        super("com.google.android.apps.miphone.astrea.fl.brella.api.IStatusCallback");
    }

    public final void a(Status status) {
        this.a.b(status);
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) aki.a(parcel, Status.CREATOR);
        enforceNoDataAvail(parcel);
        a(status);
        return true;
    }

    public apv(brb brbVar) {
        this();
        this.a = brbVar;
    }
}
