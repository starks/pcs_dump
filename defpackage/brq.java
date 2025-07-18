package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class brq {
    public final /* synthetic */ brr a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ long c;

    public /* synthetic */ brq(brr brrVar, byte[] bArr, long j) {
        this.a = brrVar;
        this.b = bArr;
        this.c = j;
    }

    public final void a(byte[] bArr, boolean z) {
        brr brrVar = this.a;
        long jAddAndGet = brrVar.d.addAndGet(brrVar.b.a() - brrVar.c.get());
        if (true != z) {
            jAddAndGet = 0;
        }
        long j = true == z ? this.c : 0L;
        byte[] bArr2 = this.b;
        if (true != z) {
            bArr2 = null;
        }
        brrVar.a.a(bArr, z, bArr2, j, jAddAndGet);
        if (z) {
            return;
        }
        brrVar.c.set(brrVar.b.a());
    }
}
