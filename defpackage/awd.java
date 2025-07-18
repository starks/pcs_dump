package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class awd extends abp implements ekk {
    private final Object ab = new Object();
    private boolean ac = false;
    private ContextWrapper b;
    private boolean c;
    private volatile ejt d;

    private final void as() {
        if (this.b == null) {
            this.b = new eke(super.r(), this);
            this.c = ebq.x(super.r());
        }
    }

    @Override // defpackage.ab
    public final void M(Activity activity) {
        super.M(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && ejt.a(contextWrapper) != activity) {
            z = false;
        }
        ebq.v(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        as();
        ar();
    }

    @Override // defpackage.ekj
    public final Object aS() {
        return a().aS();
    }

    @Override // defpackage.ekk
    /* renamed from: aq, reason: merged with bridge method [inline-methods] */
    public final ejt a() {
        if (this.d == null) {
            synchronized (this.ab) {
                if (this.d == null) {
                    this.d = new ejt(this);
                }
            }
        }
        return this.d;
    }

    protected final void ar() {
        if (this.ac) {
            return;
        }
        this.ac = true;
        Object objAS = aS();
        axd axdVar = (axd) this;
        alk alkVar = (alk) objAS;
        axdVar.d = alkVar.a.c();
        axdVar.ab = (auh) alkVar.a.i.b();
    }

    @Override // defpackage.ab
    public final LayoutInflater b(Bundle bundle) {
        LayoutInflater layoutInflaterAd = ad();
        return layoutInflaterAd.cloneInContext(new eke(layoutInflaterAd, this));
    }

    @Override // defpackage.ab
    public final void c(Context context) {
        super.c(context);
        as();
        ar();
    }

    @Override // defpackage.ab
    public final Context r() {
        if (super.r() == null && !this.c) {
            return null;
        }
        as();
        return this.b;
    }
}
