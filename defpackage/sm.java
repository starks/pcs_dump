package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sm {
    public static final sm a = a(new Locale[0]);
    public final sn b;

    private sm(sn snVar) {
        this.b = snVar;
    }

    public static sm a(Locale... localeArr) {
        return b(new LocaleList(localeArr));
    }

    public static sm b(LocaleList localeList) {
        return new sm(new sn(localeList));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sm) && this.b.equals(((sm) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
