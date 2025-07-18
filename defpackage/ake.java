package defpackage;

import android.content.Context;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ake {
    public static final ake a = new ake();
    private static int b = akd.a;

    private ake() {
    }

    public static final boolean a(Context context) throws Exception {
        Object objInvoke;
        if (b == akd.a) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                objInvoke = clsLoadClass.getMethod("getBoolean", (Class[]) Arrays.copyOf(new Class[]{String.class, Boolean.TYPE}, 2)).invoke(clsLoadClass, Arrays.copyOf(new Object[]{"is_expressive_design_enabled", false}, 2));
                objInvoke.getClass();
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Exception unused) {
            }
            int i = ((Boolean) objInvoke).booleanValue() ? akd.b : akd.c;
            b = i;
        }
        if (b != akd.a) {
            return b == akd.b;
        }
        throw new Exception("need to call com.android.settingslib.widget.SettingsThemeHelper.init(Context) first.");
    }
}
