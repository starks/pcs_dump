package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
class cxf implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public cxf(cxg cxgVar) {
        Object[] objArr = new Object[cxgVar.size()];
        Object[] objArr2 = new Object[cxgVar.size()];
        czc czcVarListIterator = cxgVar.entrySet().listIterator();
        int i = 0;
        while (czcVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) czcVarListIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public cxe a(int i) {
        return new cxe(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof cxo) {
            cxo cxoVar = (cxo) obj;
            cwu cwuVar = (cwu) this.b;
            cxe cxeVarA = a(cxoVar.size());
            czc czcVarListIterator = cxoVar.listIterator();
            czc czcVarListIterator2 = cwuVar.listIterator();
            while (czcVarListIterator.hasNext()) {
                cxeVarA.b(czcVarListIterator.next(), czcVarListIterator2.next());
            }
            return cxeVarA.e();
        }
        Object obj2 = this.b;
        Object[] objArr = (Object[]) obj;
        cxe cxeVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            cxeVarA2.b(objArr[i], ((Object[]) obj2)[i]);
        }
        return cxeVarA2.e();
    }
}
