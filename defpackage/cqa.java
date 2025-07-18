package defpackage;

import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqa {
    public static final int a = 4;
    public static final WeakHashMap b;
    public static final ThreadLocal c;
    public static final Deque d;
    public static final Deque e;
    public static final Object f;
    public static final Runnable g;
    private static final cxo h;
    private static final cxo i;
    private static final AtomicReference j;

    static {
        cxo cxoVarL = cxo.l(5, "android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        h = cxoVarL;
        i = cxoVarL;
        j = new AtomicReference(cyv.a);
        b = new WeakHashMap();
        new cpz();
        c = new cpv();
        d = new ArrayDeque();
        e = new ArrayDeque();
        f = new Object();
        g = new bkp(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cqn, java.lang.Object] */
    public static cqn a() {
        return h().c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cqn, java.lang.Object] */
    public static cqn b() {
        ezn eznVarH = h();
        ?? r1 = eznVarH.c;
        if (r1 != 0) {
            return r1;
        }
        cpq cpqVar = cqc.a;
        UUID uuidB = cqb.a.b();
        if (!cqo.a()) {
            cqc.j(uuidB, null);
            return new cqc(uuidB, cqc.a, false, eznVarH);
        }
        cpq cpqVar2 = new cpq();
        cqc.j(uuidB, cpqVar2);
        return new cqc(uuidB, cpqVar2, e(cpqVar2), eznVarH);
    }

    static cxo c() {
        return (cxo) j.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r9 = r0.c.d;
        r11 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r9.containsKey(r11) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        r0.c.d.put(r11, new defpackage.cqk(r4, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        if (r8 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
    
        r8.c = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (r8 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        r8.c = r0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r0.d = r4;
        r0.e++;
        r0.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqa.d(java.lang.String[]):java.lang.String");
    }

    public static boolean e(Throwable th) {
        if (i.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            czc czcVarListIterator = i.listIterator();
            while (czcVarListIterator.hasNext()) {
                if (stackTraceElement.toString().startsWith((String) czcVarListIterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    static void f() {
        if (cqo.a()) {
            cqn cqnVarA = a();
            IllegalStateException illegalStateException = (cqnVarA == null || (cqnVarA instanceof cqf)) ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.") : cqnVarA instanceof cps ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((cps) cqnVarA).e()) : null;
            if (illegalStateException != null) {
                if (cqnVarA instanceof cps ? ((cps) cqnVarA).f() : e(illegalStateException)) {
                    return;
                }
                Log.e("Tracer", "Missing trace", illegalStateException);
            }
        }
    }

    static void g(cqn cqnVar) {
        i(h(), cqnVar);
    }

    public static ezn h() {
        return (ezn) c.get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cqn, java.lang.Object] */
    public static cqn i(ezn eznVar, cqn cqnVar) {
        cqn cqnVar2;
        Object obj = eznVar.a;
        ?? r0 = eznVar.c;
        if (r0 != cqnVar) {
            if (r0 == 0) {
                eznVar.b = cpw.a();
            }
            Object obj2 = eznVar.a;
            if (eznVar.b) {
                if (r0 != 0) {
                    if (cqnVar == null) {
                        cqnVar2 = null;
                    } else if (r0.a() == cqnVar && !clq.Y(r0)) {
                        Trace.endSection();
                    } else if (r0 != cqnVar.a() || clq.Y(cqnVar)) {
                        cqnVar2 = cqnVar;
                    } else {
                        clq.V(cqnVar);
                    }
                    clq.X(r0);
                } else {
                    cqnVar2 = cqnVar;
                }
                if (cqnVar2 != null) {
                    clq.W(cqnVar2);
                }
            }
            if (r0 != cqnVar) {
                if (cqnVar == null) {
                    cqnVar = null;
                }
                eznVar.c = cqnVar;
                return r0;
            }
        }
        return cqnVar;
    }
}
