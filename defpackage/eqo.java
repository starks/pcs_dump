package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqo {
    public static final List a;
    public static final eqo b;
    public static final eqo c;
    public static final eqo d;
    public static final eqo e;
    public static final eqo f;
    public static final eqo g;
    public static final eqo h;
    public static final eqo i;
    public static final eqo j;
    public static final eqo k;
    public static final eqo l;
    static final eox m;
    static final eox n;
    private static final epb r;
    public final eql o;
    public final String p;
    public final Throwable q;

    static {
        TreeMap treeMap = new TreeMap();
        for (eql eqlVar : eql.values()) {
            eqo eqoVar = (eqo) treeMap.put(Integer.valueOf(eqlVar.r), new eqo(eqlVar, null, null));
            if (eqoVar != null) {
                throw new IllegalStateException("Code value duplication between " + eqoVar.o.name() + " & " + eqlVar.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = eql.OK.a();
        c = eql.CANCELLED.a();
        d = eql.UNKNOWN.a();
        e = eql.INVALID_ARGUMENT.a();
        f = eql.DEADLINE_EXCEEDED.a();
        eql.NOT_FOUND.a();
        eql.ALREADY_EXISTS.a();
        g = eql.PERMISSION_DENIED.a();
        eql.UNAUTHENTICATED.a();
        h = eql.RESOURCE_EXHAUSTED.a();
        i = eql.FAILED_PRECONDITION.a();
        eql.ABORTED.a();
        eql.OUT_OF_RANGE.a();
        j = eql.UNIMPLEMENTED.a();
        k = eql.INTERNAL.a();
        l = eql.UNAVAILABLE.a();
        eql.DATA_LOSS.a();
        eqm eqmVar = new eqm();
        int i2 = eox.d;
        m = new epa("grpc-status", false, eqmVar);
        eqn eqnVar = new eqn();
        r = eqnVar;
        n = new epa("grpc-message", false, eqnVar);
    }

    private eqo(eql eqlVar, String str, Throwable th) {
        eqlVar.getClass();
        this.o = eqlVar;
        this.p = str;
        this.q = th;
    }

    public static eqo b(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (eqo) list.get(i2);
            }
        }
        return d.e(a.x(i2, "Unknown code "));
    }

    public static eqo c(Throwable th) {
        th.getClass();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof eqp) {
                return ((eqp) cause).a;
            }
            if (cause instanceof eqr) {
                return ((eqr) cause).a;
            }
        }
        return d.d(th);
    }

    static String f(eqo eqoVar) {
        if (eqoVar.p == null) {
            return eqoVar.o.toString();
        }
        return eqoVar.o.toString() + ": " + eqoVar.p;
    }

    public final eqo a(String str) {
        String str2 = this.p;
        if (str2 == null) {
            return new eqo(this.o, str, this.q);
        }
        return new eqo(this.o, str2 + "\n" + str, this.q);
    }

    public final eqo d(Throwable th) {
        return a.g(this.q, th) ? this : new eqo(this.o, this.p, th);
    }

    public final eqo e(String str) {
        return a.g(this.p, str) ? this : new eqo(this.o, str, this.q);
    }

    public final boolean g() {
        return eql.OK == this.o;
    }

    public final String toString() {
        crt crtVarQ = clq.Q(this);
        crtVarQ.e("code", this.o.name());
        crtVarQ.e("description", this.p);
        Throwable th = this.q;
        Object objA = th;
        if (th != null) {
            objA = csk.a(th);
        }
        crtVarQ.e("cause", objA);
        return crtVarQ.toString();
    }
}
