package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emj implements eml {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ emj(Optional optional, int i) {
        this.b = i;
        this.a = optional;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [faw, java.lang.Object] */
    @Override // defpackage.eml
    public final void a(emr emrVar) {
        int i = this.b;
        if (i == 0) {
            ((emk) this.a).j(emrVar.c());
            return;
        }
        int i2 = 2;
        if (i == 1) {
            das dasVar = bdj.a;
            ((Optional) this.a).ifPresent(new ani(i2));
        } else if (i == 2) {
            if (emrVar.c() != null) {
                ((faf) this.a).a.d = true;
            }
        } else {
            eqo eqoVarN = fjp.N(emrVar);
            if (eqo.f.o.equals(eqoVarN.o)) {
                this.a.d(eqoVarN);
            }
        }
    }

    public emj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
