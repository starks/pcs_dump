package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftr extends frk {
    final /* synthetic */ ftv d;
    final /* synthetic */ int e;
    final /* synthetic */ fta f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftr(String str, ftv ftvVar, int i, fta ftaVar) {
        super(str);
        this.d = ftvVar;
        this.e = i;
        this.f = ftaVar;
    }

    @Override // defpackage.frk
    public final long a() {
        synchronized (this.d) {
            this.d.y.remove(Integer.valueOf(this.e));
        }
        return -1L;
    }
}
