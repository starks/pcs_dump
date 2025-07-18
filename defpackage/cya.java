package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cya extends czb {
    public cya(Iterator it) {
        super(it);
    }

    @Override // defpackage.czb
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }
}
