package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class B {
    public static final B ALWAYS;
    public static final B EXCEEDS_PAD;
    public static final B NEVER;
    public static final B NORMAL;
    public static final B NOT_NEGATIVE;
    private static final /* synthetic */ B[] a;

    static {
        B b = new B("NORMAL", 0);
        NORMAL = b;
        B b2 = new B("ALWAYS", 1);
        ALWAYS = b2;
        B b3 = new B("NEVER", 2);
        NEVER = b3;
        B b4 = new B("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = b4;
        B b5 = new B("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = b5;
        a = new B[]{b, b2, b3, b4, b5};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) a.clone();
    }
}
