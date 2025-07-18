package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eun extends euk {
    final /* synthetic */ euq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eun(eur eurVar, euq euqVar) {
        super(eurVar.a);
        this.a = euqVar;
    }

    @Override // defpackage.euk
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            euq euqVar = this.a;
            synchronized (euqVar) {
                if (euqVar.c.isEmpty()) {
                    euqVar.c = null;
                    euqVar.b = true;
                    return;
                } else {
                    list = euqVar.c;
                    euqVar.c = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
