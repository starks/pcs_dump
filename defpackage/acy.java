package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acy extends afc {
    final /* synthetic */ ach a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acy(ach achVar, int i) {
        super(i);
        this.a = achVar;
    }

    @Override // defpackage.afc
    public final void a(afb afbVar) throws Exception {
        ady adyVar = new ady(afbVar);
        afa afaVarB = adyVar.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (afaVarB.k()) {
                if (afaVarB.b(0) == 0) {
                    z = true;
                }
            }
            ach achVar = this.a;
            fjp.w(afaVarB, null);
            achVar.c().a(adyVar);
            if (!z) {
                ezo ezoVarG = achVar.c().g(adyVar);
                if (!ezoVarG.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(ezoVarG.b)));
                }
            }
            achVar.a(adyVar);
            achVar.c().e();
            for (yt ytVar : achVar.e()) {
            }
        } finally {
        }
    }

    @Override // defpackage.afc
    public final void b(afb afbVar, int i, int i2) throws Exception {
        d(afbVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // defpackage.afc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.afb r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acy.c(afb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0061 A[EDGE_INSN: B:75:0x0061->B:26:0x0061 BREAK  A[LOOP:2: B:10:0x0020->B:79:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.afc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.afb r12, int r13, int r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acy.d(afb, int, int):void");
    }
}
