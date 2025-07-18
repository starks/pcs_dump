package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddp implements ddz {
    @Override // defpackage.ddz
    public final ddy a(byte[] bArr) {
        return c(bArr, bArr.length);
    }

    public dea b(int i) {
        clq.y(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return d();
    }

    public ddy c(byte[] bArr, int i) {
        clq.E(0, i, bArr.length);
        return b(i).e(bArr, i).l();
    }
}
