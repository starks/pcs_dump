package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.as.oss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hi extends SeekBar {
    private final hj a;

    public hi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        kz.d(this, getContext());
        hj hjVar = new hj(this);
        this.a = hjVar;
        hjVar.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        hj hjVar = this.a;
        Drawable drawable = hjVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(hjVar.b.getDrawableState())) {
            hjVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        hj hjVar = this.a;
        if (hjVar.c != null) {
            int max = hjVar.b.getMax();
            if (max > 1) {
                int intrinsicWidth = hjVar.c.getIntrinsicWidth();
                int intrinsicHeight = hjVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                hjVar.c.setBounds(-i, -i2, i, i2);
                int width = (hjVar.b.getWidth() - hjVar.b.getPaddingLeft()) - hjVar.b.getPaddingRight();
                int iSave = canvas.save();
                canvas.translate(hjVar.b.getPaddingLeft(), hjVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    hjVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
