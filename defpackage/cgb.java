package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgb {
    public final byi a;
    public final String b;

    public cgb(byi byiVar, String str) {
        this.a = byiVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgb)) {
            return false;
        }
        cgb cgbVar = (cgb) obj;
        return fjs.c(this.a, cgbVar.a) && fjs.c(this.b, cgbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExperimentTokenData(experimentToken=" + this.a + ", configPackageName=" + this.b + ")";
    }
}
