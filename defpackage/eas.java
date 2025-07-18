package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eas extends ead {
    public eas() {
    }

    @Override // defpackage.dzz
    public final /* synthetic */ eaa a(eaa eaaVar) throws eba {
        eaz eazVar = new eaz();
        eazVar.b("Unexpected ServerToClientHalfCloseEvent in state %s", ((eae) eaaVar).c());
        eazVar.d = dgy.i;
        throw new eba(eazVar);
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof eas);
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "ServerToClientHalfCloseEvent{}";
    }

    public eas(byte[] bArr) {
        this();
    }
}
