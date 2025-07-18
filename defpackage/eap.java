package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eap extends eah {
    final /* synthetic */ ebe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eap(ebe ebeVar, eol eolVar, feu feuVar) {
        super(ebeVar, eolVar, feuVar);
        this.e = ebeVar;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() {
        super.i();
        asr asrVar = (asr) eby.a.createBuilder();
        asr asrVar2 = (asr) ebw.a.createBuilder();
        String strC = this.e.b.c();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((ebw) asrVar2.a).b = strC;
        String strD = this.e.b.d();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((ebw) asrVar2.a).c = strD;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        feu feuVar = this.d;
        eby ebyVar = (eby) asrVar.a;
        ebw ebwVar = (ebw) asrVar2.z();
        ebwVar.getClass();
        ebyVar.c = ebwVar;
        ebyVar.b = 1;
        feuVar.c((eby) asrVar.z());
        return this;
    }

    @Override // defpackage.eaa
    public final String c() {
        return "SelectingDatabase";
    }

    @Override // defpackage.eae
    public final eae g(ecq ecqVar) throws eba {
        int iB = eco.b(ecqVar.b);
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        if (i == 0) {
            dzy dzyVar = (ecqVar.b == 1 ? (ecp) ecqVar.c : ecp.a).b;
            if (dzyVar == null) {
                dzyVar = dzy.a;
            }
            dzy dzyVar2 = dzyVar;
            return new eaq(this.e, this.c, dzyVar2, ebq.a(dzyVar2), this.d);
        }
        if (i != 1) {
            throw new IllegalStateException(String.format(Locale.US, "Unrecognized output: %s", eco.a(eco.b(ecqVar.b))));
        }
        ecn ecnVar = ecqVar.b == 2 ? (ecn) ecqVar.c : ecn.a;
        if (ecl.a(ecnVar.b).ordinal() != 0) {
            eaz eazVar = new eaz();
            eazVar.b("Select Database failed; unrecognized error code: %s", ecl.a(ecnVar.b));
            eazVar.a();
            eazVar.d = dgy.l;
            throw new eba(eazVar);
        }
        eaz eazVar2 = new eaz();
        eazVar2.b = "Select Database failed; no such database";
        eazVar2.a();
        eazVar2.d = dgy.k;
        throw new eba(eazVar2);
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.e;
    }
}
