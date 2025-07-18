package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class mc extends mb {
    @Override // defpackage.ma, defpackage.jt
    public void p(mm mmVar, mm mmVar2, Window window, View view, boolean z, boolean z2) {
        mmVar.getClass();
        mmVar2.getClass();
        window.getClass();
        view.getClass();
        un.s(window);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        brb brbVar = new brb(window, view);
        brbVar.h(!z);
        brbVar.g(true ^ z2);
    }
}
