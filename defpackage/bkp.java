package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bkp implements Runnable {
    private final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
                return;
            case 3:
                ceu.e();
                return;
            case 4:
                Object objRemove = cqa.d.remove();
                if (objRemove == cqa.f) {
                    cqa.e.pop();
                    return;
                } else {
                    cqa.e.push((cqn) objRemove);
                    return;
                }
            case 5:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
            default:
                throw null;
        }
    }
}
