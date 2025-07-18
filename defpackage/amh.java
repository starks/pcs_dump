package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ITextEmbeddingService;
import com.google.android.apps.aicore.aidl.TextEmbeddingRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amh extends akh implements ami {
    final /* synthetic */ ITextEmbeddingService a;

    public amh() {
        super("com.google.android.apps.miphone.astrea.ai.aidl.PccTextEmbeddingService");
    }

    public final alo a(TextEmbeddingRequest textEmbeddingRequest, amg amgVar) {
        amg amgVar2;
        try {
            amgVar2 = amgVar;
        } catch (RemoteException unused) {
            amgVar2 = amgVar;
        }
        try {
            return new aln((ICancellationCallback) anb.a(new amt(this, this.a, textEmbeddingRequest, amgVar2, 2)));
        } catch (RemoteException unused2) {
            amgVar2.a(6);
            return new aln(null);
        }
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        amg amfVar;
        if (i != 1) {
            return false;
        }
        TextEmbeddingRequest textEmbeddingRequest = (TextEmbeddingRequest) aki.a(parcel, TextEmbeddingRequest.CREATOR);
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            amfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.ai.aidl.PccTextEmbeddingResultCallback");
            amfVar = iInterfaceQueryLocalInterface instanceof amg ? (amg) iInterfaceQueryLocalInterface : new amf(strongBinder);
        }
        enforceNoDataAvail(parcel);
        alo aloVarA = a(textEmbeddingRequest, amfVar);
        parcel2.writeNoException();
        aki.d(parcel2, aloVarA);
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public amh(ITextEmbeddingService iTextEmbeddingService) {
        this();
        this.a = iTextEmbeddingService;
    }
}
