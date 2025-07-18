package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czp extends dae {
    public czp(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.dae
    public final void a(Iterator it, dad dadVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                dadVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            dadVar.a(str, sb.toString());
        }
    }
}
