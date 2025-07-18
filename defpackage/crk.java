package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class crk extends cri {
    static final int a = Integer.numberOfLeadingZeros(31);
    static final crl b = new crk();

    public crk() {
        super("CharMatcher.whitespace()");
    }

    @Override // defpackage.crl
    public final boolean b(char c) {
        return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> a) == c;
    }
}
