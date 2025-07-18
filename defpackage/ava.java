package defpackage;

import android.os.Parcelable;
import j$.time.Instant;
import j$.util.Comparator;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ava implements Parcelable {
    public static final Comparator a = Comparator.CC.comparing(new alg(8), Comparator.CC.reverseOrder());
    public final int b;
    public final aux c;
    public final String d;
    public final long e;
    public final long f;
    public final Instant g;
    public final long h;
    public final ajc i;
    public final int j;

    public ava() {
    }

    public static auz a() {
        auz auzVar = new auz((byte[]) null);
        auzVar.f(0);
        auzVar.c(Instant.now());
        auzVar.j("");
        auzVar.e(-1L);
        auzVar.i(0L);
        auzVar.g(ajc.a);
        return auzVar;
    }

    public final int b() {
        return this.b;
    }

    public final long c() {
        return this.e;
    }

    public final long d() {
        return this.h;
    }

    public final long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ava) {
            ava avaVar = (ava) obj;
            if (this.b == avaVar.b() && this.c.equals(avaVar.g()) && this.d.equals(avaVar.j()) && this.j == avaVar.k() && this.e == avaVar.c() && this.f == avaVar.e() && this.g.equals(avaVar.i()) && this.h == avaVar.d() && this.i.equals(avaVar.f())) {
                return true;
            }
        }
        return false;
    }

    public final ajc f() {
        return this.i;
    }

    public final aux g() {
        return this.c;
    }

    public final auz h() {
        return new auz(this);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ a.b(this.j);
        long j = this.f;
        Instant instant = this.g;
        long j2 = this.e;
        int iHashCode2 = (((((iHashCode * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ instant.hashCode();
        ajc ajcVar = this.i;
        long j3 = this.h;
        return ((((int) (j3 ^ (j3 >>> 32))) ^ (iHashCode2 * 1000003)) * 1000003) ^ ajcVar.hashCode();
    }

    public final Instant i() {
        return this.g;
    }

    public final String j() {
        return this.d;
    }

    public final int k() {
        return this.j;
    }

    public final String toString() {
        ajc ajcVar = this.i;
        Instant instant = this.g;
        return "NetworkUsageEntity{id=" + this.b + ", connectionDetails=" + this.c.toString() + ", url=" + this.d + ", status=" + ayg.e(this.j) + ", downloadSize=" + this.e + ", uploadSize=" + this.f + ", creationTime=" + instant.toString() + ", fcRunId=" + this.h + ", policyProto=" + ajcVar.toString() + "}";
    }

    public ava(int i, aux auxVar, String str, int i2, long j, long j2, Instant instant, long j3, ajc ajcVar) {
        this();
        this.b = i;
        if (auxVar == null) {
            throw new NullPointerException("Null connectionDetails");
        }
        this.c = auxVar;
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.d = str;
        if (i2 == 0) {
            throw new NullPointerException("Null status");
        }
        this.j = i2;
        this.e = j;
        this.f = j2;
        if (instant == null) {
            throw new NullPointerException("Null creationTime");
        }
        this.g = instant;
        this.h = j3;
        if (ajcVar == null) {
            throw new NullPointerException("Null policyProto");
        }
        this.i = ajcVar;
    }
}
