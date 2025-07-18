package defpackage;

import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class and {
    public final Duration a;
    public final Optional b;
    public final Optional c;

    public and() {
    }

    public final Duration a() {
        return this.a;
    }

    public final Optional b() {
        return this.b;
    }

    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof and) {
            and andVar = (and) obj;
            if (this.a.equals(andVar.a()) && this.b.equals(andVar.b()) && this.c.equals(andVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        return this.c.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "AttestationMeasurementRequest{ttl=" + String.valueOf(this.a) + ", contentBinding=" + String.valueOf(optional2) + ", includeIdAttestation=" + String.valueOf(optional) + "}";
    }

    public and(Duration duration, Optional optional, Optional optional2) {
        this();
        this.a = duration;
        this.b = optional;
        this.c = optional2;
    }
}
