package j$.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class StringJoiner {
    private final String a;
    private final String b;
    private final String c;
    private String[] d;
    private int e;
    private int f;

    public StringJoiner(CharSequence charSequence) {
        this(charSequence, 0);
    }

    private void a() {
        String[] strArr;
        if (this.e > 1) {
            char[] cArr = new char[this.f];
            int iB = b(this.d[0], cArr, 0);
            int i = 1;
            do {
                int iB2 = iB + b(this.b, cArr, iB);
                iB = iB2 + b(this.d[i], cArr, iB2);
                strArr = this.d;
                strArr[i] = null;
                i++;
            } while (i < this.e);
            this.e = 1;
            strArr[0] = new String(cArr);
        }
    }

    private static int b(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public StringJoiner add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i = this.e;
            if (i == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = strValueOf.length() + this.f;
        String[] strArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        strArr2[i2] = strValueOf;
        return this;
    }

    public final StringJoiner c(StringJoiner stringJoiner) {
        stringJoiner.getClass();
        if (stringJoiner.d == null) {
            return this;
        }
        stringJoiner.a();
        return add(stringJoiner.d[0]);
    }

    public String toString() {
        String[] strArr = this.d;
        int i = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            a();
            return i == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f + length2];
        int iB = b(str, cArr, 0);
        if (i > 0) {
            iB += b(strArr[0], cArr, iB);
            for (int i2 = 1; i2 < i; i2++) {
                int iB2 = iB + b(this.b, cArr, iB);
                iB = iB2 + b(strArr[i2], cArr, iB2);
            }
        }
        b(str2, cArr, iB);
        return new String(cArr);
    }

    public StringJoiner(CharSequence charSequence, int i) {
        Objects.a(charSequence, "The delimiter must not be null");
        this.a = "";
        this.b = charSequence.toString();
        this.c = "";
    }
}
