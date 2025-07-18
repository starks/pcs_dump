package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class um implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ ua a;

    public um(View view, ua uaVar) {
        this.a = uaVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.a(view, vs.n(windowInsets, view)).e();
    }
}
