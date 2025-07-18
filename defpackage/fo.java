package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fo implements PopupWindow.OnDismissListener {
    final /* synthetic */ fp a;

    public fo(fp fpVar) {
        this.a = fpVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
