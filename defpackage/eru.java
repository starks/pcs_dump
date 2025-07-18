package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eru {
    private static final int a;
    private static final int b;
    private static final Queue c;

    static {
        int iMax = Math.max(16384, 8192);
        a = iMax;
        int i = 131072 / iMax;
        b = i;
        c = new LinkedBlockingQueue(i);
    }

    static void a(byte[] bArr) {
        if (bArr.length == a) {
            c.offer(bArr);
        }
    }

    static byte[] b() {
        return c(a);
    }

    static byte[] c(int i) {
        byte[] bArr;
        return (i != a || (bArr = (byte[]) c.poll()) == null) ? new byte[i] : bArr;
    }
}
