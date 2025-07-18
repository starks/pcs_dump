package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ear extends ead {
    private final Throwable a;

    public ear() {
    }

    @Override // defpackage.dzz
    public final /* synthetic */ eaa a(eaa eaaVar) throws eba {
        eaz eazVar = new eaz();
        eazVar.c = b();
        eazVar.b("Unexpected ServerToClientErrorEvent in state %s", ((eae) eaaVar).c());
        eazVar.d = dgy.j;
        throw new eba(eazVar);
    }

    public final Throwable b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ear) {
            return this.a.equals(((ear) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ServerToClientErrorEvent{throwable=" + this.a.toString() + "}";
    }

    public ear(Throwable th) {
        this();
        this.a = th;
    }
}
