package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dl extends va {
    final /* synthetic */ C0000do a;

    public dl(C0000do c0000do) {
        this.a = c0000do;
    }

    @Override // defpackage.va, defpackage.uz
    public final void a() {
        View view;
        C0000do c0000do = this.a;
        if (c0000do.j && (view = c0000do.e) != null) {
            view.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        C0000do c0000do2 = this.a;
        c0000do2.l = null;
        eh ehVar = c0000do2.h;
        if (ehVar != null) {
            ehVar.a(c0000do2.g);
            c0000do2.g = null;
            c0000do2.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            int[] iArr = ut.a;
            ul.b(actionBarOverlayLayout);
        }
    }
}
