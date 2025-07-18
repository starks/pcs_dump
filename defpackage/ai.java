package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ai {
    public static final /* synthetic */ int a = 0;
    private static final oc b = new oc();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        oc ocVar = b;
        oc ocVar2 = (oc) ocVar.get(classLoader);
        if (ocVar2 == null) {
            ocVar2 = new oc();
            ocVar.put(classLoader, ocVar2);
        }
        Class cls = (Class) ocVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        ocVar2.put(str, cls2);
        return cls2;
    }

    public ab b(String str) {
        throw null;
    }
}
