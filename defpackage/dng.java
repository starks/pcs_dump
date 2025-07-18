package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dng implements dsn {
    private final /* synthetic */ int a;

    public /* synthetic */ dng(int i) {
        this.a = i;
    }

    @Override // defpackage.dsn
    public final Object a() throws GeneralSecurityException {
        switch (this.a) {
            case 0:
                dmh dmhVar = dnh.a;
                enh enhVar = new enh((char[]) null, (byte[]) null);
                enhVar.k();
                enhVar.l(32);
                enhVar.m();
                enhVar.c = dmg.a;
                return enhVar.j();
            case 1:
                dmh dmhVar2 = dnh.a;
                enh enhVar2 = new enh((char[]) null, (byte[]) null);
                enhVar2.k();
                enhVar2.l(16);
                enhVar2.m();
                enhVar2.c = dmg.a;
                return enhVar2.j();
            case 2:
                dmh dmhVar3 = dnh.a;
                enh enhVar3 = new enh(null, null, null);
                enhVar3.o(16);
                enhVar3.p(16);
                enhVar3.q();
                enhVar3.d = dmb.a;
                return enhVar3.n();
            case 3:
                dmh dmhVar4 = dnh.a;
                enh enhVar4 = new enh(null, null, null);
                enhVar4.o(16);
                enhVar4.p(32);
                enhVar4.q();
                enhVar4.d = dmb.a;
                return enhVar4.n();
            case 4:
                dmh dmhVar5 = dnh.a;
                dpa dpaVar = new dpa(null);
                dpaVar.d(16);
                dpaVar.e(32);
                dpaVar.g(16);
                dpaVar.f(16);
                dpaVar.a = dlv.c;
                dpaVar.f = dlw.a;
                return dpaVar.c();
            case 5:
                dmh dmhVar6 = dnh.a;
                dpa dpaVar2 = new dpa(null);
                dpaVar2.d(32);
                dpaVar2.e(32);
                dpaVar2.g(32);
                dpaVar2.f(16);
                dpaVar2.a = dlv.c;
                dpaVar2.f = dlw.a;
                return dpaVar2.c();
            case 6:
                dmh dmhVar7 = dnh.a;
                return dnl.b(dnk.a, 12);
            case 7:
                dmh dmhVar8 = dnh.a;
                return dnl.b(dnk.b, 12);
            case 8:
                dmh dmhVar9 = dnh.a;
                return dnl.b(dnk.b, 8);
            case 9:
                dot dotVar = dow.a;
                eqh eqhVar = new eqh((byte[]) null);
                eqhVar.d(64);
                eqhVar.a = dos.a;
                return eqhVar.c();
            case 10:
                Set set = dpf.a;
                HashSet hashSet = new HashSet();
                enh enhVar5 = new enh((char[]) null, (byte[]) null);
                enhVar5.k();
                enhVar5.l(16);
                enhVar5.m();
                enhVar5.c = dmg.c;
                hashSet.add(enhVar5.j());
                enh enhVar6 = new enh((char[]) null, (byte[]) null);
                enhVar6.k();
                enhVar6.l(32);
                enhVar6.m();
                enhVar6.c = dmg.c;
                hashSet.add(enhVar6.j());
                dpa dpaVar3 = new dpa(null);
                dpaVar3.d(16);
                dpaVar3.e(32);
                dpaVar3.g(16);
                dpaVar3.f(16);
                dpaVar3.a = dlv.c;
                dpaVar3.f = dlw.c;
                hashSet.add(dpaVar3.c());
                dpa dpaVar4 = new dpa(null);
                dpaVar4.d(32);
                dpaVar4.e(32);
                dpaVar4.g(32);
                dpaVar4.f(16);
                dpaVar4.a = dlv.c;
                dpaVar4.f = dlw.c;
                hashSet.add(dpaVar4.c());
                hashSet.add(new dnp(dno.c));
                eqh eqhVar2 = new eqh((byte[]) null);
                eqhVar2.d(64);
                eqhVar2.a = dos.c;
                hashSet.add(eqhVar2.c());
                return DesugarCollections.unmodifiableSet(hashSet);
            case 11:
                drt drtVar = new drt();
                drtVar.g(new drx(drg.class, dsf.class, new dnd(14)));
                return drtVar;
            case 12:
                dtb dtbVar = dth.a;
                enh enhVar7 = new enh((byte[]) null, (byte[]) null);
                enhVar7.g(32);
                enhVar7.h(16);
                enhVar7.a = dta.a;
                enhVar7.b = dsz.c;
                return enhVar7.f();
            case 13:
                dtb dtbVar2 = dth.a;
                enh enhVar8 = new enh((byte[]) null, (byte[]) null);
                enhVar8.g(32);
                enhVar8.h(32);
                enhVar8.a = dta.a;
                enhVar8.b = dsz.c;
                return enhVar8.f();
            case 14:
                dtb dtbVar3 = dth.a;
                enh enhVar9 = new enh((byte[]) null, (byte[]) null);
                enhVar9.g(64);
                enhVar9.h(32);
                enhVar9.a = dta.a;
                enhVar9.b = dsz.e;
                return enhVar9.f();
            case 15:
                dtb dtbVar4 = dth.a;
                enh enhVar10 = new enh((byte[]) null, (byte[]) null);
                enhVar10.g(64);
                enhVar10.h(64);
                enhVar10.a = dta.a;
                enhVar10.b = dsz.e;
                return enhVar10.f();
            default:
                dtb dtbVar5 = dth.a;
                euw euwVar = new euw((byte[]) null, (byte[]) null);
                euwVar.d(32);
                euwVar.e(16);
                euwVar.c = dss.a;
                return euwVar.c();
        }
    }
}
