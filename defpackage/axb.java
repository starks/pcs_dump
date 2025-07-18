package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class axb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ab a;
    private final /* synthetic */ int b;

    public /* synthetic */ axb(axd axdVar, int i) {
        this.b = i;
        this.a = axdVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.b == 0) {
            ((axd) this.a).as();
            return;
        }
        x xVar = (x) this.a;
        Dialog dialog = xVar.c;
        if (dialog != null) {
            xVar.onCancel(dialog);
        }
    }

    public axb(x xVar, int i) {
        this.b = i;
        this.a = xVar;
    }
}
