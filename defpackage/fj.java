package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fj extends FrameLayout implements ej {
    final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public fj(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.ej
    public final void a() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.ej
    public final void b() {
        this.a.onActionViewExpanded();
    }
}
