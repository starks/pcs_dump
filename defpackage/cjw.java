package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjw implements ua {
    final /* synthetic */ CollapsingToolbarLayout a;

    public cjw(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    @Override // defpackage.ua
    public final vs a(View view, vs vsVar) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.a;
        vs vsVar2 = true != collapsingToolbarLayout.getFitsSystemWindows() ? null : vsVar;
        if (!Objects.equals(collapsingToolbarLayout.f, vsVar2)) {
            collapsingToolbarLayout.f = vsVar2;
            collapsingToolbarLayout.requestLayout();
        }
        return vsVar.k();
    }
}
