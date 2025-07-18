package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.as.oss.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cm extends ae implements cn {
    private cp j;

    public cm() {
        aj().ag("androidx:appcompat", new am(this, 2));
        w(new cl(this, 0, null));
    }

    private final void B() {
        us.e(getWindow().getDecorView(), this);
        vq.e(getWindow().getDecorView(), this);
        up.d(getWindow().getDecorView(), this);
        jt.H(getWindow().getDecorView(), this);
    }

    @Override // defpackage.lx, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        q().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        Context context2;
        Configuration configuration;
        Context context3;
        de deVar = (de) q();
        deVar.A = true;
        int iS = deVar.s(context, deVar.r());
        if (de.n(context) && cp.n(context) && !cp.c) {
            cp.a.execute(new p(context, 6));
        }
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(deVar.u(context2, iS, null, null, false));
            } catch (IllegalStateException unused) {
            }
            context3 = context2;
            super.attachBaseContext(context3);
        }
        context2 = context;
        if (context2 instanceof mx) {
            try {
                ((mx) context2).a(deVar.u(context2, iS, null, null, false));
            } catch (IllegalStateException unused2) {
            }
            context3 = context2;
        } else if (de.f) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context2.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context2.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration4 != null && configuration3.diff(configuration4) != 0) {
                    if (configuration3.fontScale != configuration4.fontScale) {
                        configuration.fontScale = configuration4.fontScale;
                    }
                    if (configuration3.mcc != configuration4.mcc) {
                        configuration.mcc = configuration4.mcc;
                    }
                    if (configuration3.mnc != configuration4.mnc) {
                        configuration.mnc = configuration4.mnc;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    if (configuration3.touchscreen != configuration4.touchscreen) {
                        configuration.touchscreen = configuration4.touchscreen;
                    }
                    if (configuration3.keyboard != configuration4.keyboard) {
                        configuration.keyboard = configuration4.keyboard;
                    }
                    if (configuration3.keyboardHidden != configuration4.keyboardHidden) {
                        configuration.keyboardHidden = configuration4.keyboardHidden;
                    }
                    if (configuration3.navigation != configuration4.navigation) {
                        configuration.navigation = configuration4.navigation;
                    }
                    if (configuration3.navigationHidden != configuration4.navigationHidden) {
                        configuration.navigationHidden = configuration4.navigationHidden;
                    }
                    if (configuration3.orientation != configuration4.orientation) {
                        configuration.orientation = configuration4.orientation;
                    }
                    if ((configuration3.screenLayout & 15) != (configuration4.screenLayout & 15)) {
                        configuration.screenLayout |= configuration4.screenLayout & 15;
                    }
                    if ((configuration3.screenLayout & 192) != (configuration4.screenLayout & 192)) {
                        configuration.screenLayout |= configuration4.screenLayout & 192;
                    }
                    if ((configuration3.screenLayout & 48) != (configuration4.screenLayout & 48)) {
                        configuration.screenLayout |= configuration4.screenLayout & 48;
                    }
                    if ((configuration3.screenLayout & 768) != (configuration4.screenLayout & 768)) {
                        configuration.screenLayout |= configuration4.screenLayout & 768;
                    }
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                    if ((configuration3.uiMode & 15) != (configuration4.uiMode & 15)) {
                        configuration.uiMode |= configuration4.uiMode & 15;
                    }
                    if ((configuration3.uiMode & 48) != (configuration4.uiMode & 48)) {
                        configuration.uiMode |= configuration4.uiMode & 48;
                    }
                    if (configuration3.screenWidthDp != configuration4.screenWidthDp) {
                        configuration.screenWidthDp = configuration4.screenWidthDp;
                    }
                    if (configuration3.screenHeightDp != configuration4.screenHeightDp) {
                        configuration.screenHeightDp = configuration4.screenHeightDp;
                    }
                    if (configuration3.smallestScreenWidthDp != configuration4.smallestScreenWidthDp) {
                        configuration.smallestScreenWidthDp = configuration4.smallestScreenWidthDp;
                    }
                    if (configuration3.densityDpi != configuration4.densityDpi) {
                        configuration.densityDpi = configuration4.densityDpi;
                    }
                }
            }
            Configuration configurationU = deVar.u(context2, iS, null, configuration, true);
            mx mxVar = new mx(context2, R.style.Theme_AppCompat_Empty);
            mxVar.a(configurationU);
            try {
                if (context2.getTheme() != null) {
                    mxVar.getTheme().rebase();
                }
            } catch (NullPointerException unused3) {
            }
            context3 = mxVar;
        } else {
            context3 = context2;
        }
        super.attachBaseContext(context3);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        p();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.bz, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        p();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return q().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        de deVar = (de) q();
        if (deVar.l == null) {
            deVar.E();
            cc ccVar = deVar.k;
            deVar.l = new ep(ccVar != null ? ccVar.a() : deVar.h);
        }
        return deVar.l;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        q().f();
    }

    public final Intent k() {
        return qy.t(this);
    }

    @Override // defpackage.lx, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        q().o();
    }

    @Override // defpackage.ae, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        q().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.ae, defpackage.lx, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        cc ccVarP = p();
        if (menuItem.getItemId() != 16908332 || ccVarP == null || (((C0000do) ccVarP).p.a() & 4) == 0) {
            return false;
        }
        return t();
    }

    @Override // android.app.Activity
    protected final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((de) q()).D();
    }

    @Override // defpackage.ae, android.app.Activity
    protected final void onPostResume() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostResume();
        cc ccVarB = ((de) q()).b();
        if (ccVarB != null) {
            ccVarB.e(true);
        }
    }

    @Override // defpackage.ae, android.app.Activity
    protected void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        ((de) q()).M(true);
    }

    @Override // defpackage.ae, android.app.Activity
    protected final void onStop() {
        super.onStop();
        q().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        q().m(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        p();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final cc p() {
        return q().b();
    }

    public final cp q() {
        if (this.j == null) {
            int i = cp.b;
            this.j = new de(this, null, this, this);
        }
        return this.j;
    }

    @Override // defpackage.lx, android.app.Activity
    public final void setContentView(int i) {
        B();
        q().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((de) q()).C = i;
    }

    public boolean t() {
        Intent intentT = qy.t(this);
        if (intentT == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentT)) {
            navigateUpTo(intentT);
            return true;
        }
        rl rlVar = new rl(this);
        Intent intentK = k();
        if (intentK == null) {
            intentK = qy.t(this);
        }
        if (intentK != null) {
            ComponentName component = intentK.getComponent();
            if (component == null) {
                component = intentK.resolveActivity(rlVar.b.getPackageManager());
            }
            int size = rlVar.a.size();
            try {
                for (Intent intentU = qy.u(rlVar.b, component); intentU != null; intentU = qy.u(rlVar.b, intentU.getComponent())) {
                    rlVar.a.add(size, intentU);
                }
                rlVar.a.add(intentK);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        if (rlVar.a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) rlVar.a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        rlVar.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // defpackage.lx, android.app.Activity
    public final void setContentView(View view) {
        B();
        q().k(view);
    }

    @Override // defpackage.lx, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B();
        q().l(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
