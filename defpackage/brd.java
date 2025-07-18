package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brd implements cbu {
    public static final brd a = new brd();
    private final long b = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    private brd() {
    }

    @Override // defpackage.cbu
    public final long a() {
        return this.b + SystemClock.elapsedRealtime();
    }

    @Override // defpackage.cbu
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
