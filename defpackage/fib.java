package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fib extends fhx {
    public fib(fhk fhkVar) {
        super(fhkVar);
        if (fhkVar != null && fhkVar.d() != fhr.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.fhk
    public final fhq d() {
        return fhr.a;
    }
}
