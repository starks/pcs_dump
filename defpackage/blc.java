package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blc implements ServiceConnection {
    final /* synthetic */ blg a;
    private final int b;

    public blc(blg blgVar, int i) {
        this.a = blgVar;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder != null) {
            synchronized (this.a.e) {
                blg blgVar = this.a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                blgVar.f = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof bma)) ? new blz(iBinder) : (bma) iInterfaceQueryLocalInterface;
            }
            this.a.z(0, null, this.b);
            return;
        }
        blg blgVar2 = this.a;
        synchronized (blgVar2.d) {
            i = blgVar2.i;
        }
        if (i == 3) {
            blgVar2.l = true;
            i2 = 5;
        } else {
            i2 = 4;
        }
        Handler handler = blgVar2.c;
        handler.sendMessage(handler.obtainMessage(i2, blgVar2.n.get(), 16));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.e) {
            this.a.f = null;
        }
        blg blgVar = this.a;
        int i = this.b;
        Handler handler = blgVar.c;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
