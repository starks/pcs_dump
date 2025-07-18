package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class adt extends fid implements fjc {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final /* synthetic */ acu[] h;
    final /* synthetic */ adu i;
    final /* synthetic */ aec j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adt(acu[] acuVarArr, adu aduVar, aec aecVar, fhk fhkVar) {
        super(fhkVar);
        this.h = acuVarArr;
        this.i = aduVar;
        this.j = aecVar;
    }

    @Override // defpackage.fjc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adt) c((aea) obj, (fhk) obj2)).b(ffz.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (((defpackage.adu) r6).d(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (((defpackage.adu) r6).c(r11, r5, r10) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:25:0x008a). Please report as a decompilation issue!!! */
    @Override // defpackage.fhx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fhs r0 = defpackage.fhs.a
            int r1 = r10.g
            r2 = 1
            if (r1 == 0) goto L28
            if (r1 == r2) goto L16
            int r1 = r10.f
            int r3 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
            goto L22
        L16:
            int r1 = r10.f
            int r3 = r10.e
            int r4 = r10.d
            java.lang.Object r5 = r10.c
            java.lang.Object r6 = r10.b
            java.lang.Object r7 = r10.a
        L22:
            defpackage.ffh.c(r11)
            r11 = r5
            r5 = r4
            goto L8a
        L28:
            defpackage.ffh.c(r11)
            acu[] r11 = r10.h
            adu r1 = r10.i
            aec r3 = r10.j
            int r4 = r11.length
            r5 = 0
            r7 = r11
            r6 = r1
            r11 = r3
            r1 = r4
            r3 = r5
        L38:
            if (r3 >= r1) goto L8c
            r4 = r7
            acu[] r4 = (defpackage.acu[]) r4
            r4 = r4[r3]
            int r8 = r5 + 1
            acu r9 = defpackage.acu.a
            int r4 = r4.ordinal()
            if (r4 == 0) goto L89
            if (r4 == r2) goto L6e
            r9 = 2
            if (r4 != r9) goto L68
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r3
            r10.f = r1
            r10.g = r9
            zl r4 = defpackage.adu.f
            r4 = r6
            adu r4 = (defpackage.adu) r4
            java.lang.Object r4 = r4.d(r11, r5, r10)
            if (r4 == r0) goto L88
            goto L89
        L68:
            ffq r10 = new ffq
            r10.<init>()
            throw r10
        L6e:
            r10.a = r7
            r10.b = r6
            r10.c = r11
            r10.d = r8
            r10.e = r3
            r10.f = r1
            r10.g = r2
            zl r4 = defpackage.adu.f
            r4 = r6
            adu r4 = (defpackage.adu) r4
            java.lang.Object r4 = r4.c(r11, r5, r10)
            if (r4 == r0) goto L88
            goto L89
        L88:
            return r0
        L89:
            r5 = r8
        L8a:
            int r3 = r3 + r2
            goto L38
        L8c:
            ffz r10 = defpackage.ffz.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fhx
    public final fhk c(Object obj, fhk fhkVar) {
        return new adt(this.h, this.i, this.j, fhkVar);
    }
}
