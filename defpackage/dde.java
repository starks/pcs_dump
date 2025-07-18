package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dde extends ddi {
    public static final ddi a = new dde();

    private dde() {
    }

    @Override // defpackage.ddi
    public final int a(ddf ddfVar, int i, String str, int i2, int i3, int i4) {
        int i5;
        daw dawVar;
        daw dawVar2;
        ddb ddaVar;
        ddb dddVar;
        char cCharAt = str.charAt(i4);
        int i6 = cCharAt & ' ';
        int i7 = 1;
        boolean z = i6 == 0;
        daw dawVar3 = daw.a;
        char c = ' ';
        int i8 = i3;
        if (i8 != i4 || z) {
            int i9 = true != z ? 0 : 128;
            while (i8 != i4) {
                int i10 = i8 + 1;
                i5 = i7;
                char cCharAt2 = str.charAt(i8);
                char c2 = '.';
                if (cCharAt2 >= c && cCharAt2 <= '0') {
                    int iA = daw.a(cCharAt2);
                    if (iA >= 0) {
                        int i11 = i5 << iA;
                        if ((i9 & i11) != 0) {
                            throw ddh.a("repeated flag", str, i8);
                        }
                        i9 |= i11;
                        c = ' ';
                        i7 = i5;
                        i8 = i10;
                    } else {
                        if (cCharAt2 != '.') {
                            throw ddh.a("invalid flag", str, i8);
                        }
                        dawVar2 = new daw(i9, -1, daw.b(str, i10, i4));
                        dawVar = dawVar2;
                    }
                } else {
                    if (cCharAt2 > '9') {
                        throw ddh.a("invalid flag", str, i8);
                    }
                    int i12 = cCharAt2 - '0';
                    while (true) {
                        if (i10 == i4) {
                            dawVar2 = new daw(i9, i12, -1);
                            break;
                        }
                        int i13 = i10 + 1;
                        char cCharAt3 = str.charAt(i10);
                        if (cCharAt3 == c2) {
                            dawVar2 = new daw(i9, i12, daw.b(str, i13, i4));
                            break;
                        }
                        char c3 = (char) (cCharAt3 - '0');
                        if (c3 >= '\n') {
                            throw ddh.a("invalid width character", str, i10);
                        }
                        i12 = (i12 * 10) + c3;
                        if (i12 > 999999) {
                            throw ddh.b("width too large", str, i8, i4);
                        }
                        i10 = i13;
                        c2 = '.';
                    }
                    dawVar = dawVar2;
                }
            }
            i5 = i7;
            dawVar = new daw(i9, -1, -1);
        } else {
            dawVar = daw.a;
            i5 = 1;
        }
        dav davVar = dav.k[dav.a(cCharAt)];
        if (i6 == 0 && (davVar == null || (davVar.n & 128) == 0)) {
            davVar = null;
        }
        int i14 = i4 + 1;
        if (davVar != null) {
            if (!dawVar.e(davVar.n, davVar.m.f)) {
                throw ddh.b("invalid format specifier", str, i2, i14);
            }
            Map map = ddc.c;
            if (i >= 10 || !dawVar.c()) {
                dddVar = new ddc(i, davVar, dawVar);
                ddaVar = dddVar;
            } else {
                ddb[] ddbVarArr = (ddc[]) ddc.c.get(davVar);
                ddbVarArr.getClass();
                ddaVar = ddbVarArr[i];
            }
        } else if (cCharAt == 't' || cCharAt == 'T') {
            if (!dawVar.e(160, false)) {
                throw ddh.b("invalid format specification", str, i2, i14);
            }
            int i15 = i4 + 2;
            if (i15 > str.length()) {
                throw ddh.a("truncated format specifier", str, i2);
            }
            dcz dczVar = (dcz) dcz.F.get(Character.valueOf(str.charAt(i14)));
            if (dczVar == null) {
                throw ddh.a("illegal date/time conversion", str, i14);
            }
            ddaVar = new dda(dawVar, i, dczVar);
            i14 = i15;
        } else {
            if (cCharAt != 'h' && cCharAt != 'H') {
                throw ddh.b("invalid format specification", str, i2, i14);
            }
            if (!dawVar.e(160, false)) {
                throw ddh.b("invalid format specification", str, i2, i14);
            }
            dddVar = new ddd(dawVar, i);
            ddaVar = dddVar;
        }
        int i16 = ddaVar.a;
        if (i16 < 32) {
            ddfVar.a |= i5 << i16;
        }
        ddfVar.b = Math.max(ddfVar.b, i16);
        ddfVar.d(i2, i14, ddaVar);
        return i14;
    }
}
