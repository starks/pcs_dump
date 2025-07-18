package defpackage;

import android.text.TextUtils;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abr {
    final int a;
    final int b;
    final String c;

    public abr(Preference preference) {
        this.c = preference.getClass().getName();
        this.a = preference.A;
        this.b = preference.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abr)) {
            return false;
        }
        abr abrVar = (abr) obj;
        return this.a == abrVar.a && this.b == abrVar.b && TextUtils.equals(this.c, abrVar.c);
    }

    public final int hashCode() {
        return ((((this.a + 527) * 31) + this.b) * 31) + this.c.hashCode();
    }
}
