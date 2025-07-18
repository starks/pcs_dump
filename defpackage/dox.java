package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dox {
    public static final drx a;
    public static final drx b;
    public static final drx c;
    public static final drx d;
    private static final dwt e;
    private static final Map f;
    private static final Map g;

    static {
        dwt dwtVarB = dsp.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        e = dwtVarB;
        int i = 9;
        a = new drx(dot.class, dsg.class, new dnb(i));
        b = new drx(dwtVarB, dsg.class, new dnc(i));
        c = new drx(doq.class, dsf.class, new dnd(i));
        d = new drx(dwtVarB, dsf.class, new dne(i));
        HashMap map = new HashMap();
        map.put(dos.c, dvn.RAW);
        map.put(dos.a, dvn.TINK);
        map.put(dos.b, dvn.CRUNCHY);
        f = DesugarCollections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(dvn.class);
        enumMap.put((EnumMap) dvn.RAW, (dvn) dos.c);
        enumMap.put((EnumMap) dvn.TINK, (dvn) dos.a);
        enumMap.put((EnumMap) dvn.CRUNCHY, (dvn) dos.b);
        enumMap.put((EnumMap) dvn.LEGACY, (dvn) dos.b);
        g = DesugarCollections.unmodifiableMap(enumMap);
    }

    public static dos a(dvn dvnVar) throws GeneralSecurityException {
        Map map = g;
        if (map.containsKey(dvnVar)) {
            return (dos) map.get(dvnVar);
        }
        throw new GeneralSecurityException(a.I(dvnVar, "Unable to parse OutputPrefixType: "));
    }

    public static dvn b(dos dosVar) {
        Map map = f;
        if (map.containsKey(dosVar)) {
            return (dvn) map.get(dosVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(String.valueOf(dosVar))));
    }
}
