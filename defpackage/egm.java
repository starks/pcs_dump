package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egm implements egx {
    private final egi a;
    private final ehh b;
    private final boolean c;
    private final ebz d;

    public egm(ehh ehhVar, ebz ebzVar, egi egiVar) {
        this.b = ehhVar;
        this.c = ebz.j(egiVar);
        this.d = ebzVar;
        this.a = egiVar;
    }

    @Override // defpackage.egx
    public final int a(Object obj) {
        ehh ehhVar = this.b;
        int iB = ehhVar.b(ehhVar.d(obj));
        if (!this.c) {
            return iB;
        }
        eep eepVarH = ebz.h(obj);
        int i = eepVarH.b.b;
        int iB2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iB2 += eepVarH.b(eepVarH.b.d(i2));
        }
        Iterator it = eepVarH.b.a().iterator();
        while (it.hasNext()) {
            iB2 += eepVarH.b((Map.Entry) it.next());
        }
        return iB + iB2;
    }

    @Override // defpackage.egx
    public final int b(Object obj) {
        int iHashCode = this.b.d(obj).hashCode();
        return this.c ? (iHashCode * 53) + ebz.h(obj).hashCode() : iHashCode;
    }

    @Override // defpackage.egx
    public final Object e() {
        egi egiVar = this.a;
        return egiVar instanceof efb ? ((efb) egiVar).newMutableInstance() : egiVar.newBuilderForType().A();
    }

    @Override // defpackage.egx
    public final void f(Object obj) {
        this.b.h(obj);
        this.d.e(obj);
    }

    @Override // defpackage.egx
    public final void g(Object obj, Object obj2) {
        egy.m(this.b, obj, obj2);
        if (this.c) {
            egy.p(this.d, obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r12 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        r6.e(defpackage.ehu.c(r11, 2), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        r12 = r13;
        r11 = r3;
        r13 = r5;
        r14 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092 A[EDGE_INSN: B:58:0x0092->B:35:0x0092 BREAK  A[LOOP:1: B:18:0x0051->B:63:0x0051], SYNTHETIC] */
    @Override // defpackage.egx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r10, byte[] r11, int r12, int r13, defpackage.edm r14) throws defpackage.efp {
        /*
            r9 = this;
            r0 = r10
            efb r0 = (defpackage.efb) r0
            ehi r1 = r0.unknownFields
            ehi r2 = defpackage.ehi.a
            if (r1 != r2) goto L10
            ehi r1 = new ehi
            r1.<init>()
            r0.unknownFields = r1
        L10:
            r6 = r1
            eex r10 = (defpackage.eex) r10
            r10.a()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La1
            int r4 = defpackage.edn.l(r11, r12, r14)
            int r2 = r14.a
            int r12 = defpackage.ehu.a
            r1 = 2
            if (r2 == r12) goto L4c
            int r12 = defpackage.ehu.b(r2)
            if (r12 != r1) goto L44
            een r12 = r14.d
            egi r0 = r9.a
            int r1 = defpackage.ehu.a(r2)
            java.lang.Object r0 = defpackage.ebz.g(r12, r0, r1)
            if (r0 != 0) goto L41
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = defpackage.edn.k(r2, r3, r4, r5, r6, r7)
            goto L18
        L41:
            egr r9 = defpackage.egr.a
            throw r10
        L44:
            r3 = r11
            r5 = r13
            r7 = r14
            int r12 = defpackage.edn.r(r2, r3, r4, r5, r7)
            goto L18
        L4c:
            r3 = r11
            r5 = r13
            r7 = r14
            r11 = 0
            r12 = r10
        L51:
            if (r4 >= r5) goto L91
            int r13 = defpackage.edn.l(r3, r4, r7)
            int r14 = r7.a
            int r2 = defpackage.ehu.a(r14)
            int r4 = defpackage.ehu.b(r14)
            if (r2 == r1) goto L77
            r8 = 3
            if (r2 == r8) goto L67
            goto L88
        L67:
            if (r0 != 0) goto L74
            if (r4 != r1) goto L88
            int r4 = defpackage.edn.c(r3, r13, r7)
            java.lang.Object r12 = r7.c
            eea r12 = (defpackage.eea) r12
            goto L51
        L74:
            egr r9 = defpackage.egr.a
            throw r10
        L77:
            if (r4 != 0) goto L88
            int r4 = defpackage.edn.l(r3, r13, r7)
            int r11 = r7.a
            een r13 = r7.d
            egi r14 = r9.a
            java.lang.Object r0 = defpackage.ebz.g(r13, r14, r11)
            goto L51
        L88:
            int r2 = defpackage.ehu.b
            if (r14 == r2) goto L92
            int r4 = defpackage.edn.r(r14, r3, r13, r5, r7)
            goto L51
        L91:
            r13 = r4
        L92:
            if (r12 == 0) goto L9b
            int r11 = defpackage.ehu.c(r11, r1)
            r6.e(r11, r12)
        L9b:
            r12 = r13
            r11 = r3
            r13 = r5
            r14 = r7
            goto L18
        La1:
            r5 = r13
            if (r12 != r5) goto La5
            return
        La5:
            efp r9 = new efp
            java.lang.String r10 = "Failed to parse the message."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egm.h(java.lang.Object, byte[], int, int, edm):void");
    }

    @Override // defpackage.egx
    public final boolean i(Object obj, Object obj2) {
        ehh ehhVar = this.b;
        if (!ehhVar.d(obj).equals(ehhVar.d(obj2))) {
            return false;
        }
        if (this.c) {
            return ebz.h(obj).equals(ebz.h(obj2));
        }
        return true;
    }

    @Override // defpackage.egx
    public final boolean j(Object obj) {
        return ebz.h(obj).i();
    }

    @Override // defpackage.egx
    public final void k(Object obj, fdu fduVar, een eenVar) {
        boolean zS;
        ehh ehhVar = this.b;
        Object objC = ehhVar.c(obj);
        eep eepVarI = ebz.i(obj);
        while (fduVar.g() != Integer.MAX_VALUE) {
            try {
                int i = fduVar.a;
                int iM = 0;
                if (i != ehu.a) {
                    if (ehu.b(i) == 2) {
                        Object objG = ebz.g(eenVar, this.a, ehu.a(i));
                        if (objG != null) {
                            ebz.m(fduVar, objG, eenVar, eepVarI);
                        } else {
                            zS = ehhVar.s(objC, fduVar, 0);
                        }
                    } else {
                        zS = fduVar.S();
                    }
                    if (!zS) {
                        break;
                    }
                } else {
                    Object objG2 = null;
                    eea eeaVarS = null;
                    while (fduVar.g() != Integer.MAX_VALUE) {
                        int i2 = fduVar.a;
                        if (i2 == ehu.c) {
                            iM = fduVar.m();
                            objG2 = ebz.g(eenVar, this.a, iM);
                        } else if (i2 == ehu.d) {
                            if (objG2 != null) {
                                ebz.m(fduVar, objG2, eenVar, eepVarI);
                            } else {
                                eeaVarS = fduVar.s();
                            }
                        } else if (i2 == ehu.b || !fduVar.S()) {
                            break;
                        }
                    }
                    if (fduVar.a != ehu.b) {
                        throw new efp("Protocol message end-group tag did not match expected tag.");
                    }
                    if (eeaVarS != null) {
                        if (objG2 != null) {
                            ebz.k(eeaVarS, objG2, eenVar, eepVarI);
                        } else {
                            ehhVar.f(objC, iM, eeaVarS);
                        }
                    }
                }
            } finally {
                ehhVar.i(obj, objC);
            }
        }
    }

    @Override // defpackage.egx
    public final void m(Object obj, fsc fscVar) {
        Iterator itD = ebz.h(obj).d();
        while (itD.hasNext()) {
            Map.Entry entry = (Map.Entry) itD.next();
            if (eey.a() != eht.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof efs) {
                fscVar.I(508674538, ((efu) ((efs) entry).a.getValue()).a());
            } else {
                fscVar.I(508674538, entry.getValue());
            }
        }
        ehh ehhVar = this.b;
        ehhVar.t(ehhVar.d(obj), fscVar);
    }
}
