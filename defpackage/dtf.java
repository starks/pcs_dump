package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dtf implements drz {
    private final /* synthetic */ int a;

    @Override // defpackage.drz
    public final Object a(dky dkyVar) throws GeneralSecurityException {
        if (this.a != 0) {
            return new dwr((dsx) dkyVar);
        }
        drg drgVar = (drg) dkyVar;
        dsf dsfVarB = drgVar.b(dln.a);
        asr asrVar = (asr) dvc.a.createBuilder();
        String str = dsfVarB.a;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dvc dvcVar = (dvc) asrVar.a;
        str.getClass();
        dvcVar.b = str;
        eea eeaVar = dsfVarB.c;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        dvc dvcVar2 = (dvc) asrVar.a;
        eeaVar.getClass();
        dvcVar2.c = eeaVar;
        dvb dvbVar = dsfVarB.d;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvc) asrVar.a).d = dvbVar.a();
        int iOrdinal = dsfVarB.e.ordinal();
        if (iOrdinal == 1) {
            dru.b(drgVar.a().intValue()).c();
        } else if (iOrdinal == 2) {
            dru.a(drgVar.a().intValue()).c();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            dru.a(drgVar.a().intValue()).c();
        } else {
            dru.a.c();
        }
        return new dtm(0);
    }
}
