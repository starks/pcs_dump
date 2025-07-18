package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class byc implements ServiceConnection {
    public byc() {
        byb bybVar = byb.a;
    }

    public abstract void a(ComponentName componentName);

    public abstract void b(IBinder iBinder);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a(componentName);
    }
}
