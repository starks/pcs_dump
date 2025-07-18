package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class y extends ag {
    final /* synthetic */ ab a;

    public y(ab abVar) {
        this.a = abVar;
    }

    @Override // defpackage.ag
    public final View a(int i) {
        View view = this.a.O;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.a + " does not have a view");
    }

    @Override // defpackage.ag
    public final boolean b() {
        return this.a.O != null;
    }
}
