package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cie implements chm {
    public boolean a = false;

    static {
        new AtomicInteger();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [cik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.chm
    public final /* bridge */ /* synthetic */ Object a(fpv fpvVar) throws IOException {
        if (this.a) {
            if (fpvVar.e.isEmpty()) {
                return fpvVar.c.c((Uri) fpvVar.a);
            }
            throw new chy("Short circuit would skip transforms.");
        }
        chx chxVar = new chx(cig.b(fpvVar), 0);
        try {
            Object obj = chxVar.a;
            if (!(obj instanceof cht)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((cht) obj).a();
            chxVar.close();
            return fileA;
        } catch (Throwable th) {
            try {
                chxVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
