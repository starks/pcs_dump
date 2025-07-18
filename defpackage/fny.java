package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fny {
    public static final fnk a;

    static {
        Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
        int i = fnx.a;
        a = new fnw(handlerCreateAsync, "main");
    }
}
