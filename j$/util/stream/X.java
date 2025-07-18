package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class X {
    public static final X DOUBLE_VALUE;
    public static final X INT_VALUE;
    public static final X LONG_VALUE;
    public static final X REFERENCE;
    private static final /* synthetic */ X[] a;

    static {
        X x = new X("REFERENCE", 0);
        REFERENCE = x;
        X x2 = new X("INT_VALUE", 1);
        INT_VALUE = x2;
        X x3 = new X("LONG_VALUE", 2);
        LONG_VALUE = x3;
        X x4 = new X("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = x4;
        a = new X[]{x, x2, x3, x4};
    }

    public static X valueOf(String str) {
        return (X) Enum.valueOf(X.class, str);
    }

    public static X[] values() {
        return (X[]) a.clone();
    }
}
