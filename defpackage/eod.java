package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eod {
    public final elt a;
    public final epc b;
    public final epg c;
    private final eob d;

    public eod() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eod eodVar = (eod) obj;
            if (a.g(this.a, eodVar.a) && a.g(this.b, eodVar.b) && a.g(this.c, eodVar.c) && a.g(this.d, eodVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        elt eltVar = this.a;
        epc epcVar = this.b;
        return "[method=" + this.c.toString() + " headers=" + epcVar.toString() + " callOptions=" + eltVar.toString() + "]";
    }

    public eod(epg epgVar, epc epcVar, elt eltVar, eob eobVar) {
        this();
        epgVar.getClass();
        this.c = epgVar;
        this.b = epcVar;
        eltVar.getClass();
        this.a = eltVar;
        eobVar.getClass();
        this.d = eobVar;
    }
}
