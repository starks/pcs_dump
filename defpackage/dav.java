package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dav {
    STRING('s', dax.GENERAL, "-#", true),
    BOOLEAN('b', dax.BOOLEAN, "-", true),
    CHAR('c', dax.CHARACTER, "-", true),
    DECIMAL('d', dax.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', dax.INTEGRAL, "-#0(", false),
    HEX('x', dax.INTEGRAL, "-#0(", true),
    FLOAT('f', dax.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', dax.FLOAT, "-#0+ (", true),
    GENERAL('g', dax.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', dax.FLOAT, "-#0+ ", true);

    public static final dav[] k = new dav[26];
    public final char l;
    public final dax m;
    public final int n;
    public final String o;

    static {
        for (dav davVar : values()) {
            k[a(davVar.l)] = davVar;
        }
    }

    dav(char c, dax daxVar, String str, boolean z) {
        this.l = c;
        this.m = daxVar;
        daw dawVar = daw.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = daw.a(str.charAt(i2));
            if (iA < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
