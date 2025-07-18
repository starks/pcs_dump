package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eev extends edi {
    private final efb a;

    public eev(efb efbVar) {
        this.a = efbVar;
    }

    @Override // defpackage.edi
    public final /* bridge */ /* synthetic */ egi d(byte[] bArr, int i, een eenVar) {
        return efb.parsePartialFrom(this.a, bArr, 0, i, eenVar);
    }

    @Override // defpackage.egp
    public final /* bridge */ /* synthetic */ Object e(eee eeeVar, een eenVar) {
        return efb.parsePartialFrom(this.a, eeeVar, eenVar);
    }
}
