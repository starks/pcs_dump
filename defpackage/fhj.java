package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhj implements Serializable, fhq {
    private final fhq a;
    private final fhn b;

    public fhj(fhq fhqVar, fhn fhnVar) {
        fhqVar.getClass();
        this.a = fhqVar;
        this.b = fhnVar;
    }

    private final int a() {
        int i = 2;
        while (true) {
            fhq fhqVar = this.a;
            this = fhqVar instanceof fhj ? (fhj) fhqVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(fhn fhnVar) {
        return fjs.c(get(fhnVar.getKey()), fhnVar);
    }

    private final Object writeReplace() {
        int iA = a();
        fhq[] fhqVarArr = new fhq[iA];
        fjw fjwVar = new fjw();
        fold(ffz.a, new fhi(fhqVarArr, fjwVar));
        if (fjwVar.a == iA) {
            return new fhh(fhqVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fhj) {
            fhj fhjVar = (fhj) obj;
            if (fhjVar.a() == a()) {
                while (true) {
                    if (!fhjVar.b(this.b)) {
                        break;
                    }
                    fhq fhqVar = this.a;
                    if (fhqVar instanceof fhj) {
                        this = (fhj) fhqVar;
                    } else if (fhjVar.b((fhn) fhqVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fhq
    public final Object fold(Object obj, fjc fjcVar) {
        return fjcVar.a(this.a.fold(obj, fjcVar), this.b);
    }

    @Override // defpackage.fhq
    public final fhn get(fho fhoVar) {
        fhoVar.getClass();
        while (true) {
            fhn fhnVar = this.b.get(fhoVar);
            if (fhnVar != null) {
                return fhnVar;
            }
            fhq fhqVar = this.a;
            if (!(fhqVar instanceof fhj)) {
                return fhqVar.get(fhoVar);
            }
            this = (fhj) fhqVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.fhq
    public final fhq minusKey(fho fhoVar) {
        fhoVar.getClass();
        if (this.b.get(fhoVar) != null) {
            return this.a;
        }
        fhq fhqVarMinusKey = this.a.minusKey(fhoVar);
        if (fhqVarMinusKey == this.a) {
            return this;
        }
        fhr fhrVar = fhr.a;
        fhn fhnVar = this.b;
        return fhqVarMinusKey == fhrVar ? fhnVar : new fhj(fhqVarMinusKey, fhnVar);
    }

    @Override // defpackage.fhq
    public final fhq plus(fhq fhqVar) {
        return fjp.H(this, fhqVar);
    }

    public final String toString() {
        return "[" + fold("", fhp.b) + "]";
    }
}
