package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
class ma extends jt {
    @Override // defpackage.jt
    public void p(mm mmVar, mm mmVar2, Window window, View view, boolean z, boolean z2) {
        mmVar.getClass();
        mmVar2.getClass();
        window.getClass();
        view.getClass();
        un.s(window);
        window.setStatusBarColor(mmVar.a(z));
        window.setNavigationBarColor(mmVar2.a(z2));
        brb brbVar = new brb(window, view);
        brbVar.h(!z);
        brbVar.g(!z2);
    }
}
