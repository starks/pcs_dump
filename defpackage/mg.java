package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mg implements OnBackAnimationCallback {
    final /* synthetic */ fiy a;
    final /* synthetic */ fiy b;
    final /* synthetic */ fin c;
    final /* synthetic */ fin d;

    public mg(fiy fiyVar, fiy fiyVar2, fin finVar, fin finVar2) {
        this.a = fiyVar;
        this.b = fiyVar2;
        this.c = finVar;
        this.d = finVar2;
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.d.a();
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.c.a();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.b.a(new lq(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.a.a(new lq(backEvent));
    }
}
