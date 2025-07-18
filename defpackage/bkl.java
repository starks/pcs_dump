package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkl {
    public final Executor a;
    public volatile Object b;
    public volatile bkk c;

    public bkl(Looper looper, Object obj, String str) {
        this.a = new caj(looper, 1);
        this.b = obj;
        aso.E(str);
        this.c = new bkk(obj, str);
    }
}
