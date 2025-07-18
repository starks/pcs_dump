package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmg implements bje {
    final /* synthetic */ aso a;
    final /* synthetic */ zl b;
    final /* synthetic */ aso c;
    final /* synthetic */ brb d;

    public bmg(zl zlVar, brb brbVar, aso asoVar, aso asoVar2) {
        this.b = zlVar;
        this.d = brbVar;
        this.a = asoVar;
        this.c = asoVar2;
    }

    @Override // defpackage.bje
    public final void a(Status status) {
        bjh bjhVar;
        if (!status.a()) {
            this.d.C(api.d(status));
            return;
        }
        zl zlVar = this.b;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) zlVar;
        aso.D(!basePendingResult.g, "Result has already been consumed.");
        zl zlVar2 = basePendingResult.i;
        aso.D(true, "Cannot await if then() has been called.");
        try {
            if (!((BasePendingResult) zlVar).d.await(0L, timeUnit)) {
                ((BasePendingResult) zlVar).l(Status.d);
            }
        } catch (InterruptedException unused) {
            basePendingResult.l(Status.b);
        }
        aso.D(basePendingResult.o(), "Result is not ready.");
        synchronized (basePendingResult.c) {
            aso.D(!((BasePendingResult) zlVar).g, "Result has already been consumed.");
            aso.D(((BasePendingResult) zlVar).o(), "Result is not ready.");
            bjhVar = ((BasePendingResult) zlVar).f;
            ((BasePendingResult) zlVar).f = null;
            ((BasePendingResult) zlVar).g = true;
        }
        bkw bkwVar = (bkw) basePendingResult.e.getAndSet(null);
        if (bkwVar != null) {
            bkwVar.a();
        }
        aso.F(bjhVar);
        this.d.D(null);
    }
}
