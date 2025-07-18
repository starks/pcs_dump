package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aqh implements ServiceConnection {
    final /* synthetic */ dki a;
    final /* synthetic */ String b;
    final /* synthetic */ aqi c;

    public aqh(aqi aqiVar, dki dkiVar, String str) {
        this.a = dkiVar;
        this.b = str;
        this.c = aqiVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        ((czl) ((czl) aqi.a.c()).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager$1", "onBindingDied", 177, "ConnectionManager.java")).r("Binding to %s died", componentName);
        this.c.c(atk.PCS_TRAINING_BINDER_DIED);
        this.c.d(this.b, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        ((czl) ((czl) aqi.a.c()).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager$1", "onNullBinding", 184, "ConnectionManager.java")).r("Received null binding for %s", componentName);
        this.c.c(atk.PCS_TRAINING_BINDER_NULL);
        this.c.d(this.b, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((czl) ((czl) aqi.a.c()).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager$1", "onServiceConnected", 153, "ConnectionManager.java")).t("Connected to service: %s.%s", componentName.getPackageName(), componentName.getClassName());
        this.c.c(atk.PCS_TRAINING_BINDER_SERVICE_CONNECTED);
        Object aprVar = null;
        if (this.c.e == 1) {
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.fl.brella.api.IExampleStore");
                aprVar = iInterfaceQueryLocalInterface instanceof apm ? (apm) iInterfaceQueryLocalInterface : new apl(iBinder);
            }
            this.a.d(aprVar);
            return;
        }
        if (this.c.e != 2) {
            this.a.e(new RuntimeException("Unsupported connection type"));
            return;
        }
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.apps.miphone.astrea.fl.brella.api.IInAppResultHandler");
            aprVar = iInterfaceQueryLocalInterface2 instanceof aps ? (aps) iInterfaceQueryLocalInterface2 : new apr(iBinder);
        }
        this.a.d(aprVar);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((czl) ((czl) aqi.a.c()).i("com/google/android/apps/miphone/astrea/fl/brella/service/ConnectionManager$1", "onServiceDisconnected", 170, "ConnectionManager.java")).p("Disconnected from Service.");
        this.c.c(atk.PCS_TRAINING_BINDER_SERVICE_DISCONNECTED);
        this.c.d(this.b, this.a);
    }
}
