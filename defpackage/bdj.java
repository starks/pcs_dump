package defpackage;

import android.net.Uri;
import com.google.android.apps.aicore.aidl.AIFeature;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdj extends bdf {
    public static final das a = das.k("SP.PIR");
    static final cbx b = new bdi();
    private final Executor c;
    private final aor d;
    private final dzw e;
    private final avm f;
    private final auh g;

    public bdj(dzw dzwVar, Executor executor, avm avmVar, auh auhVar, aor aorVar) {
        this.e = dzwVar;
        this.c = executor;
        this.f = avmVar;
        this.g = auhVar;
        this.d = aorVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.bdf, defpackage.bde
    public final void a(bdc bdcVar, feu feuVar) throws NumberFormatException {
        Optional optionalEmpty;
        int i = 1;
        if (!this.f.e(auw.PIR, bdcVar.b)) {
            auh auhVar = this.g;
            asr asrVar = (asr) atc.a.createBuilder();
            atk atkVar = atk.PCS_NETWORK_USAGE_LOG_UNRECOGNISED_REQUEST;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            atc atcVar = (atc) asrVar.a;
            atcVar.c = atkVar.H;
            atcVar.b |= 1;
            auhVar.a((atc) asrVar.z());
            if (this.d.a()) {
                auh auhVar2 = this.g;
                asr asrVar2 = (asr) ath.a.createBuilder();
                atg atgVar = atg.PIR;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ath athVar = (ath) asrVar2.a;
                athVar.c = atgVar.g;
                athVar.b |= 1;
                String str = bdcVar.b;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ath athVar2 = (ath) asrVar2.a;
                str.getClass();
                athVar2.b |= 2;
                athVar2.d = str;
                auhVar2.e((ath) asrVar2.z());
            }
            ((dap) ((dap) a.c()).i("com/google/android/apps/miphone/astrea/pir/service/PirGrpcBindableService", "download", AIFeature.Id.LLM_PER_LAYER_GEM, "PirGrpcBindableService.java")).r("Network usage log unrecognised PIR request for %s", bdcVar.b);
        }
        if (this.f.i(auw.PIR, bdcVar.b)) {
            b.j(avo.b(bdcVar.b), "Rejected unknown PIR request to PCS");
            feuVar.b(avo.b(bdcVar.b));
            return;
        }
        String str2 = bdcVar.b;
        str2.getClass();
        try {
            Uri uri = Uri.parse(str2);
            String scheme = uri.getScheme();
            scheme.getClass();
            String host = uri.getHost();
            host.getClass();
            int port = uri.getPort();
            String path = uri.getPath();
            path.getClass();
            if (!path.startsWith("/")) {
                throw new IllegalArgumentException("PIR Uri path did not start with /");
            }
            String[] strArrSplit = path.substring(1).split("/", 4);
            if (strArrSplit.length < 3) {
                throw new IllegalArgumentException("PIR Uri lacked valid database name/version/entry");
            }
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            try {
                int i2 = Integer.parseInt(strArrSplit[2]);
                String lowerCase = scheme.toLowerCase(Locale.US);
                if (port < 0) {
                    port = 443;
                }
                ebi ebiVar = new ebi(str2, lowerCase, host, port, str3, str4, i2);
                String strF = ebiVar.f();
                String str5 = (strF.hashCode() == 111001 && strF.equals("pir")) ? clq.O(ebiVar.e()) ? "PIR Uri lacked valid host" : (ebiVar.b() <= 0 || ebiVar.b() > 65535) ? "PIR Uri lacked valid port" : clq.O(ebiVar.c()) ? "PIR Uri had empty database name" : clq.O(ebiVar.d()) ? "PIR Uri had empty database version" : ebiVar.a() < 0 ? "PIR Uri had negative entry index" : null : "Not a valid PIR scheme.";
                if (str5 != null) {
                    throw new IllegalArgumentException(str5);
                }
                bnz bnzVar = new bnz((byte[]) null);
                bdh bdhVar = new bdh(feuVar, this.f, bnzVar, bdcVar.b);
                egc egcVar = new egc(feuVar, bdhVar, bnzVar, bdcVar.b);
                try {
                    ebd ebdVarA = this.e.a();
                    ebdVarA.d = bdcVar.c;
                    ebd ebdVarA2 = ebdVarA.a();
                    ebdVarA2.i = b;
                    ebd ebdVarA3 = ebdVarA2.a();
                    ebdVarA3.h = bdcVar.d;
                    ebd ebdVarA4 = ebdVarA3.a();
                    ebdVarA4.e = ebiVar;
                    ebd ebdVarA5 = ebdVarA4.a();
                    ebdVarA5.g = bdcVar.e;
                    ebd ebdVarA6 = ebdVarA5.a();
                    ebdVarA6.j = egcVar;
                    ebd ebdVarA7 = ebdVarA6.a();
                    ebdVarA7.f = bdhVar;
                    optionalEmpty = Optional.of(new ebe((dzv) ebdVarA7.a()));
                } catch (eba e) {
                    bdhVar.d(new Exception("Could not initialize PIR library.", e));
                    optionalEmpty = Optional.empty();
                }
                if (optionalEmpty.isEmpty()) {
                    return;
                }
                emr.l().d(new emj(optionalEmpty, i), this.c);
                this.c.execute(optionalEmpty.get());
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException("PIR Uri had non-integer entry index", e2);
            }
        } catch (Exception e3) {
            throw new IllegalArgumentException("Exception while attempting to parse URL", e3);
        }
    }
}
