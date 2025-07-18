package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwi {
    public static final byte[] a = fwv.c("0123456789abcdef");

    public static final String a(fvk fvkVar, long j) throws EOFException {
        if (j > 0) {
            long j2 = (-1) + j;
            if (fvkVar.c(j2) == 13) {
                String strM = fvkVar.m(j2);
                fvkVar.D(2L);
                return strM;
            }
        }
        String strM2 = fvkVar.m(j);
        fvkVar.D(1L);
        return strM2;
    }
}
