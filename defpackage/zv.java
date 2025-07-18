package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zv implements Runnable {
    private final za a;
    private final yu b;
    private boolean c;

    public zv(za zaVar, yu yuVar) {
        yuVar.getClass();
        this.a = zaVar;
        this.b = yuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            return;
        }
        this.a.d(this.b);
        this.c = true;
    }
}
