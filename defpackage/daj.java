package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class daj {
    public static final daj c = new daf();
    public static final daj d = new daf();

    protected daj() {
    }

    static daj c(daj dajVar, daj dajVar2) {
        daj dajVar3;
        daj dajVar4;
        if (dajVar != null) {
            if (dajVar2 == null || dajVar == (dajVar3 = c) || dajVar2 == (dajVar4 = d)) {
                return dajVar;
            }
            if (dajVar2 != dajVar3 && dajVar != dajVar4) {
                return new dag(dajVar, dajVar2);
            }
        }
        return dajVar2;
    }

    protected abstract void a();
}
