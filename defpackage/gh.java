package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gh extends fp {
    final /* synthetic */ gl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(gl glVar, Context context, fy fyVar, View view) {
        super(context, fyVar, view, false);
        this.d = glVar;
        if (!fyVar.l.o()) {
            View view2 = glVar.i;
            this.a = view2 == null ? (View) glVar.h : view2;
        }
        e(glVar.n);
    }

    @Override // defpackage.fp
    protected final void c() {
        this.d.l = null;
        super.c();
    }
}
