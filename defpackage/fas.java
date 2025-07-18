package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fas extends eqb implements enn {
    public static final Logger b = Logger.getLogger(fas.class.getName());
    public static final fax c = new fan();
    public final eyg d;
    public Executor e;
    public final enf f;
    public final enf g;
    public final List h;
    public final eqe[] i;
    public final long j;
    public boolean k;
    public final ewd l;
    public final Object m = new Object();
    public final Set n = new HashSet();
    public final emr o;
    public final emu p;
    public final emf q;
    public final enl r;
    public final etl s;
    public final fjp t;
    private final eno u;

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public fas(fau fauVar, ewd ewdVar, emr emrVar) {
        List listUnmodifiableList;
        eyg eygVar = fauVar.f;
        eygVar.getClass();
        this.d = eygVar;
        ekf ekfVar = fauVar.q;
        HashMap map = new HashMap();
        Iterator it = ((HashMap) ekfVar.a).values().iterator();
        while (it.hasNext()) {
            for (exo exoVar : ((exo) it.next()).b.values()) {
                map.put(((epg) exoVar.a).b, exoVar);
            }
        }
        DesugarCollections.unmodifiableList(new ArrayList(((HashMap) ekfVar.a).values()));
        this.f = new ewc(DesugarCollections.unmodifiableMap(map));
        enf enfVar = fauVar.e;
        enfVar.getClass();
        this.g = enfVar;
        this.l = ewdVar;
        synchronized (this.m) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(ewdVar.a());
        }
        this.u = eno.b("Server", String.valueOf(listUnmodifiableList));
        emrVar.getClass();
        this.o = new emr(emrVar.f, emrVar.g + 1);
        this.p = fauVar.g;
        this.q = fauVar.h;
        this.h = DesugarCollections.unmodifiableList(new ArrayList(fauVar.b));
        List list = fauVar.c;
        this.i = (eqe[]) list.toArray(new eqe[list.size()]);
        this.j = fauVar.i;
        enl enlVar = fauVar.n;
        this.r = enlVar;
        this.s = new etl(fbl.a);
        fjp fjpVar = fauVar.r;
        fjpVar.getClass();
        this.t = fjpVar;
        enl.b(enlVar.c, this);
    }

    @Override // defpackage.enu
    public final eno c() {
        return this.u;
    }

    public final String toString() {
        crt crtVarB = clq.Q(this).b("logId", this.u.a);
        crtVarB.e("transportServer", this.l);
        return crtVarB.toString();
    }
}
