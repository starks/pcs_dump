package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bro extends buc {
    private bqc a;

    @Override // defpackage.bud
    public final synchronized void a(Status status, long j) {
        bqc bqcVar = this.a;
        bqcVar.getClass();
        bqcVar.a(status.e, status.f);
        this.a = null;
    }

    @Override // defpackage.bud
    public final synchronized void b(bpf bpfVar, bpf bpfVar2, long j) {
        byte[] bArr = bpfVar == null ? null : (byte[]) bpe.a(bpfVar);
        byte[] bArr2 = bpfVar2 == null ? null : (byte[]) bpe.a(bpfVar2);
        bqc bqcVar = this.a;
        bqcVar.getClass();
        bqcVar.b(bArr, bArr2);
        this.a = null;
    }

    final synchronized void c(bqc bqcVar) {
        this.a = bqcVar;
    }
}
