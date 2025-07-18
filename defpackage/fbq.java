package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbq extends fbv {
    final /* synthetic */ fbs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbq(fbs fbsVar, fdj fdjVar) {
        super(fdjVar);
        this.a = fbsVar;
    }

    @Override // defpackage.fbv, defpackage.fdj
    public final void a(fdu fduVar) {
        this.a.h++;
        this.b.a(fduVar);
    }

    @Override // defpackage.fbv, defpackage.fdj
    public final void b(boolean z, int i, int i2) {
        if (z) {
            this.a.h++;
        }
        this.b.b(z, i, i2);
    }

    @Override // defpackage.fbv, defpackage.fdj
    public final void c(int i, fdi fdiVar) {
        this.a.h++;
        this.b.c(i, fdiVar);
    }
}
