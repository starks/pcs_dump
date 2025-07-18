package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class V {
    public static final V OP;
    public static final V SPLITERATOR;
    public static final V STREAM;
    public static final V TERMINAL_OP;
    public static final V UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ V[] a;

    static {
        V v = new V("SPLITERATOR", 0);
        SPLITERATOR = v;
        V v2 = new V("STREAM", 1);
        STREAM = v2;
        V v3 = new V("OP", 2);
        OP = v3;
        V v4 = new V("TERMINAL_OP", 3);
        TERMINAL_OP = v4;
        V v5 = new V("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = v5;
        a = new V[]{v, v2, v3, v4, v5};
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) a.clone();
    }
}
