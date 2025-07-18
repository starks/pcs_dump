package j$.desugar.sun.nio.fs;

import j$.nio.file.AbstractC0020j;
import j$.nio.file.D;
import j$.nio.file.N;
import j$.nio.file.Path;
import j$.nio.file.attribute.H;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i extends AbstractC0020j {
    private final String a;
    private final String b;
    private final m c;

    public i(m mVar, String str, String str2) {
        this.c = mVar;
        this.a = str;
        this.b = str2;
    }

    @Override // j$.nio.file.AbstractC0020j
    public final Iterable c() {
        throw new UnsupportedOperationException("");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final Path d(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new o(this, str, this.a, this.b);
    }

    @Override // j$.nio.file.AbstractC0020j
    public final D e(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new IllegalArgumentException(String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", Integer.valueOf(iIndexOf), str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            strSubstring2 = g.e(strSubstring2);
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            throw new UnsupportedOperationException("Syntax '" + strSubstring + "' not recognized");
        }
        return new h(Pattern.compile(strSubstring2));
    }

    @Override // j$.nio.file.AbstractC0020j
    public final Iterable f() {
        return g.b(new Object[]{new o(this, "/", this.a, this.b)});
    }

    @Override // j$.nio.file.AbstractC0020j
    public final String g() {
        return "/";
    }

    @Override // j$.nio.file.AbstractC0020j
    public final H h() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final boolean i() {
        return false;
    }

    @Override // j$.nio.file.AbstractC0020j
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.AbstractC0020j
    public final N j() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.AbstractC0020j
    public final j$.nio.file.spi.d k() {
        return this.c;
    }

    @Override // j$.nio.file.AbstractC0020j
    public final Set l() {
        return g.c(new Object[]{"basic"});
    }
}
