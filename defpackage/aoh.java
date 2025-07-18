package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoh {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public Object b = null;

    public final synchronized Object a(fuu fuuVar) {
        if (this.b == null) {
            this.b = ((anx) fuuVar.a).a();
        }
        return this.b;
    }
}
