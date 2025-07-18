package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fns extends flx {
    public static final fns c = new fns();

    private fns() {
    }

    @Override // defpackage.flx
    public final void d(fhq fhqVar, Runnable runnable) {
        if (((fnv) fhqVar.get(fnv.a)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.flx
    public final boolean e() {
        return false;
    }

    @Override // defpackage.flx
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
