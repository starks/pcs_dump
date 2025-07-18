package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjd {
    public final String a;
    public final djy b;
    public final Executor c;
    public final cru d;
    public final fcy g;
    private final ciz h;
    private final clq j;
    public final Object e = new Object();
    private final fpf i = new fpf((short[]) null);
    public djy f = null;

    public cjd(String str, djy djyVar, ciz cizVar, Executor executor, fcy fcyVar, cru cruVar, clq clqVar) {
        this.a = str;
        this.b = cnx.D(djyVar);
        this.h = cizVar;
        this.c = new dkh(executor);
        this.g = fcyVar;
        this.d = cruVar;
        this.j = clqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a A[Catch: all -> 0x0036, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000d, B:11:0x0014, B:12:0x0016, B:14:0x001a, B:15:0x0032, B:16:0x0034), top: B:21:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.djy a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            djy r1 = r4.f     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L16
            boolean r1 = r1.isDone()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L16
            djy r1 = r4.f     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L36
            defpackage.cnx.H(r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.Throwable -> L36
            goto L16
        L13:
            r1 = 0
            r4.f = r1     // Catch: java.lang.Throwable -> L36
        L16:
            djy r1 = r4.f     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L32
            fpf r1 = r4.i     // Catch: java.lang.Throwable -> L36
            cjb r2 = new cjb     // Catch: java.lang.Throwable -> L36
            r3 = 2
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L36
            dir r2 = defpackage.cqt.a(r2)     // Catch: java.lang.Throwable -> L36
            java.util.concurrent.Executor r3 = r4.c     // Catch: java.lang.Throwable -> L36
            djy r1 = r1.f(r2, r3)     // Catch: java.lang.Throwable -> L36
            djy r1 = defpackage.cnx.D(r1)     // Catch: java.lang.Throwable -> L36
            r4.f = r1     // Catch: java.lang.Throwable -> L36
        L32:
            djy r4 = r4.f     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r4
        L36:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjd.a():djy");
    }

    public final Object b(Uri uri) throws IOException {
        try {
            try {
                cqg cqgVarZ = clq.Z("Read " + this.a, 1);
                try {
                    InputStream inputStream = (InputStream) this.g.g(uri, new cig(0));
                    try {
                        ciz cizVar = this.h;
                        Object objB = ((cjk) cizVar).b().getParserForType().b(inputStream, ((cjk) cizVar).a());
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        cqgVarZ.close();
                        return objB;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        cqgVarZ.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (this.g.i(uri)) {
                    throw e;
                }
                return ((cjj) this.h).a;
            }
        } catch (IOException e2) {
            throw clq.aa(this.g, uri, e2, this.a);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [cik, java.lang.Object] */
    public final void c(Uri uri, Object obj) throws IOException {
        Uri uriM = clq.m(uri, ".tmp");
        try {
            cqg cqgVarZ = clq.Z("Write " + this.a, 1);
            try {
                eqh eqhVar = new eqh((char[]) null, (byte[]) null);
                try {
                    fcy fcyVar = this.g;
                    cij cijVar = new cij();
                    cijVar.a = new eqh[]{eqhVar};
                    OutputStream outputStream = (OutputStream) fcyVar.g(uriM, cijVar);
                    try {
                        ((egi) obj).writeTo(outputStream);
                        eqhVar.k();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        cqgVarZ.close();
                        this.g.h(uriM, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw clq.aa(this.g, uri, e, this.a);
                }
            } finally {
            }
        } catch (IOException e2) {
            if (this.g.i(uriM)) {
                try {
                    fpv fpvVarJ = this.g.j(uriM);
                    fpvVarJ.c.k((Uri) fpvVarJ.a);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    public final djy d(dis disVar, Executor executor) {
        return this.i.f(cqt.a(new cje(this, a(), disVar, executor, 1)), diy.a);
    }
}
