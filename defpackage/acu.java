package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acu {
    public static final acu a;
    public static final acu b;
    public static final acu c;
    private static final /* synthetic */ acu[] d;

    static {
        acu acuVar = new acu("NO_OP", 0);
        a = acuVar;
        acu acuVar2 = new acu("ADD", 1);
        b = acuVar2;
        acu acuVar3 = new acu("REMOVE", 2);
        c = acuVar3;
        acu[] acuVarArr = {acuVar, acuVar2, acuVar3};
        d = acuVarArr;
        fjp.z(acuVarArr);
    }

    private acu(String str, int i) {
    }

    public static acu[] values() {
        return (acu[]) d.clone();
    }
}
