package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ly extends Dialog implements yz, ml, aey {
    private za a;
    private final aex b;
    private final mk c;

    public ly(Context context, int i) {
        super(context, i);
        this.b = up.e(this);
        this.c = new mk(new ls(this, 4));
    }

    private final za a() {
        za zaVar = this.a;
        if (zaVar != null) {
            return zaVar;
        }
        za zaVar2 = new za(this);
        this.a = zaVar2;
        return zaVar2;
    }

    public static final void f(ly lyVar) {
        super.onBackPressed();
    }

    @Override // defpackage.yz
    public final yw E() {
        return a();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.aey
    public final fsc aj() {
        return this.b.b;
    }

    @Override // defpackage.ml
    public final mk d() {
        throw null;
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        us.e(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        jt.H(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        up.d(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.b();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.getClass();
        this.c.c(onBackInvokedDispatcher);
        this.b.c(bundle);
        a().d(yu.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.d(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        a().d(yu.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        a().d(yu.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
