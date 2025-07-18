package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esg extends esh {
    public esg(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.esh
    public final void a(int i, esj esjVar) throws RemoteException {
        if (!b(i, esjVar.b())) {
            throw new RemoteException(a.E(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
