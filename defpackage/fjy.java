package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjy {
    public static final fjp a;

    static {
        fjp fjpVar = null;
        try {
            fjpVar = (fjp) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (fjpVar == null) {
            fjpVar = new fjp();
        }
        a = fjpVar;
    }

    public static String a(fjq fjqVar) {
        return fjp.k(fjqVar);
    }

    public static fkk b(Class cls) {
        return new fjn(cls);
    }
}
