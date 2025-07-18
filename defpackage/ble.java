package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ble extends bky {
    public final IBinder g;
    final /* synthetic */ blg h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ble(blg blgVar, int i, IBinder iBinder, Bundle bundle) {
        super(blgVar, i, bundle);
        this.h = blgVar;
        this.g = iBinder;
    }

    @Override // defpackage.bky
    protected final void a(bho bhoVar) {
        fuu fuuVar = this.h.q;
        if (fuuVar != null) {
            fuuVar.r(bhoVar);
        }
        blg.F(bhoVar);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [bjx, java.lang.Object] */
    @Override // defpackage.bky
    protected final boolean c() throws RemoteException {
        try {
            IBinder iBinder = this.g;
            aso.F(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.h.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.h.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = this.h.b(this.g);
            if (iInterfaceB == null || !(this.h.A(2, 4, iInterfaceB) || this.h.A(3, 4, iInterfaceB))) {
                return false;
            }
            blg blgVar = this.h;
            blgVar.k = null;
            fuu fuuVar = blgVar.r;
            if (fuuVar == null) {
                return true;
            }
            fuuVar.a.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
