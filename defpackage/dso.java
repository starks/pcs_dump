package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dso extends RuntimeException {
    public dso(String str) {
        super(str);
    }

    public static Object a(dsn dsnVar) {
        try {
            return dsnVar.a();
        } catch (Exception e) {
            throw new dso(e);
        }
    }

    public dso(String str, Throwable th) {
        super(str, th);
    }

    public dso(Throwable th) {
        super(th);
    }
}
