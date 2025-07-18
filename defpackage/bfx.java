package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfx {
    public final bfw a;
    public final eiw b;
    protected boolean c;
    public ArrayList d;
    public ArrayList e;
    public boolean f;
    public Set g;
    public String h;
    public final bge i;
    public final djy j;
    public boolean k;
    public final egi l;
    public cbi m;

    protected bfx(bfw bfwVar) {
        eiw eiwVar = (eiw) eix.b.createBuilder();
        this.b = eiwVar;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = true;
        this.k = false;
        this.a = bfwVar;
        this.h = bfwVar.g;
        bgc bgcVar = bfwVar.e.getApplicationContext() instanceof bgc ? (bgc) bfwVar.e.getApplicationContext() : (bgc) bgd.a.get();
        bge bgeVarA = bgcVar != null ? bgcVar.a() : null;
        if (bgeVarA == null) {
            this.i = null;
        } else if (bgeVarA.b() == eiz.b || bgeVarA.b() == eiz.c) {
            this.i = bgeVarA;
        } else {
            int iB = bgeVarA.b();
            String strValueOf = String.valueOf(iB != 0 ? eiz.toString$ar$edu$3f0d2c63_0(iB) : "null");
            int i = eiz.b;
            String strValueOf2 = String.valueOf(i != 0 ? eiz.toString$ar$edu$3f0d2c63_0(i) : "null");
            int i2 = eiz.c;
            Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + strValueOf + " is not one of the process-level expected values: " + strValueOf2 + " or " + String.valueOf(i2 != 0 ? eiz.toString$ar$edu$3f0d2c63_0(i2) : "null"));
            this.i = null;
        }
        this.j = bgcVar != null ? bgcVar.b() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!eiwVar.a.isMutable()) {
            eiwVar.B();
        }
        eix eixVar = (eix) eiwVar.a;
        eixVar.c |= 1;
        eixVar.d = jCurrentTimeMillis;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(((eix) eiwVar.a).d));
        if (!eiwVar.a.isMutable()) {
            eiwVar.B();
        }
        eix eixVar2 = (eix) eiwVar.a;
        eixVar2.c |= 131072;
        eixVar2.h = seconds;
        if (cbl.b(bfwVar.e)) {
            if (!eiwVar.a.isMutable()) {
                eiwVar.B();
            }
            eix eixVar3 = (eix) eiwVar.a;
            eixVar3.c |= 8388608;
            eixVar3.i = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            if (!eiwVar.a.isMutable()) {
                eiwVar.B();
            }
            eix eixVar4 = (eix) eiwVar.a;
            eixVar4.c |= 2;
            eixVar4.e = jElapsedRealtime;
        }
    }

    public final void a(bge bgeVar) {
        eja ejaVar = ((eix) this.b.a).k;
        if (ejaVar == null) {
            ejaVar = eja.b;
        }
        eiw eiwVar = (eiw) ejaVar.toBuilder();
        int iB = bgeVar.b();
        if (!eiwVar.a.isMutable()) {
            eiwVar.B();
        }
        eja ejaVar2 = (eja) eiwVar.a;
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        ejaVar2.e = i;
        ejaVar2.c |= 2;
        eir eirVar = ((eja) eiwVar.a).d;
        if (eirVar == null) {
            eirVar = eir.a;
        }
        asr asrVar = (asr) eirVar.toBuilder();
        eiq eiqVar = ((eir) asrVar.a).c;
        if (eiqVar == null) {
            eiqVar = eiq.a;
        }
        asr asrVar2 = (asr) eiqVar.toBuilder();
        int iA = bgeVar.a();
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        eiq eiqVar2 = (eiq) asrVar2.a;
        eiqVar2.b |= 1;
        eiqVar2.c = iA;
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        eir eirVar2 = (eir) asrVar.a;
        eiq eiqVar3 = (eiq) asrVar2.z();
        eiqVar3.getClass();
        eirVar2.c = eiqVar3;
        eirVar2.b |= 1;
        eiw eiwVar2 = this.b;
        if (!eiwVar.a.isMutable()) {
            eiwVar.B();
        }
        eja ejaVar3 = (eja) eiwVar.a;
        eir eirVar3 = (eir) asrVar.z();
        eirVar3.getClass();
        ejaVar3.d = eirVar3;
        ejaVar3.c |= 1;
        eja ejaVar4 = (eja) eiwVar.z();
        if (!eiwVar2.a.isMutable()) {
            eiwVar2.B();
        }
        eix eixVar = (eix) eiwVar2.a;
        ejaVar4.getClass();
        eixVar.k = ejaVar4;
        eixVar.c |= 268435456;
    }

    public final /* bridge */ /* synthetic */ bfx b() {
        Iterator it = ((bga) this.a).o.iterator();
        while (it.hasNext()) {
            this = ((bfz) it.next()).a(this);
        }
        Iterator it2 = bga.n.iterator();
        while (it2.hasNext()) {
            this = ((bfz) it2.next()).a(this);
        }
        return this;
    }

    public final cag c() {
        if (this.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.c = true;
        return bhc.d(this, new arl(((bga) this.a).f, 10));
    }

    public final int d() {
        return this.a.k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: null, logSourceName: ");
        sb.append(this.h);
        sb.append(", qosTier: ");
        int iD = d();
        int i = iD - 1;
        if (iD == 0) {
            throw null;
        }
        sb.append(i);
        sb.append(", veMessage: null, testCodes: null, mendelPackages: null, experimentIds: ");
        ArrayList arrayList = this.d;
        sb.append(arrayList != null ? bfw.a(arrayList) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList2 = this.e;
        sb.append(arrayList2 != null ? bfw.a(arrayList2) : null);
        sb.append(", addPhenotype: ");
        sb.append(this.f);
        sb.append("]");
        return sb.toString();
    }

    public bfx(bga bgaVar, egi egiVar) {
        this(bgaVar);
        this.l = egiVar;
    }
}
