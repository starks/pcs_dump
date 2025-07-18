package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class blr implements Handler.Callback {
    final /* synthetic */ blp a;

    public blr(blp blpVar) {
        this.a = blpVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.e) {
                blo bloVar = (blo) message.obj;
                blq blqVar = (blq) this.a.e.get(bloVar);
                if (blqVar != null && blqVar.b()) {
                    if (blqVar.c) {
                        blqVar.g.g.removeMessages(1, blqVar.e);
                        blp blpVar = blqVar.g;
                        blpVar.h.b(blpVar.f, blqVar);
                        blqVar.c = false;
                        blqVar.b = 2;
                    }
                    this.a.e.remove(bloVar);
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.e) {
            blo bloVar2 = (blo) message.obj;
            blq blqVar2 = (blq) this.a.e.get(bloVar2);
            if (blqVar2 != null && blqVar2.b == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(bloVar2), new Exception());
                ComponentName componentName = blqVar2.f;
                if (componentName == null) {
                    componentName = null;
                }
                if (componentName == null) {
                    String str = bloVar2.b;
                    aso.F(str);
                    componentName = new ComponentName(str, "unknown");
                }
                blqVar2.onServiceDisconnected(componentName);
            }
        }
        return true;
    }
}
