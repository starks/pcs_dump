package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lo {
    public static final tl b = new tl(20);
    public int a;
    public tz c;
    public tz d;

    private lo() {
    }

    public static lo a() {
        lo loVar = (lo) b.a();
        return loVar == null ? new lo() : loVar;
    }

    public static void b(lo loVar) {
        loVar.a = 0;
        loVar.c = null;
        loVar.d = null;
        b.b(loVar);
    }
}
