package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbp {
    public final PowerManager a;
    public final bqm b;
    public final int c;

    public cbp(Context context, bqm bqmVar, int i) {
        this.a = (PowerManager) context.getSystemService("power");
        this.b = bqmVar;
        this.c = i;
    }
}
