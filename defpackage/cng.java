package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cng extends ImageButton {
    public int d;

    public cng(Context context) {
        this(context, null);
    }

    public final void g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.d = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void setVisibility(int i) {
        g(i, true);
    }

    public cng(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cng(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = getVisibility();
    }
}
