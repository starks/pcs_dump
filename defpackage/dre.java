package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dre implements dkz {
    final String a;
    final Class b;
    final dvb c;

    public dre(String str, Class cls, dvb dvbVar) {
        this.a = str;
        this.b = cls;
        this.c = dvbVar;
    }

    @Override // defpackage.dkz
    public final dvc a(eea eeaVar) throws GeneralSecurityException {
        asr asrVar = (asr) dve.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dve) asrVar.a).b = this.a;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dve dveVar = (dve) asrVar.a;
        eeaVar.getClass();
        dveVar.c = eeaVar;
        dvn dvnVar = dvn.RAW;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dve) asrVar.a).d = dvnVar.a();
        dsk dskVarC = drt.a.c(drn.a.a(drt.a.b(dsg.a((dve) asrVar.z())), null), dsf.class, dln.a);
        asr asrVar2 = (asr) dvc.a.createBuilder();
        dsf dsfVar = (dsf) dskVarC;
        String str = dsfVar.a;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dvc dvcVar = (dvc) asrVar2.a;
        str.getClass();
        dvcVar.b = str;
        eea eeaVar2 = dsfVar.c;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        dvc dvcVar2 = (dvc) asrVar2.a;
        eeaVar2.getClass();
        dvcVar2.c = eeaVar2;
        dvb dvbVar = dsfVar.d;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ((dvc) asrVar2.a).d = dvbVar.a();
        return (dvc) asrVar2.z();
    }

    @Override // defpackage.dkz
    public final Class b() {
        return this.b;
    }

    @Override // defpackage.dkz
    public final Object c(eea eeaVar) throws GeneralSecurityException {
        return drs.a.a(drt.a.a(dsf.a(this.a, eeaVar, this.c, dvn.RAW, null), dln.a), this.b);
    }

    @Override // defpackage.dkz
    public final String d() {
        return this.a;
    }
}
