package defpackage;

import com.google.intelligence.micore.pir.core.PirClientModuleJNI;
import com.google.intelligence.micore.pir.core.PirClientSwig;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eam extends eah {
    final /* synthetic */ ebe e;
    private final int f;
    private final long g;
    private final long h;
    private final int i;
    private int j;
    private int k;
    private final PirClientSwig l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eam(ebe ebeVar, eol eolVar, dzy dzyVar, PirClientSwig pirClientSwig, feu feuVar, int i, int i2) {
        super(ebeVar, eolVar, feuVar);
        this.e = ebeVar;
        this.l = pirClientSwig;
        int iA = dzx.a(dzyVar.b);
        int i3 = iA - 1;
        if (iA == 0) {
            throw null;
        }
        if (i3 != 0) {
            throw new IllegalArgumentException("Unrecognized PIR configuration scheme.");
        }
        edd eddVar = (dzyVar.b == 1 ? (ede) dzyVar.c : ede.a).b;
        int i4 = 1 << (eddVar == null ? edd.a : eddVar).b;
        edd eddVar2 = (dzyVar.b == 1 ? (ede) dzyVar.c : ede.a).b;
        int iB = ebq.b(i4, (eddVar2 == null ? edd.a : eddVar2).c);
        edc edcVar = dzyVar.d;
        int i5 = ((edcVar == null ? edc.a : edcVar).c + (iB - 1)) / iB;
        this.f = i5;
        this.g = ebq.c(dzyVar);
        this.h = ebq.d(dzyVar);
        this.i = i2;
        this.j = i;
        this.k = Math.min(i + i2, i5) - 1;
        ebeVar.c.a(i5);
    }

    private final eae l() {
        int i = this.f;
        int i2 = this.j;
        if (i - i2 <= 0) {
            return new eal(this.e, this.c, this.d);
        }
        int i3 = this.k - i2;
        feu feuVar = this.d;
        asr asrVar = (asr) eby.a.createBuilder();
        asr asrVar2 = (asr) ebu.a.createBuilder();
        asr asrVar3 = (asr) ebt.a.createBuilder();
        int i4 = this.j;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((ebt) asrVar3.a).b = i4;
        if (!asrVar3.a.isMutable()) {
            asrVar3.B();
        }
        ((ebt) asrVar3.a).c = i3 + 1;
        if (!asrVar2.a.isMutable()) {
            asrVar2.B();
        }
        ebu ebuVar = (ebu) asrVar2.a;
        ebt ebtVar = (ebt) asrVar3.z();
        ebtVar.getClass();
        efm efmVar = ebuVar.b;
        if (!efmVar.c()) {
            ebuVar.b = efb.mutableCopy(efmVar);
        }
        ebuVar.b.add(ebtVar);
        if (!asrVar.a.isMutable()) {
            asrVar.B();
        }
        eby ebyVar = (eby) asrVar.a;
        ebu ebuVar2 = (ebu) asrVar2.z();
        ebuVar2.getClass();
        ebyVar.c = ebuVar2;
        ebyVar.b = 3;
        feuVar.c((eby) asrVar.z());
        return this;
    }

    @Override // defpackage.eae, defpackage.eaa
    public final /* bridge */ /* synthetic */ eaa a() {
        super.i();
        return l();
    }

    @Override // defpackage.eaa
    public final String c() {
        return String.format(Locale.US, "Downloading[chunk range %d to %d of %d]", Integer.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.f));
    }

    @Override // defpackage.eae
    public final eae f(ecj ecjVar) throws eba {
        int iB = ecg.b(ecjVar.b);
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(String.format(Locale.US, "Unrecognized output: %s", ecg.a(ecg.b(ecjVar.b))));
            }
            ecf ecfVar = ecjVar.b == 2 ? (ecf) ecjVar.c : ecf.a;
            if (ecb.a(ecfVar.b).ordinal() != 0) {
                eaz eazVar = new eaz();
                eazVar.b("Get Chunks failed; unrecognized error code: %s", ecb.a(ecfVar.b));
                eazVar.a();
                eazVar.d = dgy.u;
                throw new eba(eazVar);
            }
            eaz eazVar2 = new eaz();
            eazVar2.b = "Get Chunks failed; invalid chunk range.";
            eazVar2.a();
            eazVar2.d = dgy.t;
            throw new eba(eazVar2);
        }
        eci eciVar = ecjVar.b == 1 ? (eci) ecjVar.c : eci.a;
        if (eciVar.b.size() != 1) {
            eaz eazVar3 = new eaz();
            eazVar3.b = "PIR server did not return a single range of chunks";
            eazVar3.a();
            eazVar3.d = dgy.p;
            throw new eba(eazVar3);
        }
        ech echVar = (ech) eciVar.b.get(0);
        int i2 = echVar.b;
        int i3 = this.j;
        if (i2 != i3) {
            eaz eazVar4 = new eaz();
            eazVar4.b("PIR server returned chunks starting from an unexpected index (expected: %d, received: %d).", Integer.valueOf(i3), Integer.valueOf(echVar.b));
            eazVar4.a();
            eazVar4.d = dgy.q;
            throw new eba(eazVar4);
        }
        int i4 = (this.k - i3) + 1;
        if (echVar.c.size() != i4) {
            eaz eazVar5 = new eaz();
            eazVar5.b("PIR server returned 1 chunk range, but not exactly %d chunks in that range.", Integer.valueOf(i4));
            eazVar5.a();
            eazVar5.d = dgy.r;
            throw new eba(eazVar5);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ebg ebgVar = (ebg) echVar.c.get(i5);
            ebe ebeVar = this.e;
            PirClientSwig pirClientSwig = this.l;
            csf csfVarB = csf.b(ebeVar.i);
            byte[] bArrPirClientSwig_processResponseChunk = PirClientModuleJNI.PirClientSwig_processResponseChunk(pirClientSwig.a, pirClientSwig, ebgVar == null ? null : ebgVar.toByteArray());
            ebe ebeVar2 = this.e;
            int i6 = this.j + i5;
            asr asrVar = (asr) dgt.a.createBuilder();
            asr asrVar2 = (asr) dgs.a.createBuilder();
            if (!asrVar2.a.isMutable()) {
                asrVar2.B();
            }
            dgs dgsVar = (dgs) asrVar2.a;
            dgsVar.b |= 1;
            dgsVar.c = i6;
            if (!asrVar.a.isMutable()) {
                asrVar.B();
            }
            dgt dgtVar = (dgt) asrVar.a;
            dgs dgsVar2 = (dgs) asrVar2.z();
            dgsVar2.getClass();
            dgtVar.d = dgsVar2;
            dgtVar.c = 5;
            ebeVar2.c(asrVar, csfVarB);
            long j = this.g;
            long j2 = (this.j + i5) * j;
            try {
                this.e.m.d(bArrPirClientSwig_processResponseChunk, j2, (int) Math.min(j, this.h - j2));
            } catch (IOException e) {
                eaz eazVar6 = new eaz();
                eazVar6.c = e;
                eazVar6.b = "IOException occurred while writing processed PIR chunks to disk.";
                eazVar6.d = dgy.s;
                throw new eba(eazVar6);
            }
        }
        this.j = this.k + 1;
        this.k = Math.min(r13 + this.i, this.f) - 1;
        return l();
    }

    @Override // defpackage.eae
    public final int k() {
        return dgu.g;
    }
}
