package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
class atw implements Function {
    public static ajk a(atf atfVar) {
        asr asrVar = (asr) ajk.a.createBuilder();
        if ((atfVar.b & 1) != 0) {
            long j = atfVar.c;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar = (ajk) asrVar.a;
            ajkVar.b |= 1;
            ajkVar.c = j;
        }
        if ((atfVar.b & 2) != 0) {
            Function function = aue.a;
            ats atsVarB = ats.b(atfVar.d);
            if (atsVarB == null) {
                atsVarB = ats.TRAIN_UNDEFINED;
            }
            ein einVar = (ein) function.apply(atsVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar2 = (ajk) asrVar.a;
            ajkVar2.d = einVar.Z;
            ajkVar2.b |= 2;
        }
        if ((atfVar.b & 4) != 0) {
            String str = atfVar.e;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar3 = (ajk) asrVar.a;
            str.getClass();
            ajkVar3.b |= 4;
            ajkVar3.e = str;
        }
        if ((atfVar.b & 8) != 0) {
            long j2 = atfVar.f;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar4 = (ajk) asrVar.a;
            ajkVar4.b |= 8;
            ajkVar4.f = j2;
        }
        if ((atfVar.b & 16) != 0) {
            long j3 = atfVar.g;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar5 = (ajk) asrVar.a;
            ajkVar5.b |= 16;
            ajkVar5.g = j3;
        }
        if ((atfVar.b & 32) != 0) {
            long j4 = atfVar.h;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar6 = (ajk) asrVar.a;
            ajkVar6.b |= 32;
            ajkVar6.h = j4;
        }
        if ((atfVar.b & 64) != 0) {
            Function function2 = aue.b;
            atr atrVarB = atr.b(atfVar.i);
            if (atrVarB == null) {
                atrVarB = atr.TRAIN_ERROR_DEFAULT;
            }
            eil eilVar = (eil) function2.apply(atrVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar7 = (ajk) asrVar.a;
            ajkVar7.i = eilVar.e;
            ajkVar7.b |= 64;
        }
        if ((atfVar.b & 128) != 0) {
            long j5 = atfVar.j;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar8 = (ajk) asrVar.a;
            ajkVar8.b |= 128;
            ajkVar8.j = j5;
        }
        if ((atfVar.b & 256) != 0) {
            long j6 = atfVar.k;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar9 = (ajk) asrVar.a;
            ajkVar9.b |= 256;
            ajkVar9.k = j6;
        }
        if ((atfVar.b & 512) != 0) {
            long j7 = atfVar.l;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar10 = (ajk) asrVar.a;
            ajkVar10.b |= 512;
            ajkVar10.l = j7;
        }
        if ((atfVar.b & 1024) != 0) {
            String str2 = atfVar.m;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar11 = (ajk) asrVar.a;
            str2.getClass();
            ajkVar11.b |= 1024;
            ajkVar11.m = str2;
        }
        if ((atfVar.b & AIFeature.Id.PIXEL_AI_FEATURE_48) != 0) {
            long j8 = atfVar.n;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar12 = (ajk) asrVar.a;
            ajkVar12.b |= AIFeature.Id.PIXEL_AI_FEATURE_48;
            ajkVar12.n = j8;
        }
        if ((atfVar.b & 4096) != 0) {
            long j9 = atfVar.o;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar13 = (ajk) asrVar.a;
            ajkVar13.b |= 4096;
            ajkVar13.o = j9;
        }
        if ((atfVar.b & 8192) != 0) {
            long j10 = atfVar.p;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar14 = (ajk) asrVar.a;
            ajkVar14.b |= 8192;
            ajkVar14.p = j10;
        }
        if ((atfVar.b & 16384) != 0) {
            String str3 = atfVar.q;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar15 = (ajk) asrVar.a;
            str3.getClass();
            ajkVar15.b |= 16384;
            ajkVar15.q = str3;
        }
        if ((atfVar.b & 32768) != 0) {
            Function function3 = aue.c;
            atq atqVarB = atq.b(atfVar.r);
            if (atqVarB == null) {
                atqVarB = atq.TRAINING_DATA_SOURCE_UNDEFINED;
            }
            eik eikVar = (eik) function3.apply(atqVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar16 = (ajk) asrVar.a;
            ajkVar16.r = eikVar.d;
            ajkVar16.b |= 32768;
        }
        if ((atfVar.b & 65536) != 0) {
            long j11 = atfVar.s;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar17 = (ajk) asrVar.a;
            ajkVar17.b = 65536 | ajkVar17.b;
            ajkVar17.s = j11;
        }
        if ((atfVar.b & 131072) != 0) {
            long j12 = atfVar.t;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar18 = (ajk) asrVar.a;
            ajkVar18.b = 131072 | ajkVar18.b;
            ajkVar18.t = j12;
        }
        if ((atfVar.b & 262144) != 0) {
            Function function4 = aue.e;
            atj atjVarB = atj.b(atfVar.u);
            if (atjVarB == null) {
                atjVarB = atj.COLLECTION_NAME_UNDEFINED;
            }
            eie eieVar = (eie) function4.apply(atjVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar19 = (ajk) asrVar.a;
            ajkVar19.u = eieVar.e;
            ajkVar19.b |= 262144;
        }
        if ((atfVar.b & 524288) != 0) {
            Function function5 = aue.d;
            atl atlVarB = atl.b(atfVar.v);
            if (atlVarB == null) {
                atlVarB = atl.HISTOGRAM_COUNTER_UNDEFINED;
            }
            eif eifVar = (eif) function5.apply(atlVarB);
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ajk ajkVar20 = (ajk) asrVar.a;
            ajkVar20.v = eifVar.ae;
            ajkVar20.b |= 524288;
        }
        return (ajk) asrVar.z();
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return a((atf) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
