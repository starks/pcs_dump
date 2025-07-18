package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ann implements eko {
    private final /* synthetic */ int a;

    public ann(int i) {
        this.a = i;
    }

    public static aor a() {
        aor aorVar = aor.RELEASE;
        aorVar.getClass();
        return aorVar;
    }

    public static Duration c() {
        Duration durationOfDays = Duration.ofDays(14L);
        durationOfDays.getClass();
        return durationOfDays;
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final /* synthetic */ Object b() {
        switch (this.a) {
            case 0:
                Executor executor = anl.d;
                executor.getClass();
                return executor;
            case 1:
                return new aku();
            case 2:
                dke dkeVar = anl.f;
                dkeVar.getClass();
                return dkeVar;
            case 3:
                dke dkeVar2 = anl.f;
                dkeVar2.getClass();
                return dkeVar2;
            case 4:
                dke dkeVar3 = anl.h;
                dkeVar3.getClass();
                return dkeVar3;
            case 5:
                Executor executor2 = anl.b;
                executor2.getClass();
                return executor2;
            case 6:
                Executor executor3 = anl.a;
                executor3.getClass();
                return executor3;
            case 7:
                Executor executor4 = anl.c;
                executor4.getClass();
                return executor4;
            case 8:
                dke dkeVar4 = anl.g;
                dkeVar4.getClass();
                return dkeVar4;
            case 9:
                Executor executor5 = anl.e;
                executor5.getClass();
                return executor5;
            case 10:
                return a();
            case 11:
                return new api();
            case 12:
                return new aqt();
            case 13:
                return "com.google.android.apps.miphone.astrea.fl.api.TrainingService";
            case 14:
                return new wh();
            case 15:
                return asz.a();
            case 16:
                int i = asz.a;
                return "com.google.android.apps.miphone.astrea.http.api.HttpService";
            case 17:
                return c();
            case 18:
                return new ayo(ayp.a, Optional.empty());
            case AIFeature.Type.IMAGE_DESCRIPTION /* 19 */:
                return ayt.a("com.google.android.aicore:8519285862245230442");
            default:
                return ayt.a("com.google.android.aicore:418124939180967388");
        }
    }
}
