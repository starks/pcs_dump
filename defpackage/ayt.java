package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayt {
    private final String a;
    private final Optional b;

    public ayt() {
    }

    public static ayt a(String str) {
        ays aysVar = new ays(null);
        aysVar.a = str;
        return aysVar.a();
    }

    public final Optional b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayt) {
            ayt aytVar = (ayt) obj;
            if (this.a.equals(aytVar.c()) && this.b.equals(aytVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "ClientConfig{clientId=" + this.a + ", buildIdFlag=" + String.valueOf(this.b) + "}";
    }

    public ayt(String str, Optional optional) {
        this();
        this.a = str;
        this.b = optional;
    }
}
