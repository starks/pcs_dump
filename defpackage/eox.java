package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eox {
    public static final /* synthetic */ int d = 0;
    private static final BitSet e;
    public final String a;
    public final byte[] b;
    public final Object c;
    private final String f;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        e = bitSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eox(java.lang.String r9, boolean r10, java.lang.Object r11) {
        /*
            r8 = this;
            r8.<init>()
            r8.f = r9
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r0)
            r9.getClass()
            boolean r0 = r9.isEmpty()
            r0 = r0 ^ 1
            java.lang.String r1 = "token must have at least 1 tchar"
            defpackage.clq.w(r0, r1)
            java.lang.String r0 = "connection"
            boolean r0 = r9.equals(r0)
            r1 = 0
            if (r0 == 0) goto L36
            java.util.logging.Logger r2 = defpackage.epc.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "exception to show backtrace"
            r7.<init>(r0)
            java.lang.String r5 = "validateName"
            java.lang.String r6 = "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1"
            java.lang.String r4 = "io.grpc.Metadata$Key"
            r2.logp(r3, r4, r5, r6, r7)
        L36:
            r0 = r1
        L37:
            int r2 = r9.length()
            if (r0 >= r2) goto L6b
            char r2 = r9.charAt(r0)
            if (r10 == 0) goto L4c
            r3 = 58
            if (r2 != r3) goto L4c
            if (r0 != 0) goto L4b
            r0 = r1
            goto L54
        L4b:
            r2 = r3
        L4c:
            java.util.BitSet r3 = defpackage.eox.e
            boolean r3 = r3.get(r2)
            if (r3 == 0) goto L57
        L54:
            int r0 = r0 + 1
            goto L37
        L57:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Character r10 = java.lang.Character.valueOf(r2)
            java.lang.Object[] r9 = new java.lang.Object[]{r10, r9}
            java.lang.String r10 = "Invalid character '%s' in key name '%s'"
            java.lang.String r9 = defpackage.clq.u(r10, r9)
            r8.<init>(r9)
            throw r8
        L6b:
            r8.a = r9
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r9 = r9.getBytes(r10)
            r8.b = r9
            r8.c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eox.<init>(java.lang.String, boolean, java.lang.Object):void");
    }

    public static eox c(String str, eot eotVar) {
        return new eos(str, eotVar);
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((eox) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.a + "'}";
    }
}
