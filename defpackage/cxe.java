package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxe {
    Object[] a;
    int b;
    fcy c;

    public cxe() {
        this(4);
    }

    private final cxg h(boolean z) {
        fcy fcyVar;
        fcy fcyVar2;
        if (z && (fcyVar2 = this.c) != null) {
            throw fcyVar2.f();
        }
        cyu cyuVarD = cyu.d(this.b, this.a, this);
        if (!z || (fcyVar = this.c) == null) {
            return cyuVarD;
        }
        throw fcyVar.f();
    }

    private final void i(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, cwt.f(length, i2));
        }
    }

    public cxe a(cxe cxeVar) {
        cxeVar.getClass();
        i(this.b + cxeVar.b);
        Object[] objArr = cxeVar.a;
        Object[] objArr2 = this.a;
        int i = this.b;
        int i2 = cxeVar.b;
        System.arraycopy(objArr, 0, objArr2, i + i, i2 + i2);
        this.b += cxeVar.b;
        return this;
    }

    public cxe b(Object obj, Object obj2) {
        i(this.b + 1);
        dcr.M(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    public cxe c(Iterable iterable) {
        if (iterable instanceof Collection) {
            i(this.b + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            f((Map.Entry) it.next());
        }
        return this;
    }

    public cxe d(Map map) {
        return c(map.entrySet());
    }

    public cxg e() {
        return h(true);
    }

    public void f(Map.Entry entry) {
        b(entry.getKey(), entry.getValue());
    }

    public final cxg g() {
        return h(false);
    }

    public cxe(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
