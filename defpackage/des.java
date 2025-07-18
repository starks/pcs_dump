package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public class des extends det {
    public final deo b;
    public final Character c;
    public volatile det d;

    public des(deo deoVar, Character ch) {
        this.b = deoVar;
        boolean z = true;
        if (ch != null) {
            ch.charValue();
            byte[] bArr = deoVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        clq.A(z, "Padding character %s was already in alphabet", ch);
        this.c = ch;
    }

    @Override // defpackage.det
    public int a(byte[] bArr, CharSequence charSequence) throws der {
        deo deoVar;
        CharSequence charSequenceF = f(charSequence);
        if (!this.b.c(charSequenceF.length())) {
            throw new der("Invalid input length " + charSequenceF.length());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceF.length()) {
            long jB = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                deoVar = this.b;
                if (i3 >= deoVar.e) {
                    break;
                }
                jB <<= deoVar.d;
                if (i + i3 < charSequenceF.length()) {
                    jB |= this.b.b(charSequenceF.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = deoVar.f;
            int i6 = i4 * deoVar.d;
            int i7 = (i5 - 1) * 8;
            while (i7 >= (i5 * 8) - i6) {
                bArr[i2] = (byte) ((jB >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.b.e;
        }
        return i2;
    }

    public det b(deo deoVar, Character ch) {
        throw null;
    }

    @Override // defpackage.det
    public void c(Appendable appendable, byte[] bArr, int i) throws IOException {
        int i2 = 0;
        clq.E(0, i, bArr.length);
        while (i2 < i) {
            g(appendable, bArr, i2, Math.min(this.b.f, i - i2));
            i2 += this.b.f;
        }
    }

    @Override // defpackage.det
    public final int d(int i) {
        return (int) (((this.b.d * i) + 7) / 8);
    }

    @Override // defpackage.det
    public final int e(int i) {
        return this.b.e * dhh.a(i, this.b.f, RoundingMode.CEILING);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof des) {
            des desVar = (des) obj;
            if (this.b.equals(desVar.b) && Objects.equals(this.c, desVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.det
    public final CharSequence f(CharSequence charSequence) {
        charSequence.getClass();
        Character ch = this.c;
        if (ch == null) {
            return charSequence;
        }
        ch.charValue();
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    final void g(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        clq.E(i, i + i2, bArr.length);
        int i3 = 0;
        clq.v(i2 <= this.b.f);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = (i2 + 1) * 8;
        deo deoVar = this.b;
        while (i3 < i2 * 8) {
            long j2 = j >>> ((i5 - deoVar.d) - i3);
            deo deoVar2 = this.b;
            appendable.append(deoVar2.a(((int) j2) & deoVar2.c));
            i3 += this.b.d;
        }
        if (this.c != null) {
            while (i3 < this.b.f * 8) {
                this.c.charValue();
                appendable.append('=');
                i3 += this.b.d;
            }
        }
    }

    public final int hashCode() {
        return this.b.hashCode() ^ Objects.hashCode(this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.b);
        if (8 % this.b.d != 0) {
            if (this.c == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.c);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public des(String str, String str2, Character ch) {
        this(new deo(str, str2.toCharArray()), ch);
    }
}
