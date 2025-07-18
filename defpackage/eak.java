package defpackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eak extends eae {
    final /* synthetic */ ebe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eak(ebe ebeVar) {
        super(ebeVar);
        this.c = ebeVar;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() throws Exception {
        epg epgVarA;
        super.i();
        this.c.k.b.d();
        eai eaiVar = new eai(this);
        ebi ebiVar = this.c.b;
        String strF = ebiVar.f();
        if (strF.hashCode() != 111001 || !strF.equals("pir")) {
            eaz eazVar = new eaz();
            eazVar.b = "Unsupported PIR scheme: ".concat(ebiVar.f());
            eazVar.a();
            throw new eba(eazVar);
        }
        eon eonVarA = dzu.a(ebiVar);
        fbz fbzVar = (fbz) eonVarA;
        fbzVar.d(16777216);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        clq.w(true, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(60L);
        fbzVar.g = nanos;
        long jMax = Math.max(nanos, ewq.a);
        fbzVar.g = jMax;
        if (jMax >= fbz.b) {
            fbzVar.g = Long.MAX_VALUE;
        }
        eol eolVarA = eonVarA.a();
        try {
            String str = this.c.a;
            ArrayList arrayList = new ArrayList();
            epc epcVar = new epc();
            epcVar.f(eox.c("X-Goog-Api-Key", epc.b), str);
            arrayList.add(new fep(epcVar));
            fed fedVar = new fed(ebz.x(eolVarA, arrayList), elt.a.e(feo.a, fem.ASYNC), null);
            elu eluVar = fedVar.a;
            epg epgVar = ebz.a;
            if (epgVar == null) {
                synchronized (ebz.class) {
                    epgVarA = ebz.a;
                    if (epgVarA == null) {
                        epd epdVarA = epg.a();
                        epdVarA.c = epf.BIDI_STREAMING;
                        epdVarA.d = epg.c("google.internal.privateinformationretrieval.v1.PirService", "Session");
                        epdVarA.b();
                        eby ebyVar = eby.a;
                        int i = fec.b;
                        epdVarA.a = new fea(ebyVar);
                        epdVarA.b = new fea(ecv.a);
                        epgVarA = epdVarA.a();
                        ebz.a = epgVarA;
                    }
                }
                epgVar = epgVarA;
            }
            elw elwVarA = eluVar.a(epgVar, fedVar.b);
            fei feiVar = new fei(elwVarA);
            feo.b(elwVarA, new fel(eaiVar, feiVar));
            return new eap(this.c, eolVarA, new eaj(this, feiVar));
        } catch (Exception e) {
            eolVarA.d();
            throw e;
        }
    }

    @Override // defpackage.eaa
    public final String c() {
        return "Connecting";
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.d;
    }
}
