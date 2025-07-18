package j$.util;

import java.io.Serializable;

/* renamed from: j$.util.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0044d extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new C0044d("Unsupported " + str + " :" + serializable);
    }
}
