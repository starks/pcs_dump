package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euc implements eue {
    private final /* synthetic */ int a;

    public euc(int i) {
        this.a = i;
    }

    @Override // defpackage.euf
    public final /* synthetic */ int a(eyx eyxVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            eyxVar.l(i);
            return 0;
        }
        if (i3 == 1) {
            return eyxVar.e();
        }
        if (i3 == 2) {
            eyxVar.k((byte[]) obj, i2, i);
            return i2 + i;
        }
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        eyxVar.i(byteBuffer);
        byteBuffer.limit(iLimit);
        return 0;
    }
}
