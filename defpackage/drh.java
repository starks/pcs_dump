package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drh extends dli {
    public final dsg a;

    public drh(dsg dsgVar) {
        this.a = dsgVar;
    }

    @Override // defpackage.dli
    public final boolean a() {
        dvn dvnVarB = dvn.b(this.a.b.d);
        if (dvnVarB == null) {
            dvnVarB = dvn.UNRECOGNIZED;
        }
        return dvnVarB != dvn.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof drh)) {
            return false;
        }
        dsg dsgVar = ((drh) obj).a;
        dvn dvnVarB = dvn.b(this.a.b.d);
        if (dvnVarB == null) {
            dvnVarB = dvn.UNRECOGNIZED;
        }
        dvn dvnVarB2 = dvn.b(dsgVar.b.d);
        if (dvnVarB2 == null) {
            dvnVarB2 = dvn.UNRECOGNIZED;
        }
        if (dvnVarB.equals(dvnVarB2)) {
            if (this.a.b.b.equals(dsgVar.b.b)) {
                if (this.a.b.c.equals(dsgVar.b.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dsg dsgVar = this.a;
        return Objects.hash(dsgVar.b, dsgVar.a);
    }

    public final String toString() {
        dve dveVar = this.a.b;
        String str = dveVar.b;
        dvn dvnVarB = dvn.b(dveVar.d);
        if (dvnVarB == null) {
            dvnVarB = dvn.UNRECOGNIZED;
        }
        int iOrdinal = dvnVarB.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
