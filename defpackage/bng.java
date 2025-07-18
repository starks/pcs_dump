package defpackage;

import android.app.Application;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bng {
    private static String a;
    private static Boolean b;

    public static String a() {
        if (a == null) {
            a = Application.getProcessName();
        }
        return a;
    }

    public static boolean b() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(Process.isIsolated());
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
