package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foo {
    public static final boolean a;

    static {
        Object objB;
        try {
            objB = Class.forName("android.os.Build");
        } catch (Throwable th) {
            objB = ffh.b(th);
        }
        a = ffu.b(objB);
    }
}
