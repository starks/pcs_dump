package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import defpackage.cmu;
import defpackage.cmv;
import defpackage.fh;
import defpackage.fs;
import defpackage.jb;
import defpackage.tp;
import defpackage.ut;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends cmu implements fs {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int i;
    private final CheckedTextView j;
    private FrameLayout k;
    private fh l;
    private final tp m;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.fs
    public final fh a() {
        return this.l;
    }

    @Override // defpackage.fs
    public final boolean e() {
        return false;
    }

    @Override // defpackage.fs
    public final void f(fh fhVar) {
        StateListDrawable stateListDrawable;
        this.l = fhVar;
        int i = fhVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != fhVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.as.oss.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean zIsCheckable = fhVar.isCheckable();
        refreshDrawableState();
        if (this.c != zIsCheckable) {
            this.c = zIsCheckable;
            this.m.d(this.j, AIFeature.Id.PIXEL_AI_FEATURE_48);
        }
        boolean zIsChecked = fhVar.isChecked();
        refreshDrawableState();
        this.j.setChecked(zIsChecked);
        CheckedTextView checkedTextView = this.j;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (zIsChecked && this.d) ? 1 : 0);
        setEnabled(fhVar.isEnabled());
        this.j.setText(fhVar.d);
        Drawable icon = fhVar.getIcon();
        if (icon != null) {
            int i2 = this.i;
            icon.setBounds(0, 0, i2, i2);
        }
        this.j.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = fhVar.getActionView();
        if (actionView != null) {
            if (this.k == null) {
                this.k = (FrameLayout) ((ViewStub) findViewById(com.google.android.as.oss.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.k.removeAllViews();
            this.k.addView(actionView);
        }
        setContentDescription(fhVar.l);
        setTooltipText(fhVar.m);
        fh fhVar2 = this.l;
        if (fhVar2.d == null && fhVar2.getIcon() == null && this.l.getActionView() != null) {
            this.j.setVisibility(8);
            FrameLayout frameLayout = this.k;
            if (frameLayout != null) {
                jb jbVar = (jb) frameLayout.getLayoutParams();
                jbVar.width = -1;
                this.k.setLayoutParams(jbVar);
                return;
            }
            return;
        }
        this.j.setVisibility(0);
        FrameLayout frameLayout2 = this.k;
        if (frameLayout2 != null) {
            jb jbVar2 = (jb) frameLayout2.getLayoutParams();
            jbVar2.width = -2;
            this.k.setLayoutParams(jbVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        fh fhVar = this.l;
        if (fhVar != null && fhVar.isCheckable() && this.l.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, e);
        }
        return iArrOnCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        cmv cmvVar = new cmv(this);
        this.m = cmvVar;
        q(0);
        LayoutInflater.from(context).inflate(com.google.android.as.oss.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.i = context.getResources().getDimensionPixelSize(com.google.android.as.oss.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.as.oss.R.id.design_menu_item_text);
        this.j = checkedTextView;
        ut.j(checkedTextView, cmvVar);
    }
}
