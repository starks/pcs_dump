package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class det {
    public static final det e = new deq("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final det f = new deq("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final det g;

    static {
        new des("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new des("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        g = new dep(new deo("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public CharSequence f(CharSequence charSequence) {
        throw null;
    }

    public final String h(byte[] bArr) {
        int length = bArr.length;
        clq.E(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            c(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] i(CharSequence charSequence) {
        try {
            CharSequence charSequenceF = f(charSequence);
            int iD = d(charSequenceF.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceF);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (der e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
