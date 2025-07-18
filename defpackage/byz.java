package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byz extends akh implements bza {
    final /* synthetic */ brb a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public byz(brb brbVar) {
        this();
        this.a = brbVar;
    }

    public final void a(Status status, byte[] bArr) {
        if (!status.a()) {
            api.f(status, null, this.a);
            return;
        }
        try {
            api.f(status, (cfv) efb.parseFrom(cfv.a, bArr, een.a()), this.a);
        } catch (efp e) {
            this.a.C(e);
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) aki.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        a(status, bArrCreateByteArray);
        return true;
    }

    public byz() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }
}
