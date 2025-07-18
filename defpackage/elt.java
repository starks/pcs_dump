package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elt {
    public static final elt a;
    public final ems b;
    public final Executor c;
    public final List d;
    public final Integer e;
    public final Integer f;
    private final Object[][] g;
    private final Boolean h;

    static {
        elr elrVar = new elr();
        elrVar.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        elrVar.d = Collections.EMPTY_LIST;
        a = new elt(elrVar);
    }

    public elt(elr elrVar) {
        this.b = elrVar.a;
        this.c = elrVar.b;
        this.g = elrVar.c;
        this.d = elrVar.d;
        this.h = elrVar.e;
        this.e = elrVar.f;
        this.f = elrVar.g;
    }

    public static elr a(elt eltVar) {
        elr elrVar = new elr();
        elrVar.a = eltVar.b;
        elrVar.b = eltVar.c;
        elrVar.c = eltVar.g;
        elrVar.d = eltVar.d;
        elrVar.e = eltVar.h;
        elrVar.f = eltVar.e;
        elrVar.g = eltVar.f;
        return elrVar;
    }

    public final elt b(Executor executor) {
        elr elrVarA = a(this);
        elrVarA.b = executor;
        return new elt(elrVarA);
    }

    public final elt c(int i) {
        clq.y(i >= 0, "invalid maxsize %s", i);
        elr elrVarA = a(this);
        elrVarA.f = Integer.valueOf(i);
        return new elt(elrVarA);
    }

    public final elt d(int i) {
        clq.y(i >= 0, "invalid maxsize %s", i);
        elr elrVarA = a(this);
        elrVarA.g = Integer.valueOf(i);
        return new elt(elrVarA);
    }

    public final elt e(els elsVar, Object obj) {
        elsVar.getClass();
        obj.getClass();
        elr elrVarA = a(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.g;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (elsVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        elrVarA.c = (Object[][]) Array.newInstance((Class<?>) Object.class, this.g.length + (i == -1 ? 1 : 0), 2);
        Object[][] objArr2 = this.g;
        System.arraycopy(objArr2, 0, elrVarA.c, 0, objArr2.length);
        if (i == -1) {
            elrVarA.c[this.g.length] = new Object[]{elsVar, obj};
        } else {
            elrVarA.c[i] = new Object[]{elsVar, obj};
        }
        return new elt(elrVarA);
    }

    public final Object f(els elsVar) {
        elsVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.g;
            if (i >= objArr.length) {
                return null;
            }
            if (elsVar.equals(objArr[i][0])) {
                return this.g[i][1];
            }
            i++;
        }
    }

    public final boolean g() {
        return Boolean.TRUE.equals(this.h);
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("deadline", this.b);
        crtVarQ.e("authority", null);
        crtVarQ.e("callCredentials", null);
        Executor executor = this.c;
        crtVarQ.e("executor", executor != null ? executor.getClass() : null);
        crtVarQ.e("compressorName", null);
        crtVarQ.e("customOptions", Arrays.deepToString(this.g));
        crt crtVarC = crtVarQ.c("waitForReady", g());
        crtVarC.e("maxInboundMessageSize", this.e);
        crtVarC.e("maxOutboundMessageSize", this.f);
        crtVarC.e("onReadyThreshold", null);
        crtVarC.e("streamTracerFactories", this.d);
        return crtVarC.toString();
    }
}
