package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyp implements eoh {
    final /* synthetic */ Object a;
    final /* synthetic */ eoi b;
    private final /* synthetic */ int c;

    public /* synthetic */ eyp(eyo eyoVar, eyn eynVar, int i) {
        this.c = i;
        this.b = eyoVar;
        this.a = eynVar;
    }

    @Override // defpackage.eoh
    public final void a(emi emiVar) {
        eog eyrVar;
        if (this.c != 0) {
            ((eyo) this.b).f((eyn) this.a, emiVar);
            return;
        }
        emh emhVar = emiVar.a;
        if (emhVar == emh.SHUTDOWN) {
            return;
        }
        eoi eoiVar = this.b;
        if (emhVar == emh.TRANSIENT_FAILURE || emhVar == emh.IDLE) {
            ((eyt) eoiVar).f.e();
        }
        eyt eytVar = (eyt) eoiVar;
        if (eytVar.g == emh.TRANSIENT_FAILURE) {
            if (emhVar == emh.CONNECTING) {
                return;
            }
            if (emhVar == emh.IDLE) {
                eoiVar.d();
                return;
            }
        }
        Object obj = this.a;
        int iOrdinal = emhVar.ordinal();
        if (iOrdinal == 0) {
            eyrVar = new eyr(eoc.a);
        } else if (iOrdinal == 1) {
            eyrVar = new eyr(eoc.c((eof) obj));
        } else if (iOrdinal == 2) {
            eyrVar = new eyr(eoc.b(emiVar.b));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(emhVar.toString()));
            }
            eyrVar = new eys(eytVar, (eof) obj);
        }
        eytVar.f(emhVar, eyrVar);
    }

    public eyp(eyt eytVar, eof eofVar, int i) {
        this.c = i;
        this.a = eofVar;
        this.b = eytVar;
    }
}
