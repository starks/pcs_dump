package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxm extends byc {
    final /* synthetic */ dki a;
    final /* synthetic */ bxq b;

    public bxm(bxq bxqVar, dki dkiVar) {
        this.a = dkiVar;
        this.b = bxqVar;
    }

    @Override // defpackage.byc
    public final void b(IBinder iBinder) throws RemoteException {
        Object bsbVar;
        if (iBinder == null) {
            bsbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.learning.dynamite.proxy.IExampleStoreProxy");
            bsbVar = iInterfaceQueryLocalInterface instanceof bsd ? (bsd) iInterfaceQueryLocalInterface : new bsb(iBinder);
        }
        this.a.d(bsbVar);
        try {
            iBinder.linkToDeath(this.b.i, 0);
        } catch (RemoteException unused) {
            this.b.c.h("Could not link to death, process probably already died");
        }
    }

    @Override // defpackage.byc
    public final void a(ComponentName componentName) {
    }
}
