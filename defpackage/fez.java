package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fez extends eoi {
    public static final Logger f = Logger.getLogger(fez.class.getName());
    public final eoa h;
    protected boolean i;
    protected emh k;
    public List g = new ArrayList(0);
    protected final eoj j = new eyu();

    protected fez(eoa eoaVar) {
        this.h = eoaVar;
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "<init>", "Created");
    }

    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.eoi
    public final eqo a(eoe eoeVar) {
        frj frjVar;
        Object obj;
        try {
            this.i = true;
            f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "acceptResolvedAddressesInternal", "Received resolution result: {0}", eoeVar);
            LinkedHashMap linkedHashMapR = dcr.r(eoeVar.a.size());
            for (emv emvVar : eoeVar.a) {
                euw euwVar = new euw((byte[]) null);
                euwVar.c = eoeVar.a;
                euwVar.b = eoeVar.b;
                euwVar.a = eoeVar.c;
                euwVar.c = Collections.singletonList(emvVar);
                eln elnVar = new eln(elp.a);
                elnVar.b(e, true);
                euwVar.b = elnVar.a();
                euwVar.a = null;
                linkedHashMapR.put(new fey(emvVar), euwVar.a());
            }
            if (linkedHashMapR.isEmpty()) {
                eqo eqoVarE = eqo.l.e("NameResolver returned no usable address. ".concat(String.valueOf(String.valueOf(eoeVar))));
                b(eqoVarE);
                frjVar = new frj(eqoVarE, (Object) null);
            } else {
                LinkedHashMap linkedHashMapR2 = dcr.r(this.g.size());
                for (fex fexVar : this.g) {
                    linkedHashMapR2.put(fexVar.a, fexVar);
                }
                ArrayList arrayList = new ArrayList(linkedHashMapR.size());
                for (Map.Entry entry : linkedHashMapR.entrySet()) {
                    fex fexVarF = (fex) linkedHashMapR2.remove(entry.getKey());
                    if (fexVarF == null) {
                        fexVarF = f(entry.getKey());
                    }
                    arrayList.add(fexVarF);
                    if (entry.getValue() != null) {
                        fexVarF.b.c((eoe) entry.getValue());
                    }
                }
                this.g = arrayList;
                frjVar = new frj(eqo.b, new ArrayList(linkedHashMapR2.values()));
            }
            if (((eqo) frjVar.b).g()) {
                g();
                Iterator it = frjVar.a.iterator();
                while (it.hasNext()) {
                    ((fex) it.next()).b();
                }
                obj = frjVar.b;
            } else {
                obj = frjVar.b;
            }
            this.i = false;
            return (eqo) obj;
        } catch (Throwable th) {
            this.i = false;
            throw th;
        }
    }

    @Override // defpackage.eoi
    public final void b(eqo eqoVar) {
        if (this.k != emh.READY) {
            this.h.f(emh.TRANSIENT_FAILURE, new enz(eoc.b(eqoVar)));
        }
    }

    @Override // defpackage.eoi
    public final void e() {
        f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer", "shutdown", "Shutdown");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((fex) it.next()).b();
        }
        this.g.clear();
    }

    protected fex f(Object obj) {
        throw null;
    }

    protected abstract void g();
}
