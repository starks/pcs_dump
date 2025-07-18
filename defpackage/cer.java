package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cer extends ceu {
    final /* synthetic */ bdg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cer(ces cesVar, String str, Object obj, bdg bdgVar) {
        super(cesVar, str, obj, false);
        this.a = bdgVar;
    }

    @Override // defpackage.ceu
    public final Object a(Object obj) {
        try {
            return (ejf) efb.parseFrom(ejf.a, Base64.decode((String) obj, 3));
        } catch (IOException | IllegalArgumentException unused) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.d() + ": " + String.valueOf(obj));
            return null;
        }
    }
}
