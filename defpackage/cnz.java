package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnz extends xi {
    private final int a;

    public cnz(int i) {
        this.a = i;
    }

    @Override // defpackage.xi
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = coa.k;
        float[] fArr = ((coa) obj).j;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.xi
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        int i = coa.k;
        coa coaVar = (coa) obj;
        float[] fArr = coaVar.j;
        if (fArr != null) {
            fArr[this.a] = f;
            coaVar.invalidateSelf();
        }
    }
}
