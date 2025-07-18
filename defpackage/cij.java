package defpackage;

import android.net.Uri;
import java.io.OutputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cij implements chm {
    public eqh[] a;

    /* JADX WARN: Type inference failed for: r1v0, types: [cik, java.lang.Object] */
    @Override // defpackage.chm
    public final /* bridge */ /* synthetic */ Object a(fpv fpvVar) {
        List listG = fpvVar.g(fpvVar.c.j((Uri) fpvVar.a));
        eqh[] eqhVarArr = this.a;
        if (eqhVarArr != null) {
            for (int i = 0; i <= 0; i++) {
                eqhVarArr[i].j(listG);
            }
        }
        return (OutputStream) listG.get(0);
    }
}
