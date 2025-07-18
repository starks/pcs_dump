package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class x extends ab implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean ag;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    public Dialog c;
    private final DialogInterface.OnCancelListener ab = new axb(this, 1);
    public final DialogInterface.OnDismissListener a = new u(this);
    private int ac = 0;
    private int ad = 0;
    private boolean ae = true;
    public boolean b = true;
    private int af = -1;
    private final zj ah = new v(this);
    public boolean d = false;

    @Override // defpackage.ab
    public final ag aN() {
        return new w(this, new y(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:10:0x0015, B:12:0x0021, B:22:0x0039, B:24:0x0041, B:25:0x0048, B:18:0x002b, B:20:0x0031, B:21:0x0036, B:26:0x0060), top: B:42:0x0015 }] */
    @Override // defpackage.ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater b(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = r6.ad()
            boolean r0 = r6.b
            r1 = 2
            if (r0 == 0) goto L80
            boolean r0 = r6.ag
            if (r0 == 0) goto Lf
            goto L80
        Lf:
            boolean r0 = r6.d
            if (r0 != 0) goto L6a
            r0 = 0
            r2 = 1
            r6.ag = r2     // Catch: java.lang.Throwable -> L66
            android.app.Dialog r3 = r6.m()     // Catch: java.lang.Throwable -> L66
            r6.c = r3     // Catch: java.lang.Throwable -> L66
            boolean r4 = r6.b     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L60
            int r4 = r6.ac     // Catch: java.lang.Throwable -> L66
            if (r4 == r2) goto L36
            if (r4 == r1) goto L36
            r5 = 3
            if (r4 == r5) goto L2b
            goto L39
        L2b:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L36
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L66
        L36:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L66
        L39:
            android.content.Context r3 = r6.r()     // Catch: java.lang.Throwable -> L66
            boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L48
            android.app.Dialog r4 = r6.c     // Catch: java.lang.Throwable -> L66
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L66
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L66
        L48:
            android.app.Dialog r3 = r6.c     // Catch: java.lang.Throwable -> L66
            boolean r4 = r6.ae     // Catch: java.lang.Throwable -> L66
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L66
            android.app.Dialog r3 = r6.c     // Catch: java.lang.Throwable -> L66
            android.content.DialogInterface$OnCancelListener r4 = r6.ab     // Catch: java.lang.Throwable -> L66
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L66
            android.app.Dialog r3 = r6.c     // Catch: java.lang.Throwable -> L66
            android.content.DialogInterface$OnDismissListener r4 = r6.a     // Catch: java.lang.Throwable -> L66
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L66
            r6.d = r2     // Catch: java.lang.Throwable -> L66
            goto L63
        L60:
            r2 = 0
            r6.c = r2     // Catch: java.lang.Throwable -> L66
        L63:
            r6.ag = r0
            goto L6a
        L66:
            r7 = move-exception
            r6.ag = r0
            throw r7
        L6a:
            boolean r0 = defpackage.ax.X(r1)
            if (r0 == 0) goto L73
            r6.toString()
        L73:
            android.app.Dialog r6 = r6.c
            if (r6 == 0) goto L89
            android.content.Context r6 = r6.getContext()
            android.view.LayoutInflater r6 = r7.cloneInContext(r6)
            return r6
        L80:
            boolean r0 = defpackage.ax.X(r1)
            if (r0 == 0) goto L89
            r6.toString()
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x.b(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // defpackage.ab
    public final void c(Context context) {
        super.c(context);
        zi ziVar = this.Z;
        zh.b("observeForever");
        zj zjVar = this.ah;
        ze zeVar = new ze(ziVar, zjVar);
        zg zgVar = (zg) ziVar.c.f(zjVar, zeVar);
        if (zgVar instanceof zf) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zgVar == null) {
            zeVar.d(true);
        }
        if (this.ak) {
            return;
        }
        this.aj = false;
    }

    @Override // defpackage.ab
    public void d(Bundle bundle) {
        super.d(bundle);
        new Handler();
        this.b = this.E == 0;
        if (bundle != null) {
            this.ac = bundle.getInt("android:style", 0);
            this.ad = bundle.getInt("android:theme", 0);
            this.ae = bundle.getBoolean("android:cancelable", true);
            this.b = bundle.getBoolean("android:showsDialog", this.b);
            this.af = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // defpackage.ab
    public final void e() {
        super.e();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ai = true;
            dialog.setOnDismissListener(null);
            this.c.dismiss();
            if (!this.aj) {
                onDismiss(this.c);
            }
            this.c = null;
            this.d = false;
        }
    }

    @Override // defpackage.ab
    public final void f() {
        super.f();
        if (!this.ak && !this.aj) {
            this.aj = true;
        }
        this.Z.h(this.ah);
    }

    @Override // defpackage.ab
    public void g(Bundle bundle) {
        Dialog dialog = this.c;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.ac;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.ad;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.ae) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.b) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.af;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // defpackage.ab
    public final void h() {
        super.h();
        Dialog dialog = this.c;
        if (dialog != null) {
            this.ai = false;
            dialog.show();
            View decorView = this.c.getWindow().getDecorView();
            us.e(decorView, this);
            vq.e(decorView, this);
            up.d(decorView, this);
        }
    }

    @Override // defpackage.ab
    public final void i() {
        super.i();
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // defpackage.ab
    public final void j(Bundle bundle) {
        Bundle bundle2;
        super.j(bundle);
        if (this.c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.c.onRestoreInstanceState(bundle2);
    }

    @Override // defpackage.ab
    public final void k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.k(layoutInflater, viewGroup, bundle);
        if (this.O != null || this.c == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.c.onRestoreInstanceState(bundle2);
    }

    public final void l(ax axVar, String str) {
        this.aj = false;
        this.ak = true;
        d dVar = new d(axVar);
        dVar.o();
        dVar.f(0, this, str, 1);
        dVar.j();
    }

    public Dialog m() {
        if (ax.X(3)) {
            toString();
        }
        return new ly(s(), this.ad);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ai) {
            return;
        }
        if (ax.X(3)) {
            toString();
        }
        if (this.aj) {
            return;
        }
        this.aj = true;
        this.ak = false;
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.c.dismiss();
        }
        this.ai = true;
        if (this.af < 0) {
            d dVar = new d(B());
            dVar.o();
            dVar.b(this);
            dVar.a(true, true);
            return;
        }
        ax axVarB = B();
        int i = this.af;
        if (i < 0) {
            throw new IllegalArgumentException(a.x(i, "Bad id: "));
        }
        axVarB.F(new av(axVarB, i), true);
        this.af = -1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
