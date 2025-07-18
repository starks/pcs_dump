package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fad extends fab {
    @Override // defpackage.fab
    public final boolean a(fae faeVar) {
        synchronized (faeVar) {
            if (faeVar.a != 0) {
                return false;
            }
            faeVar.a = -1;
            return true;
        }
    }

    @Override // defpackage.fab
    public final void b(fae faeVar) {
        synchronized (faeVar) {
            faeVar.a = 0;
        }
    }
}
