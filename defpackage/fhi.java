package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhi extends fjt implements fjc {
    final /* synthetic */ fhq[] a;
    final /* synthetic */ fjw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhi(fhq[] fhqVarArr, fjw fjwVar) {
        super(2);
        this.a = fhqVarArr;
        this.b = fjwVar;
    }

    @Override // defpackage.fjc
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((ffz) obj).getClass();
        fjw fjwVar = this.b;
        int i = fjwVar.a;
        fjwVar.a = i + 1;
        this.a[i] = (fhn) obj2;
        return ffz.a;
    }
}
