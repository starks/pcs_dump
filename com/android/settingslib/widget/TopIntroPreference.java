package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.as.oss.R;
import defpackage.aca;
import defpackage.akf;
import defpackage.fjs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TopIntroPreference extends Preference {
    private static final int[] a = akf.a;
    private boolean b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopIntroPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        context.getClass();
        this.c = 2;
        this.A = R.layout.settingslib_expressive_top_intro;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.b = z;
        this.c = fjs.k(typedArrayObtainStyledAttributes.getInt(1, true != z ? 10 : 2), 1, 10);
        typedArrayObtainStyledAttributes.recycle();
        P();
    }

    @Override // androidx.preference.Preference
    public final void a(aca acaVar) {
        acaVar.getClass();
        super.a(acaVar);
        acaVar.u = false;
        acaVar.v = false;
        View viewC = acaVar.C(R.id.collapsable_text_view);
        CollapsableTextView collapsableTextView = viewC instanceof CollapsableTextView ? (CollapsableTextView) viewC : null;
        if (collapsableTextView != null) {
            boolean z = this.b;
            collapsableTextView.g = z;
            if (z) {
                collapsableTextView.h = true;
            }
            collapsableTextView.f();
            collapsableTextView.i = fjs.k(this.c, 1, 10);
            collapsableTextView.f();
            CharSequence charSequence = this.o;
            collapsableTextView.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
            CharSequence charSequence2 = this.o;
            if (charSequence2 != null) {
                collapsableTextView.j.setText(charSequence2.toString());
            }
        }
    }
}
