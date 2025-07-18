package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayk {
    private final eea a;
    private final int b;

    public ayk() {
    }

    public final eea a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayk) {
            ayk aykVar = (ayk) obj;
            if (this.a.equals(aykVar.a()) && this.b == aykVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return a.b(this.b) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return "AttestationResponse{attestationToken=" + this.a.toString() + ", status=" + (i != 1 ? i != 2 ? "FAILED" : "NOT_RUN" : "SUCCESS") + "}";
    }

    public ayk(eea eeaVar, int i) {
        this();
        if (eeaVar == null) {
            throw new NullPointerException("Null attestationToken");
        }
        this.a = eeaVar;
        this.b = i;
    }
}
