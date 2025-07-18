package defpackage;

import android.database.ContentObserver;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cea extends ContentObserver {
    final /* synthetic */ ceb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cea(ceb cebVar) {
        super(null);
        this.a = cebVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ceb cebVar = this.a;
        synchronized (cebVar.d) {
            cebVar.e = null;
            ceu.e();
        }
        synchronized (cebVar) {
            Iterator it = cebVar.f.iterator();
            while (it.hasNext()) {
                ((cec) it.next()).a();
            }
        }
    }
}
