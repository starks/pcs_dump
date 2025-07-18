package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eok {
    private static final Logger a = Logger.getLogger(eok.class.getName());
    private static eok b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("eyu"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("ffe"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized eok b() {
        if (b == null) {
            List<eoj> listJ = fjp.J(eoj.class, c, eoj.class.getClassLoader(), new eoq(1));
            b = new eok();
            for (eoj eojVar : listJ) {
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(eojVar))));
                b.c(eojVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(eoj eojVar) {
        eojVar.e();
        clq.w(true, "isAvailable() returned false");
        this.d.add(eojVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            eoj eojVar = (eoj) it.next();
            String strC = eojVar.c();
            if (((eoj) this.e.get(strC)) != null) {
                eojVar.d();
            } else {
                this.e.put(strC, eojVar);
            }
        }
    }

    public final synchronized eoj a(String str) {
        return (eoj) this.e.get(str);
    }
}
