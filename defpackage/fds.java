package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fds implements fdv {
    public static final Logger a = Logger.getLogger(fdp.class.getName());
    public static final fvn b = fvn.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public static int a(int i, byte b2, short s) throws IOException {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        throw c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    public static int b(fvm fvmVar) {
        return (fvmVar.d() & 255) | ((fvmVar.d() & 255) << 16) | ((fvmVar.d() & 255) << 8);
    }

    public static IOException c(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    public static IllegalArgumentException d(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    @Override // defpackage.fdv
    public final fdq e(fvm fvmVar) {
        return new fdq(fvmVar);
    }

    @Override // defpackage.fdv
    public final fdj f(fvl fvlVar) {
        return new fdr(fvlVar);
    }
}
