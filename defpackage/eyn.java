package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyn {
    public final eof a;
    public emh b;
    public boolean c = false;
    public emi d = emi.a(emh.IDLE);

    public eyn(eof eofVar, emh emhVar) {
        this.a = eofVar;
        this.b = emhVar;
    }

    public final emh a() {
        return this.d.a;
    }

    public final void b(emh emhVar) {
        boolean z;
        this.b = emhVar;
        if (emhVar == emh.READY || emhVar == emh.TRANSIENT_FAILURE) {
            z = true;
        } else if (emhVar != emh.IDLE) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
