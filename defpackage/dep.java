package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dep extends des {
    final char[] a;

    public dep(deo deoVar) {
        super(deoVar, null);
        this.a = new char[512];
        clq.v(deoVar.b.length == 16);
        for (int i = 0; i < 256; i++) {
            this.a[i] = deoVar.a(i >>> 4);
            this.a[i | 256] = deoVar.a(i & 15);
        }
    }

    @Override // defpackage.des, defpackage.det
    public final int a(byte[] bArr, CharSequence charSequence) throws der {
        if (charSequence.length() % 2 == 1) {
            throw new der("Invalid input length " + charSequence.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            bArr[i2] = (byte) ((this.b.b(charSequence.charAt(i)) << 4) | this.b.b(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.des
    public final det b(deo deoVar, Character ch) {
        return new dep(deoVar);
    }

    @Override // defpackage.des, defpackage.det
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        clq.E(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            appendable.append(this.a[i3]);
            appendable.append(this.a[i3 | 256]);
        }
    }
}
