package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cxq extends cxj implements cyg {
    private static final long serialVersionUID = 0;
    private final transient cxo emptySet;

    public cxq(cxg cxgVar, int i) {
        super(cxgVar, i);
        this.emptySet = a(null);
    }

    private static cxo a(Comparator comparator) {
        return comparator == null ? cyv.a : cxt.x(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            cxm cxmVar = comparator == null ? new cxm() : new cxr(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                object2.getClass();
                cxmVar.c(object2);
            }
            cxo cxoVarI = cxmVar.i();
            if (cxoVarI.size() != i4) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(object.toString()));
            }
            cxeVar.b(object, cxoVarI);
            i2 += i4;
        }
        try {
            cxi.a.ac(this, cxeVar.e());
            cxi.b.ab(this, i2);
            cxp.a.ac(this, a(comparator));
        } catch (IllegalArgumentException e) {
            throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        cxo cxoVar = this.emptySet;
        objectOutputStream.writeObject(cxoVar instanceof cxt ? ((cxt) cxoVar).a : null);
        dcr.k(this, objectOutputStream);
    }

    @Override // defpackage.cxj, defpackage.cyg
    public final /* bridge */ /* synthetic */ Collection b(Object obj) {
        return (cxo) clq.R((cxo) this.map.get(obj), this.emptySet);
    }
}
