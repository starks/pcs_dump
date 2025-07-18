package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eqm implements epb {
    @Override // defpackage.epb
    public final /* synthetic */ Object a(byte[] bArr) {
        int i;
        int i2;
        byte b;
        List list = eqo.a;
        int length = bArr.length;
        char c = 0;
        if (length == 1 && bArr[0] == 48) {
            return eqo.b;
        }
        if (length != 1) {
            if (length == 2 && (b = bArr[0]) >= 48 && b <= 57) {
                i = (b - 48) * 10;
                c = 1;
            }
            return eqo.d.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
        }
        i = 0;
        byte b2 = bArr[c];
        if (b2 >= 48 && b2 <= 57 && (i2 = i + (b2 - 48)) < eqo.a.size()) {
            return (eqo) eqo.a.get(i2);
        }
        return eqo.d.e("Unknown code ".concat(new String(bArr, StandardCharsets.US_ASCII)));
    }

    @Override // defpackage.epb
    public final /* bridge */ /* synthetic */ byte[] b(Object obj) {
        return ((eqo) obj).o.s;
    }
}
