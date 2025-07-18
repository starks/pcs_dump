package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bqe extends Service {
    private final bum a = new bul(this);
    private final Object b = new Object();
    private bup c;

    private final bup aP() {
        bup bupVar;
        synchronized (this.b) {
            bupVar = this.c;
        }
        return bupVar;
    }

    public abstract void c(String str, byte[] bArr, byte[] bArr2, bua buaVar, dzi dziVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        bup bupVar;
        if (!"com.google.android.gms.learning.EXAMPLE_STORE_V2".equals(intent.getAction())) {
            return new buq("Received connection with unexpected action ".concat(String.valueOf(intent.getAction())));
        }
        synchronized (this.b) {
            bupVar = this.c;
            if (bupVar == null) {
                try {
                    bupVar = (bup) bux.a(this, "com.google.android.gms.learning.dynamite.proxy.InAppExampleStoreProxyImpl", new bwe(1));
                    try {
                        bupVar.init(new bpe(this), this.a);
                        this.c = bupVar;
                    } catch (RemoteException e) {
                        if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                            Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.init", e);
                        }
                        return new buq("No IInAppExampleStoreProxy implementation found");
                    }
                } catch (buv e2) {
                    if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                        Log.w("brella.InAppExStProxy", "LoadingException during onBind", e2);
                    }
                    return new buq("No IInAppExampleStoreProxy implementation found");
                }
            }
        }
        try {
            return bupVar.onBind(intent);
        } catch (RemoteException e3) {
            if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onBind", e3);
            }
            return new buq("No IInAppExampleStoreProxy implementation found");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        bup bupVarAP = aP();
        if (bupVarAP != null) {
            try {
                bupVarAP.onDestroy();
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onCreate", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        bup bupVarAP = aP();
        if (bupVarAP != null) {
            try {
                bupVarAP.onRebind(intent);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onRebind", e);
                }
            }
        }
        super.onRebind(intent);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        bup bupVarAP = aP();
        if (bupVarAP != null) {
            try {
                bupVarAP.onTrimMemory(i);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onTrimMemory", e);
                }
            }
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        bup bupVarAP = aP();
        if (bupVarAP != null) {
            try {
                return bupVarAP.onUnbind(intent);
            } catch (RemoteException e) {
                if (Log.isLoggable("brella.InAppExStProxy", 5)) {
                    Log.w("brella.InAppExStProxy", "RemoteException in IInAppExampleStoreProxy.onUnbind", e);
                }
            }
        }
        return super.onUnbind(intent);
    }
}
