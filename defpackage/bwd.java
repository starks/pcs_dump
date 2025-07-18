package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bwd extends IInterface {
    void addHttpRequestHandleFactory(String str, bve bveVar);

    void addHttpUrlConnectionFactory(String str, bvo bvoVar);

    IBinder onBind(Intent intent);

    void onCreate(bpf bpfVar);

    void onDestroy();

    void onRebind(Intent intent);

    int onStartCommand(Intent intent, int i, int i2);

    void onTrimMemory(int i);

    boolean onUnbind(Intent intent);

    @Deprecated
    void setPRFSdkImpl();
}
