package defpackage;

import android.content.Context;
import com.google.android.apps.aicore.aidl.AIFeature;
import com.google.android.gms.common.api.Status;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bos {
    private static final Duration b = Duration.ofMinutes(30);
    public final AtomicReference a;
    private final bmp c;
    private final bnc d;

    public bos(Context context) {
        ekb ekbVar = new ekb((byte[]) null);
        ekbVar.a = "droidguard";
        bmx bmxVar = new bmx(context, ekbVar.c());
        bnc bncVar = bnc.a;
        this.a = new AtomicReference(Instant.MIN);
        this.c = bmxVar;
        this.d = bncVar;
    }

    final synchronized void a(int i, cag cagVar, long j, long j2) {
        int i2;
        int i3;
        int i4;
        Instant instantOfEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        if (((Instant) this.a.get()).plus(b).isAfter(instantOfEpochMilli)) {
            return;
        }
        if (cagVar.e()) {
            i4 = 0;
            i3 = 0;
        } else {
            if (((cal) cagVar).c) {
                i2 = 100;
            } else {
                Exception excB = cagVar.b();
                if (excB instanceof bix) {
                    Status status = ((bix) excB).a;
                    int i5 = status.e;
                    bho bhoVar = status.h;
                    i3 = bhoVar != null ? bhoVar.c : -1;
                    i4 = i5;
                } else {
                    i2 = AIFeature.Id.LLM_PER_LAYER_GEM;
                }
            }
            i4 = i2;
            i3 = -1;
        }
        this.c.a(new bmo(0, cxc.q(new bme(i, i4, i3, j, j2, null, null, 0, -1)))).i(new arn(this, instantOfEpochMilli, 4));
    }
}
