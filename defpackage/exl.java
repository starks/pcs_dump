package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exl {
    final Object a = new Object();
    Collection b = new HashSet();
    eqo c;
    final /* synthetic */ exm d;

    public exl(exm exmVar) {
        this.d = exmVar;
    }

    final void a(eqo eqoVar) {
        synchronized (this.a) {
            if (this.c != null) {
                return;
            }
            this.c = eqoVar;
            boolean zIsEmpty = this.b.isEmpty();
            if (zIsEmpty) {
                this.d.y.d(eqoVar);
            }
        }
    }
}
