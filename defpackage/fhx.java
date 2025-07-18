package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fhx implements Serializable, fhk, fia {
    public final fhk k;

    public fhx(fhk fhkVar) {
        this.k = fhkVar;
    }

    protected abstract Object b(Object obj);

    @Override // defpackage.fia
    public final StackTraceElement bg() {
        return null;
    }

    public fhk c(Object obj, fhk fhkVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fhk
    public final void e(Object obj) {
        while (true) {
            this.getClass();
            fhx fhxVar = this;
            fhk fhkVar = fhxVar.k;
            fhkVar.getClass();
            try {
                obj = fhxVar.b(obj);
                if (obj == fhs.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = ffh.b(th);
            }
            fhxVar.h();
            if (!(fhkVar instanceof fhx)) {
                fhkVar.e(obj);
                return;
            }
            this = fhkVar;
        }
    }

    @Override // defpackage.fia
    public final fia g() {
        fhk fhkVar = this.k;
        if (fhkVar instanceof fia) {
            return (fia) fhkVar;
        }
        return null;
    }

    public String toString() {
        String name = getClass().getName();
        Objects.toString(name);
        return "Continuation at ".concat(String.valueOf(name));
    }

    protected void h() {
    }
}
