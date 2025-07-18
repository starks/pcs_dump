package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edn {
    public static final /* synthetic */ int a = 0;
    private static volatile int b = 100;

    static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(s(bArr, i));
    }

    static float b(byte[] bArr, int i) {
        return Float.intBitsToFloat(d(bArr, i));
    }

    static int c(byte[] bArr, int i, edm edmVar) {
        int iL = l(bArr, i, edmVar);
        int i2 = edmVar.a;
        if (i2 < 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iL) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            edmVar.c = eea.b;
            return iL;
        }
        edmVar.c = eea.s(bArr, iL, i2);
        return iL + i2;
    }

    static int d(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int e(egx egxVar, byte[] bArr, int i, int i2, int i3, edm edmVar) {
        Object objE = egxVar.e();
        int iP = p(objE, egxVar, bArr, i, i2, i3, edmVar);
        egxVar.f(objE);
        edmVar.c = objE;
        return iP;
    }

    static int f(egx egxVar, byte[] bArr, int i, int i2, edm edmVar) {
        Object objE = egxVar.e();
        int iQ = q(objE, egxVar, bArr, i, i2, edmVar);
        egxVar.f(objE);
        edmVar.c = objE;
        return iQ;
    }

    static int g(egx egxVar, int i, byte[] bArr, int i2, int i3, efm efmVar, edm edmVar) {
        int iF = f(egxVar, bArr, i2, i3, edmVar);
        efmVar.add(edmVar.c);
        while (iF < i3) {
            int iL = l(bArr, iF, edmVar);
            if (i != edmVar.a) {
                break;
            }
            iF = f(egxVar, bArr, iL, i3, edmVar);
            efmVar.add(edmVar.c);
        }
        return iF;
    }

    static int h(byte[] bArr, int i, efm efmVar, edm edmVar) {
        efc efcVar = (efc) efmVar;
        int iL = l(bArr, i, edmVar);
        int i2 = edmVar.a + iL;
        while (iL < i2) {
            iL = l(bArr, iL, edmVar);
            efcVar.g(edmVar.a);
        }
        if (iL == i2) {
            return iL;
        }
        throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int i(byte[] bArr, int i, edm edmVar) {
        int iL = l(bArr, i, edmVar);
        int i2 = edmVar.a;
        if (i2 < 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            edmVar.c = "";
            return iL;
        }
        edmVar.c = new String(bArr, iL, i2, efn.a);
        return iL + i2;
    }

    static int j(byte[] bArr, int i, edm edmVar) {
        int iL = l(bArr, i, edmVar);
        int i2 = edmVar.a;
        if (i2 < 0) {
            throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            edmVar.c = "";
            return iL;
        }
        edmVar.c = ehr.g(bArr, iL, i2);
        return iL + i2;
    }

    static int k(int i, byte[] bArr, int i2, int i3, ehi ehiVar, edm edmVar) {
        if (ehu.a(i) == 0) {
            throw new efp("Protocol message contained an invalid tag (zero).");
        }
        int iB = ehu.b(i);
        if (iB == 0) {
            int iO = o(bArr, i2, edmVar);
            ehiVar.e(i, Long.valueOf(edmVar.b));
            return iO;
        }
        if (iB == 1) {
            ehiVar.e(i, Long.valueOf(s(bArr, i2)));
            return i2 + 8;
        }
        if (iB == 2) {
            int iL = l(bArr, i2, edmVar);
            int i4 = edmVar.a;
            if (i4 < 0) {
                throw new efp("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i4 > bArr.length - iL) {
                throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i4 == 0) {
                ehiVar.e(i, eea.b);
            } else {
                ehiVar.e(i, eea.s(bArr, iL, i4));
            }
            return iL + i4;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new efp("Protocol message contained an invalid tag (zero).");
            }
            ehiVar.e(i, Integer.valueOf(d(bArr, i2)));
            return i2 + 4;
        }
        ehi ehiVar2 = new ehi();
        int i5 = (i & (-8)) | 4;
        int i6 = edmVar.e + 1;
        edmVar.e = i6;
        u(i6);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iL2 = l(bArr, i2, edmVar);
            int i8 = edmVar.a;
            if (i8 == i5) {
                i7 = i8;
                i2 = iL2;
                break;
            }
            i2 = k(i8, bArr, iL2, i3, ehiVar2, edmVar);
            i7 = i8;
        }
        edmVar.e--;
        if (i2 > i3 || i7 != i5) {
            throw new efp("Failed to parse the message.");
        }
        ehiVar.e(i, ehiVar2);
        return i2;
    }

    static int l(byte[] bArr, int i, edm edmVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return m(b2, bArr, i2, edmVar);
        }
        edmVar.a = b2;
        return i2;
    }

    static int m(int i, byte[] bArr, int i2, edm edmVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            edmVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            edmVar.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            edmVar.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            edmVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                edmVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int n(int i, byte[] bArr, int i2, int i3, efm efmVar, edm edmVar) {
        efc efcVar = (efc) efmVar;
        int iL = l(bArr, i2, edmVar);
        efcVar.g(edmVar.a);
        while (iL < i3) {
            int iL2 = l(bArr, iL, edmVar);
            if (i != edmVar.a) {
                break;
            }
            iL = l(bArr, iL2, edmVar);
            efcVar.g(edmVar.a);
        }
        return iL;
    }

    static int o(byte[] bArr, int i, edm edmVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            edmVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        edmVar.b = j2;
        return i3;
    }

    static int p(Object obj, egx egxVar, byte[] bArr, int i, int i2, int i3, edm edmVar) {
        int i4 = edmVar.e + 1;
        edmVar.e = i4;
        u(i4);
        int iC = ((egl) egxVar).c(obj, bArr, i, i2, i3, edmVar);
        edmVar.e--;
        edmVar.c = obj;
        return iC;
    }

    static int q(Object obj, egx egxVar, byte[] bArr, int i, int i2, edm edmVar) {
        int iM = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM = m(i3, bArr, iM, edmVar);
            i3 = edmVar.a;
        }
        int i4 = iM;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new efp("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = edmVar.e + 1;
        edmVar.e = i5;
        u(i5);
        int i6 = i4 + i3;
        egxVar.h(obj, bArr, i4, i6, edmVar);
        edmVar.e--;
        edmVar.c = obj;
        return i6;
    }

    static int r(int i, byte[] bArr, int i2, int i3, edm edmVar) {
        if (ehu.a(i) == 0) {
            throw new efp("Protocol message contained an invalid tag (zero).");
        }
        int iB = ehu.b(i);
        if (iB == 0) {
            return o(bArr, i2, edmVar);
        }
        if (iB == 1) {
            return i2 + 8;
        }
        if (iB == 2) {
            return l(bArr, i2, edmVar) + edmVar.a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i2 + 4;
            }
            throw new efp("Protocol message contained an invalid tag (zero).");
        }
        int i4 = (i & (-8)) | 4;
        int i5 = 0;
        while (i2 < i3) {
            i2 = l(bArr, i2, edmVar);
            i5 = edmVar.a;
            if (i5 == i4) {
                break;
            }
            i2 = r(i5, bArr, i2, i3, edmVar);
        }
        if (i2 > i3 || i5 != i4) {
            throw new efp("Failed to parse the message.");
        }
        return i2;
    }

    static long s(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int t(int i, byte[] bArr, int i2, int i3, eex eexVar, eez eezVar, edm edmVar) {
        eep eepVar = eexVar.a;
        if (eez.D() == ehs.ENUM) {
            l(bArr, i2, edmVar);
            throw null;
        }
        switch (eez.D()) {
            case DOUBLE:
                a(bArr, i2);
                throw null;
            case FLOAT:
                b(bArr, i2);
                throw null;
            case INT64:
            case UINT64:
                o(bArr, i2, edmVar);
                throw null;
            case INT32:
            case UINT32:
                l(bArr, i2, edmVar);
                throw null;
            case FIXED64:
            case SFIXED64:
                s(bArr, i2);
                throw null;
            case FIXED32:
            case SFIXED32:
                d(bArr, i2);
                throw null;
            case BOOL:
                o(bArr, i2, edmVar);
                throw null;
            case STRING:
                i(bArr, i2, edmVar);
                throw null;
            case GROUP:
                egr egrVar = egr.a;
                throw null;
            case MESSAGE:
                egr egrVar2 = egr.a;
                throw null;
            case BYTES:
                c(bArr, i2, edmVar);
                throw null;
            case ENUM:
                throw new IllegalStateException("Shouldn't reach here.");
            case SINT32:
                l(bArr, i2, edmVar);
                int i4 = eee.f;
                throw null;
            case SINT64:
                o(bArr, i2, edmVar);
                int i5 = eee.f;
                throw null;
            default:
                throw null;
        }
    }

    private static void u(int i) throws efp {
        if (i >= b) {
            throw new efp("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
