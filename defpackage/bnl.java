package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnl extends bnp {
    final /* synthetic */ Map a;
    final /* synthetic */ fcy b;
    final /* synthetic */ fuu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bnl(fcy fcyVar, String str, Map map, fuu fuuVar) {
        super(str);
        this.a = map;
        this.c = fuuVar;
        this.b = fcyVar;
    }

    @Override // defpackage.bnp
    protected final void a(bno bnoVar) {
        ((Handler) this.b.c).removeCallbacksAndMessages(this);
        fcy fcyVar = this.b;
        new bnm((Context) fcyVar.b, bnoVar, (Handler) fcyVar.c, this.a, this.e, this.g, (bnr) fcyVar.a, this.c).b();
    }
}
