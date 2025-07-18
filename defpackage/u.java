package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class u implements DialogInterface.OnDismissListener {
    final /* synthetic */ x a;

    public u(x xVar) {
        this.a = xVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        x xVar = this.a;
        Dialog dialog = xVar.c;
        if (dialog != null) {
            xVar.onDismiss(dialog);
        }
    }
}
