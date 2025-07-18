package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqv {
    public static final fqv a;
    public static final fqv b;
    public static final fqv c;
    public static final fqv d;
    public static final fqv e;
    public static final fqv f;
    public static final fwv h;
    private static final /* synthetic */ fqv[] i;
    public final String g;

    static {
        fqv fqvVar = new fqv("HTTP_1_0", 0, "http/1.0");
        a = fqvVar;
        fqv fqvVar2 = new fqv("HTTP_1_1", 1, "http/1.1");
        b = fqvVar2;
        fqv fqvVar3 = new fqv("SPDY_3", 2, "spdy/3.1");
        c = fqvVar3;
        fqv fqvVar4 = new fqv("HTTP_2", 3, "h2");
        d = fqvVar4;
        fqv fqvVar5 = new fqv("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        e = fqvVar5;
        fqv fqvVar6 = new fqv("QUIC", 5, "quic");
        f = fqvVar6;
        fqv[] fqvVarArr = {fqvVar, fqvVar2, fqvVar3, fqvVar4, fqvVar5, fqvVar6};
        i = fqvVarArr;
        fjp.z(fqvVarArr);
        h = new fwv();
    }

    private fqv(String str, int i2, String str2) {
        this.g = str2;
    }

    public static fqv[] values() {
        return (fqv[]) i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
