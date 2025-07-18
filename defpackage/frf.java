package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class frf {
    public static final frf a;
    public static final frf b;
    public static final frf c;
    public static final frf d;
    public static final frf e;
    public static final fwv g;
    private static final /* synthetic */ frf[] h;
    public final String f;

    static {
        frf frfVar = new frf("TLS_1_3", 0, "TLSv1.3");
        a = frfVar;
        frf frfVar2 = new frf("TLS_1_2", 1, "TLSv1.2");
        b = frfVar2;
        frf frfVar3 = new frf("TLS_1_1", 2, "TLSv1.1");
        c = frfVar3;
        frf frfVar4 = new frf("TLS_1_0", 3, "TLSv1");
        d = frfVar4;
        frf frfVar5 = new frf("SSL_3_0", 4, "SSLv3");
        e = frfVar5;
        frf[] frfVarArr = {frfVar, frfVar2, frfVar3, frfVar4, frfVar5};
        h = frfVarArr;
        fjp.z(frfVarArr);
        g = new fwv();
    }

    private frf(String str, int i, String str2) {
        this.f = str2;
    }

    public static frf[] values() {
        return (frf[]) h.clone();
    }
}
