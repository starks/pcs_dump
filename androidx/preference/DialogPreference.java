package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.as.oss.R;
import defpackage.abu;
import defpackage.acb;
import defpackage.ul;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ul.r(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    @Override // androidx.preference.Preference
    protected void c() {
        abu abuVar = this.k.d;
        if (abuVar != null) {
            abuVar.al(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, acb.c, i, 0);
        String strW = ul.w(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strW;
        if (strW == null) {
            this.a = this.o;
        }
        this.b = ul.w(typedArrayObtainStyledAttributes, 8, 1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = ul.w(typedArrayObtainStyledAttributes, 11, 3);
        this.e = ul.w(typedArrayObtainStyledAttributes, 10, 4);
        this.f = ul.t(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
