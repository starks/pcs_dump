package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gj extends hc implements gm {
    final /* synthetic */ gl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(gl glVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.a = glVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new gi(this, this));
    }

    @Override // defpackage.gm
    public final boolean c() {
        return false;
    }

    @Override // defpackage.gm
    public final boolean d() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.a.r();
        return true;
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = getPaddingLeft() - getPaddingRight();
            int i5 = (width + paddingLeft) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(i5 - iMax, paddingTop - iMax, i5 + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
