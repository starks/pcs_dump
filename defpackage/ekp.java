package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekp implements eko, ejg {
    public final Object a;

    private ekp(Object obj) {
        this.a = obj;
    }

    public static eko a(Object obj) {
        obj.getClass();
        return new ekp(obj);
    }

    @Override // defpackage.ffk, defpackage.ffj
    public final Object b() {
        return this.a;
    }
}
