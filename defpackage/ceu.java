package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ceu {
    private static final Object a = new Object();
    public static final /* synthetic */ int d = 0;
    private static volatile cet e = null;
    private static volatile boolean f = false;
    private static final cfg g;
    private static final AtomicInteger h;
    final ces b;
    final String c;
    private Object i;
    private volatile int j = -1;
    private volatile Object k;
    private final boolean l;
    private volatile boolean m;

    static {
        new AtomicReference();
        g = new cfg(new cgq(1));
        h = new AtomicInteger();
    }

    public ceu(ces cesVar, String str, Object obj, boolean z) {
        if (cesVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.b = cesVar;
        this.c = str;
        this.i = obj;
        this.l = z;
        this.m = false;
    }

    public static void e() {
        h.incrementAndGet();
    }

    public static void f(Context context) {
        if (e != null || context == null) {
            return;
        }
        Object obj = a;
        synchronized (obj) {
            if (e == null) {
                synchronized (obj) {
                    cet cetVar = e;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (cetVar == null || cetVar.a != context) {
                        if (cetVar != null) {
                            ceb.b();
                            cew.a();
                            ceg.c();
                        }
                        e = new cet(context, clq.t(new bsr(context, 8)));
                        e();
                    }
                }
            }
        }
    }

    private final String g(String str) {
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.c;
        return zIsEmpty ? str2 : str.concat(str2);
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r3
  0x0045: PHI (r3v1 cru) = (r3v0 cru), (r3v5 cru) binds: [B:11:0x0022, B:13:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137 A[Catch: all -> 0x01d4, TryCatch #2 {, blocks: (B:8:0x0019, B:10:0x001d, B:12:0x0024, B:14:0x0032, B:20:0x004c, B:22:0x0057, B:24:0x0067, B:57:0x0137, B:59:0x013f, B:60:0x0141, B:79:0x0173, B:81:0x0176, B:82:0x0178, B:84:0x0180, B:87:0x0188, B:89:0x018e, B:94:0x01a4, B:96:0x01aa, B:92:0x019c, B:98:0x01b0, B:100:0x01b6, B:103:0x01be, B:104:0x01c3, B:105:0x01c7, B:26:0x0079, B:28:0x0081, B:52:0x00f6, B:54:0x00fd, B:55:0x0122, B:29:0x008e, B:30:0x0090, B:50:0x00e8, B:109:0x01ce, B:110:0x01cf, B:111:0x01d1, B:112:0x01d2, B:61:0x0142, B:63:0x0146, B:65:0x0155, B:72:0x0166, B:73:0x016a, B:74:0x016d, B:75:0x016e, B:64:0x014a, B:70:0x015c, B:31:0x0091, B:33:0x0099, B:34:0x00a5, B:36:0x00a7, B:38:0x00b3, B:40:0x00c1, B:48:0x00dd, B:49:0x00e7, B:42:0x00cb, B:43:0x00cf, B:44:0x00d5), top: B:123:0x0019, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceu.b():java.lang.Object");
    }

    public final Object c() {
        return this.i;
    }

    public final String d() {
        return g(this.b.c);
    }
}
