package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyt extends eoi {
    public final eoa f;
    public emh g = emh.IDLE;
    private eof h;

    public eyt(eoa eoaVar) {
        this.f = eoaVar;
    }

    @Override // defpackage.eoi
    public final eqo a(eoe eoeVar) {
        eyq eyqVar;
        Boolean bool;
        List list = eoeVar.a;
        if (list.isEmpty()) {
            List list2 = eoeVar.a;
            eqo eqoVarE = eqo.l.e("NameResolver returned no usable address. addrs=" + String.valueOf(list2) + ", attrs=" + eoeVar.b.toString());
            b(eqoVarE);
            return eqoVarE;
        }
        Object obj = eoeVar.c;
        if ((obj instanceof eyq) && (bool = (eyqVar = (eyq) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Long l = eyqVar.b;
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        eof eofVar = this.h;
        if (eofVar == null) {
            eoa eoaVar = this.f;
            epl eplVar = new epl((byte[]) null);
            eplVar.d(list);
            eof eofVarB = eoaVar.b(eplVar.b());
            eofVarB.e(new eyp(this, eofVarB, 0));
            this.h = eofVarB;
            f(emh.CONNECTING, new eyr(eoc.c(eofVarB)));
            eofVarB.c();
        } else {
            eofVar.f(list);
        }
        return eqo.b;
    }

    @Override // defpackage.eoi
    public final void b(eqo eqoVar) {
        eof eofVar = this.h;
        if (eofVar != null) {
            eofVar.d();
            this.h = null;
        }
        f(emh.TRANSIENT_FAILURE, new eyr(eoc.b(eqoVar)));
    }

    @Override // defpackage.eoi
    public final void d() {
        eof eofVar = this.h;
        if (eofVar != null) {
            eofVar.c();
        }
    }

    @Override // defpackage.eoi
    public final void e() {
        eof eofVar = this.h;
        if (eofVar != null) {
            eofVar.d();
        }
    }

    public final void f(emh emhVar, eog eogVar) {
        this.g = emhVar;
        this.f.f(emhVar, eogVar);
    }
}
