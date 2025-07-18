package defpackage;

import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpu {
    private static final boolean a = true;
    private static final WeakHashMap b = new WeakHashMap();
    private static final WeakHashMap c = new WeakHashMap();

    public static void a(Throwable th) {
        Throwable cause;
        clq clqVar;
        cqn cqnVarA;
        Object obj;
        Object obj2;
        synchronized (c) {
            cause = th;
            while (cause != null) {
                if (c.containsKey(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
            c.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        clq.G(true, "Trace uncaught exception is disabled.");
        synchronized (b) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (b.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } finally {
                }
            }
            if (cause2 == null) {
                clqVar = null;
            } else {
                WeakHashMap weakHashMap = b;
                weakHashMap.put(th, (cqr) weakHashMap.get(cause2));
                clqVar = new clq();
            }
        }
        if (clqVar != null || (cqnVarA = cqa.a()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (cqnVarA = cqa.a(); cqnVarA != null; cqnVarA = cqnVarA.a()) {
            arrayList.add(cqnVarA);
        }
        euw euwVar = new euw((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        UUID uuidD = ((cqn) arrayList.get(0)).d();
        if (uuidD == null) {
            throw new NullPointerException("Null rootTraceId");
        }
        euwVar.c = uuidD;
        cwy cwyVarJ = cxc.j(arrayList.size());
        cwy cwyVarJ2 = cxc.j(arrayList.size());
        for (cqn cqnVar : dcr.u(arrayList)) {
            cwyVarJ2.h(cqnVar.b());
            cwyVarJ.h(cqnVar.h());
        }
        WeakHashMap weakHashMap2 = b;
        synchronized (weakHashMap2) {
            cxc cxcVarG = cwyVarJ2.g();
            if (cxcVarG == null) {
                throw new NullPointerException("Null spansNames");
            }
            euwVar.b = cxcVarG;
            cxc cxcVarG2 = cwyVarJ.g();
            if (cxcVarG2 == null) {
                throw new NullPointerException("Null extras");
            }
            euwVar.a = cxcVarG2;
            Object obj3 = euwVar.b;
            if (obj3 != null && (obj = euwVar.a) != null && (obj2 = euwVar.c) != null) {
                weakHashMap2.put(th, new cqr((cxc) obj3, (cxc) obj, (UUID) obj2));
            }
            StringBuilder sb = new StringBuilder();
            if (euwVar.b == null) {
                sb.append(" spansNames");
            }
            if (euwVar.a == null) {
                sb.append(" extras");
            }
            if (euwVar.c == null) {
                sb.append(" rootTraceId");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
    }
}
