package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbp {
    private final bbc a;
    private final ayk b;
    private final csd c;

    public bbp() {
    }

    public final ayk a() {
        return this.b;
    }

    public final bbc b() {
        return this.a;
    }

    public final csd c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbp) {
            bbp bbpVar = (bbp) obj;
            if (this.a.equals(bbpVar.b()) && this.c.equals(bbpVar.c()) && this.b.equals(bbpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        ayk aykVar = this.b;
        csd csdVar = this.c;
        return "IntegrityResponse{state=" + this.a.toString() + ", externalEncryption=" + csdVar.toString() + ", attestationResponse=" + aykVar.toString() + "}";
    }

    public bbp(bbc bbcVar, csd csdVar, ayk aykVar) {
        this();
        if (bbcVar == null) {
            throw new NullPointerException("Null state");
        }
        this.a = bbcVar;
        if (csdVar == null) {
            throw new NullPointerException("Null externalEncryption");
        }
        this.c = csdVar;
        if (aykVar == null) {
            throw new NullPointerException("Null attestationResponse");
        }
        this.b = aykVar;
    }
}
