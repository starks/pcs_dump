package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bd {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public az d;

    final Bundle a(String str, Bundle bundle) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    final ab b(String str) {
        bc bcVar = (bc) this.b.get(str);
        if (bcVar != null) {
            return bcVar.a;
        }
        return null;
    }

    final ab c(String str) {
        for (bc bcVar : this.b.values()) {
            if (bcVar != null) {
                ab abVarC = bcVar.a;
                if (!str.equals(abVarC.k)) {
                    abVarC = abVarC.B.c.c(str);
                }
                if (abVarC != null) {
                    return abVarC;
                }
            }
        }
        return null;
    }

    final bc d(String str) {
        return (bc) this.b.get(str);
    }

    final List e() {
        ArrayList arrayList = new ArrayList();
        for (bc bcVar : this.b.values()) {
            if (bcVar != null) {
                arrayList.add(bcVar);
            }
        }
        return arrayList;
    }

    final List f() {
        ArrayList arrayList = new ArrayList();
        for (bc bcVar : this.b.values()) {
            if (bcVar != null) {
                arrayList.add(bcVar.a);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final List g() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    final void h(ab abVar) {
        if (this.a.contains(abVar)) {
            Objects.toString(abVar);
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(abVar)));
        }
        synchronized (this.a) {
            this.a.add(abVar);
        }
        abVar.p = true;
    }

    final void i() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    final void j(bc bcVar) {
        ab abVar = bcVar.a;
        if (m(abVar.k)) {
            return;
        }
        this.b.put(abVar.k, bcVar);
        boolean z = abVar.J;
        if (ax.X(2)) {
            Objects.toString(abVar);
        }
    }

    final void k(bc bcVar) {
        ab abVar = bcVar.a;
        if (abVar.I) {
            this.d.d(abVar);
        }
        if (this.b.get(abVar.k) == bcVar && ((bc) this.b.put(abVar.k, null)) != null && ax.X(2)) {
            Objects.toString(abVar);
        }
    }

    final void l(ab abVar) {
        synchronized (this.a) {
            this.a.remove(abVar);
        }
        abVar.p = false;
    }

    final boolean m(String str) {
        return this.b.get(str) != null;
    }
}
