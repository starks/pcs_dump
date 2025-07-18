package defpackage;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.app.StatsQuery;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arc implements ara {
    public static final cxg a;
    private static final czn d = czn.j("com/google/android/apps/miphone/astrea/fl/federatedcompute/statsd/StatsdExampleStoreConnector");
    private static final long e = 175747355;
    private static final String f = "com.google.android.gms";
    public final Context b;
    public final dke c;
    private final akp g;
    private final auh h;

    static {
        cxe cxeVar = new cxe();
        cxeVar.b("No configs found matching the config key", atk.PCS_TRAINING_STATS_EXCEPTION_NO_CONFIGS_FOUND);
        a = cxeVar.b("No matching configs for restricted metrics delegate", atk.PCS_TRAINING_STATS_EXCEPTION_NO_MATCHING_RESTRICTED_CONFIGS).b("Ambiguous ConfigKey", atk.PCS_TRAINING_STATS_EXCEPTION_AMBIGUOUS_CONFIG_KEY).b("Inconsistent row sizes", atk.PCS_TRAINING_STATS_EXCEPTION_INCONSISTENT_ROW_SIZES).e();
    }

    public arc(dke dkeVar, Context context, auh auhVar, akp akpVar) {
        this.c = dkeVar;
        this.b = context;
        this.h = auhVar;
        this.g = akpVar;
    }

    @Override // defpackage.ara
    public final void a(byte[] bArr, bua buaVar, dzi dziVar) {
        String str = null;
        try {
            edl edlVar = (edl) efb.parseFrom(edl.a, bArr, een.a());
            if (edlVar.b.equals("type.googleapis.com/miphone.astrea.proto.AstreaQuery")) {
                bdn bdnVar = (bdn) efb.parseFrom(bdn.a, edlVar.c, een.a());
                if ((bdnVar.b & 2) != 0) {
                    edl edlVar2 = bdnVar.f;
                    if (edlVar2 == null) {
                        edlVar2 = edl.a;
                    }
                    if (edlVar2.b.equals("type.googleapis.com/miphone.astrea.proto.AstreaStatsQuery")) {
                        edl edlVar3 = bdnVar.f;
                        if (edlVar3 == null) {
                            edlVar3 = edl.a;
                        }
                        str = ((bdo) efb.parseFrom(bdo.a, edlVar3.c, een.a())).b;
                    }
                }
            }
        } catch (efp e2) {
            ((czl) ((czl) ((czl) d.e()).h(e2)).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/statsd/StatsdExampleStoreConnector", "parseSqlQuery", (char) 263, "StatsdExampleStoreConnector.java")).p("Couldn't parse criteria.");
        }
        str.getClass();
        asr asrVar = (asr) ajg.a.createBuilder();
        dzf dzfVar = dziVar.c;
        if (dzfVar == null) {
            dzfVar = dzf.a;
        }
        dyv dyvVar = dzfVar.b == 4 ? (dyv) dzfVar.c : dyv.a;
        int i = (dyvVar.b == 4 ? (dzh) dyvVar.c : dzh.a).b;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ajg ajgVar = (ajg) asrVar.a;
        ajgVar.b |= 1;
        ajgVar.c = i;
        ajg ajgVar2 = (ajg) asrVar.z();
        ((czl) ((czl) d.b()).i("com/google/android/apps/miphone/astrea/fl/federatedcompute/statsd/StatsdExampleStoreConnector", "startQuery", 122, "StatsdExampleStoreConnector.java")).r("Sql Query: %s", str);
        StatsQuery statsQueryBuild = new StatsQuery.Builder(str).setSqlDialect(1).setMinSqlClientVersion(1).setPolicyConfig(ajgVar2.toByteArray()).build();
        try {
            StatsManager statsManager = (StatsManager) this.b.getSystemService(StatsManager.class);
            csf csfVarB = csf.b(crc.a);
            d(atk.PCS_TRAINING_STATS_ATTEMPTED);
            statsManager.query(175747355L, f, statsQueryBuild, this.c, new arb(this, csfVarB, buaVar));
        } catch (StatsManager.StatsUnavailableException | RuntimeException e3) {
            buaVar.a(27, "Statsd query failed: ".concat(String.valueOf(e3.getLocalizedMessage())));
            d(atk.PCS_TRAINING_STATS_UNAVAILABLE_EXCEPTION);
        }
    }

    public final int b(long j) {
        akp akpVar = this.g;
        return (int) akpVar.a(akpVar.b(j));
    }

    public final /* synthetic */ List c(StatsManager statsManager, PendingIntent pendingIntent) {
        try {
            long[] restrictedMetricsChangedOperation = statsManager.setRestrictedMetricsChangedOperation(175747355L, f, pendingIntent);
            int length = restrictedMetricsChangedOperation.length;
            return length == 0 ? Collections.EMPTY_LIST : new dhl(restrictedMetricsChangedOperation, 0, length);
        } catch (StatsManager.StatsUnavailableException | RuntimeException unused) {
            d(atk.PCS_TRAINING_STATS_UNAVAILABLE_EXCEPTION);
            int i = cxc.d;
            return cyp.a;
        }
    }

    public final void d(atk atkVar) {
        asr asrVar = (asr) atc.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        auh auhVar = this.h;
        atc atcVar = (atc) asrVar.a;
        atcVar.c = atkVar.H;
        atcVar.b |= 1;
        auhVar.a((atc) asrVar.z());
    }

    public final void e(att attVar, int i) {
        asr asrVar = (asr) ati.a.createBuilder();
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        ati atiVar = (ati) asrVar.a;
        atiVar.c = attVar.u;
        atiVar.b |= 1;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        auh auhVar = this.h;
        ati atiVar2 = (ati) asrVar.a;
        atiVar2.b |= 2;
        atiVar2.d = i;
        auhVar.f((ati) asrVar.z());
    }
}
