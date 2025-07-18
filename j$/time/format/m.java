package j$.time.format;

/* loaded from: classes2.dex */
final class m implements f {
    private final f a;
    private final int b;
    private final char c;

    m(f fVar, int i, char c) {
        this.a = fVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.g(vVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.a);
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + strValueOf + "," + this.b + str;
    }
}
