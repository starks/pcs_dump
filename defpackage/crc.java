package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crc {
    public static final csm a;

    static {
        csm crbVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            crbVar = new cra();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            crbVar = new crb();
        }
        a = crbVar;
    }
}
