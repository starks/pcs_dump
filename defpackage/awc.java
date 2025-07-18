package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
class awc extends ab implements ekk {
    private ContextWrapper a;
    private boolean b;
    private volatile ejt c;
    private final Object d = new Object();
    private boolean ab = false;

    private final void al() {
        if (this.a == null) {
            this.a = new eke(super.r(), this);
            this.b = ebq.x(super.r());
        }
    }

    @Override // defpackage.ab
    public final void M(Activity activity) {
        super.M(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && ejt.a(contextWrapper) != activity) {
            z = false;
        }
        ebq.v(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        al();
        m();
    }

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ab
    public final LayoutInflater b(Bundle bundle) {
        LayoutInflater layoutInflaterAd = ad();
        return layoutInflaterAd.cloneInContext(new eke(layoutInflaterAd, this));
    }

    @Override // defpackage.ab
    public final void c(Context context) {
        super.c(context);
        al();
        m();
    }

    @Override // defpackage.ekk
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ejt a() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new ejt(this);
                }
            }
        }
        return this.c;
    }

    protected final void m() {
        if (this.ab) {
            return;
        }
        this.ab = true;
        Object objAS = aS();
        awz awzVar = (awz) this;
        alk alkVar = (alk) objAS;
        awzVar.ab = alkVar.a.c();
        awzVar.ac = (auh) alkVar.a.i.b();
        awzVar.ad = (avs) alkVar.a.o.b();
        awzVar.b = (cxc) alkVar.a.I.b();
    }

    @Override // defpackage.ab
    public final Context r() {
        if (super.r() == null && !this.b) {
            return null;
        }
        al();
        return this.a;
    }
}
