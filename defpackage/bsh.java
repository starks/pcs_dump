package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsh extends bsj {
    private final ccg a;

    public bsh(ccg ccgVar) {
        this.a = ccgVar;
    }

    @Override // defpackage.bsj, defpackage.btw
    public final ccg a() {
        return this.a;
    }

    @Override // defpackage.btw
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btw) {
            btw btwVar = (btw) obj;
            if (btwVar.b() == 1 && this.a.equals(btwVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrainingTaskKey{federatedTrainingOptions=" + this.a.toString() + "}";
    }
}
