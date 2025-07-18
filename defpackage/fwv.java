package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwv {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final frf A(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return frf.c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return frf.b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return frf.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return frf.d;
            }
        } else if (str.equals("SSLv3")) {
            return frf.e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final fqz B(byte[] bArr, fqs fqsVar, int i) {
        frh.C(bArr.length, i);
        return new fqy(fqsVar, i, bArr);
    }

    public static final int C(String str) {
        if (fjs.c(str, "http")) {
            return 80;
        }
        return !fjs.c(str, "https") ? -1 : 443;
    }

    public static /* synthetic */ String D(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        boolean z3 = z & ((i3 & 4) == 0);
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%') {
                z2 = z3;
            } else if (cCharAt != '+' || !z3) {
                iCharCount++;
            }
            fvk fvkVar = new fvk();
            fvkVar.V(str, i, iCharCount);
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt == 37) {
                    int i4 = iCharCount + 2;
                    if (i4 < i2) {
                        int iF = frh.f(str.charAt(iCharCount + 1));
                        int iF2 = frh.f(str.charAt(i4));
                        if (iF == -1 || iF2 == -1) {
                            iCodePointAt = 37;
                            fvkVar.W(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            fvkVar.P((iF << 4) + iF2);
                            iCharCount = Character.charCount(37) + i4;
                        }
                    } else {
                        iCodePointAt = 37;
                    }
                }
                if (iCodePointAt == 43 && z2) {
                    fvkVar.P(32);
                    iCharCount++;
                } else {
                    fvkVar.W(iCodePointAt);
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return fvkVar.l();
        }
        String strSubstring = str.substring(i, i2);
        strSubstring.getClass();
        return strSubstring;
    }

    public static final List E(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iU = fjz.u(str, '&', i, 4);
            if (iU == -1) {
                iU = str.length();
            }
            int iU2 = fjz.u(str, '=', i, 4);
            if (iU2 == -1 || iU2 > iU) {
                String strSubstring = str.substring(i, iU);
                strSubstring.getClass();
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iU2);
                strSubstring2.getClass();
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iU2 + 1, iU);
                strSubstring3.getClass();
                arrayList.add(strSubstring3);
            }
            i = iU + 1;
        }
        return arrayList;
    }

    public static final void F(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt >= 127) {
                throw new IllegalArgumentException(frh.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static final void G(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (cCharAt < ' ' || cCharAt >= 127)) {
                throw new IllegalArgumentException(frh.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(frh.x(str2) ? "" : ": ".concat(String.valueOf(str))));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String I(defpackage.fwv r17, java.lang.String r18, int r19, int r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25, int r26) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwv.I(fwv, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r4 == 16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (r5 == (-1)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        r13 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r13, r13);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress J(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwv.J(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final boolean K(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && frh.f(str.charAt(i + 1)) != -1 && frh.f(str.charAt(i3)) != -1;
    }

    private static final List L(Certificate[] certificateArr) {
        return certificateArr != null ? frh.n(Arrays.copyOf(certificateArr, certificateArr.length)) : fgm.a;
    }

    public static final int a(fwc fwcVar, int i) {
        int i2;
        int length = fwcVar.f.length - 1;
        int i3 = 0;
        while (true) {
            if (i3 <= length) {
                int i4 = i + 1;
                i2 = (i3 + length) >>> 1;
                int i5 = fwcVar.g[i2];
                if (i5 >= i4) {
                    if (i5 <= i4) {
                        break;
                    }
                    length = i2 - 1;
                } else {
                    i3 = i2 + 1;
                }
            } else {
                i2 = (-i3) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static final String b(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, fla.a);
    }

    public static final byte[] c(String str) {
        byte[] bytes = str.getBytes(fla.a);
        bytes.getClass();
        return bytes;
    }

    public static final long e(fvk fvkVar) {
        return fvkVar.b / 4;
    }

    public static final fvl f(fwd fwdVar) {
        return new fvx(fwdVar);
    }

    public static final fvn g(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i + i;
            bArr[i] = (byte) ((fwj.a(str.charAt(i2)) << 4) + fwj.a(str.charAt(i2 + 1)));
        }
        return new fvn(bArr);
    }

    public static final fvn h(String str) {
        str.getClass();
        fvn fvnVar = new fvn(c(str));
        fvnVar.d = str;
        return fvnVar;
    }

    public static /* synthetic */ fvn i(byte[] bArr) {
        int length = bArr.length;
        long j = length;
        m(j, 0L, j);
        return new fvn(ffh.ak(bArr, length));
    }

    public static final fvj j() throws InterruptedException {
        fvj fvjVar = fvj.f;
        fvjVar.getClass();
        fvj fvjVar2 = fvjVar.h;
        if (fvjVar2 == null) {
            long jNanoTime = System.nanoTime();
            fvj.c.await(fvj.d, TimeUnit.MILLISECONDS);
            fvj fvjVar3 = fvj.f;
            fvjVar3.getClass();
            if (fvjVar3.h != null || System.nanoTime() - jNanoTime < fvj.e) {
                return null;
            }
            return fvj.f;
        }
        long jD = fvjVar2.d(System.nanoTime());
        if (jD > 0) {
            fvj.c.await(jD, TimeUnit.NANOSECONDS);
            return null;
        }
        fvj fvjVar4 = fvj.f;
        fvjVar4.getClass();
        fvjVar4.h = fvjVar2.h;
        fvjVar2.h = null;
        fvjVar2.g = 2;
        return fvjVar2;
    }

    public static final void k(fvj fvjVar, long j, boolean z) {
        if (fvj.f == null) {
            fvj.f = new fvj();
            new fvg().start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            fvjVar.i = Math.min(j, fvjVar.h() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            fvjVar.i = j + jNanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            fvjVar.i = fvjVar.h();
        }
        long jD = fvjVar.d(jNanoTime);
        fvj fvjVar2 = fvj.f;
        fvjVar2.getClass();
        while (true) {
            fvj fvjVar3 = fvjVar2.h;
            if (fvjVar3 == null || jD < fvjVar3.d(jNanoTime)) {
                break;
            }
            fvjVar2 = fvjVar2.h;
            fvjVar2.getClass();
        }
        fvjVar.h = fvjVar2.h;
        fvjVar2.h = fvjVar;
        if (fvjVar2 == fvj.f) {
            fvj.c.signal();
        }
    }

    public static final String l(int i) {
        if (i == 0) {
            return "0";
        }
        char c = fwj.a[(i >> 28) & 15];
        char[] cArr = fwj.a;
        int i2 = 0;
        char[] cArr2 = {c, cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 >= 0) {
            if (i2 <= 8) {
                return new String(cArr2, i2, 8 - i2);
            }
            throw new IllegalArgumentException(a.D(8, i2, "startIndex: ", " > endIndex: "));
        }
        throw new IndexOutOfBoundsException("startIndex: " + i2 + ", endIndex: 8, size: 8");
    }

    public static final void m(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static final boolean n(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static final String o(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int iA;
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = (i3 + length) / 2;
            while (i4 >= 0 && bArr[i4] != 10) {
                i4--;
            }
            int i5 = i4 + 1;
            int i6 = 1;
            while (true) {
                i2 = i5 + i6;
                if (bArr[i2] == 10) {
                    break;
                }
                i6++;
            }
            int i7 = i2 - i5;
            int i8 = i;
            boolean z = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iA = (z ? 46 : frh.A(bArr2[i8][i9])) - frh.A(bArr[i5 + i10]);
                if (iA != 0) {
                    break;
                }
                i10++;
                i9++;
                if (i10 == i7) {
                    break;
                }
                if (bArr2[i8].length != i9) {
                    z = false;
                } else {
                    if (i8 == bArr2.length - 1) {
                        break;
                    }
                    i8++;
                    z = true;
                    i9 = -1;
                }
            }
            iA = 0;
            if (iA >= 0) {
                if (iA <= 0) {
                    int i11 = i7 - i10;
                    int length2 = bArr2[i8].length - i9;
                    int length3 = bArr2.length;
                    for (int i12 = i8 + 1; i12 < length3; i12++) {
                        length2 += bArr2[i12].length;
                    }
                    if (length2 >= i11) {
                        if (length2 <= i11) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            return new String(bArr, i5, i7, charset);
                        }
                    }
                }
                i3 = i2 + 1;
            }
            length = i4;
        }
        return null;
    }

    public static final fur p(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            return new fur(x509TrustManager, x509TrustManagerExtensions);
        }
        return null;
    }

    public static final boolean q() {
        fup fupVar = fup.c;
        return s();
    }

    public static final List r(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((fqv) obj) != fqv.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ffh.Q(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((fqv) it.next()).g);
        }
        return arrayList2;
    }

    public static final boolean s() {
        return fjs.c("Dalvik", System.getProperty("java.vm.name"));
    }

    public static final int t(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(a.D(i, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static final fta u(int i) {
        for (fta ftaVar : fta.values()) {
            if (ftaVar.o == i) {
                return ftaVar;
            }
        }
        return null;
    }

    public static final fsq v(String str) throws ProtocolException, NumberFormatException {
        fqv fqvVar;
        int i;
        String strSubstring;
        if (fjz.E(str, "HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                fqvVar = fqv.a;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                fqvVar = fqv.b;
            }
        } else {
            if (!fjz.E(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            fqvVar = fqv.a;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i, i2);
            strSubstring2.getClass();
            int i3 = Integer.parseInt(strSubstring2);
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
                strSubstring.getClass();
            }
            return new fsq(fqvVar, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final String w(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        return str2;
    }

    public static final void x(frk frkVar, frm frmVar, String str) {
        Logger logger = frn.b;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        logger.fine(frmVar.b + " " + str2 + ": " + frkVar.a);
    }

    public static final frb y(frb frbVar) {
        if ((frbVar != null ? frbVar.g : null) == null) {
            return frbVar;
        }
        fra fraVar = new fra(frbVar);
        fraVar.d = null;
        return fraVar.f();
    }

    public static final String z(String str) {
        int i;
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!fjz.o(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i < length; i + 1) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (fjs.a(cCharAt, 31) > 0 && fjs.a(cCharAt, 127) < 0 && fjz.u(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i + 1 : 0;
                        return null;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }
        InetAddress inetAddressJ = (fjz.E(str, "[") && str.endsWith("]")) ? J(str, 1, str.length() - 1) : J(str, 0, str.length());
        if (inetAddressJ == null) {
            return null;
        }
        byte[] address = inetAddressJ.getAddress();
        int length2 = address.length;
        if (length2 != 16) {
            if (length2 == 4) {
                return inetAddressJ.getHostAddress();
            }
            throw new AssertionError(a.z(str, "Invalid IPv6 address: '", "'"));
        }
        address.getClass();
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        fvk fvkVar = new fvk();
        while (i3 < address.length) {
            if (i3 == i2) {
                fvkVar.P(58);
                i3 += i5;
                if (i3 == 16) {
                    fvkVar.P(58);
                }
            } else {
                if (i3 > 0) {
                    fvkVar.P(58);
                }
                fvkVar.Q((frh.A(address[i3]) << 8) | frh.A(address[i3 + 1]));
                i3 += 2;
            }
        }
        return fvkVar.l();
    }

    public final fqn H(SSLSession sSLSession) throws IOException {
        Object objL;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (fjs.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || fjs.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        fqd fqdVarH = fqd.t.h(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (fjs.c("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        frf frfVar = frf.a;
        frf frfVarA = A(protocol);
        try {
            objL = L(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objL = fgm.a;
        }
        return new fqn(frfVarA, fqdVarH, L(sSLSession.getLocalCertificates()), new acp(objL, 5));
    }

    public final void d(long j, fvk fvkVar, int i, List list, int i2, int i3, List list2) {
        int i4;
        List list3;
        int i5;
        int i6 = i;
        int i7 = i2;
        List list4 = list2;
        if (i7 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i7; i8 < i3; i8++) {
            if (((fvn) list.get(i8)).b() < i6) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        fvn fvnVar = (fvn) list.get(i2);
        fvn fvnVar2 = (fvn) list.get(i3 - 1);
        if (i6 == fvnVar.b()) {
            int iIntValue = ((Number) list4.get(i7)).intValue();
            i7++;
            i4 = iIntValue;
            fvnVar = (fvn) list.get(i7);
        } else {
            i4 = -1;
        }
        int i9 = i7 + 1;
        if (fvnVar.a(i6) == fvnVar2.a(i6)) {
            int iMin = Math.min(fvnVar.b(), fvnVar2.b());
            int i10 = 0;
            for (int i11 = i; i11 < iMin && fvnVar.a(i11) == fvnVar2.a(i11); i11++) {
                i10++;
            }
            long jE = j + e(fvkVar) + 2;
            long j2 = i10;
            fvkVar.S(-i10);
            fvkVar.S(i4);
            int i12 = i + i10;
            for (int i13 = i; i13 < i12; i13++) {
                fvkVar.S(fvnVar.a(i13) & 255);
            }
            if (i9 == i3) {
                if (i12 != ((fvn) list.get(i7)).b()) {
                    throw new IllegalStateException("Check failed.");
                }
                fvkVar.S(((Number) list4.get(i7)).intValue());
                return;
            } else {
                long j3 = jE + j2 + 1;
                fvk fvkVar2 = new fvk();
                fvkVar.S(-((int) (e(fvkVar2) + j3)));
                d(j3, fvkVar2, i12, list, i7, i3, list4);
                fvkVar.N(fvkVar2);
                return;
            }
        }
        int i14 = 1;
        while (i9 < i3) {
            if (((fvn) list.get(i9 - 1)).a(i6) != ((fvn) list.get(i9)).a(i6)) {
                i14++;
            }
            i9++;
        }
        long jE2 = j + e(fvkVar) + 2;
        int i15 = i14 + i14;
        fvkVar.S(i14);
        fvkVar.S(i4);
        for (int i16 = i7; i16 < i3; i16++) {
            byte bA = ((fvn) list.get(i16)).a(i6);
            if (i16 == i7 || bA != ((fvn) list.get(i16 - 1)).a(i6)) {
                fvkVar.S(bA & 255);
            }
        }
        fvk fvkVar3 = new fvk();
        int i17 = i7;
        while (i17 < i3) {
            int i18 = i6 + 1;
            byte bA2 = ((fvn) list.get(i17)).a(i6);
            int i19 = i17 + 1;
            int i20 = i19;
            while (true) {
                if (i20 >= i3) {
                    i20 = i3;
                    break;
                } else if (bA2 != ((fvn) list.get(i20)).a(i6)) {
                    break;
                } else {
                    i20++;
                }
            }
            if (i19 == i20 && i18 == ((fvn) list.get(i17)).b()) {
                fvkVar.S(((Number) list4.get(i17)).intValue());
                list3 = list4;
                i5 = i20;
            } else {
                long j4 = i15 + jE2;
                fvkVar.S(-((int) (j4 + e(fvkVar3))));
                list3 = list4;
                i5 = i20;
                d(j4, fvkVar3, i18, list, i17, i5, list3);
            }
            i6 = i;
            i17 = i5;
            list4 = list3;
        }
        fvkVar.N(fvkVar3);
    }
}
