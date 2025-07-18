package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sn {
    private final LocaleList a;

    public sn(Object obj) {
        this.a = (LocaleList) obj;
    }

    public final Object a() {
        return this.a;
    }

    public final Locale b(int i) {
        return this.a.get(0);
    }

    public final boolean c() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((sn) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
