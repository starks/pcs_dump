package defpackage;

import android.system.virtualmachine.VirtualMachine;
import android.system.virtualmachine.VirtualMachineCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcw implements VirtualMachineCallback {
    final /* synthetic */ oq a;

    public bcw(oq oqVar) {
        this.a = oqVar;
    }

    public final void onError(VirtualMachine virtualMachine, int i, String str) {
        virtualMachine.clearCallback();
        this.a.b(new bcx("onError received from VM with errorCode: " + i + " and message " + str));
    }

    public final void onPayloadFinished(VirtualMachine virtualMachine, int i) {
        virtualMachine.clearCallback();
        this.a.b(new bcx(a.x(i, "onPayloadFinished received from VM with exitCode: ")));
    }

    public final void onPayloadReady(VirtualMachine virtualMachine) {
        ((czl) ((czl) bcy.a.b()).i("com/google/android/apps/miphone/astrea/pd/virtualmachine/impl/VirtualMachineRunnerImpl$1", "onPayloadReady", 141, "VirtualMachineRunnerImpl.java")).p("onPayloadReady received from VM.");
        virtualMachine.clearCallback();
        this.a.a(null);
    }

    public final void onPayloadStarted(VirtualMachine virtualMachine) {
        ((czl) ((czl) bcy.a.b()).i("com/google/android/apps/miphone/astrea/pd/virtualmachine/impl/VirtualMachineRunnerImpl$1", "onPayloadStarted", 136, "VirtualMachineRunnerImpl.java")).p("onPayloadStarted received from VM.");
    }

    public final void onStopped(VirtualMachine virtualMachine, int i) {
        virtualMachine.clearCallback();
        this.a.b(new bcx(a.x(i, "onStopped received from VM with reason: ")));
    }
}
