package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewg implements Runnable {
    final /* synthetic */ eui a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ewn c;

    public ewg(ewn ewnVar, eui euiVar, boolean z) {
        this.a = euiVar;
        this.b = z;
        this.c = ewnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.l.c(this.a, this.b);
    }
}
