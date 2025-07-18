package defpackage;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frh {
    public static final byte[] a = new byte[0];
    public static final fqo b;
    public static final frd c;
    public static final TimeZone d;
    public static final boolean e;
    public static final String f;
    private static final fld g;

    /* JADX WARN: Code restructure failed: missing block: B:83:0x019b, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frh.<clinit>():void");
    }

    public static final int A(byte b2) {
        return b2 & 255;
    }

    public static final int B(long j, TimeUnit timeUnit) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0"));
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large."));
        }
        if (millis != 0) {
            j2 = millis;
        } else if (j > 0) {
            throw new IllegalArgumentException("timeout".concat(" too small."));
        }
        return (int) j2;
    }

    public static final void C(long j, long j2) {
        if (j2 < 0 || j < 0 || j < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static /* synthetic */ int D(String str, char c2, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c2, 0, i);
    }

    public static final boolean E(fwf fwfVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return y(fwfVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final int a(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (fjz.n(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (fjs.a(cCharAt, 31) <= 0 || fjs.a(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(String str, int i, int i2) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 < 'A' || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final int g(fvm fvmVar) {
        return A(fvmVar.d()) | (A(fvmVar.d()) << 16) | (A(fvmVar.d()) << 8);
    }

    public static final int h(String str, int i) throws NumberFormatException {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final long i(frb frbVar) {
        String strB = frbVar.f.b("Content-Length");
        if (strB == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strB);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String j(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        str2.getClass();
        return str2;
    }

    public static final String k(fqq fqqVar, boolean z) {
        String str;
        if (fjz.o(fqqVar.c, ":")) {
            str = "[" + fqqVar.c + "]";
        } else {
            str = fqqVar.c;
        }
        if (!z && fqqVar.d == fwv.C(fqqVar.b)) {
            return str;
        }
        return str + ":" + fqqVar.d;
    }

    public static final String l(String str, int i, int i2) {
        int iD = d(str, i, i2);
        String strSubstring = str.substring(iD, e(str, iD, i2));
        strSubstring.getClass();
        return strSubstring;
    }

    public static final Throwable m(Exception exc, List list) {
        exc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ffh.a(exc, (Exception) it.next());
        }
        return exc;
    }

    @SafeVarargs
    public static final List n(Object... objArr) {
        objArr.getClass();
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ffh.B(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List o(List list) {
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ffh.M(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final ThreadFactory p(final String str, final boolean z) {
        return new ThreadFactory() { // from class: frg
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                byte[] bArr = frh.a;
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static final fqo q(List list) {
        fsc fscVar = new fsc((byte[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ftb ftbVar = (ftb) it.next();
            fscVar.j(ftbVar.g.e(), ftbVar.h.e());
        }
        return fscVar.h();
    }

    public static final void r(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void s(Socket socket) throws IOException {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!fjs.c(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean t(String str) {
        return g.a(str);
    }

    public static final boolean u(fqq fqqVar, fqq fqqVar2) {
        return fjs.c(fqqVar.c, fqqVar2.c) && fqqVar.d == fqqVar2.d && fjs.c(fqqVar.b, fqqVar2.b);
    }

    public static final boolean v(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                fkr fkrVar = new fkr(strArr2, 1);
                while (fkrVar.hasNext()) {
                    if (comparator.compare(str, (String) fkrVar.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean w(Socket socket, fvm fvmVar) throws SocketException {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !fvmVar.E();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean x(String str) {
        str.getClass();
        return fjz.q(str, "Authorization") || fjz.q(str, "Cookie") || fjz.q(str, "Proxy-Authorization") || fjz.q(str, "Set-Cookie");
    }

    public static final boolean y(fwf fwfVar, int i, TimeUnit timeUnit) {
        boolean z;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jH = fwfVar.a().g() ? fwfVar.a().h() - jNanoTime : Long.MAX_VALUE;
        fwfVar.a().j(Math.min(jH, timeUnit.toNanos(i)) + jNanoTime);
        try {
            fvk fvkVar = new fvk();
            while (fwfVar.b(fvkVar, 8192L) != -1) {
                fvkVar.B();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            fwh fwhVarA = fwfVar.a();
            if (jH == Long.MAX_VALUE) {
                fwhVarA.i();
            } else {
                fwhVarA.j(jNanoTime + jH);
            }
            throw th;
        }
        if (jH == Long.MAX_VALUE) {
            fwfVar.a().i();
        } else {
            fwfVar.a().j(jNanoTime + jH);
        }
        return z;
    }

    public static final String[] z(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= strArr2.length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
