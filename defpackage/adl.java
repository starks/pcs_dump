package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adl {
    public static final adl a;
    public static final adl b;
    public static final adl c;
    private static final /* synthetic */ adl[] d;

    static {
        adl adlVar = new adl("DEFERRED", 0);
        a = adlVar;
        adl adlVar2 = new adl("IMMEDIATE", 1);
        b = adlVar2;
        adl adlVar3 = new adl("EXCLUSIVE", 2);
        c = adlVar3;
        adl[] adlVarArr = {adlVar, adlVar2, adlVar3};
        d = adlVarArr;
        fjp.z(adlVarArr);
    }

    private adl(String str, int i) {
    }

    public static adl[] values() {
        return (adl[]) d.clone();
    }
}
