package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class o implements f {
    public static final o INSENSITIVE;
    public static final o LENIENT;
    public static final o SENSITIVE;
    public static final o STRICT;
    private static final /* synthetic */ o[] a;

    static {
        o oVar = new o("SENSITIVE", 0);
        SENSITIVE = oVar;
        o oVar2 = new o("INSENSITIVE", 1);
        INSENSITIVE = oVar2;
        o oVar3 = new o("STRICT", 2);
        STRICT = oVar3;
        o oVar4 = new o("LENIENT", 3);
        LENIENT = oVar4;
        a = new o[]{oVar, oVar2, oVar3, oVar4};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) a.clone();
    }

    @Override // j$.time.format.f
    public final boolean g(v vVar, StringBuilder sb) {
        return true;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
