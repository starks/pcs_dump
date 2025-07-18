package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blq implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final blo e;
    public ComponentName f;
    final /* synthetic */ blp g;

    public blq(blp blpVar, blo bloVar) {
        this.g = blpVar;
        this.e = bloVar;
    }

    static /* bridge */ /* synthetic */ bho c(blq blqVar, String str) throws RemoteException, bmi {
        bho bhoVar;
        Bundle bundleCall;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        try {
            Context context = blqVar.g.f;
            blo bloVar = blqVar.e;
            Uri uri = bmn.a;
            String str2 = bloVar.a;
            Intent intent = null;
            if (bloVar.d) {
                Bundle bundle = new Bundle();
                bundle.putString("serviceActionBundleKey", str2);
                try {
                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(bmn.a);
                } catch (RemoteException | IllegalArgumentException e) {
                    Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundleCall = null;
                }
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action " + str2 + " but has possible resolution");
                                throw new bmi(new bho(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str2));
                    }
                } catch (Throwable th) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th;
                }
            }
            if (intent == null) {
                intent = new Intent(str2).setPackage(bloVar.b);
            }
            Intent intent3 = intent;
            blqVar.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(bnh.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            try {
                blp blpVar = blqVar.g;
                boolean zC = blpVar.h.c(blpVar.f, str, intent3, blqVar, blp.a);
                blqVar.c = zC;
                if (zC) {
                    blqVar.g.g.sendMessageDelayed(blqVar.g.g.obtainMessage(1, blqVar.e), blqVar.g.i);
                    bhoVar = bho.a;
                } else {
                    blqVar.b = 2;
                    try {
                        blp blpVar2 = blqVar.g;
                        blpVar2.h.b(blpVar2.f, blqVar);
                    } catch (IllegalArgumentException unused) {
                    }
                    bhoVar = new bho(16);
                }
                return bhoVar;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (bmi e2) {
            return e2.a;
        }
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.e) {
            this.g.g.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.e) {
            this.g.g.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
