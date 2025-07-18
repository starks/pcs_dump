package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aux implements Parcelable {
    public static final cxo a = cxo.l(3, auw.FC_CHECK_IN, auw.FC_TRAINING_START_QUERY, auw.FC_TRAINING_RESULT_UPLOAD);
    public final auj b;
    public final auw c;
    public final String d;

    public aux() {
    }

    public final auj a() {
        return this.b;
    }

    public final auw b() {
        return this.c;
    }

    public final String c() {
        return this.d;
    }

    public final euw d() {
        return new euw(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aux) {
            aux auxVar = (aux) obj;
            if (this.b.equals(auxVar.a()) && this.c.equals(auxVar.b()) && this.d.equals(auxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        auw auwVar = this.c;
        return "ConnectionDetails{connectionKey=" + this.b.toString() + ", type=" + auwVar.toString() + ", packageName=" + this.d + "}";
    }

    public aux(auj aujVar, auw auwVar, String str) {
        this();
        if (aujVar == null) {
            throw new NullPointerException("Null connectionKey");
        }
        this.b = aujVar;
        if (auwVar == null) {
            throw new NullPointerException("Null type");
        }
        this.c = auwVar;
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.d = str;
    }
}
