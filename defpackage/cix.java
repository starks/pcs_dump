package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cix {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public cix() {
        this.d = crc.a;
        this.g = new AtomicInteger();
        this.e = new AtomicInteger();
        this.f = new AtomicLong();
        this.b = new AtomicLong();
        this.c = new AtomicLong();
        this.a = new AtomicLong();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [dis, java.lang.Object] */
    public final synchronized cjg a(civ civVar) {
        cjg cjgVar;
        ?? r0 = this.a;
        Uri uri = civVar.a;
        cjgVar = (cjg) r0.get(uri);
        if (cjgVar == null) {
            Uri uri2 = civVar.a;
            clq.A(uri2.isHierarchical(), "Uri must be hierarchical: %s", uri2);
            String strN = clq.N(uri2.getLastPathSegment());
            int iLastIndexOf = strN.lastIndexOf(46);
            clq.A((iLastIndexOf == -1 ? "" : strN.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri2);
            clq.w(civVar.b != null, "Proto schema cannot be null");
            clq.w(civVar.c != null, "Handler cannot be null");
            cjh cjhVar = (cjh) this.f.get("singleproc");
            clq.A(cjhVar != 0, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strN2 = clq.N(civVar.a.getLastPathSegment());
            int iLastIndexOf2 = strN2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strN2 = strN2.substring(0, iLastIndexOf2);
            }
            String str = strN2;
            djy djyVarJ = dij.j(cnx.C(civVar.a), this.e, diy.a);
            cjd cjdVarB = cjhVar.b(civVar, str, this.c, (fcy) this.d, 1);
            Object obj = this.g;
            cjhVar.a(1);
            cjg cjgVar2 = new cjg(cjdVarB, (cji) obj, djyVarJ, null);
            cxc cxcVar = civVar.d;
            if (!cxcVar.isEmpty()) {
                cjgVar2.d(new cit(cxcVar, this.c));
            }
            this.a.put(uri, cjgVar2);
            this.b.put(uri, civVar);
            cjgVar = cjgVar2;
        } else {
            civ civVar2 = (civ) this.b.get(uri);
            if (!civVar.equals(civVar2)) {
                String strU = clq.u("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", civVar.b.getClass().getSimpleName(), civVar.a);
                clq.A(civVar.a.equals(civVar2.b()), strU, "uri");
                clq.A(civVar.b.equals(civVar2.e()), strU, "schema");
                clq.A(civVar.c.equals(civVar2.c()), strU, "handler");
                clq.A(dcr.v(civVar.d, civVar2.d()), strU, "migrations");
                clq.A(civVar.f.equals(civVar2.g()), strU, "variantConfig");
                clq.A(civVar.e == civVar2.f(), strU, "useGeneratedExtensionRegistry");
                clq.A(true, strU, "enableTracing");
                throw new IllegalArgumentException(clq.u(strU, "unknown"));
            }
        }
        return cjgVar;
    }

    public final long b() {
        return ((AtomicLong) this.a).get();
    }

    public final long c() {
        return ((AtomicInteger) this.g).get();
    }

    public final long d() {
        return ((AtomicInteger) this.e).get();
    }

    public final long e() {
        return ((AtomicLong) this.b).get();
    }

    public final long f() {
        return ((AtomicLong) this.f).get();
    }

    public final long g() {
        return ((AtomicLong) this.c).get();
    }

    public cix(Executor executor, fcy fcyVar, cji cjiVar, Map map) {
        this.a = new HashMap();
        this.b = new HashMap();
        executor.getClass();
        this.c = executor;
        fcyVar.getClass();
        this.d = fcyVar;
        this.g = cjiVar;
        this.f = map;
        clq.v(!map.isEmpty());
        this.e = new ciw(0);
    }
}
