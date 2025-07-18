package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpc {
    public static final dpc a = new dpc("SHA1");
    public static final dpc b = new dpc("SHA224");
    public static final dpc c = new dpc("SHA256");
    public static final dpc d = new dpc("SHA384");
    public static final dpc e = new dpc("SHA512");
    private final String f;

    private dpc(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
