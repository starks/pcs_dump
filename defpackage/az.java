package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class az extends zx {
    public static final zz a = new aan(1);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public az(boolean z) {
        this.e = z;
    }

    private final void g(String str, boolean z) {
        az azVar = (az) this.c.get(str);
        if (azVar != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(azVar.c.keySet());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    azVar.b((String) arrayList.get(i), true);
                }
            }
            azVar.c();
            this.c.remove(str);
        }
        fsc fscVar = (fsc) this.d.get(str);
        if (fscVar != null) {
            fscVar.aj();
            this.d.remove(str);
        }
    }

    final void a(ab abVar, boolean z) {
        if (ax.X(3)) {
            Objects.toString(abVar);
        }
        g(abVar.k, z);
    }

    final void b(String str, boolean z) {
        ax.X(3);
        g(str, z);
    }

    @Override // defpackage.zx
    protected final void c() {
        if (ax.X(3)) {
            toString();
        }
        this.f = true;
    }

    final void d(ab abVar) {
        if (this.g) {
            ax.X(2);
        } else {
            if (this.b.remove(abVar.k) == null || !ax.X(2)) {
                return;
            }
            Objects.toString(abVar);
        }
    }

    final boolean e(ab abVar) {
        if (this.b.containsKey(abVar.k) && this.e) {
            return this.f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            az azVar = (az) obj;
            if (this.b.equals(azVar.b) && this.c.equals(azVar.c) && this.d.equals(azVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
