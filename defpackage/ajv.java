package defpackage;

import android.R;
import android.app.ActionBar;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajv extends ae {
    private ajw j;

    private final ajw t() {
        if (this.j == null) {
            this.j = new ajw(new fuu(this, null));
        }
        return this.j;
    }

    @Override // defpackage.lx, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        if (aQ().a() == 0) {
            finishAfterTransition();
        }
    }

    @Override // defpackage.ae, defpackage.lx, defpackage.bz, android.app.Activity
    protected void onCreate(Bundle bundle) throws Exception {
        int i = lz.a;
        mm mmVarN = jt.n(0, 0);
        mm mmVarN2 = jt.n(lz.a, lz.b);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        fiy fiyVar = mmVarN.a;
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) fiyVar.a(resources)).booleanValue();
        fiy fiyVar2 = mmVarN2.a;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) fiyVar2.a(resources2)).booleanValue();
        md mdVar = new md();
        Window window = getWindow();
        window.getClass();
        mdVar.p(mmVarN, mmVarN2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        mdVar.o(window2);
        View viewFindViewById = findViewById(R.id.content);
        ajx ajxVar = new ajx(this, 0);
        int[] iArr = ut.a;
        un.p(viewFindViewById, ajxVar);
        super.onCreate(bundle);
        if (ake.a(this)) {
            setTheme(com.google.android.as.oss.R.style.Theme_SubSettingsBase_Expressive);
        }
        ajw ajwVarT = t();
        LayoutInflater layoutInflater = getLayoutInflater();
        boolean z = ajwVarT.e;
        boolean zA = ake.a(this);
        ajwVarT.f = zA;
        View viewInflate = layoutInflater.inflate(true != zA ? com.google.android.as.oss.R.layout.collapsing_toolbar_base_layout : com.google.android.as.oss.R.layout.settingslib_expressive_collapsing_toolbar_base_layout, (ViewGroup) null, false);
        if (viewInflate instanceof CoordinatorLayout) {
        }
        ajwVarT.a = (CollapsingToolbarLayout) viewInflate.findViewById(com.google.android.as.oss.R.id.collapsing_toolbar);
        ajwVarT.b = (AppBarLayout) viewInflate.findViewById(com.google.android.as.oss.R.id.app_bar);
        CollapsingToolbarLayout collapsingToolbarLayout = ajwVarT.a;
        if (collapsingToolbarLayout != null) {
            cms cmsVar = collapsingToolbarLayout.a;
            cmsVar.s = 1.1f;
            cmsVar.t = 3;
            vr vrVar = new vr();
            if (cmsVar.w != vrVar) {
                cmsVar.w = vrVar;
                cmsVar.g(true);
            }
        }
        AppBarLayout appBarLayout = ajwVarT.b;
        if (appBarLayout != null) {
            rb rbVar = (rb) appBarLayout.getLayoutParams();
            AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
            ((AppBarLayout.BaseBehavior) behavior).b = new clq((byte[]) null);
            rbVar.b(behavior);
        }
        ajwVarT.d = (FrameLayout) viewInflate.findViewById(com.google.android.as.oss.R.id.content_frame);
        ajwVarT.c = (Toolbar) viewInflate.findViewById(com.google.android.as.oss.R.id.action_bar);
        fuu fuuVar = ajwVarT.g;
        super.setActionBar(ajwVarT.c);
        ActionBar actionBar = super.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
            if (ajwVarT.f) {
                actionBar.setHomeAsUpIndicator(com.google.android.as.oss.R.drawable.settingslib_expressive_icon_back);
            }
            actionBar.setDisplayShowTitleEnabled(true);
        }
        super.setContentView(viewInflate);
    }

    @Override // android.app.Activity
    public final boolean onNavigateUp() {
        if (aQ().a() > 0) {
            aQ().ab();
        }
        if (aQ().a() != 0) {
            return true;
        }
        finishAfterTransition();
        return true;
    }

    @Override // defpackage.lx, android.app.Activity
    public final void setContentView(int i) {
        ajw ajwVar = this.j;
        ViewGroup viewGroup = ajwVar == null ? (ViewGroup) findViewById(com.google.android.as.oss.R.id.content_frame) : ajwVar.d;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        LayoutInflater.from(this).inflate(i, viewGroup);
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        setTitle(getText(i));
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        ajw ajwVarT = t();
        CollapsingToolbarLayout collapsingToolbarLayout = ajwVarT.a;
        if (collapsingToolbarLayout != null) {
            collapsingToolbarLayout.g(charSequence);
        }
        super.setTitle(charSequence);
    }

    @Override // defpackage.lx, android.app.Activity
    public final void setContentView(View view) {
        ajw ajwVar = this.j;
        ViewGroup viewGroup = ajwVar == null ? (ViewGroup) findViewById(com.google.android.as.oss.R.id.content_frame) : ajwVar.d;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    @Override // defpackage.lx, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ajw ajwVar = this.j;
        ViewGroup viewGroup = ajwVar == null ? (ViewGroup) findViewById(com.google.android.as.oss.R.id.content_frame) : ajwVar.d;
        if (viewGroup != null) {
            viewGroup.addView(view, layoutParams);
        }
    }
}
