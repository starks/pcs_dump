package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqn implements dkx {
    private final dkx a;
    private final byte[] b;

    public dqn(dkx dkxVar, byte[] bArr) {
        this.a = dkxVar;
        this.b = bArr;
    }

    @Override // defpackage.dkx
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        dkx dkxVar = this.a;
        return length == 0 ? dkxVar.a(bArr, bArr2) : dcr.al(bArr3, dkxVar.a(bArr, bArr2));
    }
}
