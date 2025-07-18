package defpackage;

import googledata.experiments.mobile.gmscore.brella.ClientConfigToEndorsementOptionsMap;
import googledata.experiments.mobile.gmscore.brella.TrainingProcessTimeout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgs implements cgu {
    private final /* synthetic */ int a;

    public /* synthetic */ cgs(int i) {
        this.a = i;
    }

    @Override // defpackage.cgu
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                return Long.valueOf(Long.parseLong((String) obj));
            case 2:
                return Double.valueOf(Double.parseDouble((String) obj));
            case 3:
                return Boolean.valueOf(Boolean.parseBoolean((String) obj));
            case 4:
                return (String) obj;
            case 5:
                return (ClientConfigToEndorsementOptionsMap) efb.parseFrom(ClientConfigToEndorsementOptionsMap.a, (byte[]) obj);
            case 6:
                return (eid) efb.parseFrom(eid.a, (byte[]) obj);
            case 7:
                return (edb) efb.parseFrom(edb.a, (byte[]) obj);
            case 8:
                return (eic) efb.parseFrom(eic.a, (byte[]) obj);
            default:
                return (TrainingProcessTimeout) efb.parseFrom(TrainingProcessTimeout.a, (byte[]) obj);
        }
    }
}
