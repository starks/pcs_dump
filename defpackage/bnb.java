package defpackage;

import android.content.Context;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnb {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};
    private static final int b = -1;
    private static int c = 0;
    private static int d = 0;

    public static void a(Context context, Throwable th) {
        try {
            aso.F(context);
            aso.F(th);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
