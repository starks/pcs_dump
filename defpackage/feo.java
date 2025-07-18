package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feo {
    public static final els a;
    private static final Logger b = Logger.getLogger(feo.class.getName());

    static {
        if (!clq.O(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        }
        a = new els("internal-stub-type");
    }

    private feo() {
    }

    public static djy a(elw elwVar, Object obj) {
        fej fejVar = new fej(elwVar);
        d(elwVar, obj, new fen(fejVar));
        return fejVar;
    }

    public static void b(elw elwVar, fek fekVar) {
        elwVar.e(fekVar, new epc());
        fekVar.D();
    }

    private static RuntimeException c(elw elwVar, Throwable th) {
        try {
            elwVar.a(null, th);
        } catch (Error | RuntimeException e) {
            b.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new AssertionError(th);
    }

    private static void d(elw elwVar, Object obj, fek fekVar) {
        b(elwVar, fekVar);
        try {
            elwVar.d(obj);
            elwVar.b();
        } catch (Error | RuntimeException e) {
            throw c(elwVar, e);
        }
    }
}
