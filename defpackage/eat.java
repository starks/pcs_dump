package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eat extends ead {
    private final cbx a;
    private final ecv b;

    public eat() {
    }

    @Override // defpackage.dzz
    public final /* bridge */ /* synthetic */ eaa a(eaa eaaVar) {
        eae eaeVar = (eae) eaaVar;
        eaeVar.c();
        int iB = eck.b(c().b);
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        if (i == 0) {
            ecv ecvVarC = c();
            return eaeVar.g(ecvVarC.b == 1 ? (ecq) ecvVarC.c : ecq.a);
        }
        if (i == 1) {
            ecv ecvVarC2 = c();
            return eaeVar.h(ecvVarC2.b == 2 ? (ecu) ecvVarC2.c : ecu.a);
        }
        if (i != 2) {
            throw new IllegalStateException(String.format(Locale.US, "Unrecognized message type: %s", eck.a(eck.b(c().b))));
        }
        ecv ecvVarC3 = c();
        return eaeVar.f(ecvVarC3.b == 3 ? (ecj) ecvVarC3.c : ecj.a);
    }

    public final cbx b() {
        return this.a;
    }

    public final ecv c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eat) {
            eat eatVar = (eat) obj;
            if (this.a.equals(eatVar.b()) && this.b.equals(eatVar.c())) {
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
        ecv ecvVar = this.b;
        return "ServerToClientMessageEvent{logger=" + this.a.toString() + ", message=" + ecvVar.toString() + "}";
    }

    public eat(cbx cbxVar, ecv ecvVar) {
        this();
        this.a = cbxVar;
        if (ecvVar == null) {
            throw new NullPointerException("Null message");
        }
        this.b = ecvVar;
    }
}
