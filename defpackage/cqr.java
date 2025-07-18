package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqr {
    private final cxc a;
    private final cxc b;
    private final UUID c;

    public cqr() {
    }

    public final cxc a() {
        return this.b;
    }

    public final cxc b() {
        return this.a;
    }

    public final UUID c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqr) {
            cqr cqrVar = (cqr) obj;
            if (dcr.v(this.a, cqrVar.b()) && dcr.v(this.b, cqrVar.a()) && this.c.equals(cqrVar.c())) {
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
        return TextUtils.join(" -> ", b());
    }

    public cqr(cxc cxcVar, cxc cxcVar2, UUID uuid) {
        this();
        this.a = cxcVar;
        this.b = cxcVar2;
        this.c = uuid;
    }
}
