package j$.util.stream;

import j$.util.Map;
import java.util.EnumMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
final class W {
    public static final W DISTINCT;
    public static final W ORDERED;
    public static final W SHORT_CIRCUIT;
    public static final W SIZED;
    public static final W SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    private static final /* synthetic */ W[] t;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    static {
        V v = V.SPLITERATOR;
        C0065g c0065gY = y(v);
        V v2 = V.STREAM;
        c0065gY.h(v2);
        V v3 = V.OP;
        ((EnumMap) c0065gY.a).put((EnumMap) v3, (V) 3);
        W w = new W("DISTINCT", 0, 0, c0065gY);
        DISTINCT = w;
        C0065g c0065gY2 = y(v);
        c0065gY2.h(v2);
        ((EnumMap) c0065gY2.a).put((EnumMap) v3, (V) 3);
        W w2 = new W("SORTED", 1, 1, c0065gY2);
        SORTED = w2;
        C0065g c0065gY3 = y(v);
        c0065gY3.h(v2);
        EnumMap enumMap = (EnumMap) c0065gY3.a;
        enumMap.put((EnumMap) v3, (V) 3);
        V v4 = V.TERMINAL_OP;
        enumMap.put((EnumMap) v4, (V) 2);
        V v5 = V.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) v5, (V) 2);
        W w3 = new W("ORDERED", 2, 2, c0065gY3);
        ORDERED = w3;
        C0065g c0065gY4 = y(v);
        c0065gY4.h(v2);
        ((EnumMap) c0065gY4.a).put((EnumMap) v3, (V) 2);
        W w4 = new W("SIZED", 3, 3, c0065gY4);
        SIZED = w4;
        C0065g c0065gY5 = y(v3);
        c0065gY5.h(v4);
        int i2 = 0;
        W w5 = new W("SHORT_CIRCUIT", 4, 12, c0065gY5);
        SHORT_CIRCUIT = w5;
        t = new W[]{w, w2, w3, w4, w5};
        f = p(v);
        g = p(v2);
        h = p(v3);
        p(v4);
        p(v5);
        for (W w6 : values()) {
            i2 |= w6.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        W w7 = DISTINCT;
        int i5 = w7.c;
        m = w7.d;
        W w8 = SORTED;
        int i6 = w8.c;
        n = w8.d;
        W w9 = ORDERED;
        o = w9.c;
        p = w9.d;
        W w10 = SIZED;
        q = w10.c;
        r = w10.d;
        s = SHORT_CIRCUIT.c;
    }

    private W(String str, int i2, int i3, C0065g c0065g) {
        V[] vArrValues = V.values();
        int length = vArrValues.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = (EnumMap) c0065g.a;
            if (i4 >= length) {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
            Map.EL.putIfAbsent(enumMap, vArrValues[i4], 0);
            i4++;
        }
    }

    static int g(int i2, int i3) {
        return i2 | (i3 & (i2 == 0 ? i : ~(((j & i2) << 1) | i2 | ((k & i2) >> 1))));
    }

    private static int p(V v) {
        int iIntValue = 0;
        for (W w : values()) {
            iIntValue |= ((Integer) w.a.get(v)).intValue() << w.b;
        }
        return iIntValue;
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) t.clone();
    }

    private static C0065g y(V v) {
        C0065g c0065g = new C0065g(new EnumMap(V.class));
        c0065g.h(v);
        return c0065g;
    }

    static int z(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    final boolean t(int i2) {
        return (i2 & this.e) == this.c;
    }
}
