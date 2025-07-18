package defpackage;

import android.os.Bundle;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bok {
    public static final Duration a = Duration.ofMinutes(1);
    public final Duration b;
    public final Duration c;
    public final boolean d;
    public final Bundle e;

    public bok() {
    }

    public final Bundle a() {
        return this.e;
    }

    public final Duration b() {
        return this.b;
    }

    public final Duration c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bok) {
            bok bokVar = (bok) obj;
            if (this.b.equals(bokVar.b()) && this.c.equals(bokVar.c()) && this.d == bokVar.d() && this.e.equals(bokVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
        return this.e.hashCode() ^ (((iHashCode * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003);
    }

    public final String toString() {
        Bundle bundle = this.e;
        Duration duration = this.c;
        return "DroidGuardClientOptions{initTimeout=" + String.valueOf(this.b) + ", snapshotTimeout=" + String.valueOf(duration) + ", reinitializeHandleOnGetSnapshot=" + this.d + ", extras=" + String.valueOf(bundle) + "}";
    }

    public bok(Duration duration, Duration duration2, boolean z, Bundle bundle) {
        this();
        this.b = duration;
        this.c = duration2;
        this.d = z;
        this.e = bundle;
    }
}
