package defpackage;

import com.google.android.apps.aicore.aidl.AIFeature;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class deq extends des {
    private deq(deo deoVar, Character ch) {
        super(deoVar, ch);
        clq.v(deoVar.b.length == 64);
    }

    @Override // defpackage.des, defpackage.det
    public final int a(byte[] bArr, CharSequence charSequence) throws der {
        CharSequence charSequenceF = f(charSequence);
        if (!this.b.c(charSequenceF.length())) {
            throw new der("Invalid input length " + charSequenceF.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceF.length()) {
            int i3 = i2 + 1;
            int iB = (this.b.b(charSequenceF.charAt(i)) << 18) | (this.b.b(charSequenceF.charAt(i + 1)) << 12);
            bArr[i2] = (byte) (iB >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceF.length()) {
                int i5 = i + 3;
                int iB2 = iB | (this.b.b(charSequenceF.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iB2 >>> 8) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
                if (i5 < charSequenceF.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iB2 | this.b.b(charSequenceF.charAt(i5))) & AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.des
    public final det b(deo deoVar, Character ch) {
        return new deq(deoVar, null);
    }

    @Override // defpackage.des, defpackage.det
    public final void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        clq.E(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = bArr[i2] & 255;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | (i4 << 16) | (bArr[i2 + 2] & 255);
            appendable.append(this.b.a(i5 >>> 18));
            appendable.append(this.b.a((i5 >>> 12) & 63));
            appendable.append(this.b.a((i5 >>> 6) & 63));
            appendable.append(this.b.a(i5 & 63));
            i2 += 3;
        }
        if (i2 < i) {
            g(appendable, bArr, i2, i - i2);
        }
    }

    public deq(String str, String str2, Character ch) {
        this(new deo(str, str2.toCharArray()), ch);
    }
}
