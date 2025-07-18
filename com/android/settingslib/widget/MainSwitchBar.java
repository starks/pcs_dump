package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.as.oss.R;
import defpackage.acb;
import defpackage.akb;
import defpackage.akc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MainSwitchBar extends LinearLayout implements CompoundButton.OnCheckedChangeListener {
    protected TextView a;
    protected Switch b;
    private final List c;
    private View d;

    public MainSwitchBar(Context context) {
        this(context, null);
    }

    private final void e(boolean z) {
        this.d.setActivated(z);
    }

    public final void a(akc akcVar) {
        if (this.c.contains(akcVar)) {
            return;
        }
        this.c.add(akcVar);
    }

    public final void b(boolean z) {
        Switch r0 = this.b;
        if (r0 != null) {
            r0.setChecked(z);
        }
        e(z);
    }

    public final void c(CharSequence charSequence) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean d() {
        return this.b.isChecked();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        e(z);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((akc) this.c.get(i)).aO(z);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        akb akbVar = (akb) parcelable;
        super.onRestoreInstanceState(akbVar.getSuperState());
        this.b.setChecked(akbVar.a);
        b(akbVar.a);
        e(akbVar.a);
        setVisibility(true != akbVar.b ? 8 : 0);
        this.b.setOnCheckedChangeListener(true != akbVar.b ? null : this);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        akb akbVar = new akb(super.onSaveInstanceState());
        akbVar.a = this.b.isChecked();
        akbVar.b = getVisibility() == 0;
        return akbVar;
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.b.performClick();
        return super.performClick();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.a.setEnabled(z);
        this.b.setEnabled(z);
        this.d.setEnabled(z);
        this.d.setActivated(d());
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MainSwitchBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.settingslib_main_switch_bar, this);
        setFocusable(true);
        setClickable(true);
        this.d = findViewById(R.id.frame);
        this.a = (TextView) findViewById(R.id.switch_text);
        this.b = (Switch) findViewById(android.R.id.switch_widget);
        a(new akc() { // from class: aka
            @Override // defpackage.akc
            public final void aO(boolean z) {
                this.a.b(z);
            }
        });
        if (this.b.getVisibility() == 0) {
            this.b.setOnCheckedChangeListener(this);
        }
        b(this.b.isChecked());
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.g, 0, 0);
            c(typedArrayObtainStyledAttributes.getText(4));
            typedArrayObtainStyledAttributes.recycle();
        }
        e(this.b.isChecked());
    }
}
