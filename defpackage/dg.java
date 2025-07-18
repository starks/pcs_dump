package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dg extends ly implements cn {
    private cp a;
    private final tt b;

    public dg(Context context, int i) {
        super(context, a(context, i));
        this.b = new tt() { // from class: df
            @Override // defpackage.tt
            public final boolean f(KeyEvent keyEvent) {
                return this.a.c(keyEvent);
            }
        };
        cp cpVarB = b();
        ((de) cpVarB).C = a(context, i);
        cpVarB.p();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    private final void g() {
        us.e(getWindow().getDecorView(), this);
        up.d(getWindow().getDecorView(), this);
        jt.H(getWindow().getDecorView(), this);
    }

    @Override // defpackage.ly, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        b().d(view, layoutParams);
    }

    public final cp b() {
        if (this.a == null) {
            int i = cp.b;
            this.a = new de(getContext(), getWindow(), this, this);
        }
        return this.a;
    }

    final boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        b().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        return ul.k(this.b, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        return b().c(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        b().f();
    }

    @Override // defpackage.ly, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        b().e();
        super.onCreate(bundle);
        b().p();
    }

    @Override // defpackage.ly, android.app.Dialog
    protected final void onStop() {
        super.onStop();
        b().h();
    }

    @Override // defpackage.ly, android.app.Dialog
    public final void setContentView(int i) {
        g();
        b().j(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        b().m(getContext().getString(i));
    }

    @Override // defpackage.ly, android.app.Dialog
    public final void setContentView(View view) {
        g();
        b().k(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().m(charSequence);
    }

    @Override // defpackage.ly, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        b().l(view, layoutParams);
    }
}
