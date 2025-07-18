package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fjv extends fjl implements fkp, fko {
    public fjv(Object obj, Class cls) {
        this(obj, cls, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.fin
    public final Object a() {
        return h();
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
        if (obj instanceof fjv) {
            fjv fjvVar = (fjv) obj;
            return d().equals(fjvVar.d()) && this.c.equals(fjvVar.c) && this.d.equals(fjvVar.d) && fjs.c(this.b, fjvVar.b);
        }
        if (obj instanceof fkp) {
            return obj.equals(b());
        }
        return false;
    }

    protected final fkp f() {
        fkj fkjVarB = b();
        if (fkjVarB != this) {
            return (fkp) fkjVarB;
        }
        throw new fim();
    }

    @Override // defpackage.fko
    public final fkn g() {
        return ((fko) f()).g();
    }

    public Object h() {
        return g().e();
    }

    public final int hashCode() {
        return (((d().hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        fkj fkjVarB = b();
        if (fkjVarB != this) {
            return fkjVarB.toString();
        }
        return "property " + this.c + " (Kotlin reflection is not available)";
    }

    public fjv(Object obj, Class cls, byte[] bArr) {
        this(obj, cls);
    }

    public fjv() {
        super(fjl.a, null, null, null, false);
    }

    public fjv(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
    }
}
