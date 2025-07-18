package googledata.experiments.mobile.gmscore.brella;

import defpackage.eeu;
import defpackage.eev;
import defpackage.efa;
import defpackage.efb;
import defpackage.egd;
import defpackage.egj;
import defpackage.egp;
import defpackage.ehs;
import defpackage.fsc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TrainingProcessTimeout extends efb implements egj {
    public static final TrainingProcessTimeout a;
    private static volatile egp c;
    public egd b = egd.a;

    /* compiled from: PG */
    public final class Builder extends eeu implements egj {
        public Builder() {
            super(TrainingProcessTimeout.a);
        }
    }

    /* compiled from: PG */
    final class TimeoutSecondsDefaultEntryHolder {
        static final fsc a = new fsc(ehs.STRING, (Object) "", ehs.INT64, (Object) 0L);
    }

    static {
        TrainingProcessTimeout trainingProcessTimeout = new TrainingProcessTimeout();
        a = trainingProcessTimeout;
        efb.registerDefaultInstance(TrainingProcessTimeout.class, trainingProcessTimeout);
    }

    private TrainingProcessTimeout() {
    }

    @Override // defpackage.efb
    protected final Object dynamicMethod(efa efaVar, Object obj, Object obj2) {
        egp eevVar;
        int iOrdinal = efaVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", TimeoutSecondsDefaultEntryHolder.a});
        }
        if (iOrdinal == 3) {
            return new TrainingProcessTimeout();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        egp egpVar = c;
        if (egpVar != null) {
            return egpVar;
        }
        synchronized (TrainingProcessTimeout.class) {
            eevVar = c;
            if (eevVar == null) {
                eevVar = new eev(a);
                c = eevVar;
            }
        }
        return eevVar;
    }
}
