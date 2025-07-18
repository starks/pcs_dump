package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xt implements KeyListener {
    private final KeyListener a;
    private final uo b;

    public xt(KeyListener keyListener) {
        uo uoVar = new uo(null);
        this.a = keyListener;
        this.b = uoVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.a.getInputType();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[RETURN] */
    @Override // android.text.method.KeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
        /*
            r3 = this;
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L10
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto Lb
            goto L1a
        Lb:
            boolean r0 = defpackage.un.t(r5, r7, r1)
            goto L14
        L10:
            boolean r0 = defpackage.un.t(r5, r7, r2)
        L14:
            if (r0 == 0) goto L1a
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            goto L22
        L1a:
            android.text.method.KeyListener r3 = r3.a
            boolean r3 = r3.onKeyDown(r4, r5, r6, r7)
            if (r3 == 0) goto L23
        L22:
            return r1
        L23:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xt.onKeyDown(android.view.View, android.text.Editable, int, android.view.KeyEvent):boolean");
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
