package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gk extends fp {
    final /* synthetic */ gl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(gl glVar, Context context, ff ffVar, View view) {
        super(context, ffVar, view, true);
        this.d = glVar;
        this.b = 8388613;
        e(glVar.n);
    }

    @Override // defpackage.fp
    protected final void c() {
        ff ffVar = this.d.c;
        if (ffVar != null) {
            ffVar.close();
        }
        this.d.k = null;
        super.c();
    }
}
