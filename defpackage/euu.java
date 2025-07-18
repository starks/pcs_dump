package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euu implements ety {
    public final ety a;
    public volatile boolean b;
    public List c = new ArrayList();

    public euu(ety etyVar) {
        this.a = etyVar;
    }

    private final void b(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.ety
    public final void a(eqo eqoVar, etx etxVar, epc epcVar) {
        b(new bsk(this, eqoVar, etxVar, epcVar, 4));
    }

    @Override // defpackage.ety
    public final void c(epc epcVar) {
        b(new cfz((Object) this, (Object) epcVar, 19, (byte[]) null));
    }

    @Override // defpackage.fbk
    public final void d(fbj fbjVar) {
        if (this.b) {
            this.a.d(fbjVar);
        } else {
            b(new cfz(this, fbjVar, 18, (short[]) null));
        }
    }

    @Override // defpackage.fbk
    public final void e() {
        if (this.b) {
            this.a.e();
        } else {
            b(new chg(this, 19, null));
        }
    }
}
