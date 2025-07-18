package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czq extends dae {
    public czq(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.dae
    public final /* bridge */ /* synthetic */ void b(Object obj, dad dadVar) {
        dcy dcyVar = (dcy) obj;
        if (dcyVar == null) {
            return;
        }
        dcu dcuVar = new dcu((dcv) dcyVar.c.d);
        while (dcuVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dcuVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                dadVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    dadVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
