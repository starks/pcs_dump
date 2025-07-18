package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpb {
    public static final dpb a = new dpb("NIST_P256");
    public static final dpb b = new dpb("NIST_P384");
    public static final dpb c = new dpb("NIST_P521");
    public static final dpb d = new dpb("X25519");
    private final String e;

    private dpb(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
