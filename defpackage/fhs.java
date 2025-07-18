package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhs {
    public static final fhs a;
    public static final fhs b;
    public static final fhs c;
    private static final /* synthetic */ fhs[] d;

    static {
        fhs fhsVar = new fhs("COROUTINE_SUSPENDED", 0);
        a = fhsVar;
        fhs fhsVar2 = new fhs("UNDECIDED", 1);
        b = fhsVar2;
        fhs fhsVar3 = new fhs("RESUMED", 2);
        c = fhsVar3;
        fhs[] fhsVarArr = {fhsVar, fhsVar2, fhsVar3};
        d = fhsVarArr;
        fjp.z(fhsVarArr);
    }

    private fhs(String str, int i) {
    }

    public static fhs[] values() {
        return (fhs[]) d.clone();
    }
}
