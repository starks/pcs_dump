package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhj implements Serializable {
    private static final long serialVersionUID = 0;
    public final String a;
    private final int b;

    public dhj(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dhj) {
            dhj dhjVar = (dhj) obj;
            if (a.g(this.a, dhjVar.a) && this.b == dhjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a.length() + 8);
        if (this.a.indexOf(58) >= 0) {
            sb.append('[');
            sb.append(this.a);
            sb.append(']');
        } else {
            sb.append(this.a);
        }
        if (this.b >= 0) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }
}
