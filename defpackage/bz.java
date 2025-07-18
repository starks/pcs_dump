package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bz extends Activity implements yz, tt {
    private final za a;

    public bz() {
        new oc((byte[]) null);
        this.a = new za(this);
    }

    @Override // defpackage.yz
    public final yw E() {
        return this.a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = ut.a;
        return ul.k(this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        getWindow().getDecorView().getClass();
        int[] iArr = ut.a;
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // defpackage.tt
    public final boolean f(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zl zlVar = zn.a;
        zl.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.a.e(yv.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
