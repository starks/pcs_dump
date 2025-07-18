package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doo {
    public static final int a = 1;
    public static final int b = 2;
    private static final /* synthetic */ int[] c = {a, b};

    public static boolean a(int i) {
        Boolean bool;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return !dop.a();
        }
        if (i2 != 1) {
            throw null;
        }
        if (dop.a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                dop.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = false;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static int[] values$ar$edu$c4c09b17_0() {
        return new int[]{a, b};
    }
}
