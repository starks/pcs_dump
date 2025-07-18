package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eep {
    public static final eep a = new eep(null);
    final ehd b = new egz();
    public boolean c;
    private boolean d;

    private eep() {
    }

    public static int a(ehs ehsVar, int i, Object obj) {
        int iY = eei.Y(i);
        if (ehsVar == ehs.GROUP) {
            efn.c((egi) obj);
            iY += iY;
        }
        eht ehtVar = eht.INT;
        int iAc = 4;
        switch (ehsVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                iAc = 8;
                return iY + iAc;
            case FLOAT:
                ((Float) obj).floatValue();
                return iY + iAc;
            case INT64:
                iAc = eei.ac(((Long) obj).longValue());
                return iY + iAc;
            case UINT64:
                iAc = eei.ac(((Long) obj).longValue());
                return iY + iAc;
            case INT32:
                iAc = eei.L(((Integer) obj).intValue());
                return iY + iAc;
            case FIXED64:
                ((Long) obj).longValue();
                iAc = 8;
                return iY + iAc;
            case FIXED32:
                ((Integer) obj).intValue();
                return iY + iAc;
            case BOOL:
                ((Boolean) obj).booleanValue();
                iAc = 1;
                return iY + iAc;
            case STRING:
                iAc = obj instanceof eea ? eei.H((eea) obj) : eei.X((String) obj);
                return iY + iAc;
            case GROUP:
                iAc = ((egi) obj).getSerializedSize();
                return iY + iAc;
            case MESSAGE:
                iAc = obj instanceof efu ? eei.O((efu) obj) : eei.Q((egi) obj);
                return iY + iAc;
            case BYTES:
                iAc = obj instanceof eea ? eei.H((eea) obj) : eei.P(((byte[]) obj).length);
                return iY + iAc;
            case UINT32:
                iAc = eei.aa(((Integer) obj).intValue());
                return iY + iAc;
            case ENUM:
                iAc = obj instanceof eff ? eei.L(((eff) obj).a()) : eei.L(((Integer) obj).intValue());
                return iY + iAc;
            case SFIXED32:
                ((Integer) obj).intValue();
                return iY + iAc;
            case SFIXED64:
                ((Long) obj).longValue();
                iAc = 8;
                return iY + iAc;
            case SINT32:
                iAc = eei.T(((Integer) obj).intValue());
                return iY + iAc;
            case SINT64:
                iAc = eei.V(((Long) obj).longValue());
                return iY + iAc;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void g(eei eeiVar, ehs ehsVar, int i, Object obj) {
        if (ehsVar == ehs.GROUP) {
            egi egiVar = (egi) obj;
            efn.c(egiVar);
            eeiVar.A(i, 3);
            eeiVar.am(egiVar);
            eeiVar.A(i, 4);
            return;
        }
        eeiVar.A(i, ehsVar.t);
        eht ehtVar = eht.INT;
        switch (ehsVar) {
            case DOUBLE:
                eeiVar.aj(((Double) obj).doubleValue());
                break;
            case FLOAT:
                eeiVar.al(((Float) obj).floatValue());
                break;
            case INT64:
                eeiVar.E(((Long) obj).longValue());
                break;
            case UINT64:
                eeiVar.E(((Long) obj).longValue());
                break;
            case INT32:
                eeiVar.t(((Integer) obj).intValue());
                break;
            case FIXED64:
                eeiVar.r(((Long) obj).longValue());
                break;
            case FIXED32:
                eeiVar.p(((Integer) obj).intValue());
                break;
            case BOOL:
                eeiVar.j(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof eea)) {
                    eeiVar.z((String) obj);
                    break;
                } else {
                    eeiVar.n((eea) obj);
                    break;
                }
            case GROUP:
                eeiVar.am((egi) obj);
                break;
            case MESSAGE:
                eeiVar.v((egi) obj);
                break;
            case BYTES:
                if (!(obj instanceof eea)) {
                    byte[] bArr = (byte[]) obj;
                    eeiVar.F(bArr, bArr.length);
                    break;
                } else {
                    eeiVar.n((eea) obj);
                    break;
                }
            case UINT32:
                eeiVar.C(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof eff)) {
                    eeiVar.t(((Integer) obj).intValue());
                    break;
                } else {
                    eeiVar.t(((eff) obj).a());
                    break;
                }
            case SFIXED32:
                eeiVar.p(((Integer) obj).intValue());
                break;
            case SFIXED64:
                eeiVar.r(((Long) obj).longValue());
                break;
            case SINT32:
                eeiVar.ao(((Integer) obj).intValue());
                break;
            case SINT64:
                eeiVar.aq(((Long) obj).longValue());
                break;
        }
    }

    public static int j(eey eeyVar, Object obj) {
        return a(eey.b(), 508674538, obj);
    }

    private static Object m(Object obj) {
        if (obj instanceof egn) {
            return ((egn) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static boolean n(Map.Entry entry) {
        if (eey.a() != eht.MESSAGE) {
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof egj) {
            return ((egj) value).isInitialized();
        }
        if (value instanceof efu) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int b(Map.Entry entry) {
        int iZ;
        int iY;
        eey eeyVar = (eey) entry.getKey();
        Object value = entry.getValue();
        if (eey.a() != eht.MESSAGE) {
            return j(eeyVar, value);
        }
        if (value instanceof efu) {
            int iY2 = eei.Y(1);
            iZ = iY2 + iY2 + eei.Z(2, 508674538);
            iY = eei.N(3, (efu) value);
        } else {
            int iY3 = eei.Y(1);
            iZ = iY3 + iY3 + eei.Z(2, 508674538);
            iY = eei.Y(3) + eei.Q((egi) value);
        }
        return iZ + iY;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eep clone() {
        eep eepVar = new eep();
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            eha ehaVar = (eha) this.b.d(i2);
            eepVar.l((eey) ehaVar.a, ehaVar.b);
        }
        for (Map.Entry entry : this.b.a()) {
            eepVar.l((eey) entry.getKey(), entry.getValue());
        }
        eepVar.d = this.d;
        return eepVar;
    }

    public final Iterator d() {
        return h() ? Collections.emptyIterator() : this.d ? new eft(this.b.entrySet().iterator()) : this.b.entrySet().iterator();
    }

    public final void e() {
        if (this.c) {
            return;
        }
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((eha) this.b.d(i2)).b;
            if (obj instanceof efb) {
                ((efb) obj).makeImmutable();
            }
        }
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof efb) {
                ((efb) value).makeImmutable();
            }
        }
        ehd ehdVar = this.b;
        if (!ehdVar.d) {
            for (int i3 = 0; i3 < ehdVar.b; i3++) {
            }
            Iterator it2 = ehdVar.a().iterator();
            while (it2.hasNext()) {
            }
        }
        if (!ehdVar.d) {
            ehdVar.c = ehdVar.c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(ehdVar.c);
            ehdVar.e = ehdVar.e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(ehdVar.e);
            ehdVar.d = true;
        }
        this.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eep) {
            return this.b.equals(((eep) obj).b);
        }
        return false;
    }

    public final void f(Map.Entry entry) {
        egi egiVarZ;
        eey eeyVar = (eey) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof efu;
        if (eey.a() != eht.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.b.put(eeyVar, m(value));
            return;
        }
        Object objK = k(eeyVar);
        if (objK == null) {
            this.b.put(eeyVar, m(value));
            if (z) {
                this.d = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (objK instanceof egn) {
            egiVarZ = eey.d();
        } else {
            ((egi) objK).toBuilder();
            egiVarZ = eey.c().z();
        }
        this.b.put(eeyVar, egiVarZ);
    }

    final boolean h() {
        return this.b.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final boolean i() {
        int i = this.b.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (!n(this.b.d(i2))) {
                return false;
            }
        }
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            if (!n((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object k(eey eeyVar) {
        Object obj = this.b.get(eeyVar);
        if (!(obj instanceof efu)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r4 instanceof defpackage.eff) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((r4 instanceof defpackage.efu) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.eey r3, java.lang.Object r4) {
        /*
            r2 = this;
            ehs r0 = defpackage.eey.b()
            defpackage.efn.d(r4)
            ehs r1 = defpackage.ehs.DOUBLE
            eht r1 = defpackage.eht.INT
            eht r0 = r0.s
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L27;
                case 7: goto L1e;
                case 8: goto L15;
                default: goto L14;
            }
        L14:
            goto L50
        L15:
            boolean r0 = r4 instanceof defpackage.egi
            if (r0 != 0) goto L43
            boolean r0 = r4 instanceof defpackage.efu
            if (r0 == 0) goto L50
            goto L43
        L1e:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L43
            boolean r0 = r4 instanceof defpackage.eff
            if (r0 == 0) goto L50
            goto L43
        L27:
            boolean r0 = r4 instanceof defpackage.eea
            if (r0 != 0) goto L43
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L50
            goto L43
        L30:
            boolean r0 = r4 instanceof java.lang.String
            goto L41
        L33:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L41
        L36:
            boolean r0 = r4 instanceof java.lang.Double
            goto L41
        L39:
            boolean r0 = r4 instanceof java.lang.Float
            goto L41
        L3c:
            boolean r0 = r4 instanceof java.lang.Long
            goto L41
        L3f:
            boolean r0 = r4 instanceof java.lang.Integer
        L41:
            if (r0 == 0) goto L50
        L43:
            boolean r0 = r4 instanceof defpackage.efu
            if (r0 == 0) goto L4a
            r0 = 1
            r2.d = r0
        L4a:
            ehd r2 = r2.b
            r2.put(r3, r4)
            return
        L50:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r3 = 508674538(0x1e51c1ea, float:1.1104468E-20)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            ehs r0 = defpackage.eey.b()
            eht r0 = r0.s
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eep.l(eey, java.lang.Object):void");
    }

    private eep(byte[] bArr) {
        e();
        e();
    }
}
