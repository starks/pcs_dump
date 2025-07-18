package defpackage;

import android.os.RemoteException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anb {
    public static final czn a = czn.j("com/google/android/apps/miphone/astrea/ai/service/GenAiServiceUtils");

    public static Object a(Callable callable) throws Exception {
        try {
            Object objCall = callable.call();
            if (objCall != null) {
                return objCall;
            }
            throw new NullPointerException("Callable returned null object. Maybe PCS<>AICore connection is dead?");
        } catch (Exception e) {
            throw new RemoteException("Callable failed: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
