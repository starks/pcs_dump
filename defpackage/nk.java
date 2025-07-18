package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nk implements Iterable {
    public ng b;
    public ng c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    protected ng a(Object obj) {
        ng ngVar = this.b;
        while (ngVar != null && !ngVar.a.equals(obj)) {
            ngVar = ngVar.c;
        }
        return ngVar;
    }

    public Object b(Object obj) {
        ng ngVarA = a(obj);
        if (ngVarA == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator it = this.d.keySet().iterator();
            while (it.hasNext()) {
                ((nj) it.next()).aK(ngVarA);
            }
        }
        ng ngVar = ngVarA.d;
        ng ngVar2 = ngVarA.c;
        if (ngVar != null) {
            ngVar.c = ngVar2;
        } else {
            this.b = ngVar2;
        }
        ng ngVar3 = ngVarA.c;
        if (ngVar3 != null) {
            ngVar3.d = ngVar;
        } else {
            this.c = ngVar;
        }
        ngVarA.c = null;
        ngVarA.d = null;
        return ngVarA.b;
    }

    public final ng d(Object obj, Object obj2) {
        ng ngVar = new ng(obj, obj2);
        this.e++;
        ng ngVar2 = this.c;
        if (ngVar2 == null) {
            this.b = ngVar;
        } else {
            ngVar2.c = ngVar;
            ngVar.d = ngVar2;
        }
        this.c = ngVar;
        return ngVar;
    }

    public final nh e() {
        nh nhVar = new nh(this);
        this.d.put(nhVar, false);
        return nhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nk)) {
            return false;
        }
        nk nkVar = (nk) obj;
        if (this.e != nkVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = nkVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry next = ((ni) it).next();
            Map.Entry next2 = ((ni) it2).next();
            if (next != null) {
                if (next != null || next.equals(next2)) {
                }
            } else if (next2 == null) {
                next2 = null;
                if (next != null) {
                }
            }
            return false;
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public final Object f(Object obj, Object obj2) {
        ng ngVarA = a(obj);
        if (ngVarA != null) {
            return ngVarA.b;
        }
        d(obj, obj2);
        return null;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((ni) it).next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ne neVar = new ne(this.b, this.c);
        this.d.put(neVar, false);
        return neVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((ni) it).next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
