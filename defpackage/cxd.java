package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxd extends cxj implements cyg {
    private static final long serialVersionUID = 0;

    public cxd(cxg cxgVar, int i) {
        super(cxgVar, i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(a.x(i, "Invalid key count "));
        }
        cxe cxeVar = new cxe();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            object.getClass();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(a.x(i4, "Invalid value count "));
            }
            int i5 = cxc.d;
            cwy cwyVar = new cwy();
            for (int i6 = 0; i6 < i4; i6++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                cwyVar.h(object2);
            }
            cxeVar.b(object, cwyVar.g());
            i2 += i4;
        }
        try {
            cxi.a.ac(this, cxeVar.e());
            cxi.b.ab(this, i2);
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        dcr.k(this, objectOutputStream);
    }

    @Override // defpackage.cxj, defpackage.cyg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cxc b(Object obj) {
        cxc cxcVar = (cxc) this.map.get(obj);
        if (cxcVar != null) {
            return cxcVar;
        }
        int i = cxc.d;
        return cyp.a;
    }
}
