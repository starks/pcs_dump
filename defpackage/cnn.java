package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnn extends rv {
    final /* synthetic */ cno a;
    final /* synthetic */ ceg b;

    public cnn(cno cnoVar, ceg cegVar) {
        this.b = cegVar;
        this.a = cnoVar;
    }

    @Override // defpackage.rv
    public final void a(int i) {
        this.a.m = true;
        this.b.f();
    }

    @Override // defpackage.rv
    public final void b(Typeface typeface) {
        cno cnoVar = this.a;
        cnoVar.k = Typeface.create(typeface, cnoVar.c);
        this.a.m = true;
        this.b.e(this.a.k);
    }
}
