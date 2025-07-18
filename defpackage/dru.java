package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dru {
    public static final dwt a = dwt.b(new byte[0]);

    public static final dwt a(int i) {
        return dwt.b(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final dwt b(int i) {
        return dwt.b(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
