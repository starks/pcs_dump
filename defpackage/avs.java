package defpackage;

import android.content.Context;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.as.oss.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avs {
    private static final czn a = czn.j("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl");
    private final cxg b;
    private final Context c;

    public avs(Context context, cxg cxgVar) {
        this.c = context;
        this.b = cxgVar;
    }

    public final Optional a(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            if (auxVar.a().b == 5) {
                auj aujVarA = auxVar.a();
                if (str.equals((aujVarA.b == 5 ? (aui) aujVarA.c : aui.a).c)) {
                    return Optional.of(auxVar);
                }
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getAttestationConnectionDetails", 60, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized Attestation request for feature name '%s'", str);
        return Optional.empty();
    }

    public final Optional b(aux auxVar) {
        if (auxVar.b() == auw.FC_CHECK_IN) {
            return Optional.of(this.c.getString(R.string.description_fc_check_in));
        }
        if (auxVar.b() == auw.FC_TRAINING_RESULT_UPLOAD) {
            euw euwVarD = auxVar.d();
            euwVarD.n(auw.FC_TRAINING_START_QUERY);
            auxVar = euwVarD.k();
        }
        return this.b.containsKey(auxVar) ? Optional.of(this.c.getString(((avr) this.b.get(auxVar)).a())) : Optional.empty();
    }

    public final Optional c(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            auj aujVarA = auxVar.a();
            if (aujVarA.b == 1 && str.equals(((auk) aujVarA.c).c)) {
                return Optional.of(auxVar);
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getFcStartQueryConnectionDetails", 124, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized FC request for feature name '%s'", str);
        return Optional.empty();
    }

    public final Optional d(aux auxVar) {
        if (auxVar.b() == auw.FC_CHECK_IN) {
            return Optional.of(this.c.getString(R.string.feature_name_fc_check_in));
        }
        if (auxVar.b() == auw.FC_TRAINING_RESULT_UPLOAD) {
            euw euwVarD = auxVar.d();
            euwVarD.n(auw.FC_TRAINING_START_QUERY);
            auxVar = euwVarD.k();
        }
        return this.b.containsKey(auxVar) ? Optional.of(this.c.getString(((avr) this.b.get(auxVar)).b())) : Optional.empty();
    }

    public final Optional e(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            if (auxVar.a().b == 2) {
                auj aujVarA = auxVar.a();
                if (str.matches((aujVarA.b == 2 ? (aul) aujVarA.c : aul.a).c)) {
                    return Optional.of(auxVar);
                }
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getHttpConnectionDetails", 47, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized https request for url '%s'", str);
        return Optional.empty();
    }

    public final Optional f(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            if (auxVar.a().b == 6) {
                auj aujVarA = auxVar.a();
                if (str.matches((aujVarA.b == 6 ? (aum) aujVarA.c : aum.a).c)) {
                    return Optional.of(auxVar);
                }
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getPcbConnectionDetails", 85, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized PCB request for url '%s'", str);
        return Optional.empty();
    }

    public final Optional g(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            if (auxVar.a().b == 4) {
                auj aujVarA = auxVar.a();
                if (str.matches((aujVarA.b == 4 ? (aun) aujVarA.c : aun.a).c)) {
                    return Optional.of(auxVar);
                }
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getPdConnectionDetails", AIFeature.Id.BUMBLEBEE, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized PD request for client Id '%s'", str);
        return Optional.empty();
    }

    public final Optional h(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            if (auxVar.a().b == 3) {
                auj aujVarA = auxVar.a();
                if (str.matches((aujVarA.b == 3 ? (auo) aujVarA.c : auo.a).c)) {
                    return Optional.of(auxVar);
                }
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getPirConnectionDetails", 72, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized pir request for url '%s'", str);
        return Optional.empty();
    }

    public final Optional i(String str) {
        czc czcVarE = this.b.keySet().listIterator();
        while (czcVarE.hasNext()) {
            aux auxVar = (aux) czcVarE.next();
            if (auxVar.a().b == 7) {
                auj aujVarA = auxVar.a();
                if (str.matches((aujVarA.b == 7 ? (aup) aujVarA.c : aup.a).c)) {
                    return Optional.of(auxVar);
                }
            }
        }
        ((czl) ((czl) a.e()).i("com/google/android/apps/miphone/astrea/networkusage/ui/content/impl/NetworkUsageLogContentMapImpl", "getSurveyConnectionDetails", 99, "NetworkUsageLogContentMapImpl.java")).r("Unauthorized Survey request for url '%s'", str);
        return Optional.empty();
    }

    public final String j(aux auxVar) {
        switch (auxVar.b().ordinal()) {
            case 1:
            case 2:
            case 3:
                return this.c.getString(R.string.connection_type_fc);
            case 4:
                return this.c.getString(R.string.connection_type_http);
            case 5:
                return this.c.getString(R.string.connection_type_pir);
            case 6:
                return this.c.getString(R.string.connection_type_ap);
            case 7:
                return this.c.getString(R.string.connection_type_attestation);
            case 8:
                return this.c.getString(R.string.connection_type_pcb);
            case 9:
                return this.c.getString(R.string.connection_type_survey);
            default:
                throw new UnsupportedOperationException(String.format("Unsupported connection type '%s'", auxVar.b().name()));
        }
    }
}
