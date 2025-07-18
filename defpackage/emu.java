package defpackage;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emu {
    public final byte[] b;
    private final Map d;
    static final brb c = new brb(String.valueOf(','));
    public static final emu a = new emu(emc.a, false, new emu(new emc(1), true, new emu()));

    public emu() {
        this.d = new LinkedHashMap(0);
        this.b = new byte[0];
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [emt, java.lang.Object] */
    public final emt a(String str) {
        ezo ezoVar = (ezo) this.d.get(str);
        if (ezoVar != null) {
            return ezoVar.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [emt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [emt, java.lang.Object] */
    private emu(emt emtVar, boolean z, emu emuVar) {
        String strC = emtVar.c();
        clq.w(!strC.contains(","), "Comma is currently not allowed in message encoding");
        int size = emuVar.d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(emuVar.d.containsKey(emtVar.c()) ? size : size + 1);
        for (ezo ezoVar : emuVar.d.values()) {
            String strC2 = ezoVar.b.c();
            if (!strC2.equals(strC)) {
                linkedHashMap.put(strC2, new ezo((emt) ezoVar.b, ezoVar.a));
            }
        }
        linkedHashMap.put(strC, new ezo(emtVar, z));
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.d = mapUnmodifiableMap;
        brb brbVar = c;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((ezo) entry.getValue()).a) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.b = brbVar.o(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
