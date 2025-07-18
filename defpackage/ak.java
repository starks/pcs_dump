package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ak implements View.OnAttachStateChangeListener {
    final /* synthetic */ bc a;
    final /* synthetic */ al b;

    public ak(al alVar, bc bcVar) {
        this.b = alVar;
        this.a = bcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        bc bcVar = this.a;
        bcVar.d();
        bx.c((ViewGroup) bcVar.a.O.getParent(), this.b.a).f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
