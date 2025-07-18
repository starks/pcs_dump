package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A {
    public static final A LENIENT;
    public static final A SMART;
    public static final A STRICT;
    private static final /* synthetic */ A[] a;

    static {
        A a2 = new A("STRICT", 0);
        STRICT = a2;
        A a3 = new A("SMART", 1);
        SMART = a3;
        A a4 = new A("LENIENT", 2);
        LENIENT = a4;
        a = new A[]{a2, a3, a4};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) a.clone();
    }
}
