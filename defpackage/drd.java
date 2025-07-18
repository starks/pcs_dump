package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drd extends dre implements dkz {
    public drd(String str, Class cls, egp egpVar) {
        super(str, cls, dvb.ASYMMETRIC_PRIVATE);
    }

    public final dvc e(eea eeaVar) throws GeneralSecurityException {
        Object objA = drt.a.a(dsf.a(this.a, eeaVar, this.c, dvn.RAW, null), dln.a);
        if (!(objA instanceof dlj)) {
            throw new GeneralSecurityException("Key not private key");
        }
        dsk dskVarC = drt.a.c(((dlj) objA).b(), dsf.class, dln.a);
        asr asrVar = (asr) dvc.a.createBuilder();
        dsf dsfVar = (dsf) dskVarC;
        String str = dsfVar.a;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dvc dvcVar = (dvc) asrVar.a;
        str.getClass();
        dvcVar.b = str;
        eea eeaVar2 = dsfVar.c;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dvc dvcVar2 = (dvc) asrVar.a;
        eeaVar2.getClass();
        dvcVar2.c = eeaVar2;
        dvb dvbVar = dsfVar.d;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvc) asrVar.a).d = dvbVar.a();
        return (dvc) asrVar.z();
    }
}
