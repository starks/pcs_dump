package defpackage;

import java.net.ProxySelector;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyv implements csg {
    private final /* synthetic */ int a;

    public eyv(int i) {
        this.a = i;
    }

    @Override // defpackage.csg
    public final /* synthetic */ Object a() {
        return this.a != 0 ? new csf() : ProxySelector.getDefault();
    }
}
