package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wv {
    public Object a;
    public final /* synthetic */ Object b;

    public wv(Object obj) {
        this.b = obj;
    }

    public final void a(int i, int i2, int i3, int i4) {
        ((nm) this.b).d.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(i + ((nm) this.b).c.left, i2 + ((nm) this.b).c.top, i3 + ((nm) this.b).c.right, i4 + ((nm) this.b).c.bottom);
    }

    public final boolean b() {
        return ((nm) this.b).b;
    }

    public final boolean c() {
        return ((nm) this.b).a;
    }
}
