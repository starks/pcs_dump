package defpackage;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cii implements chm {
    public eqh[] a;
    private final egi b;

    public cii(egi egiVar) {
        this.b = egiVar;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [cik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [cik, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [cik, java.lang.Object] */
    @Override // defpackage.chm
    public final /* bridge */ /* synthetic */ Object a(fpv fpvVar) throws IOException {
        AtomicLong atomicLong = cih.a;
        String str = ".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + cih.a.getAndIncrement();
        Uri uri = (Uri) fpvVar.a;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(str)).build();
        List listG = fpvVar.g(fpvVar.c.j(uriBuild));
        eqh[] eqhVarArr = this.a;
        if (eqhVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                eqhVarArr[i].j(listG);
            }
        }
        try {
            OutputStream outputStream = (OutputStream) listG.get(0);
            try {
                this.b.writeTo(outputStream);
                eqh[] eqhVarArr2 = this.a;
                if (eqhVarArr2 != null) {
                    for (int i2 = 0; i2 <= 0; i2++) {
                        eqhVarArr2[i2].i();
                    }
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                fpvVar.c.g(uriBuild, (Uri) fpvVar.a);
                return null;
            } finally {
            }
        } catch (Exception e) {
            try {
                fpvVar.c.k(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }
}
