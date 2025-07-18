package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vt extends uq {
    final WindowInsetsController a;
    protected Window b;

    public vt(Window window) {
        WindowInsetsController insetsController = window.getInsetsController();
        new oc();
        this.a = insetsController;
        this.b = window;
    }

    @Override // defpackage.uq
    public final void g(boolean z) {
        if (z) {
            if (this.b != null) {
                v(16);
            }
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            if (this.b != null) {
                w(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.uq
    public final void h(boolean z) {
        if (z) {
            if (this.b != null) {
                v(8192);
            }
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            if (this.b != null) {
                w(8192);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    protected final void v(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    protected final void w(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    public vt(Window window, brb brbVar, ul ulVar) {
        this(window);
    }

    public vt(Window window, brb brbVar, ul ulVar, byte[] bArr) {
        this(window, brbVar, ulVar);
    }
}
