package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epq {
    private static final Logger a = Logger.getLogger(epq.class.getName());
    private static epq b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private cxg e = cyu.a;

    public static synchronized epq b() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Class.forName("eve"));
            } catch (ClassNotFoundException e) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
            }
            List<epp> listJ = fjp.J(epp.class, DesugarCollections.unmodifiableList(arrayList), epp.class.getClassLoader(), new eoq(2));
            if (listJ.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new epq();
            for (epp eppVar : listJ) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(eppVar))));
                b.e(eppVar);
            }
            b.f();
        }
        return b;
    }

    private final synchronized void e(epp eppVar) {
        eppVar.d();
        clq.w(true, "isAvailable() returned false");
        this.d.add(eppVar);
    }

    private final synchronized void f() {
        HashMap map = new HashMap();
        Iterator it = this.d.iterator();
        String strB = "unknown";
        char c = 0;
        while (it.hasNext()) {
            epp eppVar = (epp) it.next();
            String strB2 = eppVar.b();
            if (((epp) map.get(strB2)) != null) {
                eppVar.e();
            } else {
                map.put(strB2, eppVar);
            }
            eppVar.e();
            if (c < 5) {
                eppVar.e();
                strB = eppVar.b();
            }
            c = 5;
        }
        this.e = cxg.g(map);
        this.c = strB;
    }

    public final epp a(String str) {
        if (str == null) {
            return null;
        }
        return (epp) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }
}
