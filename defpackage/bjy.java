package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjy implements bje {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bjy(bnz bnzVar, BasePendingResult basePendingResult, int i) {
        this.c = i;
        this.a = basePendingResult;
        this.b = bnzVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.bje
    public final void a(Status status) {
        if (this.c != 0) {
            ThreadLocal threadLocal = BasePendingResult.b;
            new bkd(this.a, status, 1).run();
        } else {
            ((bnz) this.b).b.remove(this.a);
        }
    }
}
