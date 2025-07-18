package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.apps.aicore.aidl.IAiCoreServiceProvider;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amp implements ServiceConnection {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/ai/service/AiCoreServiceConnection");
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final Context c;
    public oq d;
    public djy e;

    public amp(Context context) {
        this.c = context;
    }

    public final void a(String str, boolean z) {
        if (this.b.getAndSet(true)) {
            return;
        }
        ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/ai/service/AiCoreServiceConnection", "disconnect", 184, "AiCoreServiceConnection.java")).r("%s", str);
        this.d.b(new RemoteException(str));
        try {
            this.c.unbindService(this);
        } catch (RuntimeException e) {
            ((czl) ((czl) ((czl) a.c()).h(e)).i("com/google/android/apps/miphone/astrea/ai/service/AiCoreServiceConnection", "disconnect", (char) 189, "AiCoreServiceConnection.java")).p("Failed to unbind.");
        }
        if (z) {
            this.c.sendBroadcast(new Intent("com.google.android.as.oss.AiCoreServiceConnection_STOPPED"));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        a("PCS<>AICore binding died", true);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        a("Received null binding for AICoreService", false);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        ((czl) ((czl) a.b()).i("com/google/android/apps/miphone/astrea/ai/service/AiCoreServiceConnection", "onServiceConnected", 124, "AiCoreServiceConnection.java")).p("PCS<>AICore connected");
        try {
            iBinder.linkToDeath(new amn(this, 1), 0);
            IAiCoreServiceProvider.Stub.asInterface(iBinder).get(new amo(this));
        } catch (RemoteException e) {
            a(String.format(Locale.US, "Encountered error while connecting to AICoreService. Error: [%s]", e.getMessage()), true);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a("PCS<>AICore disconnected", true);
    }
}
