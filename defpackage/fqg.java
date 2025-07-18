package defpackage;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqg {
    public final String e;
    public final String f;
    private final long h;
    private final String i;
    private final String j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    public static final fme g = new fme();
    public static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public fqg(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.h = j;
        this.i = str3;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fqg)) {
            return false;
        }
        fqg fqgVar = (fqg) obj;
        return fjs.c(fqgVar.e, this.e) && fjs.c(fqgVar.f, this.f) && fqgVar.h == this.h && fjs.c(fqgVar.i, this.i) && fjs.c(fqgVar.j, this.j) && fqgVar.k == this.k && fqgVar.l == this.l && fqgVar.m == this.m && fqgVar.n == this.n;
    }

    public final int hashCode() {
        int iHashCode = ((this.e.hashCode() + 527) * 31) + this.f.hashCode();
        long j = this.h;
        int iHashCode2 = (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
        boolean z = this.n;
        boolean z2 = this.m;
        return (((((((iHashCode2 * 31) + a.d(this.k)) * 31) + a.d(this.l)) * 31) + a.d(z2)) * 31) + a.d(z);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('=');
        sb.append(this.f);
        if (this.m) {
            if (this.h == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) fsi.a.get()).format(new Date(this.h));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.n) {
            sb.append("; domain=");
            sb.append(this.i);
        }
        sb.append("; path=");
        sb.append(this.j);
        if (this.k) {
            sb.append("; secure");
        }
        if (this.l) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
