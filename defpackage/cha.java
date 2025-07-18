package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cha {
    public final cfq a;
    public final chb b;

    public cha() {
    }

    public final cfq a() {
        return this.a;
    }

    public final chb b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cha) {
            cha chaVar = (cha) obj;
            cfq cfqVar = this.a;
            if (cfqVar != null ? cfqVar.equals(chaVar.a()) : chaVar.a() == null) {
                if (this.b.equals(chaVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        cfq cfqVar = this.a;
        return this.b.hashCode() ^ (((cfqVar == null ? 0 : cfqVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        chb chbVar = this.b;
        return "SnapshotBlobAndResult{snapshotBlob=" + String.valueOf(this.a) + ", snapshotResult=" + chbVar.toString() + "}";
    }

    public cha(cfq cfqVar, chb chbVar) {
        this();
        this.a = cfqVar;
        this.b = chbVar;
    }
}
