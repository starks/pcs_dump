package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class avf implements crp {
    private final /* synthetic */ int a;

    public /* synthetic */ avf(int i) {
        this.a = i;
    }

    @Override // defpackage.crp
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Long) obj).longValue() != -1);
            case 1:
                return -1L;
            case 2:
                return Long.valueOf(((ava) obj).d());
            case 3:
                aww awwVar = (aww) obj;
                return Pair.create(awwVar.a(), awt.b(awwVar.f()).atStartOfDay().c());
            case 4:
                czn cznVar = awt.a;
                return awt.b(((aww) obj).f()).atStartOfDay().c();
            case 5:
                return Long.valueOf(((ava) obj).d());
            case 6:
                int i = ayl.a;
                return new ayk(((ane) obj).toByteString(), 1);
            case 7:
                Optional optional = (Optional) obj;
                czn cznVar2 = bcy.a;
                if (optional.isPresent()) {
                    ((czl) ((czl) bcy.a.c()).i("com/google/android/apps/miphone/astrea/pd/virtualmachine/impl/VirtualMachineRunnerImpl", "readOrCreatePersistentState", AIFeature.Id.ROSIE_ROBOT_CONTINUOUS, "VirtualMachineRunnerImpl.java")).r("found persistent state for client %s", "VM_CLIENT");
                } else {
                    ((czl) ((czl) bcy.a.c()).i("com/google/android/apps/miphone/astrea/pd/virtualmachine/impl/VirtualMachineRunnerImpl", "readOrCreatePersistentState", AIFeature.Id.ROSIE_ROBOT_DICTATION, "VirtualMachineRunnerImpl.java")).r("creating new persistent state for client %s", "VM_CLIENT");
                }
                return (bbc) optional.orElse(bcy.b);
            case 8:
                cbq cbqVar = (cbq) obj;
                bsp bspVarA = bpx.a();
                if (bspVarA != null && bspVarA.b() != null) {
                    return bspVarA.b();
                }
                brh.a(cbqVar.a());
                return new bra();
            case 9:
                return new cbt(((cbq) obj).a());
            case 10:
                cbq cbqVar2 = (cbq) obj;
                return new cdh(cbqVar2.a(), (bpz) cbqVar2.c(bpz.class), (bqm) cbqVar2.c(bqm.class), (bus) cbqVar2.c(bus.class), (ccb) cbqVar2.c(ccb.class), (cby) cbqVar2.c(cby.class));
            case 11:
                cbq cbqVar3 = (cbq) obj;
                return new cdi((cbu) cbqVar3.c(cbu.class), (cbx) cbqVar3.c(cbx.class), (bpz) cbqVar3.c(bpz.class), (bqm) cbqVar3.c(bqm.class), (bus) cbqVar3.c(bus.class), (ccb) cbqVar3.c(ccb.class), new cbp(cbqVar3.a(), (bqm) cbqVar3.c(bqm.class), ((bpz) cbqVar3.c(bpz.class)).M()));
            case 12:
                return brd.a;
            case 13:
                return cbr.c("");
            case 14:
                cbq cbqVar4 = (cbq) obj;
                bsp bspVarA2 = bpx.a();
                if (bspVarA2 != null && bspVarA2.c() != null) {
                    return bspVarA2.c();
                }
                Context contextA = cbqVar4.a();
                bpz bpzVar = (bpz) cbqVar4.c(bpz.class);
                cbu cbuVar = (cbu) cbqVar4.c(cbu.class);
                int i2 = bwl.c;
                return new bwl(contextA, bpzVar, cbuVar, bpzVar.aZ() ? new fuu(contextA) : null);
            case 15:
                return new brc(((cbq) obj).a());
            case 16:
                return crc.a;
            case 17:
                cbq cbqVar5 = (cbq) obj;
                return new bqr(cbqVar5.a(), (bqm) cbqVar5.c(bqm.class), brg.a);
            case 18:
                return brg.a((cbq) obj);
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                ciy ciyVar = new ciy();
                ciyVar.b(cjc.a);
                ciyVar.a = brf.a;
                ciyVar.b = new fcy(cxc.q(new cho(new fpf(((cbq) obj).a()))));
                return ciyVar.a();
            default:
                cbq cbqVar6 = (cbq) obj;
                return new bqs(cbqVar6.a(), (bqm) cbqVar6.c(bqm.class), bpx.a());
        }
    }
}
