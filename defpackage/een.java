package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class een {
    public static final een a = new een(null);
    private static volatile boolean b = false;
    private static volatile een c;
    private final Map d;

    een() {
        this.d = new HashMap();
    }

    public static een a() {
        een eenVar = c;
        if (eenVar != null) {
            return eenVar;
        }
        synchronized (een.class) {
            een eenVar2 = c;
            if (eenVar2 != null) {
                return eenVar2;
            }
            egr egrVar = egr.a;
            een eenVarB = eet.b(een.class);
            c = eenVarB;
            return eenVarB;
        }
    }

    public eez b(egi egiVar, int i) {
        return (eez) this.d.get(new eem(egiVar, i));
    }

    public een(byte[] bArr) {
        this.d = Collections.EMPTY_MAP;
    }
}
