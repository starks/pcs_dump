package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.google.android.apps.aicore.aidl.AIFeature;
import defpackage.cmp;
import defpackage.cmq;
import defpackage.ha;
import defpackage.ut;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckableImageButton extends ha implements Checkable {
    private static final int[] c = {R.attr.state_checked};
    public boolean a;
    public boolean b;
    private boolean d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), c) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cmq)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cmq cmqVar = (cmq) parcelable;
        super.onRestoreInstanceState(cmqVar.d);
        setChecked(cmqVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        cmq cmqVar = new cmq(super.onSaveInstanceState());
        cmqVar.a = this.a;
        return cmqVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(AIFeature.Id.PIXEL_AI_FEATURE_48);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.as.oss.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = true;
        ut.j(this, new cmp(this));
    }
}
