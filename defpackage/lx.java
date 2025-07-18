package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import com.google.android.as.oss.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lx extends bz implements yz, aad, ys, aey, ml, mt, rn, ro, br, bs, tu {
    private final aex a;
    private final ffo b;
    private final CopyOnWriteArrayList c;
    private final CopyOnWriteArrayList d;
    private final CopyOnWriteArrayList e;
    public final mn f = new mn();
    public final ms g;
    public final CopyOnWriteArrayList h;
    public final lv i;
    private final CopyOnWriteArrayList j;
    private final CopyOnWriteArrayList k;
    private boolean l;
    private boolean m;
    private final ffo n;
    private final fcy o;
    private fsc p;

    public lx() {
        int i = 0;
        this.o = new fcy(new ls(this, i));
        aex aexVarE = up.e(this);
        this.a = aexVarE;
        this.i = new lv(this);
        this.b = new ffw(new lw(this, 0));
        new AtomicInteger();
        this.g = new ms(null);
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        if (E() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        E().b(new lt(this, i));
        int i2 = 2;
        E().b(new lt(this, i2));
        E().b(new lt(this, 3, null));
        aexVarE.b();
        zs.b(this);
        aj().ag("android:support:activity-result", new am(this, 3));
        w(new cl(this, i2));
        this.n = new ffw(new lw(this, 2));
    }

    public static final void z(lx lxVar) {
        Bundle bundleAf = lxVar.aj().af("android:support:activity-result");
        if (bundleAf != null) {
            ms msVar = lxVar.g;
            ArrayList<Integer> integerArrayList = bundleAf.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleAf.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleAf.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                msVar.d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleAf.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                msVar.g.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (msVar.b.containsKey(str)) {
                    Integer num = (Integer) msVar.b.remove(str);
                    if (!msVar.g.containsKey(str)) {
                        msVar.a.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                msVar.a(iIntValue, str2);
            }
        }
    }

    public final acv A() {
        return (acv) this.b.a();
    }

    @Override // defpackage.ys
    public final aag F() {
        aah aahVar = new aah((byte[]) null);
        if (getApplication() != null) {
            aaf aafVar = zy.a;
            Application application = getApplication();
            application.getClass();
            aahVar.a(aafVar, application);
        }
        aahVar.a(zs.a, this);
        aahVar.a(zs.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            aahVar.a(zs.c, extras);
        }
        return aahVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.i.b(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.aey
    public final fsc aj() {
        return this.a.b;
    }

    @Override // defpackage.aad
    public final fsc ak() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        x();
        fsc fscVar = this.p;
        fscVar.getClass();
        return fscVar;
    }

    @Override // defpackage.ml
    public final mk d() {
        return (mk) this.n.a();
    }

    @Override // defpackage.mt
    public final ms e() {
        throw null;
    }

    @Override // defpackage.rn
    public final void g(tj tjVar) {
        tjVar.getClass();
        this.c.add(tjVar);
    }

    @Override // defpackage.br
    public final void h(tj tjVar) {
        tjVar.getClass();
        this.e.add(tjVar);
    }

    @Override // defpackage.bs
    public final void i(tj tjVar) {
        tjVar.getClass();
        this.j.add(tjVar);
    }

    @Override // defpackage.ro
    public final void j(tj tjVar) {
        tjVar.getClass();
        this.d.add(tjVar);
    }

    @Override // defpackage.rn
    public final void l(tj tjVar) {
        tjVar.getClass();
        this.c.remove(tjVar);
    }

    @Override // defpackage.br
    public final void m(tj tjVar) {
        tjVar.getClass();
        this.e.remove(tjVar);
    }

    @Override // defpackage.bs
    public final void n(tj tjVar) {
        tjVar.getClass();
        this.j.remove(tjVar);
    }

    @Override // defpackage.ro
    public final void o(tj tjVar) {
        tjVar.getClass();
        this.d.remove(tjVar);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.g.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        d().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((tj) it.next()).a(configuration);
        }
    }

    @Override // defpackage.bz, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.a.c(bundle);
        mn mnVar = this.f;
        mnVar.b = this;
        Iterator it = mnVar.a.iterator();
        while (it.hasNext()) {
            ((mo) it.next()).a(this);
        }
        super.onCreate(bundle);
        zl zlVar = zn.a;
        zl.c(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.o.t(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.o.v(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.l) {
            return;
        }
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((tj) it.next()).a(new cfg(z));
        }
    }

    @Override // android.app.Activity
    protected final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((tj) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.o.b).iterator();
        while (it.hasNext()) {
            ((fuu) it.next()).P(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.m) {
            return;
        }
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((tj) it.next()).a(new cfg(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.o.u(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.g.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ekb ekbVar;
        Object obj = this.p;
        if (obj == null && (ekbVar = (ekb) getLastNonConfigurationInstance()) != null) {
            obj = ekbVar.a;
        }
        if (obj == null) {
            return null;
        }
        ekb ekbVar2 = new ekb((byte[]) null);
        ekbVar2.a = obj;
        return ekbVar2;
    }

    @Override // defpackage.bz, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (E() instanceof za) {
            yw ywVarE = E();
            ywVarE.getClass();
            ((za) ywVarE).e(yv.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.a.d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((tj) it.next()).a(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // defpackage.tu
    public final void r(fuu fuuVar) {
        fuuVar.getClass();
        this.o.E(fuuVar);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                agf.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            A().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.tu
    public final void s(fuu fuuVar) {
        fuuVar.getClass();
        this.o.F(fuuVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        y();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.i.b(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void v(final mk mkVar) {
        E().b(new yx() { // from class: lu
            @Override // defpackage.yx
            public final void g(yz yzVar, yu yuVar) {
                if (yuVar == yu.ON_CREATE) {
                    lx lxVar = this;
                    mk mkVar2 = mkVar;
                    OnBackInvokedDispatcher onBackInvokedDispatcher = lxVar.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    mkVar2.c(onBackInvokedDispatcher);
                }
            }
        });
    }

    public final void w(mo moVar) {
        mn mnVar = this.f;
        Context context = mnVar.b;
        if (context != null) {
            moVar.a(context);
        }
        mnVar.a.add(moVar);
    }

    public final void x() {
        if (this.p == null) {
            ekb ekbVar = (ekb) getLastNonConfigurationInstance();
            if (ekbVar != null) {
                this.p = (fsc) ekbVar.a;
            }
            if (this.p == null) {
                this.p = new fsc((byte[]) null, (byte[]) null, (byte[]) null, (char[]) null);
            }
        }
    }

    public final void y() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        us.e(decorView, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        vq.e(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        up.d(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        jt.H(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.l = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.l = false;
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((tj) it.next()).a(new cfg(z));
            }
        } catch (Throwable th) {
            this.l = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.m = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.m = false;
            Iterator it = this.j.iterator();
            while (it.hasNext()) {
                ((tj) it.next()).a(new cfg(z));
            }
        } catch (Throwable th) {
            this.m = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        y();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.i.b(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.i.b(decorView);
        super.setContentView(view, layoutParams);
    }
}
