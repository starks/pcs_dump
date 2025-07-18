package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dip extends din {
    @Override // defpackage.din
    public final int a(diq diqVar) {
        int i;
        synchronized (diqVar) {
            i = diqVar.remaining - 1;
            diqVar.remaining = i;
        }
        return i;
    }

    @Override // defpackage.din
    public final void b(diq diqVar, Set set) {
        synchronized (diqVar) {
            if (diqVar.seenExceptions == null) {
                diqVar.seenExceptions = set;
            }
        }
    }
}
