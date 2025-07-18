package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddr extends ddq {
    final dds a;
    final /* synthetic */ ddt b;

    public ddr(ddt ddtVar, int i) {
        this.b = ddtVar;
        this.a = new dds(i);
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea a(ByteBuffer byteBuffer) {
        this.a.b(byteBuffer);
        return this;
    }

    @Override // defpackage.dea
    public final void d() {
        this.a.write(0);
    }

    @Override // defpackage.ddq, defpackage.dea
    public final dea e(byte[] bArr, int i) {
        this.a.write(bArr, 0, i);
        return this;
    }

    @Override // defpackage.dea
    public final ddy l() {
        dds ddsVar = this.a;
        return this.b.c(ddsVar.c(), ddsVar.a());
    }
}
