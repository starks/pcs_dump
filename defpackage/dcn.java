package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcn extends dcr {
    public static final dcn a = new dcn(dct.a);
    public final AtomicReference b;

    public dcn(dcr dcrVar) {
        this.b = new AtomicReference(dcrVar);
    }

    @Override // defpackage.dcr
    public final dbg a() {
        return ((dcr) this.b.get()).a();
    }

    @Override // defpackage.dcr
    public final dcy b() {
        return ((dcr) this.b.get()).b();
    }

    @Override // defpackage.dcr
    public final void c(String str, Level level, boolean z) {
        ((dcr) this.b.get()).c(str, level, z);
    }
}
