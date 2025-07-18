package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cep extends ceu {
    public cep(ces cesVar, String str, Boolean bool) {
        super(cesVar, str, bool, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (cap.c.matcher(obj).matches()) {
            return true;
        }
        if (cap.d.matcher(obj).matches()) {
            return false;
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
