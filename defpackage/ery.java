package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ery {
    final InputStream a = null;
    final byte[] b;
    final int c;
    final boolean d;

    public ery(InputStream inputStream, byte[] bArr, int i, boolean z) {
        this.b = bArr;
        this.c = i;
        this.d = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransactionData[");
        sb.append(this.c);
        sb.append("b array");
        sb.append(true != this.d ? "]" : "(last)]");
        return sb.toString();
    }
}
