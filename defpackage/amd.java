package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ITarsService;
import com.google.android.apps.aicore.aidl.TarsRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amd extends akh implements ame {
    final /* synthetic */ ITarsService a;

    public amd() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.PccTarsService");
    }

    public final alo a(TarsRequest tarsRequest, amc amcVar) {
        amc amcVar2;
        try {
            amcVar2 = amcVar;
        } catch (RemoteException unused) {
            amcVar2 = amcVar;
        }
        try {
            return new aln((ICancellationCallback) anb.a(new amt(this, this.a, tarsRequest, amcVar2, 0)));
        } catch (RemoteException unused2) {
            amcVar2.a(6);
            return new aln(null);
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        amc ambVar;
        if (i != 1) {
            return false;
        }
        TarsRequest tarsRequest = (TarsRequest) aki.a(parcel, TarsRequest.CREATOR);
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            ambVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.ai.aidl.PccTarsResultCallback");
            ambVar = iInterfaceQueryLocalInterface instanceof amc ? (amc) iInterfaceQueryLocalInterface : new amb(strongBinder);
        }
        enforceNoDataAvail(parcel);
        alo aloVarA = a(tarsRequest, ambVar);
        parcel2.writeNoException();
        aki.d(parcel2, aloVarA);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public amd(ITarsService iTarsService) {
        this();
        this.a = iTarsService;
    }
}
