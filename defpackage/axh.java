package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class axh extends awk {
    public final axf a;

    protected axh(axf axfVar) {
        this.a = axfVar;
    }

    @Override // defpackage.awk
    public final awj b() {
        return awj.c;
    }

    @Override // defpackage.awk
    public final boolean c(awk awkVar) {
        return equals(awkVar);
    }

    @Override // defpackage.awk
    public final boolean d(awk awkVar) {
        return equals(awkVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axh) {
            return this.a.equals(((axh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
