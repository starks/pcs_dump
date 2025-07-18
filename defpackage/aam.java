package defpackage;

import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aam implements zj {
    public final aas a;
    public boolean b = false;
    public final bds c;

    public aam(aas aasVar, bds bdsVar) {
        this.a = aasVar;
        this.c = bdsVar;
    }

    @Override // defpackage.zj
    public final void a(Object obj) {
        if (aap.c(2)) {
            Objects.toString(this.a);
            aas.j(obj);
        }
        this.b = true;
        bds bdsVar = this.c;
        bdsVar.a.clear();
        bdsVar.a.addAll((List) obj);
        bdsVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.c.toString();
    }
}
