package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.apps.miphone.astrea.http.api.proto.UnrecognizedUrlException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asx extends asm {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService");
    public final avm b;
    private final fqu c;
    private final Executor d;
    private final aoa e;
    private final aor f;
    private final auh g;

    public asx(fqu fquVar, Executor executor, avm avmVar, aoa aoaVar, auh auhVar, aor aorVar) {
        this.c = fquVar;
        this.d = executor;
        this.b = avmVar;
        this.e = aoaVar;
        this.g = auhVar;
        this.f = aorVar;
    }

    public static void c(Throwable th, avm avmVar, asi asiVar, long j) {
        ((czl) ((czl) ((czl) a.e()).h(th)).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "logCallCancelledByClient", 270, "HttpGrpcBindableService.java")).r("Failed to fetch response body for URL '%s'. Call cancelled by client.", asiVar.b);
        d(avmVar, asiVar, 2, j);
    }

    public static void d(avm avmVar, asi asiVar, int i, long j) {
        if (!avmVar.h(auw.HTTP, asiVar.b) || avmVar.a().isEmpty()) {
            return;
        }
        Object obj = ((avs) avmVar.a().get()).e(asiVar.b).get();
        String str = asiVar.b;
        aux auxVar = (aux) obj;
        clq.v(auxVar.a().b == 2);
        auj aujVarA = auxVar.a();
        clq.v(str.matches((aujVarA.b == 2 ? (aul) aujVarA.c : aul.a).c));
        clq.v(auxVar.b() == auw.HTTP);
        avmVar.d(ayg.g(auxVar, i, j, str));
    }

    @Override // defpackage.asm, defpackage.asl
    public final void a(asi asiVar, feu feuVar) throws Throwable {
        czn cznVar = a;
        ((czl) ((czl) cznVar.c()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "download", 82, "HttpGrpcBindableService.java")).r("Downloading requested for URL '%s'", asiVar.b);
        ast astVar = (ast) this.e.b();
        bkp bkpVar = new bkp(1);
        feq feqVar = (feq) feuVar;
        clq.G(!feqVar.c, "Cannot alter onCancelHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
        feqVar.e = bkpVar;
        if (!asiVar.b.startsWith("https://")) {
            ((czl) ((czl) cznVar.e()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "download", 92, "HttpGrpcBindableService.java")).p("Rejected non HTTPS url request to PCS");
            feuVar.b(new IllegalArgumentException(String.format("Rejecting non HTTPS url: '%s'", asiVar.b)));
            return;
        }
        if (!this.b.e(auw.HTTP, asiVar.b)) {
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
            if (this.f.a()) {
                auh auhVar2 = this.g;
                asr asrVar2 = (asr) ath.a.createBuilder();
                atg atgVar = atg.HTTP;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ath athVar = (ath) asrVar2.a;
                athVar.c = atgVar.g;
                athVar.b |= 1;
                String str = asiVar.b;
                if (!asrVar2.a.isMutable()) {
                    asrVar2.B();
                }
                ath athVar2 = (ath) asrVar2.a;
                str.getClass();
                athVar2.b |= 2;
                athVar2.d = str;
                auhVar2.e((ath) asrVar2.z());
            }
            ((czl) ((czl) cznVar.c()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "download", 116, "HttpGrpcBindableService.java")).r("Network usage log unrecognised HTTPS request for %s", asiVar.b);
        }
        if (this.b.i(auw.HTTP, asiVar.b)) {
            avo avoVarB = avo.b(asiVar.b);
            ((czl) ((czl) ((czl) cznVar.e()).h(avoVarB)).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "download", 'z', "HttpGrpcBindableService.java")).p("Rejected unknown HTTPS request to PCS");
            asr asrVar3 = (asr) eit.a.createBuilder();
            int i = eql.INVALID_ARGUMENT.r;
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            ((eit) asrVar3.a).b = i;
            String message = avoVarB.getMessage();
            if (!asrVar3.a.isMutable()) {
                asrVar3.B();
            }
            eit eitVar = (eit) asrVar3.a;
            message.getClass();
            eitVar.c = message;
            asr asrVarNewBuilder = UnrecognizedUrlException.newBuilder();
            String str2 = asiVar.b;
            if (!asrVarNewBuilder.a.isMutable()) {
                asrVarNewBuilder.B();
            }
            ((UnrecognizedUrlException) asrVarNewBuilder.a).setUrl(str2);
            asrVar3.j(asa.a((UnrecognizedUrlException) asrVarNewBuilder.z()));
            feuVar.b(asa.b((eit) asrVar3.z()));
            return;
        }
        fqw fqwVarC = new fqw().c(asiVar.b);
        for (ask askVar : asiVar.c) {
            Iterator it = askVar.d.iterator();
            while (it.hasNext()) {
                fqwVarC.e(askVar.c, (String) it.next());
            }
        }
        try {
            frb frbVarD = new frw(this.c, fqwVarC.d()).d();
            asr asrVar4 = (asr) asq.a.createBuilder();
            int i2 = frbVarD.d;
            if (!asrVar4.a.isMutable()) {
                asrVar4.B();
            }
            asq asqVar = (asq) asrVar4.a;
            asqVar.b |= 1;
            asqVar.c = i2;
            for (String str3 : frbVarD.f.f()) {
                asr asrVar5 = (asr) ask.a.createBuilder();
                if (!asrVar5.a.isMutable()) {
                    asrVar5.B();
                }
                ask askVar2 = (ask) asrVar5.a;
                str3.getClass();
                askVar2.b |= 1;
                askVar2.c = str3;
                List listE = frbVarD.f.e(str3);
                if (!asrVar5.a.isMutable()) {
                    asrVar5.B();
                }
                ask askVar3 = (ask) asrVar5.a;
                efm efmVar = askVar3.d;
                if (!efmVar.c()) {
                    askVar3.d = efb.mutableCopy(efmVar);
                }
                edg.addAll(listE, askVar3.d);
                ask askVar4 = (ask) asrVar5.z();
                if (!asrVar4.a.isMutable()) {
                    asrVar4.B();
                }
                asq asqVar2 = (asq) asrVar4.a;
                askVar4.getClass();
                efm efmVar2 = asqVar2.d;
                if (!efmVar2.c()) {
                    asqVar2.d = efb.mutableCopy(efmVar2);
                }
                asqVar2.d.add(askVar4);
            }
            czn cznVar2 = a;
            ((czl) ((czl) cznVar2.c()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "download", 163, "HttpGrpcBindableService.java")).r("Responding with header information for URL '%s'", asiVar.b);
            asr asrVar6 = (asr) asj.a.createBuilder();
            if (!asrVar6.a.isMutable()) {
                asrVar6.B();
            }
            asj asjVar = (asj) asrVar6.a;
            asq asqVar3 = (asq) asrVar4.z();
            asqVar3.getClass();
            asjVar.c = asqVar3;
            asjVar.b = 1;
            feuVar.c((asj) asrVar6.z());
            frd frdVar = frbVarD.g;
            if (frdVar == null) {
                ((czl) ((czl) cznVar2.c()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService", "download", 170, "HttpGrpcBindableService.java")).r("Received an empty body for URL '%s'. Responding with fetch_completed.", asiVar.b);
                feuVar.a();
                d(this.b, asiVar, 1, 0L);
                return;
            }
            ParcelFileDescriptor parcelFileDescriptor = astVar.c() ? (ParcelFileDescriptor) arz.b.a() : null;
            if (!astVar.b() || parcelFileDescriptor != null) {
                this.d.execute(new asv(this, frdVar, parcelFileDescriptor, feuVar, asiVar));
                return;
            }
            asw aswVar = new asw(asiVar, feqVar, frdVar.c(), astVar.a(), this.d, this.b);
            clq.G(!feqVar.c, "Cannot alter onReadyHandler after initialization. May only be called during the initial call to the application, before the service returns its StreamObserver");
            feqVar.d = aswVar;
            aswVar.run();
        } catch (IOException e) {
            feuVar.b(e);
            d(this.b, asiVar, 2, 0L);
        }
    }
}
