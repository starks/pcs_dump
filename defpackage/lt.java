package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lt implements yx {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) {
        Window window;
        View viewPeekDecorView;
        View view;
        int i = this.b;
        if (i == 0) {
            if (yuVar != yu.ON_STOP || (window = ((lx) this.a).getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                return;
            }
            viewPeekDecorView.cancelPendingInputEvents();
            return;
        }
        if (i == 1) {
            if (yuVar != yu.ON_STOP || (view = ((ab) this.a).O) == null) {
                return;
            }
            view.cancelPendingInputEvents();
            return;
        }
        if (i == 2) {
            if (yuVar == yu.ON_DESTROY) {
                lx lxVar = (lx) this.a;
                lxVar.f.b = null;
                if (!lxVar.isChangingConfigurations()) {
                    lxVar.ak().aj();
                }
                lxVar.i.a();
                return;
            }
            return;
        }
        if (i == 3) {
            ((lx) this.a).x();
            ((bz) this.a).E().c(this);
            return;
        }
        if (i != 4) {
            if (yuVar == yu.ON_DESTROY) {
                eke ekeVar = (eke) this.a;
                ekeVar.a = null;
                ekeVar.b = null;
                ekeVar.c = null;
                return;
            }
            return;
        }
        Object obj = this.a;
        if (yuVar == yu.ON_START) {
            ((aez) obj).f = true;
        } else if (yuVar == yu.ON_STOP) {
            ((aez) obj).f = false;
        }
    }

    public lt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
