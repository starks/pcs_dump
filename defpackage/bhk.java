package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhk implements bgt {
    public static final Charset a = Charset.forName("UTF-8");
    public static final ces b;
    public static final ConcurrentHashMap c;
    public static Boolean d;
    public static Long e;
    public final Context f;

    static {
        ces cesVar = new ces(cej.a("com.google.android.gms.clearcut.public"));
        if (cesVar.d) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        ces cesVar2 = new ces(cesVar.a, "gms:playlog:service:samplingrules_", cesVar.c, false, cesVar.e, cesVar.f);
        b = new ces(cesVar2.a, cesVar2.b, "LogSamplingRulesV2__", cesVar2.d, cesVar2.e, cesVar2.f);
        c = new ConcurrentHashMap();
        d = null;
        e = null;
    }

    public bhk(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            ceu.f(applicationContext);
        }
    }
}
