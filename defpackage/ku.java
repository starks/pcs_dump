package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ku extends jz {
    public kx a;
    public boolean b;

    public ku(int i, int i2) {
        super(i, i2);
    }

    public final int d() {
        kx kxVar = this.a;
        if (kxVar == null) {
            return -1;
        }
        return kxVar.e;
    }

    public ku(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ku(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public ku(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
