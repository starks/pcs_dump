package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aag {
    public final Map b = new LinkedHashMap();

    public final boolean equals(Object obj) {
        return (obj instanceof aag) && fjs.c(this.b, ((aag) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.b + ')';
    }
}
