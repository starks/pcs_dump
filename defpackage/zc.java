package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class zc extends Service implements yz {
    private final zw a = new zw(this);

    @Override // defpackage.yz
    public final yw E() {
        return (yw) this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.a(yu.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(yu.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        zw zwVar = this.a;
        zwVar.a(yu.ON_STOP);
        zwVar.a(yu.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.a(yu.ON_START);
        super.onStart(intent, i);
    }
}
