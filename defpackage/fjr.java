package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fjr extends fjl implements fjq, fkm {
    private final int e;
    private final int f;

    public fjr(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, false);
        this.e = i;
        this.f = 0;
    }

    @Override // defpackage.fjl
    protected final fkj c() {
        fjp fjpVar = fjy.a;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fjr)) {
            if (obj instanceof fkm) {
                return obj.equals(b());
            }
            return false;
        }
        fjr fjrVar = (fjr) obj;
        if (this.c.equals(fjrVar.c) && this.d.equals(fjrVar.d)) {
            int i = fjrVar.f;
            if (this.e == fjrVar.e && fjs.c(this.b, fjrVar.b) && fjs.c(d(), fjrVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((d() == null ? 0 : d().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // defpackage.fjq
    public final int i() {
        return this.e;
    }

    public final String toString() {
        fkj fkjVarB = b();
        if (fkjVarB != this) {
            return fkjVarB.toString();
        }
        if ("<init>".equals(this.c)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.c + " (Kotlin reflection is not available)";
    }

    public fjr(int i, Object obj, Class cls, String str, String str2) {
        this(i, obj, cls, str, str2, 0);
    }
}
