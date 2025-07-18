package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cds {
    public static final cds a;
    public static final cds b;
    public static final cds c;
    public static final cds d;
    private static final /* synthetic */ cds[] e;

    static {
        cds cdsVar = new cds("ANY", 0);
        a = cdsVar;
        cds cdsVar2 = new cds("EGRESS", 1);
        b = cdsVar2;
        cds cdsVar3 = new cds("JOIN", 2);
        c = cdsVar3;
        cds cdsVar4 = new cds("SANDBOX", 3);
        d = cdsVar4;
        cds[] cdsVarArr = {cdsVar, cdsVar2, cdsVar3, cdsVar4};
        e = cdsVarArr;
        fjp.z(cdsVarArr);
    }

    private cds(String str, int i) {
    }

    public static cds[] values() {
        return (cds[]) e.clone();
    }
}
