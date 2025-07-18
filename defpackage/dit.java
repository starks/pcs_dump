package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dit extends dim {
    private List b;

    public dit(cwu cwuVar, byte[] bArr) {
        this(cwuVar);
        q();
    }

    public static /* bridge */ /* synthetic */ Object t(List list) {
        ArrayList arrayListT = dcr.t(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fsc fscVar = (fsc) it.next();
            arrayListT.add(fscVar != null ? fscVar.a : null);
        }
        return DesugarCollections.unmodifiableList(arrayListT);
    }

    @Override // defpackage.dim
    public final void h(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new fsc(obj, (byte[]) null));
        }
    }

    @Override // defpackage.dim
    public final void j() {
        List list = this.b;
        if (list != null) {
            d(t(list));
        }
    }

    @Override // defpackage.dim
    public final void s(int i) {
        super.s(i);
        this.b = null;
    }

    public dit(cwu cwuVar) {
        List listT;
        super(cwuVar, true, true);
        if (cwuVar.isEmpty()) {
            listT = Collections.EMPTY_LIST;
        } else {
            listT = dcr.t(cwuVar.size());
        }
        for (int i = 0; i < cwuVar.size(); i++) {
            listT.add(null);
        }
        this.b = listT;
    }
}
