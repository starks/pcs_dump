package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsi extends bsj {
    private final cci a;

    public bsi(cci cciVar) {
        this.a = cciVar;
    }

    @Override // defpackage.btw
    public final int b() {
        return 2;
    }

    @Override // defpackage.bsj, defpackage.btw
    public final cci c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof btw) {
            btw btwVar = (btw) obj;
            if (btwVar.b() == 2 && this.a.equals(btwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TrainingTaskKey{personalizedTrainingOptions=" + this.a.toString() + "}";
    }
}
