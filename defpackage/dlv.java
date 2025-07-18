package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlv {
    public static final dlv a = new dlv("SHA1");
    public static final dlv b = new dlv("SHA224");
    public static final dlv c = new dlv("SHA256");
    public static final dlv d = new dlv("SHA384");
    public static final dlv e = new dlv("SHA512");
    private final String f;

    private dlv(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
