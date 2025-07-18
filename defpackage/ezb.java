package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ezb implements ews {
    public static final RuntimeException a;
    private static final Logger b = Logger.getLogger(ezb.class.getName());
    private static final Constructor c;
    private static final Method d;
    private static final Object[] e;
    private final Object f;

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    static {
        /*
            java.lang.Class<ezb> r0 = defpackage.ezb.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            defpackage.ezb.b = r0
            r1 = 0
            java.lang.String r0 = "java.util.concurrent.atomic.LongAdder"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "add"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L40
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L40
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "sum"
            r0.getMethod(r3, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()     // Catch: java.lang.Throwable -> L3c
            int r3 = r0.length     // Catch: java.lang.Throwable -> L3c
            r4 = 0
        L2a:
            if (r4 >= r3) goto L39
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r6 = r6.length     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L36
            goto L3a
        L36:
            int r4 = r4 + 1
            goto L2a
        L39:
            r5 = r1
        L3a:
            r7 = r1
            goto L52
        L3c:
            r0 = move-exception
            r7 = r0
            r0 = r2
            goto L43
        L40:
            r0 = move-exception
            r7 = r0
            r0 = r1
        L43:
            java.util.logging.Logger r2 = defpackage.ezb.b
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r5 = "<clinit>"
            java.lang.String r6 = "LongAdder can not be found via reflection, this is normal for JDK7 and below"
            java.lang.String r4 = "io.grpc.internal.ReflectionLongAdderCounter"
            r2.logp(r3, r4, r5, r6, r7)
            r2 = r0
            r5 = r1
        L52:
            if (r7 != 0) goto L5d
            if (r5 == 0) goto L5d
            defpackage.ezb.c = r5
            defpackage.ezb.d = r2
            defpackage.ezb.a = r1
            goto L68
        L5d:
            defpackage.ezb.c = r1
            defpackage.ezb.d = r1
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            defpackage.ezb.a = r0
        L68:
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            defpackage.ezb.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezb.<clinit>():void");
    }

    public ezb() {
        RuntimeException runtimeException = a;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f = c.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // defpackage.ews
    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            d.invoke(this.f, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
