package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eor {
    private static final Logger a = Logger.getLogger(eor.class.getName());
    private static eor b;
    private final LinkedHashSet c = new LinkedHashSet();
    private List d = Collections.EMPTY_LIST;

    public static synchronized eor a() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Class.forName("fca"));
            } catch (ClassNotFoundException e) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find OkHttpChannelProvider", (Throwable) e);
            }
            try {
                arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find NettyChannelProvider", (Throwable) e2);
            }
            try {
                arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
            } catch (ClassNotFoundException e3) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getHardCodedClasses", "Unable to find UdsNettyChannelProvider", (Throwable) e3);
            }
            List<eop> listJ = fjp.J(eop.class, DesugarCollections.unmodifiableList(arrayList), eop.class.getClassLoader(), new eoq(0));
            b = new eor();
            for (eop eopVar : listJ) {
                a.logp(Level.FINE, "io.grpc.ManagedChannelRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(eopVar))));
                b.c(eopVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(eop eopVar) {
        eopVar.c();
        clq.w(true, "isAvailable() returned false");
        this.c.add(eopVar);
    }

    private final synchronized void d() {
        ArrayList arrayList = new ArrayList(this.c);
        Collections.sort(arrayList, Collections.reverseOrder(new it(5)));
        this.d = DesugarCollections.unmodifiableList(arrayList);
    }

    public final synchronized List b() {
        return this.d;
    }
}
