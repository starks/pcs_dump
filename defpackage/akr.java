package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akr implements akq {
    private static final das a = aky.a;
    private final aoa b;

    public akr(aoa aoaVar) {
        this.b = aoaVar;
    }

    private final boolean g() {
        if (((akt) this.b.b()).h()) {
            return true;
        }
        ((dap) ((dap) ((dap) a.e()).g(15, TimeUnit.MINUTES)).i("com/google/android/apps/miphone/aiai/common/logging/IntelligenceStatsLoggerImpl", "isEnabled", 57, "IntelligenceStatsLoggerImpl.java")).p("Westworld/Statsd logging disabled.");
        return false;
    }

    @Override // defpackage.akq
    public final void a(ajh ajhVar) {
        if (g()) {
            eio eioVarB = eio.b(ajhVar.c);
            if (eioVarB == null) {
                eioVarB = eio.UNKNOWN_COUNT;
            }
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(200053);
            builderNewBuilder.writeInt(eioVarB.bG);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }

    @Override // defpackage.akq
    public final void b(aji ajiVar) {
        if (g()) {
            long j = ajiVar.c;
            long j2 = ajiVar.d;
            long j3 = ajiVar.e;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(200037);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeLong(j2);
            builderNewBuilder.writeLong(j3);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }

    @Override // defpackage.akq
    public final void c(ajj ajjVar) {
        if (g()) {
            long j = ajjVar.c;
            long j2 = ajjVar.d;
            String str = ajjVar.e;
            String str2 = ajjVar.f;
            long j3 = ajjVar.g;
            long j4 = ajjVar.h;
            eii eiiVarB = eii.b(ajjVar.i);
            if (eiiVarB == null) {
                eiiVarB = eii.CLIENT_UNDEFINED_EVENT;
            }
            long j5 = ajjVar.j;
            eij eijVarB = eij.b(ajjVar.k);
            if (eijVarB == null) {
                eijVarB = eij.CLIENT_UNDEFINED_ROUND;
            }
            eig eigVarB = eig.b(ajjVar.l);
            if (eigVarB == null) {
                eigVarB = eig.UNDEFINED_CRYPTO_OPERATION;
            }
            long j6 = ajjVar.m;
            long j7 = ajjVar.n;
            long j8 = ajjVar.o;
            eih eihVarB = eih.b(ajjVar.p);
            if (eihVarB == null) {
                eihVarB = eih.CLIENT_UNDEFINED_ERROR;
            }
            int i = eigVarB.g;
            int i2 = eijVarB.h;
            int i3 = eiiVarB.k;
            eih eihVar = eihVarB;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(200036);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeLong(j2);
            builderNewBuilder.writeString(str);
            builderNewBuilder.writeString(str2);
            builderNewBuilder.writeLong(j3);
            builderNewBuilder.writeLong(j4);
            builderNewBuilder.writeInt(i3);
            builderNewBuilder.writeLong(j5);
            builderNewBuilder.writeInt(i2);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.writeLong(j6);
            builderNewBuilder.writeLong(j7);
            builderNewBuilder.writeLong(j8);
            builderNewBuilder.writeInt(eihVar.i);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }

    @Override // defpackage.akq
    public final void d(ajk ajkVar) {
        if (g()) {
            long j = ajkVar.c;
            ein einVarB = ein.b(ajkVar.d);
            if (einVarB == null) {
                einVarB = ein.TRAIN_UNDEFINED;
            }
            String str = ajkVar.e;
            long j2 = ajkVar.f;
            long j3 = ajkVar.g;
            long j4 = ajkVar.h;
            eil eilVarB = eil.b(ajkVar.i);
            if (eilVarB == null) {
                eilVarB = eil.TRAIN_ERROR_DEFAULT;
            }
            long j5 = ajkVar.j;
            long j6 = ajkVar.k;
            long j7 = ajkVar.l;
            String str2 = ajkVar.m;
            long j8 = ajkVar.n;
            long j9 = ajkVar.o;
            long j10 = ajkVar.p;
            String str3 = ajkVar.q;
            eik eikVarB = eik.b(ajkVar.r);
            if (eikVarB == null) {
                eikVarB = eik.TRAINING_DATA_SOURCE_UNDEFINED;
            }
            long j11 = ajkVar.s;
            long j12 = ajkVar.t;
            eie eieVarB = eie.b(ajkVar.u);
            if (eieVarB == null) {
                eieVarB = eie.COLLECTION_NAME_UNDEFINED;
            }
            eif eifVarB = eif.b(ajkVar.v);
            if (eifVarB == null) {
                eifVarB = eif.HISTOGRAM_COUNTER_UNDEFINED;
            }
            int i = eieVarB.e;
            int i2 = eikVarB.d;
            int i3 = eilVarB.e;
            int i4 = einVarB.Z;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(200038);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(i4);
            builderNewBuilder.writeString(str);
            builderNewBuilder.writeLong(j2);
            builderNewBuilder.writeLong(j3);
            builderNewBuilder.writeLong(j4);
            builderNewBuilder.writeInt(i3);
            builderNewBuilder.writeLong(j5);
            builderNewBuilder.writeLong(j6);
            builderNewBuilder.writeLong(j7);
            builderNewBuilder.writeString(str2);
            builderNewBuilder.writeLong(j8);
            builderNewBuilder.writeLong(j9);
            builderNewBuilder.writeLong(j10);
            builderNewBuilder.writeString(str3);
            builderNewBuilder.writeInt(i2);
            builderNewBuilder.writeLong(j11);
            builderNewBuilder.writeLong(j12);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.writeInt(eifVarB.ae);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }

    @Override // defpackage.akq
    public final void e(ajm ajmVar) {
        if (g()) {
            ajl ajlVarB = ajl.b(ajmVar.c);
            if (ajlVarB == null) {
                ajlVarB = ajl.UNKNOWN_TYPE;
            }
            String str = ajmVar.d;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(200080);
            builderNewBuilder.writeInt(ajlVarB.g);
            builderNewBuilder.writeString(str);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }

    @Override // defpackage.akq
    public final void f(ajn ajnVar) {
        if (g()) {
            eip eipVarB = eip.b(ajnVar.c);
            if (eipVarB == null) {
                eipVarB = eip.UNKNOWN_VALUE;
            }
            int i = ajnVar.d;
            StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(200052);
            builderNewBuilder.writeInt(eipVarB.D);
            builderNewBuilder.writeInt(i);
            builderNewBuilder.usePooledBuffer();
            StatsLog.write(builderNewBuilder.build());
        }
    }
}
