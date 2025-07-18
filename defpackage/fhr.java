package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhr implements Serializable, fhq {
    public static final fhr a = new fhr();
    private static final long serialVersionUID = 0;

    private fhr() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.fhq
    public final fhn get(fho fhoVar) {
        fhoVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.fhq
    public final fhq minusKey(fho fhoVar) {
        fhoVar.getClass();
        return this;
    }

    @Override // defpackage.fhq
    public final fhq plus(fhq fhqVar) {
        fhqVar.getClass();
        return fhqVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.fhq
    public final Object fold(Object obj, fjc fjcVar) {
        return obj;
    }
}
