package defpackage;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgw {
    public static final bgw a;
    public static final bgw b;
    public static final bgw c;
    public final cxo d;

    static {
        cxo cxoVarH;
        EnumSet enumSetAllOf = EnumSet.allOf(bgx.class);
        if (enumSetAllOf instanceof Collection) {
            cxoVarH = enumSetAllOf.isEmpty() ? cyv.a : cwx.h(EnumSet.copyOf((Collection) enumSetAllOf));
        } else {
            Iterator it = enumSetAllOf.iterator();
            if (it.hasNext()) {
                EnumSet enumSetOf = EnumSet.of((Enum) it.next());
                dcr.x(enumSetOf, it);
                cxoVarH = cwx.h(enumSetOf);
            } else {
                cxoVarH = cyv.a;
            }
        }
        a = new bgw(cxoVarH);
        b = new bgw(cyv.a);
        c = new bgw(cwx.h(EnumSet.of(bgx.ZWIEBACK, new bgx[0])));
    }

    public bgw(cxo cxoVar) {
        this.d = cxoVar;
    }

    public final boolean a(bgx bgxVar) {
        return this.d.contains(bgxVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bgw) && this.d.equals(((bgw) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
