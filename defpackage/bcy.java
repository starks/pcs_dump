package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.system.virtualmachine.VirtualMachine;
import android.system.virtualmachine.VirtualMachineConfig;
import android.system.virtualmachine.VirtualMachineDescriptor;
import android.system.virtualmachine.VirtualMachineException;
import android.system.virtualmachine.VirtualMachineManager;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcy implements bcu {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/pd/virtualmachine/impl/VirtualMachineRunnerImpl");
    public static final bbc b;
    public final Executor c;
    public final bnz d;
    private final Context e;

    static {
        asr asrVar = (asr) bbc.a.createBuilder();
        eea eeaVar = eea.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bbc bbcVar = (bbc) asrVar.a;
        eeaVar.getClass();
        bbcVar.b |= 1;
        bbcVar.c = eeaVar;
        eea eeaVar2 = eea.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        bbc bbcVar2 = (bbc) asrVar.a;
        eeaVar2.getClass();
        bbcVar2.b |= 2;
        bbcVar2.d = eeaVar2;
        b = (bbc) asrVar.z();
    }

    public bcy(bnz bnzVar, Executor executor, Context context) {
        this.c = executor;
        this.e = context;
        this.d = bnzVar;
    }

    static /* synthetic */ axr c(VirtualMachineManager virtualMachineManager) {
        try {
            virtualMachineManager.delete("pd_vm");
            return axr.a;
        } catch (VirtualMachineException e) {
            throw new bcx("Failed to delete VM.", e);
        }
    }

    public static /* synthetic */ VirtualMachineDescriptor e(VirtualMachine virtualMachine) {
        try {
            return virtualMachine.toDescriptor();
        } catch (VirtualMachineException e) {
            throw new bcx("Error getting descriptor from VM", e);
        }
    }

    private final VirtualMachine f(axx axxVar) {
        VirtualMachineManager virtualMachineManager = (VirtualMachineManager) this.e.getSystemService(VirtualMachineManager.class);
        if (virtualMachineManager == null) {
            throw new UnsupportedOperationException("VMs are unsupported on this device.");
        }
        if ((virtualMachineManager.getCapabilities() & 1) == 0) {
            throw new UnsupportedOperationException("Protected VMs are unsupported on this device.");
        }
        Context context = this.e;
        String str = axxVar.c;
        try {
            VirtualMachineConfig virtualMachineConfigBuild = new VirtualMachineConfig.Builder(context.createPackageContext(str, 4)).setProtectedVm(true).setPayloadBinaryName(axxVar.b).build();
            try {
                VirtualMachine orCreate = virtualMachineManager.getOrCreate("pd_vm", virtualMachineConfigBuild);
                try {
                    orCreate.setConfig(virtualMachineConfigBuild);
                    return orCreate;
                } catch (VirtualMachineException e) {
                    ((czl) ((czl) ((czl) a.e()).h(e)).i("com/google/android/apps/miphone/astrea/pd/virtualmachine/impl/VirtualMachineRunnerImpl", "getOrCreateVm", (char) 202, "VirtualMachineRunnerImpl.java")).p("Error while updating VM config. Deleting and restarting VM.");
                    virtualMachineManager.delete("pd_vm");
                    return virtualMachineManager.create("pd_vm", virtualMachineConfigBuild);
                }
            } catch (VirtualMachineException e2) {
                throw new bcx("Failed to start or update VM.", e2);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new bcx("Invalid configuration - package name not found", e3);
        }
    }

    @Override // defpackage.bcu
    public final djy a(axx axxVar) {
        djy djyVarB;
        AtomicReference atomicReference = (AtomicReference) asd.b.a();
        int i = 6;
        try {
            VirtualMachine virtualMachineF = f(axxVar);
            djyVarB = dij.i(dij.i(dij.j(dij.j(djr.q(jt.u(new ark(this, virtualMachineF, 3))), new bbk(this, 2), this.c), new aqf(this, virtualMachineF, i, null), this.c), new arl(virtualMachineF, 7), this.c), new arl(virtualMachineF, 8), this.c);
        } catch (bcx e) {
            djyVarB = cnx.B(e);
        }
        return dij.i(djr.q(djyVarB), new arl(atomicReference, i), this.c);
    }

    @Override // defpackage.bcu
    public final djy b() {
        VirtualMachineManager virtualMachineManager = (VirtualMachineManager) this.e.getSystemService(VirtualMachineManager.class);
        if (virtualMachineManager != null) {
            return cnx.E(new bcv(virtualMachineManager, 0), this.c);
        }
        throw new UnsupportedOperationException("VMs are unsupported on this device.");
    }

    public final /* synthetic */ Object d(VirtualMachine virtualMachine, oq oqVar) {
        try {
            virtualMachine.setCallback(this.c, new bcw(oqVar));
            virtualMachine.run();
            return "payloadReady future";
        } catch (VirtualMachineException e) {
            oqVar.b(new bcx("Failure while running VM.", e));
            return "payloadReady future";
        }
    }
}
