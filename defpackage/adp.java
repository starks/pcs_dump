package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adp extends fid implements fjc {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ adu c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adp(adu aduVar, fhk fhkVar, int i) {
        super(fhkVar);
        this.d = i;
        this.c = aduVar;
    }

    @Override // defpackage.fjc
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i == 0) {
            return ((adp) c((aec) obj, (fhk) obj2)).b(ffz.a);
        }
        if (i != 1) {
            return ((adp) c((aec) obj, (fhk) obj2)).b(ffz.a);
        }
        return ((adp) c((aea) obj, (fhk) obj2)).b(ffz.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r4.d(r3, r5, r14) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0112, code lost:
    
        if (r15 == r0) goto L73;
     */
    @Override // defpackage.fhx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        int i = this.d;
        if (i == 0) {
            adp adpVar = new adp(this.c, fhkVar, 0);
            adpVar.b = obj;
            return adpVar;
        }
        if (i != 1) {
            adp adpVar2 = new adp(this.c, fhkVar, 2, (char[]) null);
            adpVar2.b = obj;
            return adpVar2;
        }
        adp adpVar3 = new adp(this.c, fhkVar, 1, (byte[]) null);
        adpVar3.b = obj;
        return adpVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adp(adu aduVar, fhk fhkVar, int i, byte[] bArr) {
        super(fhkVar);
        this.d = i;
        this.c = aduVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adp(adu aduVar, fhk fhkVar, int i, char[] cArr) {
        super(fhkVar);
        this.d = i;
        this.c = aduVar;
    }
}
