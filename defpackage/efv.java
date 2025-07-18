package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efv {
    protected volatile egi a;
    public volatile eea b;
    private volatile boolean c;

    public final eea a() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = eea.b;
            } else {
                this.b = this.a.toByteString();
            }
            return this.b;
        }
    }

    public final egi b(egi egiVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = egiVar;
                        this.b = eea.b;
                    } catch (efp unused) {
                        this.c = true;
                        this.a = egiVar;
                        this.b = eea.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efv)) {
            return false;
        }
        efv efvVar = (efv) obj;
        egi egiVar = this.a;
        egi egiVar2 = efvVar.a;
        return (egiVar == null && egiVar2 == null) ? a().equals(efvVar.a()) : (egiVar == null || egiVar2 == null) ? egiVar != null ? egiVar.equals(efvVar.b(egiVar.getDefaultInstanceForType())) : b(egiVar2.getDefaultInstanceForType()).equals(egiVar2) : egiVar.equals(egiVar2);
    }

    public int hashCode() {
        return 1;
    }
}
