package j$.util;

import java.security.AccessController;

/* loaded from: classes2.dex */
abstract class W {
    static final boolean a = ((Boolean) AccessController.doPrivileged(new V())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(String.valueOf(cls) + " tripwire tripped but logging not supported: " + str);
    }
}
