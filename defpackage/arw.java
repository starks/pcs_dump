package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arw extends aph {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/fl/server/TrainerGrpcBindableService");
    public final Optional b;
    public final Executor c;
    private final aqr d;
    private final aqm e;

    public arw(aqm aqmVar, Optional optional, aqr aqrVar, Executor executor) {
        this.e = aqmVar;
        this.b = optional;
        this.d = aqrVar;
        this.c = executor;
    }

    @Override // defpackage.aph, defpackage.apg
    public final void a(apd apdVar, feu feuVar) {
        if (!this.d.l()) {
            asr asrVar = (asr) apf.a.createBuilder();
            int i = ape.d;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            apf apfVar = (apf) asrVar.a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            apfVar.c = i2;
            apfVar.b |= 1;
            feuVar.c((apf) asrVar.z());
            feuVar.b(new RuntimeException("Brella Trainer is not enabled."));
            return;
        }
        int iA = apa.a(apdVar.c);
        if (iA == 0) {
            iA = apa.a;
        }
        if (iA == apa.b) {
            this.e.b(apdVar, new aql(this, apdVar, feuVar, 2), new arn(apdVar, feuVar, 2));
            return;
        }
        int iA2 = apa.a(apdVar.c);
        if (iA2 == 0) {
            iA2 = apa.a;
        }
        if (iA2 == apa.c) {
            this.e.a(apdVar, new aql(this, apdVar, feuVar, 3), new arn(apdVar, feuVar, 3));
            return;
        }
        asr asrVar2 = (asr) apf.a.createBuilder();
        int i3 = ape.c;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        apf apfVar2 = (apf) asrVar2.a;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        apfVar2.c = i4;
        apfVar2.b |= 1;
        feuVar.c((apf) asrVar2.z());
        feuVar.a();
    }

    public final boolean c(apd apdVar) {
        if ((apdVar.b & 256) == 0) {
            return false;
        }
        int iA = apc.a(apdVar.k);
        if (iA == 0) {
            iA = apc.a;
        }
        return iA == apc.c && this.b.isPresent();
    }
}
