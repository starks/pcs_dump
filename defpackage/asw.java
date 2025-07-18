package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asw implements Runnable {
    public final asi b;
    public final avm c;
    private final feq f;
    private final InputStream g;
    private final int h;
    private final Executor i;
    public final AtomicLong a = new AtomicLong(0);
    private final byte[] d = new byte[1024];
    private int e = 0;

    public asw(asi asiVar, feq feqVar, InputStream inputStream, int i, Executor executor, avm avmVar) {
        this.b = asiVar;
        this.f = feqVar;
        this.g = inputStream;
        this.h = i;
        this.i = executor;
        this.c = avmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
    
        ((defpackage.czl) ((defpackage.czl) defpackage.asx.a.c()).i("com/google/android/apps/miphone/astrea/http/service/HttpGrpcBindableService$HttpGrpcStreamHandler", "run", 385, "HttpGrpcBindableService.java")).s("[onReadyHandler] DOWNLOAD COMPLETE: Downloaded %d bytes from URL [%s].", r9.a.get(), r9.b.b);
        r9.f.a();
        r9.i.execute(new defpackage.ls(r9, 16));
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void run() {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asw.run():void");
    }
}
