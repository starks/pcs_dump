package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class cz {
    private BroadcastReceiver a;
    final /* synthetic */ de c;

    public cz(de deVar) {
        this.c = deVar;
    }

    public abstract int a();

    public abstract IntentFilter b();

    public abstract void c();

    final void d() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.h.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void e() {
        d();
        IntentFilter intentFilterB = b();
        if (intentFilterB.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new cy(this);
        }
        de deVar = this.c;
        deVar.h.registerReceiver(this.a, intentFilterB);
    }
}
