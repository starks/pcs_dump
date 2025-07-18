package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enq {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final det b = epc.c;

    public static eox a(String str, enp enpVar) {
        boolean z = false;
        if (!str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        int i = eox.d;
        return new epa(str, z, enpVar);
    }
}
