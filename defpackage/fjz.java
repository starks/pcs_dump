package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjz {
    public static /* synthetic */ String A(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static /* synthetic */ String B(String str, String str2, String str3) {
        str.getClass();
        int i = 0;
        int iR = r(str, str2, 0);
        if (iR < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i, iR);
            sb.append(str3);
            i = iR + length;
            if (iR >= str.length()) {
                break;
            }
            iR = r(str, str2, iR + fjs.i(length, 1));
        } while (iR > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static /* synthetic */ List C(CharSequence charSequence, char[] cArr) {
        int length = 0;
        String strValueOf = String.valueOf(cArr[0]);
        int iR = r(charSequence, strValueOf, 0);
        if (iR == -1) {
            return ffh.B(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(length, iR).toString());
            length = strValueOf.length() + iR;
            iR = r(charSequence, strValueOf, length);
        } while (iR != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ boolean D(String str, String str2, int i) {
        return g(str, str2, i, false);
    }

    public static /* synthetic */ boolean E(String str, String str2) {
        return f(str, str2, false);
    }

    public static /* synthetic */ String F(String str) {
        str.getClass();
        str.getClass();
        int iW = w(str, '.', 0, 6);
        if (iW == -1) {
            return str;
        }
        String strSubstring = str.substring(iW + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static /* synthetic */ String G(String str) throws IOException {
        String str2;
        if (l("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listG = fjs.g(k(str));
        listG.size();
        fiy mfVar = "".length() == 0 ? uv.c : new mf(4);
        int iA = ffh.A(listG);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listG) {
            int i2 = i + 1;
            if (i < 0) {
                ffh.D();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iA) && l(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!H(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && D(str3, "|", i3)) {
                    str3.getClass();
                    strSubstring = str3.substring(i3 + 1);
                    strSubstring.getClass();
                }
                if (strSubstring != null && (str2 = (String) mfVar.a(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        ffh.R(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static final boolean H(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final int I(char c) {
        return Character.digit((int) c, 10);
    }

    public static boolean J(char c, char c2) {
        return c == c2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fhk, fia] */
    public static final Object K(fpa fpaVar, Object obj, fjc fjcVar) throws Throwable {
        Object flqVar;
        try {
            c(fjcVar, 2);
            flqVar = fjcVar.a(obj, fpaVar);
        } catch (Throwable th) {
            flqVar = new flq(th);
        }
        if (flqVar == fhs.a) {
            return fhs.a;
        }
        Object objU = fpaVar.u(flqVar);
        if (objU == fni.b) {
            return fhs.a;
        }
        if (!(objU instanceof flq)) {
            return fni.b(objU);
        }
        Throwable th2 = ((flq) objU).a;
        ?? r1 = fpaVar.d;
        if (fmd.c && (r1 instanceof fia)) {
            throw fpb.a(th2, r1);
        }
        throw th2;
    }

    public static final void L(fhk fhkVar, Throwable th) throws Throwable {
        fhkVar.e(ffh.b(th));
        throw th;
    }

    public static final void M(fjc fjcVar, Object obj, fhk fhkVar) throws Throwable {
        try {
            fok.a(fjp.C(fjp.B(fjcVar, obj, fhkVar)), ffz.a);
        } catch (Throwable th) {
            L(fhkVar, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[PHI: r15
  0x0064: PHI (r15v3 long) = (r15v2 long), (r15v5 long) binds: [B:26:0x0054, B:30:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long N(java.lang.String r21, long r22, long r24, long r26) {
        /*
            r0 = r21
            r1 = r24
            r3 = r26
            java.lang.String r5 = defpackage.fpd.a(r0)
            if (r5 != 0) goto Ld
            return r22
        Ld:
            int r6 = r5.length()
            if (r6 != 0) goto L16
        L13:
            r7 = 0
            goto L85
        L16:
            r8 = 0
            char r9 = r5.charAt(r8)
            r10 = 48
            int r10 = defpackage.fjs.a(r9, r10)
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r10 >= 0) goto L39
            r10 = 1
            if (r6 != r10) goto L2c
            goto L13
        L2c:
            r13 = 43
            if (r9 == r13) goto L3a
            r8 = 45
            if (r9 == r8) goto L35
            goto L13
        L35:
            r11 = -9223372036854775808
            r8 = r10
            goto L3a
        L39:
            r10 = r8
        L3a:
            r13 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r15 = 0
            r23 = r8
            r7 = r15
            r15 = r13
        L45:
            if (r10 >= r6) goto L79
            char r9 = r5.charAt(r10)
            int r9 = I(r9)
            if (r9 >= 0) goto L52
            goto L13
        L52:
            int r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r17 >= 0) goto L64
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L13
            r15 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r17 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r17 >= 0) goto L64
            goto L13
        L64:
            r17 = 10
            long r7 = r7 * r17
            long r13 = (long) r9
            long r19 = r11 + r13
            int r9 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r9 >= 0) goto L70
            goto L13
        L70:
            long r7 = r7 - r13
            int r10 = r10 + 1
            r13 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L45
        L79:
            if (r23 == 0) goto L80
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L85
        L80:
            long r6 = -r7
            java.lang.Long r7 = java.lang.Long.valueOf(r6)
        L85:
            java.lang.String r6 = "'"
            java.lang.String r8 = "System property '"
            if (r7 == 0) goto Lc5
            long r9 = r7.longValue()
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 > 0) goto L98
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto L98
            return r9
        L98:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' should be in range "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ".."
            r7.append(r0)
            r7.append(r3)
            java.lang.String r0 = ", but is '"
            r7.append(r0)
            r7.append(r9)
            r7.append(r6)
            java.lang.String r0 = r7.toString()
            r5.<init>(r0)
            throw r5
        Lc5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            r2.append(r0)
            java.lang.String r0 = "' has unrecognized value '"
            r2.append(r0)
            r2.append(r5)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjz.N(java.lang.String, long, long, long):long");
    }

    public static final boolean O(String str, boolean z) {
        String strA = fpd.a(str);
        return strA != null ? Boolean.parseBoolean(strA) : z;
    }

    public static /* synthetic */ int P(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) N(str, i, i5, i3);
    }

    public static void a(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + str);
        fjs.d(classCastException, fjz.class.getName());
        throw classCastException;
    }

    public static boolean b(Object obj, int i) {
        if (obj instanceof ffl) {
            if ((obj instanceof fjq ? ((fjq) obj).i() : obj instanceof fin ? 0 : obj instanceof fiy ? 1 : obj instanceof fjc ? 2 : obj instanceof fjd ? 3 : obj instanceof fje ? 4 : obj instanceof fjf ? 5 : obj instanceof fjg ? 6 : obj instanceof fjh ? 7 : obj instanceof fji ? 8 : obj instanceof fjj ? 9 : obj instanceof fio ? 10 : obj instanceof fip ? 11 : obj instanceof fiq ? 12 : obj instanceof fir ? 13 : obj instanceof fis ? 14 : obj instanceof fit ? 15 : obj instanceof fiu ? 16 : obj instanceof fiv ? 17 : obj instanceof fiw ? 18 : obj instanceof fix ? 19 : obj instanceof fiz ? 20 : obj instanceof fja ? 21 : obj instanceof fjb ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void c(Object obj, int i) {
        if (b(obj, 2)) {
            return;
        }
        a(obj, a.x(2, "kotlin.jvm.functions.Function"));
    }

    public static final void d(Appendable appendable, Object obj, fiy fiyVar) {
        if (fiyVar != null) {
            appendable.append((CharSequence) fiyVar.a(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static boolean e(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(true, i, str2, i2, i3);
    }

    public static boolean f(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2) : e(str, 0, str2, 0, str2.length(), true);
    }

    public static boolean g(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : e(str, i, str2, 0, str2.length(), true);
    }

    public static int h(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static CharSequence i(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zH = H(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zH) {
                    break;
                }
                length--;
            } else if (zH) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String j(String str, CharSequence charSequence) {
        if (!E(str, (String) charSequence)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static fku k(CharSequence charSequence) {
        return new fkz((fku) new fkz(charSequence, new fle(ffh.W(new String[]{"\r\n", "\n", "\r"})), 2), (fiy) new mf(charSequence, 6), 0);
    }

    public static boolean l(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!H(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String m(String str, int i) {
        String strSubstring = str.substring(0, fjs.j(i, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public static /* synthetic */ boolean n(CharSequence charSequence, char c) {
        return u(charSequence, c, 0, 2) >= 0;
    }

    public static /* synthetic */ boolean o(CharSequence charSequence, CharSequence charSequence2) {
        return v(charSequence, (String) charSequence2, 0, 2) >= 0;
    }

    public static boolean q(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static int r(CharSequence charSequence, String str, int i) {
        str.getClass();
        return !(charSequence instanceof String) ? t(charSequence, str, i, charSequence.length()) : ((String) charSequence).indexOf(str, i);
    }

    public static int s(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        fki fkiVar = new fki(fjs.i(i, 0), fjs.j(i2, charSequence.length()));
        if (!(charSequence instanceof String)) {
            int i3 = fkiVar.a;
            int i4 = fkiVar.b;
            int i5 = fkiVar.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                return -1;
            }
            while (!z(charSequence2, 0, charSequence, i3, charSequence2.length())) {
                if (i3 == i4) {
                    return -1;
                }
                i3 += i5;
            }
            return i3;
        }
        int i6 = fkiVar.a;
        int i7 = fkiVar.b;
        int i8 = fkiVar.c;
        if ((i8 <= 0 || i6 > i7) && (i8 >= 0 || i7 > i6)) {
            return -1;
        }
        int i9 = i6;
        while (true) {
            String str = (String) charSequence2;
            if (e(str, 0, (String) charSequence, i9, str.length(), false)) {
                return i9;
            }
            if (i9 == i7) {
                return -1;
            }
            i9 += i8;
        }
    }

    static /* synthetic */ int t(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        return s(charSequence, charSequence2, i, i2, false);
    }

    public static /* synthetic */ int u(CharSequence charSequence, char c, int i, int i2) {
        charSequence.getClass();
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int v(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return r(charSequence, str, i);
    }

    public static /* synthetic */ int w(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = h(charSequence);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static String x(String str) {
        CharSequence charSequenceSubSequence;
        if (str.length() >= 8) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            int length = 8 - str.length();
            if (length > 0) {
                int i = 1;
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean z(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        charSequence.getClass();
        if (i2 < 0 || charSequence.length() - i3 < 0 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!J(charSequence.charAt(i4), charSequence2.charAt(i2 + i4))) {
                return false;
            }
        }
        return true;
    }
}
