package defpackage;

import android.content.BroadcastReceiver;
import android.os.Binder;
import android.os.Process;
import android.system.virtualmachine.VirtualMachineManager;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bcv implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public bcv(aau aauVar, int i) {
        this.b = i;
        this.a = aauVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        if (i == 0) {
            return bcy.c((VirtualMachineManager) this.a);
        }
        Object objA = null;
        if (i != 1) {
            if (i == 2) {
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return null;
            }
            Object obj = this.a;
            synchronized (((cjf) obj).b.c) {
                ((cjf) obj).a = null;
            }
            return null;
        }
        ((aau) this.a).e.set(true);
        try {
            Process.setThreadPriority(10);
            objA = ((aau) this.a).a();
            Binder.flushPendingCommands();
            return objA;
        } finally {
        }
    }

    public /* synthetic */ bcv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
