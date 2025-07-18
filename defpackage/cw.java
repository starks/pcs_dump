package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cw extends es {
    public boolean a;
    public boolean b;
    final /* synthetic */ de c;
    private boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(de deVar, Window.Callback callback) {
        super(callback);
        this.c = deVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.e = true;
            callback.onContentChanged();
        } finally {
            this.e = false;
        }
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.d.dispatchKeyEvent(keyEvent) : this.c.H(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // defpackage.es, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L69
            de r5 = r5.c
            int r0 = r6.getKeyCode()
            cc r2 = r5.b()
            r3 = 0
            if (r2 == 0) goto L3c
            do r2 = (defpackage.C0000do) r2
            dn r2 = r2.f
            if (r2 != 0) goto L1b
            goto L3c
        L1b:
            if (r6 == 0) goto L22
            int r4 = r6.getDeviceId()
            goto L23
        L22:
            r4 = -1
        L23:
            ff r2 = r2.a
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r3
        L32:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
            if (r0 == 0) goto L3c
            goto L69
        L3c:
            dc r0 = r5.z
            if (r0 == 0) goto L51
            int r2 = r6.getKeyCode()
            boolean r0 = r5.Q(r0, r2, r6)
            if (r0 == 0) goto L51
            dc r5 = r5.z
            if (r5 == 0) goto L69
            r5.l = r1
            goto L69
        L51:
            dc r0 = r5.z
            if (r0 != 0) goto L68
            dc r0 = r5.P(r3)
            r5.K(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.Q(r0, r2, r6)
            r0.k = r3
            if (r5 != 0) goto L69
        L68:
            return r3
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.e) {
            this.d.onContentChanged();
        }
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof ff)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        cc ccVarB;
        super.onMenuOpened(i, menu);
        if (i == 108 && (ccVarB = this.c.b()) != null) {
            ccVarB.b(true);
        }
        return true;
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.b) {
            this.d.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        de deVar = this.c;
        if (i == 108) {
            cc ccVarB = deVar.b();
            if (ccVarB != null) {
                ccVarB.b(false);
                return;
            }
            return;
        }
        if (i == 0) {
            dc dcVarP = deVar.P(0);
            if (dcVarP.m) {
                deVar.A(dcVarP, false);
            }
        }
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        ff ffVar = menu instanceof ff ? (ff) menu : null;
        if (i == 0) {
            if (ffVar == null) {
                return false;
            }
            i = 0;
        }
        if (ffVar != null) {
            ffVar.j = true;
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (ffVar != null) {
            ffVar.j = false;
        }
        return zOnPreparePanel;
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        ff ffVar = this.c.P(0).h;
        if (ffVar != null) {
            super.onProvideKeyboardShortcuts(list, ffVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.es, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        de deVar = this.c;
        if (!deVar.r || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        el elVar = new el(deVar.h, callback);
        de deVar2 = this.c;
        ei eiVar = deVar2.n;
        if (eiVar != null) {
            eiVar.f();
        }
        cu cuVar = new cu(deVar2, elVar);
        cc ccVarB = deVar2.b();
        if (ccVarB != null) {
            C0000do c0000do = (C0000do) ccVarB;
            dn dnVar = c0000do.f;
            if (dnVar != null) {
                dnVar.f();
            }
            c0000do.b.k(false);
            c0000do.d.i();
            dn dnVar2 = new dn(c0000do, c0000do.d.getContext(), cuVar);
            dnVar2.a.s();
            try {
                if (dnVar2.b.c(dnVar2, dnVar2.a)) {
                    c0000do.f = dnVar2;
                    dnVar2.g();
                    c0000do.d.h(dnVar2);
                    c0000do.g(true);
                } else {
                    dnVar2 = null;
                }
                deVar2.n = dnVar2;
            } finally {
                dnVar2.a.r();
            }
        }
        if (deVar2.n == null) {
            deVar2.n = deVar2.w(cuVar);
        }
        deVar2.G();
        ei eiVar2 = deVar2.n;
        if (eiVar2 != null) {
            return elVar.e(eiVar2);
        }
        return null;
    }
}
