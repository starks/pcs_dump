package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.as.oss.R;
import com.google.android.material.button.MaterialButton;
import defpackage.ajy;
import defpackage.akf;
import defpackage.fjp;
import defpackage.gc;
import defpackage.qf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CollapsableTextView extends ConstraintLayout {
    public boolean g;
    public boolean h;
    public int i;
    public final TextView j;
    private final MaterialButton k;
    private final ajy l;
    private final LinkableTextView m;

    static {
        int[] iArr = akf.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsableTextView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    private static final void g(View view) {
        if (view instanceof MaterialButton) {
            ViewGroup.LayoutParams layoutParams = ((MaterialButton) view).getLayoutParams();
            layoutParams.getClass();
            qf qfVar = (qf) layoutParams;
            qfVar.t = 0;
            qfVar.v = 0;
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setGravity(17);
            textView.setTextAlignment(4);
        } else {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            qf qfVar2 = (qf) layoutParams2;
            qfVar2.t = 0;
            qfVar2.v = 0;
        }
    }

    public final void f() {
        if (this.h) {
            MaterialButton materialButton = this.k;
            materialButton.setText(this.l.d);
            materialButton.c(this.l.b);
            this.j.setMaxLines(this.i);
            this.j.setEllipsize(null);
            this.j.setScrollBarSize(0);
        } else {
            MaterialButton materialButton2 = this.k;
            materialButton2.setText(this.l.c);
            materialButton2.c(this.l.a);
            this.j.setMaxLines(10);
            this.j.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.k.setVisibility((!this.g || this.j.getLineCount() <= this.i) ? 8 : 0);
        this.m.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onMeasure(i, i2);
        f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.g = true;
        this.i = 2;
        LayoutInflater.from(context).inflate(R.layout.settingslib_expressive_collapsable_textview, this);
        TextView textView = (TextView) findViewById(android.R.id.title);
        this.j = textView;
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.collapse_button);
        this.k = materialButton;
        this.m = (LinkableTextView) findViewById(R.id.settingslib_expressive_learn_more);
        Drawable drawable = context.getDrawable(R.drawable.settingslib_expressive_icon_collapse);
        drawable.getClass();
        Drawable drawable2 = context.getDrawable(R.drawable.settingslib_expressive_icon_expand);
        drawable2.getClass();
        String string = context.getString(R.string.settingslib_expressive_text_collapse);
        string.getClass();
        String string2 = context.getString(R.string.settingslib_expressive_text_expand);
        string2.getClass();
        this.l = new ajy(drawable, drawable2, string, string2);
        materialButton.setOnClickListener(new gc(this, 4, null));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, akf.a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 8388611);
        if (i2 == 1 || i2 == 16 || i2 == 17) {
            g(textView);
            g(materialButton);
        }
        this.g = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.i = typedArrayObtainStyledAttributes.getInt(1, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ CollapsableTextView(Context context, AttributeSet attributeSet, int i, int i2, fjp fjpVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
