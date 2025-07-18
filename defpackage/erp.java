package defpackage;

import android.os.ParcelFileDescriptor;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erp implements eqe {
    private final /* synthetic */ int a;

    public erp(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.eqe
    public final fjp a(eqc eqcVar, epc epcVar, eqd eqdVar) {
        djy djyVarB;
        eqo eqoVarE;
        if (this.a != 0) {
            emr emrVarL = emr.l();
            if (epcVar.g(arz.a)) {
                emrVarL = emrVarL.m(arz.b, (ParcelFileDescriptor) epcVar.b(arz.a));
            }
            return fjp.O(emrVarL, eqcVar, epcVar, eqdVar);
        }
        err errVar = (err) eqcVar.f().a(ers.a);
        epg epgVarD = eqcVar.d();
        String str = epgVarD.c;
        boolean z = epgVarD.f;
        if (!z || (djyVarB = (djy) ((ConcurrentHashMap) errVar.b).get(str)) == null) {
            Object obj = errVar.d;
            int i = errVar.a;
            exo exoVar = (exo) ((fuu) obj).a;
            erg ergVar = (erg) ((cxg) exoVar.a).getOrDefault(str, exoVar.b);
            if (ergVar instanceof eqy) {
                djyVarB = ((eqy) ergVar).b();
            } else {
                try {
                    djyVarB = cnx.C(ergVar.a(i));
                } catch (Exception e) {
                    djyVarB = cnx.B(e);
                }
            }
            if (z) {
                ((ConcurrentHashMap) errVar.b).putIfAbsent(str, djyVarB);
                cnx.J(djyVarB, new erq(errVar, str, djyVarB, 0), diy.a);
            }
        }
        if (!djyVarB.isDone()) {
            ?? r7 = errVar.c;
            eso esoVar = new eso();
            cnx.J(djyVarB, new ero(eqcVar, esoVar, epcVar, eqdVar, 0), r7);
            return esoVar;
        }
        try {
            eqoVarE = (eqo) cnx.H(djyVarB);
        } catch (CancellationException | ExecutionException e2) {
            eqo eqoVarD = eqo.k.d(e2);
            String message = e2.getMessage();
            eqoVarE = message != null ? eqoVarD.e(message) : eqoVarD;
        }
        if (eqoVarE.g()) {
            return eqdVar.a(eqcVar, epcVar);
        }
        eqcVar.a(eqoVarE, new epc());
        return new ern();
    }
}
