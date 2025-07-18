package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sv implements tj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public sv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.tj
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            sx sxVar = (sx) obj;
            if (sxVar == null) {
                sxVar = new sx(-3);
            }
            ((bnz) this.a).h(sxVar);
            return;
        }
        sx sxVar2 = (sx) obj;
        synchronized (sw.c) {
            ArrayList arrayList = (ArrayList) sw.d.get(this.a);
            if (arrayList == null) {
                return;
            }
            sw.d.remove(this.a);
            for (int i = 0; i < arrayList.size(); i++) {
                ((tj) arrayList.get(i)).a(sxVar2);
            }
        }
    }
}
