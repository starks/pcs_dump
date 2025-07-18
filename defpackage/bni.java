package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bni {
    private static final bni a = new bni();
    private brb b = null;

    public static brb b(Context context) {
        return a.a(context);
    }

    public final synchronized brb a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new brb(context);
        }
        return this.b;
    }
}
