package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcs {
    static {
        Logger.getLogger(fcs.class.getName());
    }

    private fcs() {
    }

    public static byte[][] a(List list) {
        int size = list.size();
        int i = size + size;
        byte[][] bArr = new byte[i][];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fdk fdkVar = (fdk) it.next();
            int i3 = i2 + 1;
            bArr[i2] = fdkVar.f.m();
            i2 += 2;
            bArr[i3] = fdkVar.g.m();
        }
        Logger logger = fbm.a;
        int i4 = 0;
        while (i4 < i) {
            byte[] bArr2 = bArr[i4];
            int i5 = i4 + 1;
            byte[] bArr3 = bArr[i5];
            if (fbm.a(bArr2, fbm.b)) {
                for (byte b : bArr3) {
                    if (b == 44) {
                        ArrayList arrayList = new ArrayList(i + 10);
                        for (int i6 = 0; i6 < i4; i6++) {
                            arrayList.add(bArr[i6]);
                        }
                        while (i4 < i) {
                            byte[] bArr4 = bArr[i4];
                            byte[] bArr5 = bArr[i4 + 1];
                            if (fbm.a(bArr4, fbm.b)) {
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    int length = bArr5.length;
                                    if (i7 <= length) {
                                        if (i7 == length || bArr5[i7] == 44) {
                                            byte[] bArrI = det.e.i(new String(bArr5, i8, i7 - i8, StandardCharsets.US_ASCII));
                                            arrayList.add(bArr4);
                                            arrayList.add(bArrI);
                                            i8 = i7 + 1;
                                        }
                                        i7++;
                                    }
                                }
                            } else {
                                arrayList.add(bArr4);
                                arrayList.add(bArr5);
                            }
                            i4 += 2;
                        }
                        return (byte[][]) arrayList.toArray(new byte[0][]);
                    }
                }
                bArr[i5] = det.e.i(new String(bArr3, StandardCharsets.US_ASCII));
            }
            i4 += 2;
        }
        return bArr;
    }
}
