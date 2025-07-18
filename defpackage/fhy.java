package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhy implements fhk {
    public static final fhy a = new fhy();

    private fhy() {
    }

    @Override // defpackage.fhk
    public final fhq d() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.fhk
    public final void e(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
