package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tm extends tl {
    private final Object a;

    public tm() {
        super(12);
        this.a = new Object();
    }

    @Override // defpackage.tl
    public final Object a() {
        Object objA;
        synchronized (this.a) {
            objA = super.a();
        }
        return objA;
    }

    @Override // defpackage.tl
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.a) {
            zB = super.b(obj);
        }
        return zB;
    }
}
