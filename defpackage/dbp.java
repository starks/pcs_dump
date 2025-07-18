package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbp implements dbl {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbl
    public final /* synthetic */ void a(dae daeVar, Iterator it, Object obj) {
        cnx.V(daeVar.b, "non repeating key");
        if (!daeVar.c || dca.a() <= 20) {
            daeVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(daeVar.a, it.next());
            }
        }
    }
}
