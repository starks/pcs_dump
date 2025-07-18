package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eag extends ead {
    public eag() {
    }

    @Override // defpackage.dzz
    public final /* synthetic */ eaa a(eaa eaaVar) throws eba {
        eaz eazVar = new eaz();
        eazVar.b = "Download task was cancelled.";
        eazVar.a = true;
        eazVar.d = dgy.b;
        throw new eba(eazVar);
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof eag);
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "CancelEvent{}";
    }

    public eag(byte[] bArr) {
        this();
    }
}
