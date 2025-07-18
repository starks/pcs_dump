package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ca extends ViewGroup.MarginLayoutParams {
    public int a;

    public ca() {
        super(-2, -2);
        this.a = 8388627;
    }

    public ca(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dp.b);
        this.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ca(ca caVar) {
        super((ViewGroup.MarginLayoutParams) caVar);
        this.a = 0;
        this.a = caVar.a;
    }

    public ca(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
