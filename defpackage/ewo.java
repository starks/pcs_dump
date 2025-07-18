package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewo {
    public static final Logger a = Logger.getLogger(ewo.class.getName());

    private ewo() {
    }

    public static Object a(dxk dxkVar) throws IOException, NumberFormatException {
        String strF;
        String string;
        double d;
        clq.G(dxkVar.i(), "unexpected end of JSON");
        int iJ = dxkVar.j() - 1;
        boolean z = true;
        if (iJ == 0) {
            int iA = dxkVar.c;
            if (iA == 0) {
                iA = dxkVar.a();
            }
            if (iA != 3) {
                throw dxkVar.c("BEGIN_ARRAY");
            }
            dxkVar.h(1);
            dxkVar.i[dxkVar.g - 1] = 0;
            dxkVar.c = 0;
            ArrayList arrayList = new ArrayList();
            while (dxkVar.i()) {
                arrayList.add(a(dxkVar));
            }
            clq.G(dxkVar.j() == 2, "Bad token: ".concat(String.valueOf(dxkVar.d())));
            int iA2 = dxkVar.c;
            if (iA2 == 0) {
                iA2 = dxkVar.a();
            }
            if (iA2 != 4) {
                throw dxkVar.c("END_ARRAY");
            }
            int i = dxkVar.g;
            dxkVar.g = i - 1;
            int[] iArr = dxkVar.i;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            dxkVar.c = 0;
            return DesugarCollections.unmodifiableList(arrayList);
        }
        if (iJ == 2) {
            int iA3 = dxkVar.c;
            if (iA3 == 0) {
                iA3 = dxkVar.a();
            }
            if (iA3 != 1) {
                throw dxkVar.c("BEGIN_OBJECT");
            }
            dxkVar.h(3);
            dxkVar.c = 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (dxkVar.i()) {
                int iA4 = dxkVar.c;
                if (iA4 == 0) {
                    iA4 = dxkVar.a();
                }
                if (iA4 == 14) {
                    strF = dxkVar.g();
                } else if (iA4 == 12) {
                    strF = dxkVar.f('\'');
                } else {
                    if (iA4 != 13) {
                        throw dxkVar.c("a name");
                    }
                    strF = dxkVar.f('\"');
                }
                dxkVar.c = 0;
                dxkVar.h[dxkVar.g - 1] = strF;
                clq.A(!linkedHashMap.containsKey(strF), "Duplicate key found: %s", strF);
                linkedHashMap.put(strF, a(dxkVar));
            }
            clq.G(dxkVar.j() == 4, "Bad token: ".concat(String.valueOf(dxkVar.d())));
            int iA5 = dxkVar.c;
            if (iA5 == 0) {
                iA5 = dxkVar.a();
            }
            if (iA5 != 2) {
                throw dxkVar.c("END_OBJECT");
            }
            int i3 = dxkVar.g;
            int i4 = i3 - 1;
            dxkVar.g = i4;
            dxkVar.h[i4] = null;
            int[] iArr2 = dxkVar.i;
            int i5 = i3 - 2;
            iArr2[i5] = iArr2[i5] + 1;
            dxkVar.c = 0;
            return DesugarCollections.unmodifiableMap(linkedHashMap);
        }
        if (iJ == 5) {
            int iA6 = dxkVar.c;
            if (iA6 == 0) {
                iA6 = dxkVar.a();
            }
            if (iA6 == 10) {
                string = dxkVar.g();
            } else if (iA6 == 8) {
                string = dxkVar.f('\'');
            } else if (iA6 == 9) {
                string = dxkVar.f('\"');
            } else if (iA6 == 11) {
                string = dxkVar.f;
                dxkVar.f = null;
            } else if (iA6 == 15) {
                string = Long.toString(dxkVar.d);
            } else {
                if (iA6 != 16) {
                    throw dxkVar.c("a string");
                }
                String str = new String(dxkVar.a, dxkVar.b, dxkVar.e);
                dxkVar.b += dxkVar.e;
                string = str;
            }
            dxkVar.c = 0;
            int[] iArr3 = dxkVar.i;
            int i6 = dxkVar.g - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return string;
        }
        if (iJ != 6) {
            if (iJ != 7) {
                if (iJ != 8) {
                    throw new IllegalStateException("Bad token: ".concat(String.valueOf(dxkVar.d())));
                }
                int iA7 = dxkVar.c;
                if (iA7 == 0) {
                    iA7 = dxkVar.a();
                }
                if (iA7 != 7) {
                    throw dxkVar.c("null");
                }
                dxkVar.c = 0;
                int[] iArr4 = dxkVar.i;
                int i7 = dxkVar.g - 1;
                iArr4[i7] = iArr4[i7] + 1;
                return null;
            }
            int iA8 = dxkVar.c;
            if (iA8 == 0) {
                iA8 = dxkVar.a();
            }
            if (iA8 == 5) {
                dxkVar.c = 0;
                int[] iArr5 = dxkVar.i;
                int i8 = dxkVar.g - 1;
                iArr5[i8] = iArr5[i8] + 1;
            } else {
                if (iA8 != 6) {
                    throw dxkVar.c("a boolean");
                }
                dxkVar.c = 0;
                int[] iArr6 = dxkVar.i;
                int i9 = dxkVar.g - 1;
                iArr6[i9] = iArr6[i9] + 1;
                z = false;
            }
            return Boolean.valueOf(z);
        }
        int iA9 = dxkVar.c;
        if (iA9 == 0) {
            iA9 = dxkVar.a();
        }
        if (iA9 == 15) {
            dxkVar.c = 0;
            int[] iArr7 = dxkVar.i;
            int i10 = dxkVar.g - 1;
            iArr7[i10] = iArr7[i10] + 1;
            d = dxkVar.d;
        } else {
            if (iA9 == 16) {
                char[] cArr = dxkVar.a;
                int i11 = dxkVar.b;
                int i12 = dxkVar.e;
                dxkVar.f = new String(cArr, i11, i12);
                dxkVar.b = i11 + i12;
            } else if (iA9 == 8 || iA9 == 9) {
                dxkVar.f = dxkVar.f(iA9 == 8 ? '\'' : '\"');
            } else if (iA9 == 10) {
                dxkVar.f = dxkVar.g();
            } else if (iA9 != 11) {
                throw dxkVar.c("a double");
            }
            dxkVar.c = 11;
            d = Double.parseDouble(dxkVar.f);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw dxkVar.b("JSON forbids NaN and infinities: " + d);
            }
            dxkVar.f = null;
            dxkVar.c = 0;
            int[] iArr8 = dxkVar.i;
            int i13 = dxkVar.g - 1;
            iArr8[i13] = iArr8[i13] + 1;
        }
        return Double.valueOf(d);
    }
}
