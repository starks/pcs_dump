package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bqn extends Service {
    private final IBinder a = new bvt(this);

    public abstract void c(bqg bqgVar, boolean z, List list, brb brbVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return !intent.getAction().equals("com.google.android.gms.learning.COMPUTATION_RESULT") ? new buq("Unknown action is found while trying to bind InAppResultHandlingService") : this.a;
    }
}
