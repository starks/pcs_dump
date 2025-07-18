package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class in extends dq {
    public boolean a;

    public in(Drawable drawable) {
        super(drawable);
        this.a = true;
    }

    @Override // defpackage.dq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.dq, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.a) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.dq, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.a) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.dq, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.a) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.dq, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.a) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
