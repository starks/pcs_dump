package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsc extends akh implements bsd {
    final /* synthetic */ InAppExampleStoreProxyImpl a;

    public bsc() {
        super("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0202 A[Catch: all -> 0x01f8, TRY_LEAVE, TryCatch #10 {all -> 0x01f8, blocks: (B:49:0x011b, B:51:0x0123, B:55:0x012c, B:57:0x0155, B:59:0x0159, B:105:0x0239, B:92:0x01fe, B:94:0x0202, B:95:0x0209, B:97:0x0211, B:101:0x0218, B:104:0x0232, B:107:0x023b, B:67:0x0176, B:69:0x017c, B:71:0x0186, B:73:0x019b, B:75:0x01b1, B:78:0x01c5, B:80:0x01da, B:82:0x01ec), top: B:111:0x00c9, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0211 A[Catch: all -> 0x01f8, RemoteException -> 0x0231, TryCatch #7 {RemoteException -> 0x0231, blocks: (B:95:0x0209, B:97:0x0211, B:101:0x0218), top: B:125:0x0209, outer: #10 }] */
    /* JADX WARN: Type inference failed for: r0v60, types: [bum] */
    /* JADX WARN: Type inference failed for: r2v11, types: [bum] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cbx] */
    /* JADX WARN: Type inference failed for: r5v16, types: [bpf] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v20, types: [bpf] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.bsd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r18, byte[] r19, byte[] r20, defpackage.bsa r21, byte[] r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsc.a(java.lang.String, byte[], byte[], bsa, byte[]):void");
    }

    @Override // defpackage.bsd
    public final boolean b() {
        return true;
    }

    @Override // defpackage.akh
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws Throwable {
        bsa bryVar;
        bsa bsaVar;
        if (i == 3) {
            String string = parcel.readString();
            byte[] bArrCreateByteArray = parcel.createByteArray();
            byte[] bArrCreateByteArray2 = parcel.createByteArray();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                bsaVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreChunkingQueryCallback");
                if (iInterfaceQueryLocalInterface instanceof bsa) {
                    bsaVar = (bsa) iInterfaceQueryLocalInterface;
                } else {
                    bryVar = new bry(strongBinder);
                    byte[] bArrCreateByteArray3 = parcel.createByteArray();
                    enforceNoDataAvail(parcel);
                    a(string, bArrCreateByteArray, bArrCreateByteArray2, bryVar, bArrCreateByteArray3);
                }
            }
            bryVar = bsaVar;
            byte[] bArrCreateByteArray32 = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            a(string, bArrCreateByteArray, bArrCreateByteArray2, bryVar, bArrCreateByteArray32);
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            int i3 = aki.a;
            parcel2.writeInt(1);
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bsc(InAppExampleStoreProxyImpl inAppExampleStoreProxyImpl) {
        this();
        this.a = inAppExampleStoreProxyImpl;
    }
}
