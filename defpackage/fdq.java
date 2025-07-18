package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdq implements Closeable {
    public final fvm a;
    public final fdl b;
    private final fdo c;

    public fdq(fvm fvmVar) {
        this.a = fvmVar;
        fdo fdoVar = new fdo(fvmVar);
        this.c = fdoVar;
        this.b = new fdl(fdoVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        throw new java.io.IOException("Header index too large " + r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(int r2, short r3, byte r4, int r5) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdq.a(int, short, byte, int):java.util.List");
    }

    public final void b() {
        this.a.f();
        this.a.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
