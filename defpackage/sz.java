package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sz extends Thread {
    private final int a;

    public sz(Runnable runnable, String str, int i) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
