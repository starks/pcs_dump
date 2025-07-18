package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lj implements View.OnClickListener {
    final et a;
    final /* synthetic */ ll b;

    public lj(ll llVar) {
        this.b = llVar;
        this.a = new et(llVar.a.getContext(), llVar.b);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ll llVar = this.b;
        Window.Callback callback = llVar.c;
        if (callback == null || !llVar.d) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
