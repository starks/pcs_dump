package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffg {
    public static final /* synthetic */ int a = 0;
    private static final fff b;

    static {
        Object obj;
        Class<?> cls;
        fff fffVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                fffVar = (fff) cls.asSubclass(fff.class).getConstructor(ffh.class).newInstance(fff.a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            fffVar = null;
        }
        if (fffVar != null) {
            b = fffVar;
        } else {
            b = new fff(fff.a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, ffg.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private ffg() {
    }

    public static ffh a() {
        return fff.a;
    }

    public static ffh b() {
        return fff.b;
    }
}
