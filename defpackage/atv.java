package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
class atv implements Function {
    public static ajj a(ate ateVar) {
        asr asrVar = (asr) ajj.a.createBuilder();
        if ((ateVar.b & 1) != 0) {
            long j = ateVar.c;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar = (ajj) asrVar.a;
            ajjVar.b |= 1;
            ajjVar.c = j;
        }
        if ((ateVar.b & 2) != 0) {
            long j2 = ateVar.d;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar2 = (ajj) asrVar.a;
            ajjVar2.b |= 2;
            ajjVar2.d = j2;
        }
        if ((ateVar.b & 4) != 0) {
            String str = ateVar.e;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar3 = (ajj) asrVar.a;
            str.getClass();
            ajjVar3.b |= 4;
            ajjVar3.e = str;
        }
        if ((ateVar.b & 8) != 0) {
            String str2 = ateVar.f;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar4 = (ajj) asrVar.a;
            str2.getClass();
            ajjVar4.b |= 8;
            ajjVar4.f = str2;
        }
        if ((ateVar.b & 16) != 0) {
            long j3 = ateVar.g;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar5 = (ajj) asrVar.a;
            ajjVar5.b |= 16;
            ajjVar5.g = j3;
        }
        if ((ateVar.b & 32) != 0) {
            long j4 = ateVar.h;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar6 = (ajj) asrVar.a;
            ajjVar6.b |= 32;
            ajjVar6.h = j4;
        }
        if ((ateVar.b & 64) != 0) {
            Function function = aud.a;
            ato atoVarB = ato.b(ateVar.i);
            if (atoVarB == null) {
                atoVarB = ato.CLIENT_UNDEFINED_EVENT;
            }
            eii eiiVar = (eii) function.apply(atoVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar7 = (ajj) asrVar.a;
            ajjVar7.i = eiiVar.k;
            ajjVar7.b |= 64;
        }
        if ((ateVar.b & 128) != 0) {
            long j5 = ateVar.j;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar8 = (ajj) asrVar.a;
            ajjVar8.b |= 128;
            ajjVar8.j = j5;
        }
        if ((ateVar.b & 256) != 0) {
            Function function2 = aud.c;
            atp atpVarB = atp.b(ateVar.k);
            if (atpVarB == null) {
                atpVarB = atp.CLIENT_UNDEFINED_ROUND;
            }
            eij eijVar = (eij) function2.apply(atpVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar9 = (ajj) asrVar.a;
            ajjVar9.k = eijVar.h;
            ajjVar9.b |= 256;
        }
        if ((ateVar.b & 512) != 0) {
            Function function3 = aud.b;
            atm atmVarB = atm.b(ateVar.l);
            if (atmVarB == null) {
                atmVarB = atm.UNDEFINED_CRYPTO_OPERATION;
            }
            eig eigVar = (eig) function3.apply(atmVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar10 = (ajj) asrVar.a;
            ajjVar10.l = eigVar.g;
            ajjVar10.b |= 512;
        }
        if ((ateVar.b & 1024) != 0) {
            long j6 = ateVar.m;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar11 = (ajj) asrVar.a;
            ajjVar11.b |= 1024;
            ajjVar11.m = j6;
        }
        if ((ateVar.b & AIFeature.Id.PIXEL_AI_FEATURE_48) != 0) {
            long j7 = ateVar.n;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar12 = (ajj) asrVar.a;
            ajjVar12.b |= AIFeature.Id.PIXEL_AI_FEATURE_48;
            ajjVar12.n = j7;
        }
        if ((ateVar.b & 4096) != 0) {
            long j8 = ateVar.o;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar13 = (ajj) asrVar.a;
            ajjVar13.b |= 4096;
            ajjVar13.o = j8;
        }
        if ((ateVar.b & 8192) != 0) {
            Function function4 = aud.d;
            atn atnVarB = atn.b(ateVar.p);
            if (atnVarB == null) {
                atnVarB = atn.CLIENT_UNDEFINED_ERROR;
            }
            eih eihVar = (eih) function4.apply(atnVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajj ajjVar14 = (ajj) asrVar.a;
            ajjVar14.p = eihVar.i;
            ajjVar14.b |= 8192;
        }
        return (ajj) asrVar.z();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return a((ate) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
