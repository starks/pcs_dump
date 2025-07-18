package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euq extends ebz {
    public volatile boolean b;
    public List c;
    public final ebz d;

    public euq(ebz ebzVar) {
        super(null, null);
        this.c = new ArrayList();
        this.d = ebzVar;
    }

    private final void D(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
            } else {
                this.c.add(runnable);
            }
        }
    }

    @Override // defpackage.ebz
    public final void A(Object obj) {
        if (this.b) {
            this.d.A(obj);
        } else {
            D(new cfz(this, obj, 11, (short[]) null));
        }
    }

    @Override // defpackage.ebz
    public final void B() {
        if (this.b) {
            this.d.B();
        } else {
            D(new chg(this, 11, null));
        }
    }

    @Override // defpackage.ebz
    public final void y(eqo eqoVar, epc epcVar) {
        D(new n(this, eqoVar, epcVar, 9, (char[]) null));
    }

    @Override // defpackage.ebz
    public final void z(epc epcVar) {
        if (this.b) {
            this.d.z(epcVar);
        } else {
            D(new cfz((Object) this, (Object) epcVar, 10, (byte[]) null));
        }
    }
}
