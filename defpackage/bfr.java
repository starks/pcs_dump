package defpackage;

import android.os.Build;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfr extends bfd {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/survey/service/SurveyGrpcBindableService");
    public final fqu b;
    public final Executor c;
    public final aoa d;
    public final aor e;
    public final Map f = new HashMap();
    public final avm g;
    public final auh h;

    public bfr(fqu fquVar, avm avmVar, Executor executor, auh auhVar, aoa aoaVar, aor aorVar) {
        this.b = fquVar;
        this.g = avmVar;
        this.h = auhVar;
        this.d = aoaVar;
        this.e = aorVar;
        this.c = executor;
    }

    public static djy d(String str, List list, byte[] bArr, aoa aoaVar, avm avmVar, auh auhVar, aor aorVar, fqu fquVar) throws Throwable {
        fqs fqsVar;
        Matcher matcher;
        dki dkiVar = new dki();
        if (!((bfm) aoaVar.b()).a()) {
            ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/survey/service/SurveyGrpcBindableService", "isConfigEnabled", 321, "SurveyGrpcBindableService.java")).p("Survey feature is not enabled");
            dkiVar.e(new IllegalArgumentException("Survey feature is not enabled."));
            return dkiVar;
        }
        if (!str.startsWith("https://")) {
            ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/survey/service/SurveyGrpcBindableService", "isValidHttpsUrl", 332, "SurveyGrpcBindableService.java")).p("Rejected non HTTPS url request to PCS");
            dkiVar.e(new IllegalArgumentException(String.format("Rejecting non HTTPS url: '%s'", str)));
            return dkiVar;
        }
        if (!avmVar.e(auw.SURVEY_REQUEST, str)) {
            asr asrVar = (asr) atc.a.createBuilder();
            atk atkVar = atk.PCS_NETWORK_USAGE_LOG_UNRECOGNISED_REQUEST;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            atc atcVar = (atc) asrVar.a;
            atcVar.c = atkVar.H;
            atcVar.b |= 1;
            auhVar.a((atc) asrVar.z());
            if (aorVar.a()) {
                asr asrVar2 = (asr) ath.a.createBuilder();
                atg atgVar = atg.HTTP;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ath athVar = (ath) asrVar2.a;
                athVar.c = atgVar.g;
                athVar.b |= 1;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ath athVar2 = (ath) asrVar2.a;
                str.getClass();
                athVar2.b |= 2;
                athVar2.d = str;
                auhVar.e((ath) asrVar2.z());
            }
            ((czl) ((czl) a.c()).i("com/google/android/apps/miphone/astrea/survey/service/SurveyGrpcBindableService", "logUnrecognizedRequest", 360, "SurveyGrpcBindableService.java")).r("Network usage log unrecognised HTTPS request for %s", str);
        }
        if (avmVar.i(auw.SURVEY_REQUEST, str)) {
            avo avoVarB = avo.b(str);
            ((czl) ((czl) ((czl) a.e()).h(avoVarB)).i("com/google/android/apps/miphone/astrea/survey/service/SurveyGrpcBindableService", "shouldRejectRequest", (char) 371, "SurveyGrpcBindableService.java")).p("Rejected unknown HTTPS request to PCS");
            asr asrVar3 = (asr) eit.a.createBuilder();
            int i = eql.INVALID_ARGUMENT.r;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            ((eit) asrVar3.a).b = i;
            asr asrVar4 = (asr) bfk.a.createBuilder();
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            bfk bfkVar = (bfk) asrVar4.a;
            str.getClass();
            bfkVar.b |= 1;
            bfkVar.c = str;
            asrVar3.j(asa.a((bfk) asrVar4.z()));
            if (avoVarB.getMessage() != null) {
                String message = avoVarB.getMessage();
                if (!asrVar3.a.isMutable()) {
                    asrVar3.B();
                }
                eit eitVar = (eit) asrVar3.a;
                message.getClass();
                eitVar.c = message;
            }
            dkiVar.e(asa.b((eit) asrVar3.z()));
            return dkiVar;
        }
        fqw fqwVarC = new fqw().c(str);
        Pattern pattern = fqs.a;
        try {
            matcher = fqs.a.matcher("application/x-protobuf");
        } catch (IllegalArgumentException unused) {
            fqsVar = null;
        }
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(a.z("application/x-protobuf", "No subtype found for: \"", "\""));
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        strGroup.toLowerCase(locale).getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        Locale locale2 = Locale.US;
        locale2.getClass();
        strGroup2.toLowerCase(locale2).getClass();
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = fqs.b.matcher("application/x-protobuf");
        int iEnd = matcher.end();
        while (iEnd < 22) {
            matcher2.region(iEnd, 22);
            if (!matcher2.lookingAt()) {
                String strSubstring = "application/x-protobuf".substring(iEnd);
                strSubstring.getClass();
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + strSubstring + "\" for: \"application/x-protobuf\"");
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (fjz.E(strGroup4, "'") && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    strGroup4.getClass();
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        fqsVar = new fqs();
        fqw fqwVarB = fqwVarC.b("POST", fwv.B(bArr, fqsVar, bArr.length));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ben benVar = (ben) it.next();
            Iterator it2 = benVar.d.iterator();
            while (it2.hasNext()) {
                fqwVarB.e(benVar.c, (String) it2.next());
            }
        }
        try {
            frb frbVarD = new frw(fquVar, fqwVarB.d()).d();
            int i2 = frbVarD.d;
            if (i2 < 200 || i2 >= 300) {
                e(avmVar, str, 2, 0L);
                dkiVar.e(new Exception("Survey request failed"));
            } else {
                frd frdVar = frbVarD.g;
                if (frdVar == null) {
                    e(avmVar, str, 2, 0L);
                    dkiVar.e(new Exception("Survey response is null"));
                } else {
                    long jA = frdVar.a();
                    if (jA > 2147483647L) {
                        throw new IOException(a.C(jA, "Cannot buffer entire body for content length: "));
                    }
                    fvm fvmVarB = frdVar.b();
                    try {
                        byte[] bArrF = fvmVarB.F();
                        fjp.x(fvmVarB, null);
                        int length = bArrF.length;
                        if (jA != -1 && jA != length) {
                            throw new IOException("Content-Length (" + jA + ") and stream length (" + length + ") disagree");
                        }
                        e(avmVar, str, 1, length);
                        asr asrVar5 = (asr) beq.a.createBuilder();
                        asr asrVar6 = (asr) bev.a.createBuilder();
                        int i3 = frbVarD.d;
                        if (!asrVar6.a.isMutable()) {
                            asrVar6.B();
                        }
                        bev bevVar = (bev) asrVar6.a;
                        bevVar.b |= 1;
                        bevVar.c = i3;
                        for (String str2 : frbVarD.f.f()) {
                            asr asrVar7 = (asr) ben.a.createBuilder();
                            if (!asrVar7.a.isMutable()) {
                                asrVar7.B();
                            }
                            ben benVar2 = (ben) asrVar7.a;
                            str2.getClass();
                            benVar2.b |= 1;
                            benVar2.c = str2;
                            List listE = frbVarD.f.e(str2);
                            if (!asrVar7.a.isMutable()) {
                                asrVar7.B();
                            }
                            ben benVar3 = (ben) asrVar7.a;
                            efm efmVar = benVar3.d;
                            if (!efmVar.c()) {
                                benVar3.d = efb.mutableCopy(efmVar);
                            }
                            edg.addAll(listE, benVar3.d);
                            ben benVar4 = (ben) asrVar7.z();
                            if (!asrVar6.a.isMutable()) {
                                asrVar6.B();
                            }
                            bev bevVar2 = (bev) asrVar6.a;
                            benVar4.getClass();
                            efm efmVar2 = bevVar2.d;
                            if (!efmVar2.c()) {
                                bevVar2.d = efb.mutableCopy(efmVar2);
                            }
                            bevVar2.d.add(benVar4);
                        }
                        bev bevVar3 = (bev) asrVar6.z();
                        if (!asrVar5.a.isMutable()) {
                            asrVar5.B();
                        }
                        beq beqVar = (beq) asrVar5.a;
                        bevVar3.getClass();
                        beqVar.c = bevVar3;
                        beqVar.b |= 1;
                        asr asrVar8 = (asr) beu.a.createBuilder();
                        eea eeaVarR = eea.r(bArrF);
                        if (!asrVar8.a.isMutable()) {
                            asrVar8.B();
                        }
                        beu beuVar = (beu) asrVar8.a;
                        beuVar.b = 1 | beuVar.b;
                        beuVar.c = eeaVarR;
                        beu beuVar2 = (beu) asrVar8.z();
                        if (!asrVar5.a.isMutable()) {
                            asrVar5.B();
                        }
                        beq beqVar2 = (beq) asrVar5.a;
                        beuVar2.getClass();
                        beqVar2.d = beuVar2;
                        beqVar2.b |= 2;
                        dkiVar.d((beq) asrVar5.z());
                    } finally {
                    }
                }
            }
        } catch (IOException e) {
            e(avmVar, str, 2, 0L);
            dkiVar.e(e);
        }
        return dkiVar;
    }

    private static void e(avm avmVar, String str, int i, long j) {
        if (!avmVar.h(auw.SURVEY_REQUEST, str) || avmVar.a().isEmpty()) {
            return;
        }
        aux auxVar = (aux) ((avs) avmVar.a().get()).i(str).get();
        clq.v(auxVar.b() == auw.SURVEY_REQUEST);
        clq.v(auxVar.a().b == 7);
        auj aujVarA = auxVar.a();
        clq.v(str.matches((aujVarA.b == 7 ? (aup) aujVarA.c : aup.a).c));
        avmVar.d(ayg.g(auxVar, i, j, str));
    }

    @Override // defpackage.bfd, defpackage.bfb
    public final void a(bes besVar, feu feuVar) {
        String str = besVar.b;
        efm efmVar = besVar.c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(DesugarTimeZone.getTimeZone(TimeZone.getDefault().getID()).getRawOffset());
        asr asrVar = (asr) bec.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((bec) asrVar.a).b = seconds;
        bec becVar = (bec) asrVar.z();
        asr asrVar2 = (asr) bfh.a.createBuilder();
        asr asrVar3 = (asr) bfj.a.createBuilder();
        bfg bfgVarB = bfg.b(besVar.d);
        if (bfgVarB == null) {
            bfgVarB = bfg.UNRECOGNIZED;
        }
        if (bfgVarB.ordinal() != 1) {
            throw new IllegalArgumentException("Unknown survey trigger id");
        }
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((bfj) asrVar3.a).b = "BUm9xoo5m0qDdAHCFS70Qnvr8ZNC";
        String languageTag = Locale.getDefault().toLanguageTag();
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        bfj bfjVar = (bfj) asrVar3.a;
        languageTag.getClass();
        efm efmVar2 = bfjVar.c;
        if (!efmVar2.c()) {
            bfjVar.c = efb.mutableCopy(efmVar2);
        }
        bfjVar.c.add(languageTag);
        boolean z = besVar.e;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((bfj) asrVar3.a).d = z;
        bfj bfjVar2 = (bfj) asrVar3.z();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        bfh bfhVar = (bfh) asrVar2.a;
        bfjVar2.getClass();
        bfhVar.c = bfjVar2;
        bfhVar.b |= 1;
        asr asrVar4 = (asr) beb.a.createBuilder();
        asr asrVar5 = (asr) bdy.a.createBuilder();
        asr asrVar6 = (asr) bdx.a.createBuilder();
        String str2 = Build.MODEL;
        if (!asrVar6.a.isMutable()) {
            asrVar6.B();
        }
        bdx bdxVar = (bdx) asrVar6.a;
        str2.getClass();
        bdxVar.b = str2;
        String str3 = Build.VERSION.RELEASE;
        if (!asrVar6.a.isMutable()) {
            asrVar6.B();
        }
        bdx bdxVar2 = (bdx) asrVar6.a;
        str3.getClass();
        bdxVar2.d = str3;
        int i = bdw.b;
        if (!asrVar6.a.isMutable()) {
            asrVar6.B();
        }
        ((bdx) asrVar6.a).c = bdw.a(i);
        int iA = bey.a(besVar.h);
        if (iA == 0) {
            iA = bey.c;
        }
        if (iA == 0) {
            throw null;
        }
        if (iA - 2 != 1) {
            throw new IllegalArgumentException("Unknown survey app id for getSurveyAppId");
        }
        if (!asrVar6.a.isMutable()) {
            asrVar6.B();
        }
        ((bdx) asrVar6.a).f = "com.google.android.as";
        int iA2 = bey.a(besVar.h);
        if (iA2 == 0) {
            iA2 = bey.c;
        }
        int i2 = iA2 - 2;
        if (iA2 == 0) {
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalArgumentException("Unknown survey app id for getSurveyAppName");
        }
        if (!asrVar6.a.isMutable()) {
            asrVar6.B();
        }
        ((bdx) asrVar6.a).e = "Android System Intelligence";
        String strValueOf = String.valueOf(besVar.g);
        if (!asrVar6.a.isMutable()) {
            asrVar6.B();
        }
        bdx bdxVar3 = (bdx) asrVar6.a;
        strValueOf.getClass();
        bdxVar3.g = strValueOf;
        if (!asrVar5.a.isMutable()) {
            asrVar5.B();
        }
        bdy bdyVar = (bdy) asrVar5.a;
        bdx bdxVar4 = (bdx) asrVar6.z();
        bdxVar4.getClass();
        bdyVar.c = bdxVar4;
        bdyVar.b |= 1;
        if (!asrVar5.a.isMutable()) {
            asrVar5.B();
        }
        bdy bdyVar2 = (bdy) asrVar5.a;
        becVar.getClass();
        bdyVar2.d = becVar;
        bdyVar2.b |= 2;
        if (!asrVar4.a.isMutable()) {
            asrVar4.B();
        }
        beb bebVar = (beb) asrVar4.a;
        bdy bdyVar3 = (bdy) asrVar5.z();
        bdyVar3.getClass();
        bebVar.c = bdyVar3;
        bebVar.b |= 1;
        asr asrVar7 = (asr) bea.a.createBuilder();
        int i3 = bdz.c;
        if (!asrVar7.a.isMutable()) {
            asrVar7.B();
        }
        ((bea) asrVar7.a).b = bdz.a(i3);
        int i4 = bdv.a;
        if (!asrVar7.a.isMutable()) {
            asrVar7.B();
        }
        bea beaVar = (bea) asrVar7.a;
        if (i4 == 0) {
            throw null;
        }
        efi efiVar = beaVar.c;
        if (!efiVar.c()) {
            beaVar.c = efb.mutableCopy(efiVar);
        }
        beaVar.c.g(bdv.a(i4));
        int i5 = besVar.f;
        if (!asrVar7.a.isMutable()) {
            asrVar7.B();
        }
        ((bea) asrVar7.a).d = i5;
        if (!asrVar4.a.isMutable()) {
            asrVar4.B();
        }
        beb bebVar2 = (beb) asrVar4.a;
        bea beaVar2 = (bea) asrVar7.z();
        beaVar2.getClass();
        bebVar2.d = beaVar2;
        bebVar2.b |= 2;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        bfh bfhVar2 = (bfh) asrVar2.a;
        beb bebVar3 = (beb) asrVar4.z();
        bebVar3.getClass();
        bfhVar2.d = bebVar3;
        bfhVar2.b |= 2;
        cnx.J(d(str, efmVar, ((bfh) asrVar2.z()).toByteArray(), this.d, this.g, this.h, this.e, this.b), new erq(this, feuVar, besVar, 1), diy.a);
    }

    @Override // defpackage.bfd, defpackage.bfb
    public final void c(ber berVar, feu feuVar) {
        String str = berVar.b;
        efm efmVar = berVar.c;
        asr asrVar = (asr) bff.a.createBuilder();
        int iA = bex.a(berVar.d);
        if (iA == 0) {
            iA = bex.c;
        }
        if (iA == 0) {
            throw null;
        }
        if (iA - 2 != 1) {
            throw new IllegalArgumentException("Unknown startup config id");
        }
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((bff) asrVar.a).b = "AIzaSyDw25bWXjMGHVYLT-2_tLCm0xtNVcIORkw";
        int i = bdz.c;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ((bff) asrVar.a).c = bdz.a(i);
        cnx.J(d(str, efmVar, ((bff) asrVar.z()).toByteArray(), this.d, this.g, this.h, this.e, this.b), new ars(feuVar, 4), diy.a);
    }
}
