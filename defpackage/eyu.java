package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyu extends eoj {
    static final boolean a = evt.h("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    public static final /* synthetic */ int b = 0;

    @Override // defpackage.eny
    public final eoi a(eoa eoaVar) {
        return a ? new eyo(eoaVar) : new eyt(eoaVar);
    }

    @Override // defpackage.eoj
    public final epj b(Map map) {
        try {
            Boolean boolA = ewp.a(map, "shuffleAddressList");
            return new epj(a ? new eyk(boolA) : new eyq(boolA));
        } catch (RuntimeException e) {
            return new epj(eqo.l.d(e).e("Failed parsing configuration for ".concat("pick_first")));
        }
    }

    @Override // defpackage.eoj
    public final String c() {
        return "pick_first";
    }

    @Override // defpackage.eoj
    public final void d() {
    }

    @Override // defpackage.eoj
    public final void e() {
    }
}
