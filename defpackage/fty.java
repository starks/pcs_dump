package defpackage;

import java.io.Closeable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fty implements Closeable {
    public static final Logger a;
    public static final fwv d = new fwv();
    public final fvm b;
    public final boolean c;
    private final ftx e;
    private final ftc f;

    static {
        Logger logger = Logger.getLogger(ftf.class.getName());
        logger.getClass();
        a = logger;
    }

    public fty(fvm fvmVar, boolean z) {
        fvmVar.getClass();
        this.b = fvmVar;
        this.c = true;
        ftx ftxVar = new ftx(fvmVar);
        this.e = ftxVar;
        this.f = new ftc(ftxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fty.b(int, int, int, int):java.util.List");
    }

    private final void c() {
        this.b.f();
        this.b.d();
        byte[] bArr = frh.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x019d, code lost:
    
        throw new java.io.IOException(defpackage.a.x(r7, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r11, defpackage.ftn r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fty.a(boolean, ftn):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
