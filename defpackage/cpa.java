package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpa extends ArrayAdapter {
    final /* synthetic */ cpb a;
    private ColorStateList b;
    private ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpa(cpb cpbVar, Context context, int i, String[] strArr) {
        ColorStateList colorStateList;
        super(context, i, strArr);
        this.a = cpbVar;
        ColorStateList colorStateList2 = null;
        if (b()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{cpbVar.c.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (a() && b()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ry.b(cpbVar.c.getColorForState(iArr3, 0), cpbVar.b), ry.b(cpbVar.c.getColorForState(iArr2, 0), cpbVar.b), cpbVar.b});
        }
        this.b = colorStateList2;
    }

    private final boolean a() {
        return this.a.b != 0;
    }

    private final boolean b() {
        return this.a.c != null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            Drawable rippleDrawable = null;
            if (this.a.getText().toString().contentEquals(textView.getText()) && a()) {
                ColorDrawable colorDrawable = new ColorDrawable(this.a.b);
                if (this.c != null) {
                    colorDrawable.setTintList(this.b);
                    rippleDrawable = new RippleDrawable(this.c, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
