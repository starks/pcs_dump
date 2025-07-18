package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class w extends ag {
    final /* synthetic */ ag a;
    final /* synthetic */ x b;

    public w(x xVar, ag agVar) {
        this.b = xVar;
        this.a = agVar;
    }

    @Override // defpackage.ag
    public final View a(int i) {
        ag agVar = this.a;
        if (agVar.b()) {
            return agVar.a(i);
        }
        Dialog dialog = this.b.c;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.ag
    public final boolean b() {
        return this.a.b() || this.b.d;
    }
}
