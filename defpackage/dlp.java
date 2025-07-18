package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlp {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static dvi a(dvg dvgVar) {
        asr asrVar = (asr) dvi.a.createBuilder();
        int i = dvgVar.b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((dvi) asrVar.a).b = i;
        for (dvf dvfVar : dvgVar.c) {
            asr asrVar2 = (asr) dvh.a.createBuilder();
            dvc dvcVar = dvfVar.c;
            if (dvcVar == null) {
                dvcVar = dvc.a;
            }
            String str = dvcVar.b;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dvh dvhVar = (dvh) asrVar2.a;
            str.getClass();
            dvhVar.b = str;
            int iB = dvd.b(dvfVar.d);
            if (iB == 0) {
                iB = dvd.e;
            }
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((dvh) asrVar2.a).c = dvd.a(iB);
            dvn dvnVarB = dvn.b(dvfVar.f);
            if (dvnVarB == null) {
                dvnVarB = dvn.UNRECOGNIZED;
            }
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((dvh) asrVar2.a).e = dvnVarB.a();
            int i2 = dvfVar.e;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            ((dvh) asrVar2.a).d = i2;
            dvh dvhVar2 = (dvh) asrVar2.z();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dvi dviVar = (dvi) asrVar.a;
            dvhVar2.getClass();
            efm efmVar = dviVar.c;
            if (!efmVar.c()) {
                dviVar.c = efb.mutableCopy(efmVar);
            }
            dviVar.c.add(dvhVar2);
        }
        return (dvi) asrVar.z();
    }
}
