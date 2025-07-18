package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqx {
    public final fqq a;
    public final String b;
    public final fqo c;
    public final fqz d;
    public final Map e;
    public fqa f;

    public fqx(fqq fqqVar, String str, fqo fqoVar, fqz fqzVar, Map map) {
        str.getClass();
        map.getClass();
        this.a = fqqVar;
        this.b = str;
        this.c = fqoVar;
        this.d = fqzVar;
        this.e = map;
    }

    public final String a(String str) {
        return this.c.b(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        if (this.c.a() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : this.c) {
                int i2 = i + 1;
                if (i < 0) {
                    ffh.D();
                }
                ffs ffsVar = (ffs) obj;
                String str = (String) ffsVar.a;
                String str2 = (String) ffsVar.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        if (!this.e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.e);
        }
        sb.append('}');
        return sb.toString();
    }
}
