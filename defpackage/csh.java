package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csh implements Serializable, csg {
    private static final long serialVersionUID = 0;
    final csg a;
    volatile transient boolean b;
    transient Object c;
    private transient fjk d = new fjk();

    public csh(csg csgVar) {
        this.a = csgVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.d = new fjk();
    }

    @Override // defpackage.csg
    public final Object a() {
        if (!this.b) {
            synchronized (this.d) {
                if (!this.b) {
                    Object objA = this.a.a();
                    this.c = objA;
                    this.b = true;
                    return objA;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.b) {
            obj = "<supplier that returned " + String.valueOf(this.c) + ">";
        } else {
            obj = this.a;
        }
        return a.H(obj, "Suppliers.memoize(", ")");
    }
}
