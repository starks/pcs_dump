package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyk extends cyj implements Serializable {
    public static final cyj a = new cyk();
    private static final long serialVersionUID = 0;

    private cyk() {
    }

    @Override // defpackage.cyj, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cyl cylVar = (cyl) obj;
        cyl cylVar2 = (cyl) obj2;
        return cwg.b.b(cylVar.b, cylVar2.b).b(cylVar.c, cylVar2.c).a();
    }
}
