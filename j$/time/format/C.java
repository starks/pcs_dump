package j$.time.format;

/* loaded from: classes2.dex */
public enum C {
    FULL(0),
    FULL_STANDALONE(0),
    SHORT(1),
    SHORT_STANDALONE(1),
    NARROW(1),
    NARROW_STANDALONE(1);

    private final int a;

    C(int i) {
        this.a = i;
    }

    final int g() {
        return this.a;
    }
}
