package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fou {
    public final fli c = fjp.v(this);
    public final fli d = fjp.v(this);
    public final fli e = fjp.v(null);

    public boolean bd() {
        return f() instanceof foy;
    }

    public final Object f() {
        return this.c.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r3.c.d(r2, ((defpackage.foy) r4).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.fou g() {
        /*
            r7 = this;
        L0:
            fli r0 = r7.d
            java.lang.Object r0 = r0.a
            fou r0 = (defpackage.fou) r0
            r1 = 0
            r2 = r0
        L8:
            r3 = r1
        L9:
            fli r4 = r2.c
            java.lang.Object r4 = r4.a
            if (r4 != r7) goto L1b
            if (r0 != r2) goto L12
            goto L1a
        L12:
            fli r1 = r7.d
            boolean r0 = r1.d(r0, r2)
            if (r0 == 0) goto L0
        L1a:
            return r2
        L1b:
            boolean r5 = r7.bd()
            if (r5 == 0) goto L22
            return r1
        L22:
            boolean r5 = r4 instanceof defpackage.foy
            if (r5 == 0) goto L3d
            if (r3 == 0) goto L36
            foy r4 = (defpackage.foy) r4
            fou r4 = r4.a
            fli r5 = r3.c
            boolean r2 = r5.d(r2, r4)
            if (r2 == 0) goto L0
            r2 = r3
            goto L8
        L36:
            fli r2 = r2.d
            java.lang.Object r2 = r2.a
            fou r2 = (defpackage.fou) r2
            goto L9
        L3d:
            r4.getClass()
            r3 = r4
            fou r3 = (defpackage.fou) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fou.g():fou");
    }

    public final fou h() {
        Object objF = f();
        foy foyVar = objF instanceof foy ? (foy) objF : null;
        if (foyVar != null) {
            return foyVar.a;
        }
        objF.getClass();
        return (fou) objF;
    }

    public final fou i() {
        fou fouVarG = g();
        if (fouVarG != null) {
            return fouVarG;
        }
        Object obj = this.d.a;
        while (true) {
            fou fouVar = (fou) obj;
            if (!fouVar.bd()) {
                return fouVar;
            }
            obj = fouVar.d.a;
        }
    }

    public final void j(int i) {
        l(new Cfor(i), i);
    }

    public final void k(fou fouVar) {
        fou fouVar2;
        do {
            fouVar2 = (fou) fouVar.d.a;
            if (f() != fouVar) {
                return;
            }
        } while (!fouVar.d.d(fouVar2, this));
        if (bd()) {
            fouVar.g();
        }
    }

    public final boolean l(fou fouVar, int i) {
        fou fouVarI;
        do {
            fouVarI = i();
            if (fouVarI instanceof Cfor) {
                return (((Cfor) fouVarI).a & i) == 0 && fouVarI.l(fouVar, i);
            }
            fouVar.d.b(fouVarI);
            fouVar.c.b(this);
        } while (!fouVarI.c.d(this, fouVar));
        fouVar.k(this);
        return true;
    }

    public String toString() {
        return new fjv(this) { // from class: fot
            @Override // defpackage.fjv
            public final Object h() {
                return fme.a(this.b);
            }
        } + "@" + fme.b(this);
    }
}
