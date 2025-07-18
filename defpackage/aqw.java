package defpackage;

import android.os.SystemClock;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqw implements aqv {
    private static final czn b = czn.j("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager");
    private static final das c = akx.a;
    private static final cxo d = cxo.o(dfu.TRAIN_COMPUTATION_ERROR_TENSORFLOW, dfu.TRAIN_ELIGIBILITY_EVAL_COMPUTATION_ERROR_TENSORFLOW);
    public final avm a;
    private final aqr e;
    private final Random f = new Random();
    private final akp g;
    private final auh h;

    public aqw(aqr aqrVar, auh auhVar, akp akpVar, avm avmVar) {
        this.e = aqrVar;
        this.h = auhVar;
        this.g = akpVar;
        this.a = avmVar;
    }

    private static long m(long j) {
        return (j >>> 10) << 10;
    }

    private final void n(long j, long j2) {
        if (o()) {
            asr asrVar = (asr) atd.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            atd atdVar = (atd) asrVar.a;
            atdVar.b |= 1;
            atdVar.c = 173000L;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            atd atdVar2 = (atd) asrVar.a;
            atdVar2.b |= 2;
            atdVar2.d = j;
            if (j2 != 0) {
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                atd atdVar3 = (atd) asrVar.a;
                atdVar3.b |= 4;
                atdVar3.e = j2;
            }
            ((czl) ((czl) ((czl) b.c()).g(60, TimeUnit.MINUTES)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logDiag", 174, "FcClientStatsdLogManager.java")).p("Sending FL diagnosis log.");
            this.h.b((atd) asrVar.z());
        }
    }

    private final boolean o() {
        return this.f.nextInt(100) < this.e.c();
    }

    private final boolean p(egi egiVar) {
        aqr aqrVar = this.e;
        int serializedSize = egiVar.getSerializedSize();
        if (serializedSize > aqrVar.e()) {
            ((czl) ((czl) b.e()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "validateSerializedAtomSize", 488, "FcClientStatsdLogManager.java")).q("FL log event is larger [%d bytes] than size limit.", serializedSize);
            return false;
        }
        ((czl) ((czl) b.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "validateSerializedAtomSize", 493, "FcClientStatsdLogManager.java")).q("FL log event is of size [%d bytes].", serializedSize);
        return true;
    }

    public final long a(long j) {
        akp akpVar = this.g;
        return akpVar.a(akpVar.b(j));
    }

    @Override // defpackage.bqm
    public final bqj b(bql bqlVar, dfa dfaVar) {
        return new bwk(this, atz.d(bqlVar), dfaVar, SystemClock.elapsedRealtime(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.atl r8, defpackage.dfa r9, long r10) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqw.e(atl, dfa, long):void");
    }

    @Override // defpackage.bqm
    public final void f(bqk bqkVar, dfa dfaVar, long j) {
        e(atz.c(bqkVar), dfaVar, j);
    }

    @Override // defpackage.bqm
    public final void g(dyw dywVar, dfa dfaVar, long j) {
        e(atz.b(dywVar), dfaVar, j);
    }

    @Override // defpackage.bqm
    public final void h(ccd ccdVar) {
        ((dap) c.i().i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logDiag", 130, "FcClientStatsdLogManager.java")).r("DebugDiagCode: %s", ccdVar);
        if (this.e.bb() && this.e.ba()) {
            n(ccdVar.a(), 0L);
        }
    }

    @Override // defpackage.bqm
    public final void i(ccd ccdVar, String str) {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.bqm
    public final void j(dfa dfaVar) {
        if (dfaVar == null || !o()) {
            return;
        }
        this.a.b().isPresent();
        dfv dfvVar = dfaVar.d;
        if (dfvVar == null) {
            dfvVar = dfv.a;
        }
        dfp dfpVar = dfvVar.o;
        if (dfpVar == null) {
            dfpVar = dfp.a;
        }
        if (dfpVar.e != 0 || dfpVar.d != 0) {
            this.a.b().get().execute(new o(this, dfaVar, 20, (byte[]) null));
        }
        ((dap) c.i().i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logEvent", AIFeature.Id.MESSAGES_SUGGESTEDTEXT_PER_LAYER_GEM_2, "FcClientStatsdLogManager.java")).o(dfaVar);
        int i = dfaVar.b;
        if ((i & 64) != 0) {
            dfd dfdVar = dfaVar.e;
            if (dfdVar == null) {
                dfdVar = dfd.a;
            }
            if ((dfdVar.b & 4) != 0) {
                n(dfdVar.c, dfdVar.d);
                return;
            } else {
                n(dfdVar.c, 0L);
                return;
            }
        }
        if ((i & 4) == 0) {
            ((czl) ((czl) b.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logEvent", 119, "FcClientStatsdLogManager.java")).p("Unsupported type of log from FL.");
            return;
        }
        dfv dfvVar2 = dfaVar.d;
        if (dfvVar2 == null) {
            dfvVar2 = dfv.a;
        }
        if ((dfvVar2.b & 8192) != 0) {
            if (!this.e.j() || (dfvVar2.b & 8192) == 0) {
                return;
            }
            dgb dgbVar = dfvVar2.n;
            if (dgbVar == null) {
                dgbVar = dgb.a;
            }
            asr asrVar = (asr) ate.a.createBuilder();
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            ate ateVar = (ate) asrVar.a;
            ateVar.b |= 1;
            ateVar.c = 173000L;
            if ((dfvVar2.b & 16) != 0) {
                long j = dfvVar2.g;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar2 = (ate) asrVar.a;
                ateVar2.b |= 2;
                ateVar2.d = j;
            }
            if ((dfvVar2.b & 2) != 0) {
                String str = dfvVar2.d;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar3 = (ate) asrVar.a;
                str.getClass();
                ateVar3.b |= 4;
                ateVar3.e = str;
            }
            if ((dfvVar2.b & 4096) != 0) {
                String str2 = dfvVar2.m;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar4 = (ate) asrVar.a;
                str2.getClass();
                ateVar4.b |= 8;
                ateVar4.f = str2;
            }
            if ((dgbVar.b & 1) != 0) {
                long j2 = dgbVar.c;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar5 = (ate) asrVar.a;
                ateVar5.b |= 16;
                ateVar5.g = j2;
            }
            if ((dgbVar.b & 2) != 0) {
                long j3 = dgbVar.d;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar6 = (ate) asrVar.a;
                ateVar6.b |= 32;
                ateVar6.h = j3;
            }
            if ((dgbVar.b & 4) != 0) {
                int iA = dfz.a(dgbVar.e);
                if (iA == 0) {
                    iA = dfz.a;
                }
                int i2 = iA - 1;
                if (iA == 0) {
                    throw null;
                }
                ato atoVarB = ato.b(i2);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar7 = (ate) asrVar.a;
                ateVar7.i = atoVarB.k;
                ateVar7.b |= 64;
            }
            if ((dgbVar.b & 8) != 0) {
                long jA = a(dgbVar.f);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar8 = (ate) asrVar.a;
                ateVar8.b |= 128;
                ateVar8.j = jA;
            }
            if ((dgbVar.b & 16) != 0) {
                int iA2 = dga.a(dgbVar.g);
                if (iA2 == 0) {
                    iA2 = dga.a;
                }
                int i3 = iA2 - 1;
                if (iA2 == 0) {
                    throw null;
                }
                atp atpVarB = atp.b(i3);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar9 = (ate) asrVar.a;
                ateVar9.k = atpVarB.h;
                ateVar9.b |= 256;
            }
            if ((dgbVar.b & 32) != 0) {
                int iA3 = dfx.a(dgbVar.h);
                if (iA3 == 0) {
                    iA3 = dfx.a;
                }
                int i4 = iA3 - 1;
                if (iA3 == 0) {
                    throw null;
                }
                atm atmVarB = atm.b(i4);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar10 = (ate) asrVar.a;
                ateVar10.l = atmVarB.g;
                ateVar10.b |= 512;
            }
            if ((dgbVar.b & 64) != 0) {
                long j4 = dgbVar.i;
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar11 = (ate) asrVar.a;
                ateVar11.b |= 1024;
                ateVar11.m = j4;
            }
            if ((dgbVar.b & 128) != 0) {
                long jM = m(dgbVar.j);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar12 = (ate) asrVar.a;
                ateVar12.b |= AIFeature.Id.PIXEL_AI_FEATURE_48;
                ateVar12.n = jM;
            }
            if ((dgbVar.b & 256) != 0) {
                long jM2 = m(dgbVar.k);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar13 = (ate) asrVar.a;
                ateVar13.b |= 4096;
                ateVar13.o = jM2;
            }
            if ((dgbVar.b & 512) != 0) {
                int iA4 = dfy.a(dgbVar.l);
                if (iA4 == 0) {
                    iA4 = dfy.a;
                }
                int i5 = iA4 - 1;
                if (iA4 == 0) {
                    throw null;
                }
                atn atnVarB = atn.b(i5);
                if (!asrVar.a.isMutable()) {
                    asrVar.B();
                }
                ate ateVar14 = (ate) asrVar.a;
                ateVar14.p = atnVarB.i;
                ateVar14.b |= 8192;
            }
            ate ateVar15 = (ate) asrVar.z();
            if (p(ateVar15)) {
                ((czl) ((czl) ((czl) b.c()).g(60, TimeUnit.MINUTES)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logSecAggEvent", 466, "FcClientStatsdLogManager.java")).p("Sending FL SecAgg log.");
                this.h.c(ateVar15);
                return;
            }
            return;
        }
        asr asrVar2 = (asr) atf.a.createBuilder();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        atf.a((atf) asrVar2.a);
        if ((dfvVar2.b & 1) != 0) {
            dfu dfuVarB = dfu.b(dfvVar2.c);
            if (dfuVarB == null) {
                dfuVarB = dfu.TRAIN_UNDEFINED;
            }
            if (dfuVarB.equals(dfu.SECAGG_CLIENT_LOG_EVENT)) {
                ((czl) ((czl) b.e()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logTrainerEvent", 311, "FcClientStatsdLogManager.java")).p("Received secagg client log event without the message set. Dropping log.");
                return;
            }
            dfu dfuVarB2 = dfu.b(dfvVar2.c);
            if (dfuVarB2 == null) {
                dfuVarB2 = dfu.TRAIN_UNDEFINED;
            }
            ats atsVarB = ats.b(dfuVarB2.as);
            if (atsVarB == null) {
                ((czl) ((czl) b.e()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "translateTrainingEventKind", 547, "FcClientStatsdLogManager.java")).q("Encountered unknown kind of TrainingEvent: [%d]", dfuVarB2.as);
                atsVarB = ats.TRAIN_UNDEFINED;
            }
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar = (atf) asrVar2.a;
            atfVar.d = atsVarB.Z;
            atfVar.b |= 2;
        }
        if ((dfvVar2.b & 2) != 0) {
            String str3 = dfvVar2.d;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar2 = (atf) asrVar2.a;
            str3.getClass();
            atfVar2.b |= 4;
            atfVar2.e = str3;
        }
        if ((dfvVar2.b & 4) != 0) {
            long jA2 = a(dfvVar2.e);
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar3 = (atf) asrVar2.a;
            atfVar3.b |= 8;
            atfVar3.f = jA2;
        }
        if ((dfvVar2.b & 8) != 0) {
            long j5 = dfvVar2.f;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar4 = (atf) asrVar2.a;
            atfVar4.b |= 16;
            atfVar4.g = j5;
        }
        if ((dfvVar2.b & 16) != 0) {
            long j6 = dfvVar2.g;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar5 = (atf) asrVar2.a;
            atfVar5.b |= 32;
            atfVar5.h = j6;
        }
        if ((dfvVar2.b & 256) != 0) {
            int iA5 = dft.a(dfvVar2.j);
            if (iA5 == 0) {
                iA5 = dft.a;
            }
            int i6 = iA5 - 1;
            if (iA5 == 0) {
                throw null;
            }
            atr atrVarB = atr.b(i6);
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar6 = (atf) asrVar2.a;
            atfVar6.i = atrVarB.e;
            atfVar6.b |= 64;
        }
        if ((dfvVar2.b & 512) != 0) {
            dfq dfqVar = dfvVar2.k;
            if (dfqVar == null) {
                dfqVar = dfq.a;
            }
            if ((dfqVar.b & 1) != 0) {
                long jM3 = m(dfqVar.c);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar7 = (atf) asrVar2.a;
                atfVar7.b |= 128;
                atfVar7.j = jM3;
            }
            if ((dfqVar.b & 2) != 0) {
                long jM4 = m(dfqVar.d);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar8 = (atf) asrVar2.a;
                atfVar8.b |= 256;
                atfVar8.k = jM4;
            }
            if ((dfqVar.b & 4) != 0) {
                long jM5 = m(dfqVar.e);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar9 = (atf) asrVar2.a;
                atfVar9.b |= 512;
                atfVar9.l = jM5;
            }
            if ((dfqVar.b & 8) != 0) {
                long jM6 = m(dfqVar.f);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar10 = (atf) asrVar2.a;
                atfVar10.b |= 65536;
                atfVar10.s = jM6;
            }
        }
        if ((dfvVar2.b & 4096) != 0) {
            String str4 = dfvVar2.m;
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar11 = (atf) asrVar2.a;
            str4.getClass();
            atfVar11.b |= 1024;
            atfVar11.m = str4;
        }
        if ((dfvVar2.b & 16384) != 0) {
            dfp dfpVar2 = dfvVar2.o;
            if (dfpVar2 == null) {
                dfpVar2 = dfp.a;
            }
            if ((dfpVar2.b & 2) != 0) {
                long jA3 = a(dfpVar2.c);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar12 = (atf) asrVar2.a;
                atfVar12.b |= AIFeature.Id.PIXEL_AI_FEATURE_48;
                atfVar12.n = jA3;
            }
            if ((dfpVar2.b & 16) != 0) {
                long jM7 = m(dfpVar2.d);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar13 = (atf) asrVar2.a;
                atfVar13.b |= 4096;
                atfVar13.o = jM7;
            }
            if ((dfpVar2.b & 32) != 0) {
                long jM8 = m(dfpVar2.e);
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                atf atfVar14 = (atf) asrVar2.a;
                atfVar14.b |= 8192;
                atfVar14.p = jM8;
            }
        }
        if ((dfvVar2.b & 32768) != 0 && this.e.i()) {
            int iA6 = dft.a(dfvVar2.j);
            if (iA6 == 0) {
                iA6 = dft.a;
            }
            dfu dfuVarB3 = dfu.b(dfvVar2.c);
            if (dfuVarB3 == null) {
                dfuVarB3 = dfu.TRAIN_UNDEFINED;
            }
            String strSubstring = dfvVar2.p;
            boolean z = iA6 == dft.b;
            if (iA6 == 0) {
                throw null;
            }
            if (z || d.contains(dfuVarB3)) {
                cxc cxcVar = aqy.b;
                int i7 = ((cyp) cxcVar).c;
                int i8 = 0;
                while (true) {
                    if (i8 >= i7) {
                        strSubstring = "<redacted>";
                        break;
                    }
                    Matcher matcher = ((Pattern) cxcVar.get(i8)).matcher(strSubstring);
                    i8++;
                    if (matcher.find()) {
                        String strA = aqy.a(matcher, 1);
                        Matcher matcher2 = aqy.a.matcher(aqy.a(matcher, 2));
                        strSubstring = String.format("%s: %s", strA, matcher2.find() ? aqy.a(matcher2, 1) : "<redacted>");
                    }
                }
            }
            if (strSubstring.length() > 160) {
                strSubstring = strSubstring.substring(0, 160);
            }
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar15 = (atf) asrVar2.a;
            strSubstring.getClass();
            atfVar15.b |= 16384;
            atfVar15.q = strSubstring;
        }
        if ((dfvVar2.b & 262144) != 0) {
            int iA7 = dfs.a(dfvVar2.r);
            if (iA7 == 0) {
                iA7 = dfs.a;
            }
            int i9 = iA7 - 1;
            if (iA7 == 0) {
                throw null;
            }
            atq atqVarB = atq.b(i9);
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            atf atfVar16 = (atf) asrVar2.a;
            atfVar16.r = atqVarB.d;
            atfVar16.b |= 32768;
        }
        atf atfVar17 = (atf) asrVar2.z();
        if (p(atfVar17)) {
            ((czl) ((czl) ((czl) b.c()).g(60, TimeUnit.MINUTES)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/logging/statsd/FcClientStatsdLogManager", "logTrainerEvent", 394, "FcClientStatsdLogManager.java")).p("Sending FL Training log.");
            this.h.d(atfVar17);
        }
    }

    @Override // defpackage.bqm
    public final void k(int i) {
        if (this.e.bb()) {
            n(ccj.a(i), 0L);
        }
    }

    @Override // defpackage.bqm
    public final void l(int i, String str) {
        throw null;
    }

    @Override // defpackage.bqm
    public final void d() {
    }

    @Override // defpackage.bqm
    public final dfa c(dfa dfaVar) {
        return dfaVar;
    }
}
